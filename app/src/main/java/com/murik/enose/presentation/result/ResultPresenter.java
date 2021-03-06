package com.murik.enose.presentation.result;


import android.content.Context;
import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.murik.enose.App;
import com.murik.enose.Const;
import com.murik.enose.Screens;
import com.murik.enose.model.RealmController;
import com.murik.enose.model.ResultBySens;
import com.murik.enose.model.dto.DataByMaxParcelable;
import com.murik.enose.model.resultbyMaxValue.ResultAFactory;
import com.murik.enose.ui.fragment.result.recycler.HeaderViewHolder;
import com.murik.enose.ui.fragment.result.recycler.ResultViewHolder;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

@InjectViewState
public class ResultPresenter extends MvpPresenter<ResultView> {
  private ArrayList<ResultBySens> resultBySens = new ArrayList<>();
  private ResultAFactory resultAFactory;
  private ArrayList<ResultBySens> res = new ArrayList<>();
  private Context context;
  private DataByMaxParcelable data;
  private int hand = Const.LEFT_HAND;

  public ResultPresenter() {
  }

  public void setContext(Context context) {
    this.context = context;
  }

  @Override
  protected void onFirstViewAttach() {
    getViewState().calculateResult();
  }

  public void calculateResult(DataByMaxParcelable data, int hand){

    this.data = data;
    resultAFactory = new ResultAFactory(data, hand, context);
    if(resultAFactory.calculateResultA()){
      resultBySens = resultAFactory.getA();
      if(!res.isEmpty()){
        res.clear();
      }
      for(int i = 0; i < resultBySens.size(); i++){
        if(resultBySens.get(i).getResultComment() != null)
          res.add(resultBySens.get(i));
      }

      getViewState().initPieChart(resultAFactory.getA());
      getViewState().initRecyclerView();
    }
  }
  public void onBindHeader(HeaderViewHolder holder){
      holder.setTvDescriptions(data.getDescriptions());
  }
  public void onBindPlacesViewPosition(int pos,ResultViewHolder holder){
    int position = pos - 1;
    DecimalFormat df = new DecimalFormat("#.##");
    df.setRoundingMode(RoundingMode.HALF_UP);

    holder.setDivider(res.get(position).getViewColor());
    holder.setTvComment(res.get(position).getLegend() +" =" + df.format(res.get(position).getA()) +"\n" + res.get(position).getResultComment());

  }

  public int getResultRowsCount() {
    return res.size() + 1;
  }

  public void onSaveButtonClick(){
    getViewState().showDialog();
  }
  public void onSave(DataByMaxParcelable data){

    RealmController realmController = new RealmController();
    realmController.addInfoMax(data);
    App.INSTANCE.getRouter().newScreenChain(Screens.REALM_FRAGMENT);
  }
}

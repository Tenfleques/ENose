package com.murik.enose.presentation.realm;


import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.murik.enose.App;
import com.murik.enose.Const;
import com.murik.enose.Screens;
import com.murik.enose.model.dto.DataByMaxParcelable;
import com.murik.enose.model.dto.DataSensorRealm;
import com.murik.enose.model.dto.SensorDataFullParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@InjectViewState
public class RealmPresenter extends MvpPresenter<RealmView> {



  public void onItemRecyclerClick(DataSensorRealm data){

    if(data.isFullData()){
      SensorDataFullParcelable sensorDataFullParcelable = new SensorDataFullParcelable();
      Map<String, ArrayList<Integer>> leftHandDataSens = new HashMap<>();
      Map<String, ArrayList<Integer>> rightHandDataSens = new HashMap<>();


      if(data.getLeftHandData() != null){
        if(!data.getLeftHandData().getDataSens1().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getLeftHandData().getDataSens1().size(); i++){
            arrayList.add(data.getLeftHandData().getDataSens1().get(i).getValue());
          }
          leftHandDataSens.put(Const.SENSOR_1, arrayList);
        }

        if(!data.getLeftHandData().getDataSens2().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getLeftHandData().getDataSens2().size(); i++){
            arrayList.add(data.getLeftHandData().getDataSens2().get(i).getValue());
          }
          leftHandDataSens.put(Const.SENSOR_2, arrayList);
        }

        if(!data.getLeftHandData().getDataSens3().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getLeftHandData().getDataSens3().size(); i++){
            arrayList.add(data.getLeftHandData().getDataSens3().get(i).getValue());
          }
          leftHandDataSens.put(Const.SENSOR_3, arrayList);
        }

        if(!data.getLeftHandData().getDataSens4().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getLeftHandData().getDataSens4().size(); i++){
            arrayList.add(data.getLeftHandData().getDataSens4().get(i).getValue());
          }
          leftHandDataSens.put(Const.SENSOR_4, arrayList);
        }

        if(!data.getLeftHandData().getDataSens5().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getLeftHandData().getDataSens5().size(); i++){
            arrayList.add(data.getLeftHandData().getDataSens5().get(i).getValue());
          }
          leftHandDataSens.put(Const.SENSOR_5, arrayList);
        }

        if(!data.getLeftHandData().getDataSens6().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getLeftHandData().getDataSens6().size(); i++){
            arrayList.add(data.getLeftHandData().getDataSens6().get(i).getValue());
          }
          leftHandDataSens.put(Const.SENSOR_6, arrayList);
        }

        if(!data.getLeftHandData().getDataSens7().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getLeftHandData().getDataSens7().size(); i++){
            arrayList.add(data.getLeftHandData().getDataSens7().get(i).getValue());
          }
          leftHandDataSens.put(Const.SENSOR_7, arrayList);
        }

        if(!data.getLeftHandData().getDataSens8().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getLeftHandData().getDataSens8().size(); i++){
            arrayList.add(data.getLeftHandData().getDataSens8().get(i).getValue());
          }
          leftHandDataSens.put(Const.SENSOR_8, arrayList);
        }
      }

      if(data.getRightHandData() != null){
        if(!data.getRightHandData().getDataSens1().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getRightHandData().getDataSens1().size(); i++){
            arrayList.add(data.getRightHandData().getDataSens1().get(i).getValue());
          }
          rightHandDataSens.put(Const.SENSOR_1, arrayList);
        }

        if(!data.getRightHandData().getDataSens2().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getRightHandData().getDataSens2().size(); i++){
            arrayList.add(data.getRightHandData().getDataSens2().get(i).getValue());
          }
          rightHandDataSens.put(Const.SENSOR_2, arrayList);
        }

        if(!data.getRightHandData().getDataSens3().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getRightHandData().getDataSens3().size(); i++){
            arrayList.add(data.getRightHandData().getDataSens3().get(i).getValue());
          }
          rightHandDataSens.put(Const.SENSOR_3, arrayList);
        }

        if(!data.getRightHandData().getDataSens4().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getRightHandData().getDataSens4().size(); i++){
            arrayList.add(data.getRightHandData().getDataSens4().get(i).getValue());
          }
          rightHandDataSens.put(Const.SENSOR_4, arrayList);
        }

        if(!data.getRightHandData().getDataSens5().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getRightHandData().getDataSens5().size(); i++){
            arrayList.add(data.getRightHandData().getDataSens5().get(i).getValue());
          }
          rightHandDataSens.put(Const.SENSOR_5, arrayList);
        }

        if(!data.getRightHandData().getDataSens6().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getRightHandData().getDataSens6().size(); i++){
            arrayList.add(data.getRightHandData().getDataSens6().get(i).getValue());
          }
          rightHandDataSens.put(Const.SENSOR_6, arrayList);
        }

        if(!data.getRightHandData().getDataSens7().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getRightHandData().getDataSens7().size(); i++){
            arrayList.add(data.getRightHandData().getDataSens7().get(i).getValue());
          }
          rightHandDataSens.put(Const.SENSOR_7, arrayList);
        }

        if(!data.getRightHandData().getDataSens8().isEmpty()){
          ArrayList<Integer> arrayList = new ArrayList<>();
          for(int i = 0; i < data.getRightHandData().getDataSens8().size(); i++){
            arrayList.add(data.getRightHandData().getDataSens8().get(i).getValue());
          }
          rightHandDataSens.put(Const.SENSOR_8, arrayList);
        }
      }

      sensorDataFullParcelable.setFullData(data.isFullData());
      sensorDataFullParcelable.setDataSensorMapLeftHand(leftHandDataSens);
      sensorDataFullParcelable.setDataSensorMapRightHand(rightHandDataSens);
      sensorDataFullParcelable.setDescriptions(data.getDescriptions());
      sensorDataFullParcelable.setPractice(data.isPractice());
      sensorDataFullParcelable.setGender(data.getGender());

      App.INSTANCE.getRouter().navigateTo(Screens.FULL_RESULT_FRAGMENT, sensorDataFullParcelable);


    } else {
      DataByMaxParcelable inputDataParcelable = new DataByMaxParcelable();
      ArrayList<Integer> leftHandDataSens = new ArrayList<>();
      ArrayList<Integer> rightHandDataSens = new ArrayList<>();

      if(data.getLeftHandData() != null){
        leftHandDataSens.add(data.getLeftHandData().getDataSens1().get(0).getValue());
        leftHandDataSens.add(data.getLeftHandData().getDataSens2().get(0).getValue());
        leftHandDataSens.add(data.getLeftHandData().getDataSens3().get(0).getValue());
        leftHandDataSens.add(data.getLeftHandData().getDataSens4().get(0).getValue());
        leftHandDataSens.add(data.getLeftHandData().getDataSens5().get(0).getValue());
        leftHandDataSens.add(data.getLeftHandData().getDataSens6().get(0).getValue());
        leftHandDataSens.add(data.getLeftHandData().getDataSens7().get(0).getValue());
        leftHandDataSens.add(data.getLeftHandData().getDataSens8().get(0).getValue());

      }

      if(data.getRightHandData() != null){
        rightHandDataSens.add(data.getRightHandData().getDataSens1().get(0).getValue());
        rightHandDataSens.add(data.getRightHandData().getDataSens2().get(0).getValue());
        rightHandDataSens.add(data.getRightHandData().getDataSens3().get(0).getValue());
        rightHandDataSens.add(data.getRightHandData().getDataSens4().get(0).getValue());
        rightHandDataSens.add(data.getRightHandData().getDataSens5().get(0).getValue());
        rightHandDataSens.add(data.getRightHandData().getDataSens6().get(0).getValue());
        rightHandDataSens.add(data.getRightHandData().getDataSens7().get(0).getValue());
        rightHandDataSens.add(data.getRightHandData().getDataSens8().get(0).getValue());
      }

      inputDataParcelable.setRightHandDataSensor(rightHandDataSens);
      inputDataParcelable.setLeftHandDataSensor(leftHandDataSens);
      inputDataParcelable.setPractice(data.isPractice());
      inputDataParcelable.setDescriptions(data.getDescriptions());
      inputDataParcelable.setGender(data.getGender());

      App.INSTANCE.getRouter().navigateTo(Screens.RESULT_FRAGMENT, inputDataParcelable);
    }

  }
}


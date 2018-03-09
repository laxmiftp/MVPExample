package com.ve.mvp.mvpexample;

/**
 * Created by laxmi on 16/1/18.
 */

public class MyModel {


    public MyModel() {

    }

    public String getMainValue() {
        return mainValue;
    }

    public void setMainValue(String mainValue) {
        this.mainValue = mainValue;
    }

    String mainValue;

    public MyModel(String mainValue) {
        this.mainValue = mainValue;
    }


}

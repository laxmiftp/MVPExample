package com.ve.mvp.mvpexample;

/**
 * Created by laxmi on 16/1/18.
 */

public class MainPresenter implements MainContract.MainPresenter {


    MainContract.MainView mainView;
    MyModel myModel;

    public MainPresenter(MainContract.MainView mainView1) {
        mainView = mainView1;
        myModel = new MyModel();
    }

    @Override
    public void setValue(String val) {
        myModel.setMainValue(val);
    }

    @Override
    public void show() {
        mainView.displayToast(myModel.getMainValue());
    }



}

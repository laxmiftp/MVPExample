package com.ve.mvp.mvpexample;

/**
 * Created by laxmi on 16/1/18.
 */

public interface MainContract {

    interface MainView {
        void displayToast(String val);
    }


    interface MainPresenter {
        void setValue(String valuefromEditText);
        void show();
    }
}

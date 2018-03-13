package com.example.rpham64.mymvpexample.presenter;

/**
 * Created by rpham64 on 3/12/18.
 */

public interface BasePresenter {
    void onResume();
    void onDestroy();

    void onItemClicked(int position);
}

package com.example.rpham64.mymvpexample.presenter;

import com.example.rpham64.mymvpexample.model.BaseItemsInitializer;
import com.example.rpham64.mymvpexample.model.ItemsInitializer;
import com.example.rpham64.mymvpexample.view.MainView;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rpham64 on 3/12/18.
 */

public class MainPresenter implements BasePresenter, BaseItemsInitializer.OnFinishedListener {

    private MainView mMainView;
    private ItemsInitializer mItemsInitializer;

    public MainPresenter(MainView mainView) {
        mMainView = mainView;
        mItemsInitializer = new ItemsInitializer();
        mItemsInitializer.init(this);
    }

    @Override
    public void onResume() {
        // Show progress (on MainActivity)
    }

    @Override
    public void onDestroy() {
        mMainView = null;
    }

    @Override
    public void onItemClicked(int position) {
        // Show toast message (on MainActivity)
        if (mMainView != null) {
            mMainView.showMessage("Clicked on item " + position);
        }
    }

    @Override
    public void onFinished(List<String> items) {
        if (mMainView != null) {
            mMainView.setItems(items);
        }
    }
}

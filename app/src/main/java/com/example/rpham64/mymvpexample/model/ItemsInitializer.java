package com.example.rpham64.mymvpexample.model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rpham64 on 3/12/18.
 */

public class ItemsInitializer implements BaseItemsInitializer {

    /**
     * Initializes a list of sample Strings, then uses a listener to pass the list to MainPresenter.
     *
     * @param listener
     */
    @Override
    public void init(OnFinishedListener listener) {
        List<String> items = Arrays.asList("This", "Is", "A", "Training", "Exercise", "For", "MVP");
        listener.onFinished(items);
    }
}

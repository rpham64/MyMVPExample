package com.example.rpham64.mymvpexample.model;

import java.util.List;

/**
 * Created by rpham64 on 3/12/18.
 */

public interface BaseItemsInitializer {
    /**
     * Initialize the list of items.
     */
    void init(final OnFinishedListener listener);

    /**
     * This listener will send the list of items up to MainActivity (the VIEW).
     */
    interface OnFinishedListener {
        void onFinished(List<String> items);
    }
}

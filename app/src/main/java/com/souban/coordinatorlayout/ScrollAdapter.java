package com.souban.coordinatorlayout;

import android.support.v7.util.DiffUtil;

/**
 * Created by wss on 8/26/16.
 */
public class ScrollAdapter extends DiffUtil.Callback {

    public ScrollAdapter() {

    }

    @Override
    public int getOldListSize() {
        return 0;
    }

    @Override
    public int getNewListSize() {
        return 0;
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return false;
    }
}

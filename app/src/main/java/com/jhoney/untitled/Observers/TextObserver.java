package com.jhoney.untitled.Observers;

import android.widget.TextView;

import java.io.Serializable;
import java.util.Observable;

public class TextObserver
    extends Observable
    implements Serializable
{
    private TextView toObserve;

    public TextView getToObserve()
    {
        return toObserve;
    }
    public void setToObserve(TextView observeArgs)
    {
        this.toObserve = observeArgs;
        this.setChanged();
        this.notifyObservers(toObserve);
    }
}

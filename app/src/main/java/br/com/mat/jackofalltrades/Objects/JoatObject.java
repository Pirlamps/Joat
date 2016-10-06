package br.com.mat.jackofalltrades.Objects;

import android.databinding.ViewDataBinding;
import android.databinding.tool.Binding;

import java.io.Serializable;
import java.util.Objects;

/**
 * Created by matheus on 25/09/2016.
 */

public class JoatObject extends Object implements Serializable {

    private int headerType;
    private String headerTitle;
    private ViewDataBinding binding;
    private int bindingObjectID;
    private Object bindingObject;

    public JoatObject(ViewDataBinding binding, int bindingObjectID, Object bindingObject) {
        this.binding = binding;
        this.bindingObjectID = bindingObjectID;
        this.bindingObject = bindingObject;
    }

    public int getHeaderType() {
        return headerType;
    }

    public void setHeaderType(int headerType) {
        this.headerType = headerType;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public ViewDataBinding getBinding() {
        return binding;
    }

    public void setBinding(ViewDataBinding binding) {
        this.binding = binding;
    }

    public int getBindingObjectID() {
        return bindingObjectID;
    }

    public void setBindingObjectID(int bindingObjectID) {
        this.bindingObjectID = bindingObjectID;
    }

    public Object getBindingObject() {
        return bindingObject;
    }

    public void setBindingObject(Object bindingObject) {
        this.bindingObject = bindingObject;
    }
}

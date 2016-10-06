package br.com.mat.jackofalltrades.Adapter;

import android.databinding.ViewDataBinding;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import br.com.mat.jackofalltrades.BR;
import br.com.mat.jackofalltrades.Objects.JoatObject;

/**
 * Created by matheus on 25/09/2016.
 */

public class JoatAdapter extends BaseAdapter {

    private List<JoatObject> joatObjects;

    public void JoatAdapter(){

    }

    public void setData(List<JoatObject> joatObjects){
        this.joatObjects = joatObjects;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return joatObjects==null ? 0 : joatObjects.size();
    }

    @Override
    public Object getItem(int position) {
        return joatObjects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        JoatObject object = joatObjects.get(position);
        ViewDataBinding viewDataBinding = object.getBinding();
        viewDataBinding.setVariable(object.getBindingObjectID(),object.getBindingObject());

        return viewDataBinding.getRoot();
    }
}

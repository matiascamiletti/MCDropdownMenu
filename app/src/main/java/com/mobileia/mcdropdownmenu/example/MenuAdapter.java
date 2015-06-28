package com.mobileia.mcdropdownmenu.example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matiascamiletti on 28/6/15.
 */
public class MenuAdapter extends BaseAdapter {

    protected final Context mContext;

    private List<MenuItem> mItems = new ArrayList<MenuItem>();

    public MenuAdapter(Context context){
        mContext = context;
    }

    public void addItem(MenuItem item) {
        this.mItems.add(item);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return this.mItems.size();
    }

    @Override
    public MenuItem getItem(int i) {
        return this.mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return this.mItems.get(i).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.menu_item, parent, false);
        }

        TextView txtName = ViewHolder.get(view, R.id.textView);

        final MenuItem item = getItem(position);

        txtName.setText(item.getTitle());

        return view;
    }

    public Context getContext() {
        return this.mContext;
    }
}

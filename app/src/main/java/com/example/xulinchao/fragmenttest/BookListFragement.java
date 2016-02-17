package com.example.xulinchao.fragmenttest;


import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookListFragement extends ListFragment {
    public interface FragementListener{
        public void onclick(Integer id);
    }
    public FragementListener mListener;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity=(Activity)context;
        if(!(activity instanceof FragementListener)){

        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }
}

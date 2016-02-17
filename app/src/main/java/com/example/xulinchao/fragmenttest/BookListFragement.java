package com.example.xulinchao.fragmenttest;


import android.app.Activity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookListFragement extends ListFragment {
    public interface FragementListener{
        public void onclick(Integer id);
    }
    private FragementListener mListener;
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity=(Activity)context;
        if(!(activity instanceof FragementListener)){
        throw new IllegalStateException("没有继承FragementListener借口");
        }
        Log.e("xlc","xlc "+activity.toString());
        mListener=(FragementListener)activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<BookContent.Book>(getActivity(),
                android.R.layout.simple_list_item_activated_1,
                BookContent.BookList));


    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener=null;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Log.e("xlc","xlc "+position);
        Log.e("xlc--","xlc--111 "+BookContent.BookMap.get(BookContent.BookList.get(position).id).toString());
        Log.e("xlc","xlc mListener");
        mListener.onclick(BookContent.BookList.get(position).id-1);
    }
}

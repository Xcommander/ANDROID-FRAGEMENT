package com.example.xulinchao.fragmenttest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BookDescFragment extends Fragment {

    public static final String ITEM_ID="item_id";
    BookContent.Book book;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null) {
            if(getArguments().containsKey(ITEM_ID)) {
                book = BookContent.BookList.get(getArguments().getInt(ITEM_ID));
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View descView=inflater.inflate(R.layout.fragment_book_desc,container,false);
        if(book!=null){
            ((TextView)descView.findViewById(R.id.book_title)).setText(book.title);
            ((TextView)descView.findViewById(R.id.book_desc)).setText(book.desc);
        }
        return descView;
    }

}

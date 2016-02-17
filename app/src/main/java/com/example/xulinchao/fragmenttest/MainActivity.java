package com.example.xulinchao.fragmenttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity implements BookListFragement.FragementListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onclick(Integer id) {
        Bundle args=new Bundle();

        args.putInt(BookDescFragment.ITEM_ID,id);
        BookDescFragment bookDescFragment=new BookDescFragment();
        bookDescFragment.setArguments(args);
        getFragmentManager().beginTransaction().replace(R.id.book_desc,bookDescFragment).commit();
    }
}

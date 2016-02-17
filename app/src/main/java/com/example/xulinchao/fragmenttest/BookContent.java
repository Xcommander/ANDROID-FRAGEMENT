package com.example.xulinchao.fragmenttest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xulinchao on 2016/2/17.
 */
public class BookContent {
    public static class Book{
        public Integer id;
        public String title;
        public String desc;
        /**
         * 构造静态内部类
        * */
        public Book(Integer id, String title, String desc) {
            this.id = id;
            this.title = title;
            this.desc = desc;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    '}';
        }
    }
    public static List<Book> BookList=new ArrayList<Book>();

    public static Map<Integer,Book> BookMap=new HashMap<Integer,Book>();

    public static void addItem(Book book){
        BookList.add(book);
        BookMap.put(book.id,book);
    }
    static {
        addItem(new Book(1,"大秦帝国1","裂变"));
        addItem(new Book(2,"大秦帝国2","纵横"));
        addItem(new Book(3,"大秦帝国3","崛起"));
    }

}

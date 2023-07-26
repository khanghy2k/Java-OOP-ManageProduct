package com.ra;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("A");
        stringStack.push("B");
        stringStack.push("C");
        stringStack.push("D");
        stringStack.push("E");

        Map<String,Book> bookMap = new HashMap<>();
        bookMap.put("B001",new Book("1","Book1",500,"ra"));
        bookMap.put("B002",new Book("1","Book2",500,"ra"));
        bookMap.put("B003",new Book("1","Book3",500,"ra"));
        bookMap.put("B004",new Book("1","Book4",500,"ra"));
        bookMap.remove("B002");
        for (String key : bookMap.keySet()){
            System.out.println(bookMap.get(key).getTitle());
        }
        for (Book b : bookMap.values()){
            System.out.println(b.getTitle());
        }
    }
}

package com.example.a20230131_glennwhite_nycschools.view;

public interface Listener{
 void openDetails(String dbn);
 interface ListClickEvent{
  void clickDetails(String dbn);
 }
}
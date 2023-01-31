package com.example.a20230131_glennwhite_nycschools.model.state;


import com.example.a20230131_glennwhite_nycschools.model.remote.NYCSchoolSat;

public class RESPONSESAT extends UIState {
   private NYCSchoolSat data;

   public NYCSchoolSat getData() {
      return data;
   }

   public void setData(NYCSchoolSat data) {
      this.data = data;
   }
}

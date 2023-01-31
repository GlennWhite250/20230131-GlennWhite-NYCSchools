package com.example.a20230131_glennwhite_nycschools.model.state;


import com.example.a20230131_glennwhite_nycschools.model.remote.NYCSchoolResponse;

import java.util.List;

public class RESPONSESCHOOLLISt extends UIState {
    private List<NYCSchoolResponse> data;

    public List<NYCSchoolResponse> getData() {
        return data;
    }

    public void setData(List<NYCSchoolResponse> data) {
        this.data = data;
    }
}

package com.example.a20230131_glennwhite_nycschools.model;



import com.example.a20230131_glennwhite_nycschools.model.state.UIState;

import io.reactivex.rxjava3.core.Single;

public interface Repository {
    Single<UIState> getSchoolList();
    Single<UIState> getSchoolDetails(String dbn);
}

package com.example.a20230131_glennwhite_nycschools.model.network;


import com.example.a20230131_glennwhite_nycschools.model.network.utils.CONSTANTS;
import com.example.a20230131_glennwhite_nycschools.model.remote.NYCSchoolResponse;
import com.example.a20230131_glennwhite_nycschools.model.remote.NYCSchoolSat;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import retrofit2.http.GET;

public interface NYCService {
    @GET(CONSTANTS.ENDPOINT_SCHOOL)
    Single<List<NYCSchoolResponse>> getSchoolList();

    @GET(CONSTANTS.ENDPOINT_SAT)
    Single<List<NYCSchoolSat>> getSatList();
}

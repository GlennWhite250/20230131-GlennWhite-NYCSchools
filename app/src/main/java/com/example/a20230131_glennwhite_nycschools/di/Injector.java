package com.example.a20230131_glennwhite_nycschools.di;


import com.example.a20230131_glennwhite_nycschools.model.Repository;
import com.example.a20230131_glennwhite_nycschools.model.RepositoryImpl;
import com.example.a20230131_glennwhite_nycschools.model.network.Network;
import com.example.a20230131_glennwhite_nycschools.viewmodel.provider.SchoolViewModelProvider;

public class Injector {
    private static final Injector ourInstance = new Injector();

    public static Injector getInstance() {
        return ourInstance;
    }

    private Injector() {
    }

    public SchoolViewModelProvider provideProvider(){
        return new SchoolViewModelProvider(provideRepository());
    }

    private Repository provideRepository(){
        return new RepositoryImpl(Network.getInstance());
    }
}

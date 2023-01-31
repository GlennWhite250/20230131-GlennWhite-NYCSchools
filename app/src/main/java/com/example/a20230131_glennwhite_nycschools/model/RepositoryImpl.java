package com.example.a20230131_glennwhite_nycschools.model;



import com.example.a20230131_glennwhite_nycschools.model.network.Network;
import com.example.a20230131_glennwhite_nycschools.model.remote.NYCSchoolSat;
import com.example.a20230131_glennwhite_nycschools.model.state.RESPONSESAT;
import com.example.a20230131_glennwhite_nycschools.model.state.RESPONSESCHOOLLISt;
import com.example.a20230131_glennwhite_nycschools.model.state.UIState;

import io.reactivex.rxjava3.core.Single;

public class RepositoryImpl implements Repository  {

   private Network network;

   public RepositoryImpl(Network network){
      this.network = network;
   }

   @Override
   public Single<UIState> getSchoolList() {
      return network.getSERVICE().getSchoolList()
              .map(nycSchoolResponses -> {
                 RESPONSESCHOOLLISt result = new RESPONSESCHOOLLISt();
                 result.setData(nycSchoolResponses);
                 return result;
              });
   }

   @Override
   public Single<UIState> getSchoolDetails(String dbn) {
       return network.getSERVICE().getSatList()
               .map(nycSchoolSats -> {
                   NYCSchoolSat satSchool = new NYCSchoolSat();
                   for (NYCSchoolSat sat :
                           nycSchoolSats) {
                       if (sat.getDbn().equals(dbn))
                           satSchool = sat;
                   }
                   RESPONSESAT result = new RESPONSESAT();
                   result.setData(satSchool);
                   return result;
               });
   }
}

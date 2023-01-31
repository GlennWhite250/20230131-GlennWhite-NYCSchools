package com.example.a20230131_glennwhite_nycschools;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a20230131_glennwhite_nycschools.R;
import com.example.a20230131_glennwhite_nycschools.view.Listener;
import com.example.a20230131_glennwhite_nycschools.view.SchoolDetails;
import com.example.a20230131_glennwhite_nycschools.view.SchoolDisplay;

public class MainActivity extends AppCompatActivity implements Listener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showDisplayFragment();

    }

    private void showDisplayFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new SchoolDisplay())
                .commit();
    }

    @Override
    public void openDetails(String dbn) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new SchoolDetails().getInstance(dbn))
                .addToBackStack(null)
                .commit();
        for (PackageInfo pack :
                getPackageManager().getInstalledPackages(PackageManager.GET_PROVIDERS)) {
            ProviderInfo[] providers = pack.providers;
            if (providers != null) {
                for (ProviderInfo provider : providers)
                    Log.d("TAG", "openDetails: " + provider.authority);
            }
        }
    }
}
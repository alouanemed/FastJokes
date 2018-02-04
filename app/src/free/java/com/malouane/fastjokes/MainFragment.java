package com.malouane.fastjokes;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainFragment extends Fragment {

  public MainFragment() {
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View root = inflater.inflate(R.layout.fragment_main, container, false);

    AdView mAdView = root.findViewById(R.id.adView);
    AdRequest adRequest =
        new AdRequest.Builder().addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build();
    mAdView.loadAd(adRequest);
    return root;
  }
}

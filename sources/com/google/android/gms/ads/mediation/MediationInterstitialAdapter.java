package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

public interface MediationInterstitialAdapter extends ble {
    void requestInterstitialAd(Context context, blg blg, Bundle bundle, bld bld, Bundle bundle2);

    void showInterstitial();
}

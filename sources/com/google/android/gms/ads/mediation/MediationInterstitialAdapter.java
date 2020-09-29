package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

public interface MediationInterstitialAdapter extends bkn {
    void requestInterstitialAd(Context context, bkp bkp, Bundle bundle, bkm bkm, Bundle bundle2);

    void showInterstitial();
}

package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public interface MediationBannerAdapter extends ble {
    View getBannerView();

    void requestBannerAd(Context context, blf blf, Bundle bundle, bfi bfi, bld bld, Bundle bundle2);
}

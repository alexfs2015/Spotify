package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public interface MediationBannerAdapter extends bkn {
    View getBannerView();

    void requestBannerAd(Context context, bko bko, Bundle bundle, ber ber, bkm bkm, Bundle bundle2);
}

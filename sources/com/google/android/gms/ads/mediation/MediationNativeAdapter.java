package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;

public interface MediationNativeAdapter extends ble {
    void requestNativeAd(Context context, blh blh, Bundle bundle, bll bll, Bundle bundle2);
}

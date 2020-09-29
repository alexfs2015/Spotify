package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;

public interface MediationRewardedVideoAdAdapter extends ble {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, bld bld, String str, blw blw, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(bld bld, Bundle bundle, Bundle bundle2);

    void showVideo();
}

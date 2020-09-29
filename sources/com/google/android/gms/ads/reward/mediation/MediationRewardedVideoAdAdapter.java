package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;

public interface MediationRewardedVideoAdAdapter extends bkn {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, bkm bkm, String str, blf blf, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(bkm bkm, Bundle bundle, Bundle bundle2);

    void showVideo();
}

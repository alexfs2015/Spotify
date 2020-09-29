package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.MediationServerParameters;
import defpackage.apm;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends apm, SERVER_PARAMETERS extends MediationServerParameters> extends apj<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(apk apk, Activity activity, SERVER_PARAMETERS server_parameters, aph aph, api api, ADDITIONAL_PARAMETERS additional_parameters);
}

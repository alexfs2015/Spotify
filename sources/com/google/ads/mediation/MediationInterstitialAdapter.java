package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.MediationServerParameters;
import defpackage.aqd;

@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends aqd, SERVER_PARAMETERS extends MediationServerParameters> extends aqa<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(aqc aqc, Activity activity, SERVER_PARAMETERS server_parameters, apz apz, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}

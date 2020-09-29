package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.MediationServerParameters;
import defpackage.apm;

@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends apm, SERVER_PARAMETERS extends MediationServerParameters> extends apj<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(apl apl, Activity activity, SERVER_PARAMETERS server_parameters, api api, ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}

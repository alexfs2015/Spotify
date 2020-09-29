package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.MediationServerParameters;
import defpackage.aqd;

@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends aqd, SERVER_PARAMETERS extends MediationServerParameters> extends aqa<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(aqb aqb, Activity activity, SERVER_PARAMETERS server_parameters, apy apy, apz apz, ADDITIONAL_PARAMETERS additional_parameters);
}

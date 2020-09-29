package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.PinkiePie;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.MediationServerParameters;

public final class CustomEventAdapter implements MediationBannerAdapter<blq, aqi>, MediationInterstitialAdapter<blq, aqi> {
    private aqe a;
    private aqg b;

    static final class a implements aqf {
        private final CustomEventAdapter a;
        private final aqb b;

        public a(CustomEventAdapter customEventAdapter, aqb aqb) {
            this.a = customEventAdapter;
            this.b = aqb;
        }
    }

    class b implements aqh {
        private final CustomEventAdapter a;
        private final aqc b;

        public b(CustomEventAdapter customEventAdapter, aqc aqc) {
            this.a = customEventAdapter;
            this.b = aqc;
        }
    }

    private static <T> T a(String str) {
        try {
            return Class.forName(str).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            sb.toString();
            cpn.a(5);
            return null;
        }
    }

    public final void destroy() {
    }

    public final Class<blq> getAdditionalParametersType() {
        return blq.class;
    }

    public final View getBannerView() {
        return null;
    }

    public final Class<aqi> getServerParametersType() {
        return aqi.class;
    }

    public final void requestBannerAd(aqb aqb, Activity activity, aqi aqi, apy apy, apz apz, blq blq) {
        Object obj = null;
        this.a = (aqe) a(null);
        if (this.a == null) {
            aqb.a(ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (blq != null) {
            obj = blq.a(null);
        }
        this.a.a(new a(this, aqb), activity, null, null, apy, apz, obj);
    }

    public final /* bridge */ /* synthetic */ void requestBannerAd(aqb aqb, Activity activity, MediationServerParameters mediationServerParameters, apy apy, apz apz, aqd aqd) {
        aqi aqi = (aqi) mediationServerParameters;
        blq blq = (blq) aqd;
        PinkiePie.DianePie();
    }

    public final void requestInterstitialAd(aqc aqc, Activity activity, aqi aqi, apz apz, blq blq) {
        Object obj = null;
        this.b = (aqg) a(null);
        if (this.b == null) {
            aqc.b(ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (blq != null) {
            obj = blq.a(null);
        }
        this.b.a(new b(this, aqc), activity, null, null, apz, obj);
    }

    public final /* bridge */ /* synthetic */ void requestInterstitialAd(aqc aqc, Activity activity, MediationServerParameters mediationServerParameters, apz apz, aqd aqd) {
        aqi aqi = (aqi) mediationServerParameters;
        blq blq = (blq) aqd;
        PinkiePie.DianePie();
    }

    public final void showInterstitial() {
        this.b.a();
    }
}

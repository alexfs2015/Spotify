package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;

public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    private CustomEventBanner a;
    private CustomEventInterstitial b;
    private CustomEventNative c;

    static final class a implements bky {
        private final CustomEventAdapter a;
        private final bko b;

        public a(CustomEventAdapter customEventAdapter, bko bko) {
            this.a = customEventAdapter;
            this.b = bko;
        }
    }

    class b implements bla {
        private final CustomEventAdapter a;
        private final bkp b;

        public b(CustomEventAdapter customEventAdapter, bkp bkp) {
            this.a = customEventAdapter;
            this.b = bkp;
        }
    }

    static class c implements blb {
        private final CustomEventAdapter a;
        private final bkq b;

        public c(CustomEventAdapter customEventAdapter, bkq bkq) {
            this.a = customEventAdapter;
            this.b = bkq;
        }
    }

    public final View getBannerView() {
        return null;
    }

    public final void onDestroy() {
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void requestBannerAd(Context context, bko bko, Bundle bundle, ber ber, bkm bkm, Bundle bundle2) {
        String str = "class_name";
        this.a = (CustomEventBanner) a(bundle.getString(str));
        if (this.a == null) {
            bko.a(0);
            return;
        }
        this.a.requestBannerAd(context, new a(this, bko), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), ber, bkm, bundle2 == null ? null : bundle2.getBundle(bundle.getString(str)));
    }

    public final void requestInterstitialAd(Context context, bkp bkp, Bundle bundle, bkm bkm, Bundle bundle2) {
        String str = "class_name";
        this.b = (CustomEventInterstitial) a(bundle.getString(str));
        if (this.b == null) {
            bkp.b(0);
            return;
        }
        this.b.requestInterstitialAd(context, new b(this, bkp), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), bkm, bundle2 == null ? null : bundle2.getBundle(bundle.getString(str)));
    }

    public final void requestNativeAd(Context context, bkq bkq, Bundle bundle, bku bku, Bundle bundle2) {
        String str = "class_name";
        this.c = (CustomEventNative) a(bundle.getString(str));
        if (this.c == null) {
            bkq.c(0);
            return;
        }
        this.c.requestNativeAd(context, new c(this, bkq), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), bku, bundle2 == null ? null : bundle2.getBundle(bundle.getString(str)));
    }

    public final void showInterstitial() {
        this.b.showInterstitial();
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
            cow.a(5);
            return null;
        }
    }
}

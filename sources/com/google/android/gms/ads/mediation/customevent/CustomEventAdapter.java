package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.PinkiePie;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;

public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {
    private CustomEventBanner a;
    private CustomEventInterstitial b;
    private CustomEventNative c;

    static final class a implements blp {
        private final CustomEventAdapter a;
        private final blf b;

        public a(CustomEventAdapter customEventAdapter, blf blf) {
            this.a = customEventAdapter;
            this.b = blf;
        }
    }

    class b implements blr {
        private final CustomEventAdapter a;
        private final blg b;

        public b(CustomEventAdapter customEventAdapter, blg blg) {
            this.a = customEventAdapter;
            this.b = blg;
        }
    }

    static class c implements bls {
        private final CustomEventAdapter a;
        private final blh b;

        public c(CustomEventAdapter customEventAdapter, blh blh) {
            this.a = customEventAdapter;
            this.b = blh;
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

    public final View getBannerView() {
        return null;
    }

    public final void onDestroy() {
    }

    public final void onPause() {
    }

    public final void onResume() {
    }

    public final void requestBannerAd(Context context, blf blf, Bundle bundle, bfi bfi, bld bld, Bundle bundle2) {
        String str = "class_name";
        this.a = (CustomEventBanner) a(bundle.getString(str));
        if (this.a == null) {
            blf.a(0);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString(str));
        CustomEventBanner customEventBanner = this.a;
        new a(this, blf);
        String string = bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        Context context2 = context;
        bfi bfi2 = bfi;
        bld bld2 = bld;
        PinkiePie.DianePie();
    }

    public final void requestInterstitialAd(Context context, blg blg, Bundle bundle, bld bld, Bundle bundle2) {
        String str = "class_name";
        this.b = (CustomEventInterstitial) a(bundle.getString(str));
        if (this.b == null) {
            blg.b(0);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString(str));
        CustomEventInterstitial customEventInterstitial = this.b;
        new b(this, blg);
        String string = bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        Context context2 = context;
        bld bld2 = bld;
        PinkiePie.DianePie();
    }

    public final void requestNativeAd(Context context, blh blh, Bundle bundle, bll bll, Bundle bundle2) {
        String str = "class_name";
        this.c = (CustomEventNative) a(bundle.getString(str));
        if (this.c == null) {
            blh.c(0);
            return;
        }
        this.c.requestNativeAd(context, new c(this, blh), bundle.getString(MediationRewardedVideoAdAdapter.CUSTOM_EVENT_SERVER_PARAMETER_FIELD), bll, bundle2 == null ? null : bundle2.getBundle(bundle.getString(str)));
    }

    public final void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.b;
        PinkiePie.DianePie();
    }
}

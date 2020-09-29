package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;

public final class CustomEventAdapter implements MediationBannerAdapter<bkz, apr>, MediationInterstitialAdapter<bkz, apr> {
    private apn a;
    private app b;

    static final class a implements apo {
        private final CustomEventAdapter a;
        private final apk b;

        public a(CustomEventAdapter customEventAdapter, apk apk) {
            this.a = customEventAdapter;
            this.b = apk;
        }
    }

    class b implements apq {
        private final CustomEventAdapter a;
        private final apl b;

        public b(CustomEventAdapter customEventAdapter, apl apl) {
            this.a = customEventAdapter;
            this.b = apl;
        }
    }

    public final void destroy() {
    }

    public final Class<bkz> getAdditionalParametersType() {
        return bkz.class;
    }

    public final View getBannerView() {
        return null;
    }

    public final Class<apr> getServerParametersType() {
        return apr.class;
    }

    public final void requestBannerAd(apk apk, Activity activity, apr apr, aph aph, api api, bkz bkz) {
        Object obj = null;
        this.a = (apn) a(null);
        if (this.a == null) {
            apk.a(ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (bkz != null) {
            obj = bkz.a(null);
        }
        this.a.a(new a(this, apk), activity, null, null, aph, api, obj);
    }

    public final void requestInterstitialAd(apl apl, Activity activity, apr apr, api api, bkz bkz) {
        Object obj = null;
        this.b = (app) a(null);
        if (this.b == null) {
            apl.b(ErrorCode.INTERNAL_ERROR);
            return;
        }
        if (bkz != null) {
            obj = bkz.a(null);
        }
        this.b.a(new b(this, apl), activity, null, null, api, obj);
    }

    public final void showInterstitial() {
        this.b.a();
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

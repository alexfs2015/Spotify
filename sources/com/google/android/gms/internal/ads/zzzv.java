package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

@cey
public final class zzzv implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */
    public Activity a;
    /* access modifiers changed from: private */
    public bkp b;
    private Uri c;

    public final void showInterstitial() {
        de a2 = new a().a();
        a2.a.setData(this.c);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new bgs(a2.a), null, new eeq(this), null, new coy(0, 0, false));
        cmd.a.post(new eer(this, adOverlayInfoParcel));
        bjl.i().c();
    }

    public final void requestInterstitialAd(Context context, bkp bkp, Bundle bundle, bkm bkm, Bundle bundle2) {
        this.b = bkp;
        if (this.b == null) {
            cow.a(5);
        } else if (!(context instanceof Activity)) {
            cow.a(5);
            this.b.b(0);
        } else {
            if (!(bzo.a() && dtk.a(context))) {
                cow.a(5);
                this.b.b(0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                cow.a(5);
                this.b.b(0);
                return;
            }
            this.a = (Activity) context;
            this.c = Uri.parse(string);
            this.b.f();
        }
    }

    public final void onDestroy() {
        cow.a(3);
    }

    public final void onPause() {
        cow.a(3);
    }

    public final void onResume() {
        cow.a(3);
    }
}

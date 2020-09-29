package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

@cfp
public final class zzzv implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */
    public Activity a;
    /* access modifiers changed from: private */
    public blg b;
    private Uri c;

    public final void onDestroy() {
        cpn.a(3);
    }

    public final void onPause() {
        cpn.a(3);
    }

    public final void onResume() {
        cpn.a(3);
    }

    public final void requestInterstitialAd(Context context, blg blg, Bundle bundle, bld bld, Bundle bundle2) {
        this.b = blg;
        if (this.b == null) {
            cpn.a(5);
        } else if (!(context instanceof Activity)) {
            cpn.a(5);
            this.b.b(0);
        } else {
            if (!(caf.a() && dub.a(context))) {
                cpn.a(5);
                this.b.b(0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                cpn.a(5);
                this.b.b(0);
                return;
            }
            this.a = (Activity) context;
            this.c = Uri.parse(string);
            this.b.f();
        }
    }

    public final void showInterstitial() {
        de a2 = new a().a();
        a2.a.setData(this.c);
        AdOverlayInfoParcel adOverlayInfoParcel = new AdOverlayInfoParcel(new bhj(a2.a), null, new efh(this), null, new cpp(0, 0, false));
        cmu.a.post(new efi(this, adOverlayInfoParcel));
        bkc.i().c();
    }
}

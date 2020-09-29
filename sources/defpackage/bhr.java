package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

@cfp
/* renamed from: bhr reason: default package */
public final class bhr {
    public static void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.k == 4 && adOverlayInfoParcel.c == null) {
            if (adOverlayInfoParcel.b != null) {
                adOverlayInfoParcel.b.e();
            }
            bkc.b();
            bhh.a(context, adOverlayInfoParcel.a, adOverlayInfoParcel.i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.m.d);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        AdOverlayInfoParcel.a(intent, adOverlayInfoParcel);
        if (!caf.g()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        bkc.e();
        cmu.a(context, intent);
    }
}

package defpackage;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: biv reason: default package */
final class biv implements Runnable {
    private final /* synthetic */ AdOverlayInfoParcel a;
    private final /* synthetic */ biu b;

    biv(biu biu, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.b = biu;
        this.a = adOverlayInfoParcel;
    }

    public final void run() {
        bkc.c();
        bhr.a(this.b.a.e.c, this.a, true);
    }
}

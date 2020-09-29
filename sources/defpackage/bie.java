package defpackage;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* renamed from: bie reason: default package */
final class bie implements Runnable {
    private final /* synthetic */ AdOverlayInfoParcel a;
    private final /* synthetic */ bid b;

    bie(bid bid, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.b = bid;
        this.a = adOverlayInfoParcel;
    }

    public final void run() {
        bjl.c();
        bha.a(this.b.a.e.c, this.a, true);
    }
}

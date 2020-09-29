package defpackage;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzzv;

/* renamed from: eer reason: default package */
public final class eer implements Runnable {
    private final /* synthetic */ AdOverlayInfoParcel a;
    private final /* synthetic */ zzzv b;

    public eer(zzzv zzzv, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.b = zzzv;
        this.a = adOverlayInfoParcel;
    }

    public final void run() {
        bjl.c();
        bha.a(this.b.a, this.a, true);
    }
}

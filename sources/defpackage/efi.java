package defpackage;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzzv;

/* renamed from: efi reason: default package */
public final class efi implements Runnable {
    private final /* synthetic */ AdOverlayInfoParcel a;
    private final /* synthetic */ zzzv b;

    public efi(zzzv zzzv, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.b = zzzv;
        this.a = adOverlayInfoParcel;
    }

    public final void run() {
        bkc.c();
        bhr.a(this.b.a, this.a, true);
    }
}

package defpackage;

import com.spotify.music.toastie.ToastieManager;

/* renamed from: mxw reason: default package */
public final class mxw implements vua<mxv> {
    private final wlc<ToastieManager> a;
    private final wlc<uem> b;

    private mxw(wlc<ToastieManager> wlc, wlc<uem> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mxw a(wlc<ToastieManager> wlc, wlc<uem> wlc2) {
        return new mxw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mxv((ToastieManager) this.a.get(), (uem) this.b.get());
    }
}

package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: rco reason: default package */
public final class rco implements vua<rcn> {
    private final wlc<Context> a;
    private final wlc<ToastieManager> b;
    private final wlc<jsz> c;

    private rco(wlc<Context> wlc, wlc<ToastieManager> wlc2, wlc<jsz> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rco a(wlc<Context> wlc, wlc<ToastieManager> wlc2, wlc<jsz> wlc3) {
        return new rco(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rcn((Context) this.a.get(), (ToastieManager) this.b.get(), (jsz) this.c.get());
    }
}

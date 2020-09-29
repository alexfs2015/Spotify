package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: lnl reason: default package */
public final class lnl implements vua<lnk> {
    private final wlc<Context> a;
    private final wlc<rdc> b;
    private final wlc<jsz> c;
    private final wlc<ToastieManager> d;
    private final wlc<fss> e;

    private lnl(wlc<Context> wlc, wlc<rdc> wlc2, wlc<jsz> wlc3, wlc<ToastieManager> wlc4, wlc<fss> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static lnl a(wlc<Context> wlc, wlc<rdc> wlc2, wlc<jsz> wlc3, wlc<ToastieManager> wlc4, wlc<fss> wlc5) {
        lnl lnl = new lnl(wlc, wlc2, wlc3, wlc4, wlc5);
        return lnl;
    }

    public final /* synthetic */ Object get() {
        lnk lnk = new lnk(this.a, this.b, this.c, this.d, this.e);
        return lnk;
    }
}

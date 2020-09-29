package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: mjb reason: default package */
public final class mjb implements vua<miy> {
    private final wlc<miz> a;
    private final wlc<uxh> b;
    private final wlc<ToastieManager> c;
    private final wlc<Context> d;

    private mjb(wlc<miz> wlc, wlc<uxh> wlc2, wlc<ToastieManager> wlc3, wlc<Context> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mjb a(wlc<miz> wlc, wlc<uxh> wlc2, wlc<ToastieManager> wlc3, wlc<Context> wlc4) {
        return new mjb(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new miy((miz) this.a.get(), (uxh) this.b.get(), (ToastieManager) this.c.get(), (Context) this.d.get());
    }
}

package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: rbl reason: default package */
public final class rbl implements vua<rbk> {
    private final wlc<Context> a;
    private final wlc<ToastieManager> b;

    private rbl(wlc<Context> wlc, wlc<ToastieManager> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rbl a(wlc<Context> wlc, wlc<ToastieManager> wlc2) {
        return new rbl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rbk((Context) this.a.get(), (ToastieManager) this.b.get());
    }
}

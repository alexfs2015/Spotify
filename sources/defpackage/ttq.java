package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: ttq reason: default package */
public final class ttq implements vua<ttp> {
    private final wlc<kxs> a;
    private final wlc<ToastieManager> b;
    private final wlc<Context> c;

    private ttq(wlc<kxs> wlc, wlc<ToastieManager> wlc2, wlc<Context> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static ttq a(wlc<kxs> wlc, wlc<ToastieManager> wlc2, wlc<Context> wlc3) {
        return new ttq(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ttp((kxs) this.a.get(), (ToastieManager) this.b.get(), (Context) this.c.get());
    }
}

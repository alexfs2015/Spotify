package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: rlm reason: default package */
public final class rlm implements wig<rll> {
    private final wzi<Context> a;
    private final wzi<ToastieManager> b;
    private final wzi<jvf> c;

    private rlm(wzi<Context> wzi, wzi<ToastieManager> wzi2, wzi<jvf> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rlm a(wzi<Context> wzi, wzi<ToastieManager> wzi2, wzi<jvf> wzi3) {
        return new rlm(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new rll((Context) this.a.get(), (ToastieManager) this.b.get(), (jvf) this.c.get());
    }
}

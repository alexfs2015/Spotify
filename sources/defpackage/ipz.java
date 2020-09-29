package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: ipz reason: default package */
public final class ipz implements vua<ipx> {
    private final wlc<Context> a;
    private final wlc<ToastieManager> b;
    private final wlc<jsz> c;

    public static ipx a(Context context, ToastieManager toastieManager, jsz jsz) {
        return (ipx) vuf.a(CC.a(context, toastieManager, jsz), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (ToastieManager) this.b.get(), (jsz) this.c.get());
    }
}

package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: pmy reason: default package */
public final class pmy implements vua<pmx> {
    private final wlc<Context> a;
    private final wlc<ToastieManager> b;

    public static pmx a(Context context, ToastieManager toastieManager) {
        return new pmx(context, toastieManager);
    }

    public final /* synthetic */ Object get() {
        return new pmx((Context) this.a.get(), (ToastieManager) this.b.get());
    }
}

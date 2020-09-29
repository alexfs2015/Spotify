package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: ism reason: default package */
public final class ism implements wig<isk> {
    private final wzi<Context> a;
    private final wzi<ToastieManager> b;
    private final wzi<jvf> c;

    public static isk a(Context context, ToastieManager toastieManager, jvf jvf) {
        return (isk) wil.a(CC.a(context, toastieManager, jvf), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get(), (ToastieManager) this.b.get(), (jvf) this.c.get());
    }
}

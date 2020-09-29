package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: rkh reason: default package */
public final class rkh implements wig<rkg> {
    private final wzi<Context> a;
    private final wzi<ToastieManager> b;

    private rkh(wzi<Context> wzi, wzi<ToastieManager> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rkh a(wzi<Context> wzi, wzi<ToastieManager> wzi2) {
        return new rkh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rkg((Context) this.a.get(), (ToastieManager) this.b.get());
    }
}

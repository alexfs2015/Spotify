package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: uft reason: default package */
public final class uft implements wig<ufs> {
    private final wzi<lbb> a;
    private final wzi<ToastieManager> b;
    private final wzi<Context> c;

    private uft(wzi<lbb> wzi, wzi<ToastieManager> wzi2, wzi<Context> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static uft a(wzi<lbb> wzi, wzi<ToastieManager> wzi2, wzi<Context> wzi3) {
        return new uft(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ufs((lbb) this.a.get(), (ToastieManager) this.b.get(), (Context) this.c.get());
    }
}

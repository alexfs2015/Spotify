package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: mnu reason: default package */
public final class mnu implements wig<mnr> {
    private final wzi<mns> a;
    private final wzi<vjj> b;
    private final wzi<ToastieManager> c;
    private final wzi<Context> d;

    private mnu(wzi<mns> wzi, wzi<vjj> wzi2, wzi<ToastieManager> wzi3, wzi<Context> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static mnu a(wzi<mns> wzi, wzi<vjj> wzi2, wzi<ToastieManager> wzi3, wzi<Context> wzi4) {
        return new mnu(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new mnr((mns) this.a.get(), (vjj) this.b.get(), (ToastieManager) this.c.get(), (Context) this.d.get());
    }
}

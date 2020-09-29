package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: lrl reason: default package */
public final class lrl implements wig<lrk> {
    private final wzi<Context> a;
    private final wzi<rma> b;
    private final wzi<jvf> c;
    private final wzi<ToastieManager> d;
    private final wzi<ftm> e;

    private lrl(wzi<Context> wzi, wzi<rma> wzi2, wzi<jvf> wzi3, wzi<ToastieManager> wzi4, wzi<ftm> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static lrl a(wzi<Context> wzi, wzi<rma> wzi2, wzi<jvf> wzi3, wzi<ToastieManager> wzi4, wzi<ftm> wzi5) {
        lrl lrl = new lrl(wzi, wzi2, wzi3, wzi4, wzi5);
        return lrl;
    }

    public final /* synthetic */ Object get() {
        lrk lrk = new lrk(this.a, this.b, this.c, this.d, this.e);
        return lrk;
    }
}

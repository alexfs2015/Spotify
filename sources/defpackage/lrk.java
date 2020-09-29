package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: lrk reason: default package */
public final class lrk {
    private final wzi<Context> a;
    private final wzi<rma> b;
    private final wzi<jvf> c;
    private final wzi<ToastieManager> d;
    private final wzi<ftm> e;

    public lrk(wzi<Context> wzi, wzi<rma> wzi2, wzi<jvf> wzi3, wzi<ToastieManager> wzi4, wzi<ftm> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final lrj a(a aVar) {
        lrj lrj = new lrj((Context) a(this.a.get(), 1), (rma) a(this.b.get(), 2), (jvf) a(this.c.get(), 3), (ToastieManager) a(this.d.get(), 4), (ftm) a(this.e.get(), 5), (a) a(aVar, 6));
        return lrj;
    }
}

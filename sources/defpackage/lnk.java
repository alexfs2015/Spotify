package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: lnk reason: default package */
public final class lnk {
    private final wlc<Context> a;
    private final wlc<rdc> b;
    private final wlc<jsz> c;
    private final wlc<ToastieManager> d;
    private final wlc<fss> e;

    public lnk(wlc<Context> wlc, wlc<rdc> wlc2, wlc<jsz> wlc3, wlc<ToastieManager> wlc4, wlc<fss> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
    }

    public final lnj a(a aVar) {
        lnj lnj = new lnj((Context) a(this.a.get(), 1), (rdc) a(this.b.get(), 2), (jsz) a(this.c.get(), 3), (ToastieManager) a(this.d.get(), 4), (fss) a(this.e.get(), 5), (a) a(aVar, 6));
        return lnj;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}

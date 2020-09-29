package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: msk reason: default package */
public final class msk {
    final wzi<Context> a;
    final wzi<sso> b;
    final wzi<rma> c;
    final wzi<ToastieManager> d;
    final wzi<ftm> e;

    public msk(wzi<Context> wzi, wzi<sso> wzi2, wzi<rma> wzi3, wzi<ToastieManager> wzi4, wzi<ftm> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}

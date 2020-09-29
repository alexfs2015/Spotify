package defpackage;

import android.content.Context;
import com.spotify.music.toastie.ToastieManager;

/* renamed from: mnr reason: default package */
public final class mnr {
    final wlc<Context> a;
    final wlc<sih> b;
    final wlc<rdc> c;
    final wlc<ToastieManager> d;
    final wlc<fss> e;

    public mnr(wlc<Context> wlc, wlc<sih> wlc2, wlc<rdc> wlc3, wlc<ToastieManager> wlc4, wlc<fss> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
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

package defpackage;

import com.spotify.music.libs.web.RxWebToken;

/* renamed from: snf reason: default package */
public final class snf {
    public final wlc<ka> a;
    public final wlc<jix> b;
    public final wlc<jjb> c;
    public final wlc<jiv> d;
    public final wlc<sov> e;
    public final wlc<RxWebToken> f;
    public final wlc<mbl> g;

    public snf(wlc<ka> wlc, wlc<jix> wlc2, wlc<jjb> wlc3, wlc<jiv> wlc4, wlc<sov> wlc5, wlc<RxWebToken> wlc6, wlc<mbl> wlc7) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}

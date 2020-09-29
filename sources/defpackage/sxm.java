package defpackage;

import com.spotify.music.libs.web.RxWebToken;

/* renamed from: sxm reason: default package */
public final class sxm {
    public final wzi<kf> a;
    public final wzi<jlj> b;
    public final wzi<jln> c;
    public final wzi<jlh> d;
    public final wzi<szc> e;
    public final wzi<RxWebToken> f;
    public final wzi<mfo> g;

    public sxm(wzi<kf> wzi, wzi<jlj> wzi2, wzi<jln> wzi3, wzi<jlh> wzi4, wzi<szc> wzi5, wzi<RxWebToken> wzi6, wzi<mfo> wzi7) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
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

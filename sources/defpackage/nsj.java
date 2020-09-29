package defpackage;

import com.spotify.music.features.homemix.HomeMixFormatListAttributesHelper;

/* renamed from: nsj reason: default package */
public final class nsj {
    final wzi<ovj> a;
    final wzi<a<ovg>> b;
    final wzi<ovh> c;
    final wzi<nsa> d;
    final wzi<sso> e;
    final wzi<HomeMixFormatListAttributesHelper> f;

    public nsj(wzi<ovj> wzi, wzi<a<ovg>> wzi2, wzi<ovh> wzi3, wzi<nsa> wzi4, wzi<sso> wzi5, wzi<HomeMixFormatListAttributesHelper> wzi6) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
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

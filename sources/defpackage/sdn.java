package defpackage;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: sdn reason: default package */
public final class sdn {
    public final wzi<Context> a;
    public final wzi<MediaSessionCompat> b;
    public final wzi<vex> c;
    public final wzi<hpy> d;
    public final wzi<scr> e;
    public final wzi<sdr> f;
    public final wzi<scn> g;
    public final wzi<hqy> h;
    public final wzi<sdh> i;

    public sdn(wzi<Context> wzi, wzi<MediaSessionCompat> wzi2, wzi<vex> wzi3, wzi<hpy> wzi4, wzi<scr> wzi5, wzi<sdr> wzi6, wzi<scn> wzi7, wzi<hqy> wzi8, wzi<sdh> wzi9) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
        this.h = (wzi) a(wzi8, 8);
        this.i = (wzi) a(wzi9, 9);
    }

    public static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}

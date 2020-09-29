package defpackage;

import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;

/* renamed from: rub reason: default package */
public final class rub {
    public final wlc<Context> a;
    public final wlc<MediaSessionCompat> b;
    public final wlc<ruk> c;
    public final wlc<hnj> d;
    public final wlc<rtk> e;
    public final wlc<rue> f;
    public final wlc<rtg> g;
    public final wlc<hou> h;
    public final wlc<rtw> i;

    public rub(wlc<Context> wlc, wlc<MediaSessionCompat> wlc2, wlc<ruk> wlc3, wlc<hnj> wlc4, wlc<rtk> wlc5, wlc<rue> wlc6, wlc<rtg> wlc7, wlc<hou> wlc8, wlc<rtw> wlc9) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
        this.i = (wlc) a(wlc9, 9);
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

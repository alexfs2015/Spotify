package defpackage;

import com.spotify.music.features.addtoplaylist.AddToPlaylistLogger;
import io.reactivex.Scheduler;

/* renamed from: lng reason: default package */
public final class lng {
    public final wlc<lnp> a;
    public final wlc<uxc> b;
    public final wlc<uxh> c;
    public final wlc<uxn> d;
    public final wlc<AddToPlaylistLogger> e;
    public final wlc<Scheduler> f;
    public final wlc<hbj> g;
    public final wlc<hbc> h;
    public final wlc<lmy> i;
    public final wlc<lmx> j;
    public final wlc<lmz> k;
    public final wlc<lnk> l;
    public final wlc<lnm> m;

    public lng(wlc<lnp> wlc, wlc<uxc> wlc2, wlc<uxh> wlc3, wlc<uxn> wlc4, wlc<AddToPlaylistLogger> wlc5, wlc<Scheduler> wlc6, wlc<hbj> wlc7, wlc<hbc> wlc8, wlc<lmy> wlc9, wlc<lmx> wlc10, wlc<lmz> wlc11, wlc<lnk> wlc12, wlc<lnm> wlc13) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
        this.i = (wlc) a(wlc9, 9);
        this.j = (wlc) a(wlc10, 10);
        this.k = (wlc) a(wlc11, 11);
        this.l = (wlc) a(wlc12, 12);
        this.m = (wlc) a(wlc13, 13);
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

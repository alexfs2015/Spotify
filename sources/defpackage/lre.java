package defpackage;

import com.spotify.music.features.addtoplaylist.AddToPlaylistLogger;
import io.reactivex.Scheduler;

/* renamed from: lre reason: default package */
public final class lre {
    public final wzi<lrp> a;
    public final wzi<vje> b;
    public final wzi<vjj> c;
    public final wzi<vjp> d;
    public final wzi<AddToPlaylistLogger> e;
    public final wzi<Scheduler> f;
    public final wzi<hec> g;
    public final wzi<hdv> h;
    public final wzi<lqy> i;
    public final wzi<lqz> j;
    public final wzi<lqx> k;
    public final wzi<lrk> l;
    public final wzi<lrm> m;

    public lre(wzi<lrp> wzi, wzi<vje> wzi2, wzi<vjj> wzi3, wzi<vjp> wzi4, wzi<AddToPlaylistLogger> wzi5, wzi<Scheduler> wzi6, wzi<hec> wzi7, wzi<hdv> wzi8, wzi<lqy> wzi9, wzi<lqz> wzi10, wzi<lqx> wzi11, wzi<lrk> wzi12, wzi<lrm> wzi13) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
        this.h = (wzi) a(wzi8, 8);
        this.i = (wzi) a(wzi9, 9);
        this.j = (wzi) a(wzi10, 10);
        this.k = (wzi) a(wzi11, 11);
        this.l = (wzi) a(wzi12, 12);
        this.m = (wzi) a(wzi13, 13);
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

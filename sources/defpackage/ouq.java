package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.b;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import io.reactivex.Scheduler;
import java.util.List;

/* renamed from: ouq reason: default package */
public final class ouq implements a {
    private final wzi<sso> a;
    private final wzi<String> b;
    private final wzi<szp> c;
    private final wzi<ous> d;
    private final wzi<Scheduler> e;
    private final wzi<lal> f;
    private final wzi<ujf> g;
    private final wzi<lar> h;
    private final wzi<jpc> i;
    private final wzi<lon> j;
    private final wzi<ovd> k;
    private final wzi<tmu> l;
    private final wzi<lav> m;
    private final wzi<List<b>> n;

    public ouq(wzi<sso> wzi, wzi<String> wzi2, wzi<szp> wzi3, wzi<ous> wzi4, wzi<Scheduler> wzi5, wzi<lal> wzi6, wzi<ujf> wzi7, wzi<lar> wzi8, wzi<jpc> wzi9, wzi<lon> wzi10, wzi<ovd> wzi11, wzi<tmu> wzi12, wzi<lav> wzi13, wzi<List<b>> wzi14) {
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
        this.n = (wzi) a(wzi14, 14);
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ ouo a(ItemListConfiguration itemListConfiguration) {
        oup oup = new oup((sso) a(this.a.get(), 1), (String) a(this.b.get(), 2), (szp) a(this.c.get(), 3), (ous) a(this.d.get(), 4), (Scheduler) a(this.e.get(), 5), (lal) a(this.f.get(), 6), (ujf) a(this.g.get(), 7), (lar) a(this.h.get(), 8), (jpc) a(this.i.get(), 9), (lon) a(this.j.get(), 10), (ovd) a(this.k.get(), 11), (tmu) a(this.l.get(), 12), (lav) a(this.m.get(), 13), (List) a(this.n.get(), 14), (ItemListConfiguration) a(itemListConfiguration, 15));
        return oup;
    }
}

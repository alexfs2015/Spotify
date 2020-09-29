package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: nak reason: default package */
public class nak implements naj, ror {
    private final String a;
    private final xii<hcs> b;
    private final hhc c;
    private final CollectionStateProvider d;
    private final lar e;
    private final rom f;
    private final szp g;
    private final hec h;
    private final izh i;
    private final c<hcs, hcs> j;
    private final urm k;
    private final isn l;
    private final iss m;
    private final mxx n;
    private final stl o;
    private final boolean p;
    private final boolean q;
    private final xok r = new xok();
    private hcs s;

    public nak(boolean z, urm urm, mxs mxs, String str, hhc hhc, CollectionStateProvider collectionStateProvider, lar lar, rom rom, szp szp, hec hec, izh izh, hhm<hcs> hhm, stl stl, isn isn, iss iss, boolean z2, mxx mxx) {
        this.p = z;
        this.k = urm;
        this.b = mxs.a(str);
        this.a = (String) fbp.a(str);
        this.c = (hhc) fbp.a(hhc);
        this.d = collectionStateProvider;
        this.e = (lar) fbp.a(lar);
        this.f = (rom) fbp.a(rom);
        this.g = szp;
        this.h = (hec) fbp.a(hec);
        this.i = (izh) fbp.a(izh);
        this.j = hhm;
        this.o = stl;
        this.l = isn;
        this.m = iss;
        this.q = z2;
        this.n = mxx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ho a(hcs hcs, Map map, Boolean bool) {
        return ho.a(hcs, roq.a(hcs, ((a) map.get(this.a)).a(), false, bool.booleanValue()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in FreeTierAlbumPresenter", th);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(nat nat, Throwable th) {
        nat.a();
        Logger.e(th, "Failed to load album page", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(nat nat, ros ros, ho hoVar) {
        this.s = (hcs) fbp.a(hoVar.a);
        if (this.s.body().isEmpty()) {
            nat.a();
            return;
        }
        nat.a(this.s);
        ros.a((roq) hoVar.b);
        if (!this.q || !this.p) {
            if (this.q) {
                this.o.a(this.s);
            }
            return;
        }
        mxx mxx = this.n;
        hcs hcs = this.s;
        nat.getClass();
        mxx.a(hcs, (naq) new $$Lambda$ibDPkbP10J035_UTE6obNfKHd_Y(nat));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, ImmutableList immutableList) {
        if (z) {
            this.e.a((String[]) immutableList.toArray(new String[0]), this.a, true);
        } else {
            this.e.a((String[]) immutableList.toArray(new String[0]), true);
        }
        rom rom = this.f;
        boolean z2 = !z;
        String str = this.a;
        rom.a(z2 ? "remove-all-tracks-album-from-collection" : "add-all-tracks-album-to-collection", null, str, str, -1, "context-menu");
    }

    public void a() {
        this.r.a();
    }

    public final void a(String str) {
        this.k.a(str);
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.i.a(str, str2, (String) null, str3, str4, (String) null, jqg.a);
        this.f.a(str, null);
    }

    public /* synthetic */ void a(String str, List<String> list) {
        CC.$default$a(this, str, list);
    }

    public void a(String str, boolean z) {
        if (z) {
            this.e.a(str, str, true);
        } else {
            this.e.a(str, true);
        }
        this.f.a(!z, str, str);
    }

    public void a(nat nat, ros ros) {
        fbp.a(nat);
        fbp.a(ros);
        if (this.s == null) {
            nat.b();
        }
        xok xok = this.r;
        hcs hcs = this.s;
        xii a2 = (hcs != null ? ScalarSynchronousObservable.d(hcs) : this.b).a(this.j);
        CollectionStateProvider collectionStateProvider = this.d;
        String str = this.a;
        xok.a(xii.a(a2, wit.a((ObservableSource<T>) collectionStateProvider.b(str, str, str), BackpressureStrategy.BUFFER), this.l.b(this.a), (xja<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$nak$OIWMGP8qlWOSQ0DOeHeCGEhcwx0<Object,Object,Object,Object>(this)).a(wit.a(this.c.c())).a((xis<? super T>) new $$Lambda$nak$CZxEx6a_nnn3DNh1JK__gETq_A<Object>(this, nat, ros), (xis<Throwable>) new $$Lambda$nak$u2OAVC50Uq_YtYJY9thFb3Zf7AM<Throwable>(nat)));
    }

    public final void a(boolean z) {
        this.r.a(this.m.a(this.a).a(wit.a(this.c.c())).a((xis<? super T>) new $$Lambda$nak$pTTmAZpLttYkM4tv2VkTVmQTMW0<Object>(this, z), (xis<Throwable>) $$Lambda$nak$yNOQLZgQ5X9yafTmu2_Dk0w2LU.INSTANCE));
    }

    public final void b() {
        this.s = null;
    }

    public final void b(String str) {
        this.g.a(str);
    }

    public final void b(String str, boolean z) {
    }

    public final void c(String str) {
        this.h.a(Collections.singletonList(str), str, str);
    }
}

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

/* renamed from: mvj reason: default package */
public class mvj implements mvi, rfp {
    private final String a;
    private final wud<gzz> b;
    private final heg c;
    private final CollectionStateProvider d;
    private final kxi e;
    private final rfk f;
    private final spi g;
    private final hbj h;
    private final iww i;
    private final c<gzz, gzz> j;
    private final ufy k;
    private final iqa l;
    private final iqf m;
    private final msw n;
    private final sje o;
    private final boolean p;
    private final boolean q;
    private final xag r = new xag();
    private gzz s;

    public /* synthetic */ void a(String str, List<String> list) {
        CC.$default$a(this, str, list);
    }

    public final void b(String str, boolean z) {
    }

    public mvj(boolean z, ufy ufy, msr msr, String str, heg heg, CollectionStateProvider collectionStateProvider, kxi kxi, rfk rfk, spi spi, hbj hbj, iww iww, heq<gzz> heq, sje sje, iqa iqa, iqf iqf, boolean z2, msw msw) {
        this.p = z;
        this.k = ufy;
        this.b = msr.a(str);
        this.a = (String) fay.a(str);
        this.c = (heg) fay.a(heg);
        this.d = collectionStateProvider;
        this.e = (kxi) fay.a(kxi);
        this.f = (rfk) fay.a(rfk);
        this.g = spi;
        this.h = (hbj) fay.a(hbj);
        this.i = (iww) fay.a(iww);
        this.j = heq;
        this.o = sje;
        this.l = iqa;
        this.m = iqf;
        this.q = z2;
        this.n = msw;
    }

    public void a(mvs mvs, rfq rfq) {
        wud wud;
        fay.a(mvs);
        fay.a(rfq);
        if (this.s == null) {
            mvs.b();
        }
        xag xag = this.r;
        gzz gzz = this.s;
        if (gzz != null) {
            wud = ScalarSynchronousObservable.d(gzz);
        } else {
            wud = this.b;
        }
        wud a2 = wud.a(this.j);
        CollectionStateProvider collectionStateProvider = this.d;
        String str = this.a;
        xag.a(wud.a(a2, vun.a((ObservableSource<T>) collectionStateProvider.b(str, str, str), BackpressureStrategy.BUFFER), this.l.b(this.a), (wuv<? super T1, ? super T2, ? super T3, ? extends R>) new $$Lambda$mvj$B2BRvCA_xYiMTH7FkHscFBQj8WM<Object,Object,Object,Object>(this)).a(vun.a(this.c.c())).a((wun<? super T>) new $$Lambda$mvj$eC4pG5xhdXjUxasHvVXihiNSd_k<Object>(this, mvs, rfq), (wun<Throwable>) new $$Lambda$mvj$_SYmr_9nLpRBylHkcSCbCiutKo<Throwable>(mvs)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(mvs mvs, rfq rfq, ho hoVar) {
        this.s = (gzz) fay.a(hoVar.a);
        if (this.s.body().isEmpty()) {
            mvs.a();
            return;
        }
        mvs.a(this.s);
        rfq.a((rfo) hoVar.b);
        if (!this.q || !this.p) {
            if (this.q) {
                this.o.a(this.s);
            }
            return;
        }
        msw msw = this.n;
        gzz gzz = this.s;
        mvs.getClass();
        msw.a(gzz, (mvp) new $$Lambda$Xb8m0_myQrSoUCdPPwSvSwOLcAE(mvs));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(mvs mvs, Throwable th) {
        mvs.a();
        Logger.e(th, "Failed to load album page", new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ho a(gzz gzz, Map map, Boolean bool) {
        return ho.a(gzz, rfo.a(gzz, ((a) map.get(this.a)).a(), false, bool.booleanValue()));
    }

    public void a() {
        this.r.a();
    }

    public final void b() {
        this.s = null;
    }

    public void a(String str, boolean z) {
        if (z) {
            this.e.a(str, str, true);
        } else {
            this.e.a(str, true);
        }
        this.f.a(!z, str, str);
    }

    public final void a(String str) {
        this.k.a(str);
    }

    public final void b(String str) {
        this.g.a(str);
    }

    public final void c(String str) {
        this.h.a(Collections.singletonList(str), str, str);
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.i.a(str, str2, (String) null, str3, str4, (String) null, jnu.a);
        this.f.a(str, null);
    }

    public final void a(boolean z) {
        this.r.a(this.m.a(this.a).a(vun.a(this.c.c())).a((wun<? super T>) new $$Lambda$mvj$iVNmKxrR3TDFSTmbBuVES2KmGF8<Object>(this, z), (wun<Throwable>) $$Lambda$mvj$G_20nsYqBMkVD8NiesTfYD2PLIs.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z, ImmutableList immutableList) {
        if (z) {
            this.e.a((String[]) immutableList.toArray(new String[0]), this.a, true);
        } else {
            this.e.a((String[]) immutableList.toArray(new String[0]), true);
        }
        rfk rfk = this.f;
        boolean z2 = !z;
        String str = this.a;
        rfk.a(z2 ? "remove-all-tracks-album-from-collection" : "add-all-tracks-album-to-collection", null, str, str, -1, "context-menu");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        throw new RuntimeException("RxJava 1 exception in FreeTierAlbumPresenter", th);
    }
}

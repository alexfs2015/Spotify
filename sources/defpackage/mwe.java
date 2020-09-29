package defpackage;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider.a;
import com.spotify.music.features.freetierallsongsdialog.FreeTierAllSongsDialogLogger;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: mwe reason: default package */
public final class mwe {
    public static final sih a = ViewUris.I;
    public final xag b = xaj.a(new wuk[0]);
    public final FreeTierAllSongsDialogLogger c;
    public final txc d;
    public final kxc e;
    public final kxg f;
    public final kxi g;
    public final fpt h;
    private final mwf i;
    private final heg j;
    private final CollectionStateProvider k;
    private final String l;
    private final ArrayList<rft> m;
    private final String n;
    private final lkn o;
    private boolean p;

    public mwe(mwf mwf, FreeTierAllSongsDialogLogger freeTierAllSongsDialogLogger, heg heg, mwb mwb, txc txc, CollectionStateProvider collectionStateProvider, kxc kxc, kxg kxg, kxi kxi, fpt fpt, lkn lkn) {
        this.i = mwf;
        this.c = freeTierAllSongsDialogLogger;
        this.j = heg;
        this.l = mwb.q();
        this.m = mwb.m();
        this.n = mwb.n();
        this.k = collectionStateProvider;
        this.e = kxc;
        this.f = kxg;
        this.g = kxi;
        this.h = fpt;
        this.d = txc;
        this.o = lkn;
    }

    public final void a() {
        this.b.a(wud.a((wud<? extends T1>) ScalarSynchronousObservable.d(this.m), (wud<? extends T2>) ScalarSynchronousObservable.d(this.n), this.o.a(), (wuv<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$mwe$3nDaPHfg25PZqYlzav3y4MHIXXc.INSTANCE).i(new $$Lambda$mwe$50VfBeP9i6wcxjHgL79ljl6VO0(this)).f($$Lambda$mwe$q1AxeA_FGxWY0AzAEhU8UkxGpE0.INSTANCE).a(vun.a(this.j.c())).a((wun<? super T>) new $$Lambda$mwe$mXp8oRloLDD8jscabPqq8RotVA<Object>(this), (wun<Throwable>) $$Lambda$mwe$wA3LoYD67zmZ3n235PzUlPFMSb4.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud c(mwd mwd) {
        wud wud;
        List b2 = mwd.b();
        if (b2.isEmpty()) {
            wud = ScalarSynchronousObservable.d(Collections.emptyMap());
        } else {
            String[] strArr = new String[b2.size()];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = ((rft) b2.get(i2)).a();
            }
            wud = vun.a((ObservableSource<T>) this.k.a(a.toString(), d(), strArr), BackpressureStrategy.BUFFER);
        }
        return wud.f(new $$Lambda$mwe$5FaJQuIcC4tvHxEVSOYcSYl_8(mwd));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ mwd b(mwd mwd) {
        a e2 = mwd.e();
        Map c2 = mwd.c();
        List<rft> b2 = mwd.b();
        ArrayList arrayList = new ArrayList(b2.size());
        for (rft rft : b2) {
            a aVar = (a) c2.get(rft.a());
            if (aVar != null) {
                arrayList.add(rft.n().b(aVar.a()).a(aVar.b()).a());
            } else {
                arrayList.add(rft);
            }
        }
        return e2.a((List<rft>) arrayList).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(mwd mwd) {
        this.p = mwd.d();
        this.i.b(this.p);
        this.i.a(true);
        this.i.a(mwd.a());
        mwf mwf = this.i;
        List<rft> b2 = mwd.b();
        ArrayList arrayList = new ArrayList(b2.size());
        HashSet hashSet = new HashSet();
        for (rft rft : b2) {
            if (!hashSet.contains(rft.a())) {
                arrayList.add(rft);
                hashSet.add(rft.a());
            }
        }
        mwf.a((List<rft>) arrayList);
        this.i.l();
    }

    public void b() {
        this.i.k();
    }

    public void a(rft rft) {
        if (!this.p || !rft.d()) {
            String c2 = rft.c();
            if (!fax.a(c2)) {
                this.d.b(c2, mvu.a(rft));
                return;
            }
            return;
        }
        this.o.a(rft.a(), d());
    }

    public static String c() {
        return a.toString();
    }

    public String d() {
        if (!fax.a(this.l)) {
            return this.l;
        }
        return a.toString();
    }
}

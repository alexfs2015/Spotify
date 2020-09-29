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

/* renamed from: nbf reason: default package */
public final class nbf {
    public static final sso a = ViewUris.H;
    public final xok b = xon.a(new xip[0]);
    public final FreeTierAllSongsDialogLogger c;
    public final ujf d;
    public final lal e;
    public final lap f;
    public final lar g;
    public final fqn h;
    private final nbg i;
    private final hhc j;
    private final CollectionStateProvider k;
    private final String l;
    private final ArrayList<rov> m;
    private final String n;
    private final lon o;
    private boolean p;

    public nbf(nbg nbg, FreeTierAllSongsDialogLogger freeTierAllSongsDialogLogger, hhc hhc, nbc nbc, ujf ujf, CollectionStateProvider collectionStateProvider, lal lal, lap lap, lar lar, fqn fqn, lon lon) {
        this.i = nbg;
        this.c = freeTierAllSongsDialogLogger;
        this.j = hhc;
        this.l = nbc.q();
        this.m = nbc.m();
        this.n = nbc.n();
        this.k = collectionStateProvider;
        this.e = lal;
        this.f = lap;
        this.g = lar;
        this.h = fqn;
        this.d = ujf;
        this.o = lon;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(nbe nbe) {
        this.p = nbe.d();
        this.i.b(this.p);
        this.i.a(true);
        this.i.a(nbe.a());
        nbg nbg = this.i;
        List<rov> b2 = nbe.b();
        ArrayList arrayList = new ArrayList(b2.size());
        HashSet hashSet = new HashSet();
        for (rov rov : b2) {
            if (!hashSet.contains(rov.a())) {
                arrayList.add(rov);
                hashSet.add(rov.a());
            }
        }
        nbg.a((List<rov>) arrayList);
        this.i.l();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ nbe b(nbe nbe) {
        a e2 = nbe.e();
        Map c2 = nbe.c();
        List<rov> b2 = nbe.b();
        ArrayList arrayList = new ArrayList(b2.size());
        for (rov rov : b2) {
            a aVar = (a) c2.get(rov.a());
            if (aVar != null) {
                arrayList.add(rov.n().b(aVar.a()).a(aVar.b()).a());
            } else {
                arrayList.add(rov);
            }
        }
        return e2.a((List<rov>) arrayList).a();
    }

    public static String c() {
        return a.toString();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii c(nbe nbe) {
        xii xii;
        List b2 = nbe.b();
        if (b2.isEmpty()) {
            xii = ScalarSynchronousObservable.d(Collections.emptyMap());
        } else {
            String[] strArr = new String[b2.size()];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr[i2] = ((rov) b2.get(i2)).a();
            }
            xii = wit.a((ObservableSource<T>) this.k.a(a.toString(), d(), strArr), BackpressureStrategy.BUFFER);
        }
        return xii.e((xiy<? super T, ? extends R>) new $$Lambda$nbf$PEpWP9GH3CESpB_M_5p8MsakDE<Object,Object>(nbe));
    }

    public final void a() {
        this.b.a(xii.a((xii<? extends T1>) ScalarSynchronousObservable.d(this.m), (xii<? extends T2>) ScalarSynchronousObservable.d(this.n), this.o.a(), (xja<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$nbf$96aUb7sIeJ1epcKhfw4XenP8j5g.INSTANCE).h(new $$Lambda$nbf$EY30aw0ei3b9AFrWgLdSMsLnpA(this)).e((xiy<? super T, ? extends R>) $$Lambda$nbf$5Uz8l3_rpabbMyyLu5dQshXFGIg.INSTANCE).a(wit.a(this.j.c())).a((xis<? super T>) new $$Lambda$nbf$0iTZL1slnGbc4c8MqrF76j1b88o<Object>(this), (xis<Throwable>) $$Lambda$nbf$mdFOjm4YfCe2btIBl5sMCIbnclU.INSTANCE));
    }

    public void a(rov rov) {
        if (!this.p || !rov.d()) {
            String c2 = rov.c();
            if (!fbo.a(c2)) {
                this.d.b(c2, nav.a(rov));
                return;
            }
            return;
        }
        this.o.a(rov.a(), d());
    }

    public void b() {
        this.i.k();
    }

    public String d() {
        return !fbo.a(this.l) ? this.l : a.toString();
    }
}

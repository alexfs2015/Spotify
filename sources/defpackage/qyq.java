package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: qyq reason: default package */
public final class qyq {
    public static kjn<qyr, qyo> a(qyr qyr) {
        if (!qyr.b().b()) {
            return kjn.a(qyr, kjk.a(new b()));
        } else if (qyr.c().b()) {
            return kjn.a(qyr);
        } else {
            return kjn.a(qyr, kjk.a(qyo.a((String) qyr.b().c())));
        }
    }

    public static kjx<qyr, qyo> a(qyr qyr, qyp qyp) {
        return (kjx) qyp.a(new $$Lambda$qyq$t2XTJCuGe3XByUl51FpOV6QPBJA(qyr), new $$Lambda$qyq$aEJjKfWHMIuYMnElrbjS9zG_1o(qyr), new $$Lambda$qyq$pRFB6eupmQJraYQhUqMvZFZcU0(qyr), new $$Lambda$qyq$oJMrT1GxsuHWbLWny_eCQVyXC1w(qyr));
    }

    private static PrefsModel a(PrefsModel prefsModel, String str, Long l, int i) {
        return prefsModel.toBuilder().a(a(fcl.a((Iterable<F>) prefsModel.pagePrefs(), (Function<? super F, ? extends T>) new $$Lambda$qyq$ab5PSSPLXNq4YdfM0FMEwiLn_UE<Object,Object>(str, l)), i)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PagePrefs a(String str, Long l, PagePrefs pagePrefs) {
        return ((PagePrefs) fay.a(pagePrefs)).uri().equals(str) ? pagePrefs.toBuilder().a(l).a() : pagePrefs;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(c cVar, PagePrefs pagePrefs) {
        return !((PagePrefs) fay.a(pagePrefs)).uri().equals(cVar.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(PagePrefs pagePrefs, PagePrefs pagePrefs2) {
        return (((Long) fay.a(pagePrefs2.timestamp())).longValue() > ((Long) fay.a(pagePrefs.timestamp())).longValue() ? 1 : (((Long) fay.a(pagePrefs2.timestamp())).longValue() == ((Long) fay.a(pagePrefs.timestamp())).longValue() ? 0 : -1));
    }

    private static ImmutableList<PagePrefs> a(Iterable<PagePrefs> iterable, int i) {
        ImmutableList<PagePrefs> a = ImmutableList.a((Comparator<? super E>) $$Lambda$qyq$eqJqPfzcEgLhQ_N5xOFv0nZ0rE.INSTANCE, iterable);
        return a.size() > i ? a.subList(0, i) : a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qyr qyr, c cVar) {
        if (!qyr.c().b()) {
            return kjx.e();
        }
        PrefsModel prefsModel = (PrefsModel) qyr.c().c();
        List pagePrefs = ((PrefsModel) qyr.c().c()).pagePrefs();
        a g = ImmutableList.g();
        Optional f = fcl.f(pagePrefs, new $$Lambda$qyq$VNbarPwgheWt5mYVQnVmyDbm3Y(cVar));
        if (f.b()) {
            PagePrefs pagePrefs2 = (PagePrefs) f.c();
            ImmutableMap.a g2 = ImmutableMap.g();
            String str = cVar.b;
            if (cVar.c.b()) {
                g2.b(cVar.b, cVar.c.c());
            }
            for (Entry entry : pagePrefs2.options().entrySet()) {
                if (!((String) entry.getKey()).equals(str)) {
                    g2.b(entry.getKey(), entry.getValue());
                }
            }
            g.c(pagePrefs2.toBuilder().a(cVar.d).b(g2.b()).a());
        } else if (cVar.c.b()) {
            g.c(PagePrefs.builderWithDefault().a(cVar.d).a(cVar.a).b(ImmutableMap.b(cVar.b, cVar.c.c())).a());
        }
        g.b(fcl.b(pagePrefs, new $$Lambda$qyq$OTZTlzI5296xZ3wJPMf9PMvnf0(cVar)));
        return kjx.b(qyr.e().b(Optional.b(prefsModel.toBuilder().a(a((Iterable<PagePrefs>) g.a(), qyr.a())).a())).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qyr qyr, a aVar) {
        if (!qyr.c().b()) {
            return kjx.b(qyr.e().a(ImmutableList.a((Iterable<? extends E>) fbx.a((Iterable<? extends T>) qyr.d(), (Iterable<? extends T>) ImmutableList.a(ho.a(aVar.a, aVar.b))))).a());
        }
        return kjx.b(qyr.e().b(Optional.b(a((PrefsModel) qyr.c().c(), aVar.a, aVar.b, qyr.a()))).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qyr qyr, b bVar) {
        PrefsModel prefsModel = bVar.a;
        fdh R_ = qyr.d().R_();
        while (R_.hasNext()) {
            ho hoVar = (ho) R_.next();
            prefsModel = a(prefsModel, (String) hoVar.a, (Long) hoVar.b, qyr.a());
        }
        return kjx.b(qyr.e().b(Optional.b(prefsModel)).a(ImmutableList.d()).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(qyr qyr, d dVar) {
        qyr a = qyr.e().a(Optional.b(dVar.a)).a();
        if (a.c().b()) {
            return kjx.b(a);
        }
        return kjx.a(a, kjk.a(qyo.a(dVar.a)));
    }
}

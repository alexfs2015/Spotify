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

/* renamed from: rhf reason: default package */
public final class rhf {
    /* access modifiers changed from: private */
    public static /* synthetic */ int a(PagePrefs pagePrefs, PagePrefs pagePrefs2) {
        return (((Long) fbp.a(pagePrefs2.timestamp())).longValue() > ((Long) fbp.a(pagePrefs.timestamp())).longValue() ? 1 : (((Long) fbp.a(pagePrefs2.timestamp())).longValue() == ((Long) fbp.a(pagePrefs.timestamp())).longValue() ? 0 : -1));
    }

    private static ImmutableList<PagePrefs> a(Iterable<PagePrefs> iterable, int i) {
        ImmutableList<PagePrefs> a = ImmutableList.a((Comparator<? super E>) $$Lambda$rhf$LWkkApf3XR1VO0NzPMIasWGXL_M.INSTANCE, iterable);
        return a.size() > i ? a.subList(0, i) : a;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ PagePrefs a(String str, Long l, PagePrefs pagePrefs) {
        return ((PagePrefs) fbp.a(pagePrefs)).uri().equals(str) ? pagePrefs.toBuilder().a(l).a() : pagePrefs;
    }

    private static PrefsModel a(PrefsModel prefsModel, String str, Long l, int i) {
        return prefsModel.toBuilder().a(a(fdd.a((Iterable<F>) prefsModel.pagePrefs(), (Function<? super F, ? extends T>) new $$Lambda$rhf$NCW1HhEbAUOXLFrl9ErMEit2Dc<Object,Object>(str, l)), i)).a();
    }

    public static kmw<rhg, rhd> a(rhg rhg) {
        if (!rhg.b().b()) {
            return kmw.a(rhg, kmt.a(new b()));
        } else if (rhg.c().b()) {
            return kmw.a(rhg);
        } else {
            return kmw.a(rhg, kmt.a(rhd.a((String) rhg.b().c())));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(rhg rhg, a aVar) {
        if (!rhg.c().b()) {
            return kng.b(rhg.e().a(ImmutableList.a((Iterable<? extends E>) fcp.a(rhg.d(), ImmutableList.a(ho.a(aVar.a, aVar.b))))).a());
        }
        return kng.b(rhg.e().b(Optional.b(a((PrefsModel) rhg.c().c(), aVar.a, aVar.b, rhg.a()))).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(rhg rhg, b bVar) {
        PrefsModel prefsModel = bVar.a;
        fdz R_ = rhg.d().R_();
        while (R_.hasNext()) {
            ho hoVar = (ho) R_.next();
            prefsModel = a(prefsModel, (String) hoVar.a, (Long) hoVar.b, rhg.a());
        }
        return kng.b(rhg.e().b(Optional.b(prefsModel)).a(ImmutableList.d()).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(rhg rhg, c cVar) {
        if (!rhg.c().b()) {
            return kng.e();
        }
        PrefsModel prefsModel = (PrefsModel) rhg.c().c();
        List pagePrefs = ((PrefsModel) rhg.c().c()).pagePrefs();
        a g = ImmutableList.g();
        Optional f = fdd.f(pagePrefs, new $$Lambda$rhf$kKVk8bndKvxo90GgHbReIwVI6Us(cVar));
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
        g.b(fdd.b(pagePrefs, new $$Lambda$rhf$4Wbudq8Kc8Kz5a9bOIhubg87F6A(cVar)));
        return kng.b(rhg.e().b(Optional.b(prefsModel.toBuilder().a(a((Iterable<PagePrefs>) g.a(), rhg.a())).a())).a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(rhg rhg, d dVar) {
        rhg a = rhg.e().a(Optional.b(dVar.a)).a();
        if (a.c().b()) {
            return kng.b(a);
        }
        return kng.a(a, kmt.a(rhd.a(dVar.a)));
    }

    public static kng<rhg, rhd> a(rhg rhg, rhe rhe) {
        return (kng) rhe.a(new $$Lambda$rhf$KWMwcBnFo7LqaEoY3YFZCSrbr8(rhg), new $$Lambda$rhf$VNVXl9yZUxbk4Z9ak2wWDvLxY(rhg), new $$Lambda$rhf$YIT3WV5pxeuCbpSQzTQYjtuz33g(rhg), new $$Lambda$rhf$sZaZh24qg6aGiIxaAiCifh9T4_A(rhg));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(c cVar, PagePrefs pagePrefs) {
        return !((PagePrefs) fbp.a(pagePrefs)).uri().equals(cVar.a);
    }
}

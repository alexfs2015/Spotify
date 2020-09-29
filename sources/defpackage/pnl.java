package defpackage;

import com.spotify.mobile.android.util.Assertion;

/* renamed from: pnl reason: default package */
public final class pnl {
    public static kmw<pnm, pnj> a(pnm pnm) {
        return (kmw) pnm.a(new $$Lambda$pnl$VdL_y8AKdFlN16HAqmDl4AYGtac(pnm), $$Lambda$pnl$m66ME7_dLcOkuxNt4Cz_6_lWovk.INSTANCE, new $$Lambda$pnl$S9K_xXkMN84kYecR5pZQHMW2VJ4(pnm));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pnm pnm, a aVar) {
        if (pnm instanceof b) {
            Assertion.b("backendRequestFailed when model is loaded");
            return kng.e();
        } else if ((pnm instanceof a) && ((a) pnm).a == aVar.a) {
            return kng.e();
        } else {
            a aVar2 = new a(aVar.a);
            if (!(pnm instanceof c)) {
                return kng.b(aVar2);
            }
            return kng.a(aVar2, kmt.a(pnj.a(aVar2)));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pnm pnm, b bVar) {
        if (pnm instanceof b) {
            Assertion.b("backendViewModelReceived when model is loaded");
            return kng.e();
        }
        hcs hcs = bVar.a;
        pnm a = pnm.a(hcs);
        if (pnm instanceof c) {
            return kng.a(a, kmt.a(pnj.a(hcs, bVar.b), pnj.a(a)));
        }
        return kng.a(a, kmt.a(pnj.a(hcs, bVar.b)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pnm pnm, c cVar) {
        if (pnm instanceof b) {
            Assertion.b("cacheMiss when model is loaded");
            return kng.e();
        }
        return kng.a(kmt.a(new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pnm pnm, d dVar) {
        if (pnm instanceof b) {
            Assertion.b("cacheViewModelReceived when model is loaded.");
            return kng.e();
        }
        if (!(dVar.b <= 0)) {
            return kng.b(pnm.a(dVar.a));
        }
        return kng.a(kmt.a(new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pnm pnm, e eVar) {
        return (!(pnm instanceof c) || ((c) pnm).a) ? kng.e() : kng.b(pnm.a(true));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(pnm pnm, f fVar) {
        if (!"premium".equals(fVar.a)) {
            return kng.e();
        }
        return kng.a(kmt.a(new d()));
    }

    public static kng<pnm, pnj> a(pnm pnm, pnk pnk) {
        return (kng) pnk.a(new $$Lambda$pnl$W7h8uOOxWqj2LtqTeQvzmyjXZDc(pnm), new $$Lambda$pnl$IRdklfFTQVleJ4osE8UUxV0_OQ0(pnm), new $$Lambda$pnl$u78jJiblh6RcurounJxzXxkzPAA(pnm), new $$Lambda$pnl$vv8MbJC5mKpYsOq6yCjPW3eNTo(pnm), new $$Lambda$pnl$G79rBC47QSDoJUTVFt1_hASxFOg(pnm), new $$Lambda$pnl$JgUKfmHjyvCSg3lhzpCPsfsXSxM(pnm));
    }
}

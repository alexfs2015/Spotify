package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Scheduler;
import java.io.IOException;

/* renamed from: njc reason: default package */
public final class njc implements c<xgo<xam>, hcs> {
    private final niz a;
    private final nja b;
    private final niq c;
    private final nji d;
    private final boolean e;
    private final Scheduler f;

    public njc(niz niz, nja nja, niq niq, nji nji, boolean z, Scheduler scheduler) {
        this.a = niz;
        this.b = nja;
        this.c = niq;
        this.d = nji;
        this.e = z;
        this.f = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(hcs hcs) {
        return niq.a(hcs, "cached", Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(xgo xgo) {
        xam xam = (xam) xgo.b();
        if (xam != null) {
            try {
                xcs c2 = xam.c();
                c2.b(2147483647L);
                byte[] i = c2.b().t().i();
                if (i.length > 0) {
                    this.a.a(i);
                    Logger.b("HomeLoad: Wrote BE response to Cache. Payload length %s ", Integer.valueOf(i.length));
                }
            } catch (IOException e2) {
                Assertion.a("Failed to get response bytes", (Throwable) e2);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs b(hcs hcs) {
        return niq.a(hcs, "remote", Boolean.TRUE);
    }

    public final /* synthetic */ Object call(Object obj) {
        xii xii = (xii) obj;
        xii e2 = xii.b((xis<? super T>) new $$Lambda$njc$luFb3HGd4UmYuNpq3IHs6nxiCwY<Object>(this)).a((c<? super T, ? extends R>) this.d).e((xiy<? super T, ? extends R>) new $$Lambda$njc$7440H4H3OTD78dEpGOout5hMRs<Object,Object>(this));
        if (!this.e) {
            e2 = xii.a(this.a.a().b(wit.a(this.f)).e((xiy<? super T, ? extends R>) new $$Lambda$njc$WZEYmX_3_OnxaRhI1nGx0CfkEjU<Object,Object>(this)).e((xiy<? super T, ? extends R>) this.b), e2);
        }
        return e2.c(xii.a((c<? super T, ? extends R>) this.d));
    }
}

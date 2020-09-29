package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Scheduler;
import java.io.IOException;

/* renamed from: ndn reason: default package */
public final class ndn implements c<wsj<wmg>, gzz> {
    private final ndk a;
    private final ndl b;
    private final ndb c;
    private final ndt d;
    private final boolean e;
    private final Scheduler f;

    public final /* synthetic */ Object call(Object obj) {
        wud wud = (wud) obj;
        wud f2 = wud.b((wun<? super T>) new $$Lambda$ndn$6A5YKtInVu80bwUosZbTHoKAleY<Object>(this)).a((c<? super T, ? extends R>) this.d).f(new $$Lambda$ndn$xy_naOqd00na2G7xmYAB81uGPm0(this));
        if (!this.e) {
            f2 = wud.a(this.a.a().b(vun.a(this.f)).f(new $$Lambda$ndn$r5dXds_XC9vGVOb1XAuzFTmFFE(this)).f(this.b), f2);
        }
        return f2.c(wud.a((c<? super T, ? extends R>) this.d));
    }

    public ndn(ndk ndk, ndl ndl, ndb ndb, ndt ndt, boolean z, Scheduler scheduler) {
        this.a = ndk;
        this.b = ndl;
        this.c = ndb;
        this.d = ndt;
        this.e = z;
        this.f = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wsj wsj) {
        wmg wmg = (wmg) wsj.b();
        if (wmg != null) {
            try {
                wom c2 = wmg.c();
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
    public /* synthetic */ gzz b(gzz gzz) {
        return ndb.a(gzz, "remote", Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(gzz gzz) {
        return ndb.a(gzz, "cached", Boolean.TRUE);
    }
}

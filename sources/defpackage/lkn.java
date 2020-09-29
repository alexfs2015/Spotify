package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import java.util.concurrent.TimeUnit;

/* renamed from: lkn reason: default package */
public final class lkn {
    wuk a = xaj.b();
    private final lkk b;
    private final lks c;
    private final heg d;

    public lkn(lkk lkk, lks lks, heg heg, final a aVar) {
        this.b = lkk;
        this.c = lks;
        this.d = heg;
        aVar.a(new c() {
            public final void f() {
                lkn.this.a.unsubscribe();
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    public final wud<Boolean> a() {
        return this.b.a();
    }

    public final wud<Boolean> b() {
        return this.b.b();
    }

    public final void a(String str, String str2) {
        this.a.unsubscribe();
        this.a = b().c().a(vun.a(this.d.c())).d(2, TimeUnit.SECONDS).g($$Lambda$lkn$nmymOmxIasQ368lH_jWeGRrn_g.INSTANCE).a((wun<? super T>) new $$Lambda$lkn$hPVUztzJh5_BDAbbLnqzS96Z0<Object>(this, str, str2), (wun<Throwable>) $$Lambda$lkn$GZFHQhQjrzAtr1hTDzClx0ipKG4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Boolean bool) {
        lks lks = this.c;
        boolean booleanValue = bool.booleanValue();
        lkq lkq = lks.c;
        lks.d = new lkp((jjf) lkq.a(lkq.a.get(), 1), (jrp) lkq.a(lkq.b.get(), 2), (String) lkq.a(str, 3), str2);
        if (booleanValue) {
            lks.a.b(lks.b);
        } else {
            lks.a.a(lks.b);
        }
        lkp lkp = lks.d;
        jjf jjf = lkp.a;
        bf bfVar = new bf(null, "com.spotify.feature.explicit", lkp.c, "enable-explicit-onetrack", 0, lkp.b, "block", null, (double) lkp.d.a());
        jjf.a(bfVar);
    }
}

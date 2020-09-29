package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import java.util.concurrent.TimeUnit;

/* renamed from: lon reason: default package */
public final class lon {
    xip a = xon.b();
    private final lok b;
    private final los c;
    private final hhc d;

    public lon(lok lok, los los, hhc hhc, final a aVar) {
        this.b = lok;
        this.c = los;
        this.d = hhc;
        aVar.a(new c() {
            public final void aN_() {
                aVar.b(this);
            }

            public final void f() {
                lon.this.a.unsubscribe();
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, Boolean bool) {
        los los = this.c;
        boolean booleanValue = bool.booleanValue();
        loq loq = los.c;
        los.d = new lop((jlr) loq.a(loq.a.get(), 1), (jtz) loq.a(loq.b.get(), 2), (String) loq.a(str, 3), str2);
        if (booleanValue) {
            los.a.b(los.b);
        } else {
            los.a.a(los.b);
        }
        lop lop = los.d;
        jlr jlr = lop.a;
        be beVar = new be(null, "com.spotify.feature.explicit", lop.c, "enable-explicit-onetrack", 0, lop.b, "block", null, (double) lop.d.a());
        jlr.a(beVar);
    }

    public final xii<Boolean> a() {
        return this.b.a();
    }

    public final void a(String str, String str2) {
        this.a.unsubscribe();
        this.a = b().c().a(wit.a(this.d.c())).d(2, TimeUnit.SECONDS).f($$Lambda$lon$r2lz6plYtT4Ah5VBuGeFR0OGNJ8.INSTANCE).a((xis<? super T>) new $$Lambda$lon$GEmFbIM7khgznF9MIppYmS3RndM<Object>(this, str, str2), (xis<Throwable>) $$Lambda$lon$Lre1HBVI49IF81oHhiZefElo7xk.INSTANCE);
    }

    public final xii<Boolean> b() {
        return this.b.b();
    }
}

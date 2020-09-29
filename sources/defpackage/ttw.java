package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: ttw reason: default package */
public final class ttw implements ttv {
    final lkn a;
    wuk b = xaj.b();
    boolean c;

    public ttw(lkn lkn, final a aVar) {
        this.a = lkn;
        aVar.a(new c() {
            public final void c() {
                ttw ttw = ttw.this;
                ttw.b = ttw.a.a().a((wun<? super T>) new $$Lambda$ttw$1$o16L2Kc687qtjU3VMbNugzplMvw<Object>(this), (wun<Throwable>) $$Lambda$ttw$1$YwK2P1PKNkqlwxZB77OAzukBAo.INSTANCE);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                ttw.this.c = bool.booleanValue();
            }

            public final void a() {
                ttw.this.b.unsubscribe();
            }

            public final void aP_() {
                aVar.b(this);
            }
        });
    }

    public final boolean a() {
        return this.c;
    }

    public final void a(String str, String str2) {
        this.a.a(str, str2);
    }
}

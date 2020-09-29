package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: ufz reason: default package */
public final class ufz implements ufy {
    final lon a;
    xip b = xon.b();
    boolean c;

    public ufz(lon lon, final a aVar) {
        this.a = lon;
        aVar.a(new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                ufz.this.c = bool.booleanValue();
            }

            public final void a() {
                ufz.this.b.unsubscribe();
            }

            public final void aN_() {
                aVar.b(this);
            }

            public final void c() {
                ufz ufz = ufz.this;
                ufz.b = ufz.a.a().a((xis<? super T>) new $$Lambda$ufz$1$HwmiH6ncEsNVH7eOOVGthApu6AM<Object>(this), (xis<Throwable>) $$Lambda$ufz$1$Z_a3xw5zm7VUwEteCJ_Dq2RnoMA.INSTANCE);
            }
        });
    }

    public final void a(String str, String str2) {
        this.a.a(str, str2);
    }

    public final boolean a() {
        return this.c;
    }
}

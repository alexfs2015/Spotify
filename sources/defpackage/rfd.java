package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: rfd reason: default package */
public final class rfd {
    final lon a;
    public Optional<Boolean> b = Optional.e();

    public rfd(lon lon, a aVar) {
        this.a = lon;
        aVar.a(new c() {
            private xip a = xon.b();

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                rfd.this.b = Optional.b(bool);
            }

            public final void a() {
                this.a.unsubscribe();
            }

            public final void c() {
                this.a = rfd.this.a.a().a((xis<? super T>) new $$Lambda$rfd$1$urm82X5u3PyrBGADpgnlkP95ONg<Object>(this), (xis<Throwable>) $$Lambda$rfd$1$XwHeFvSxmn2NEg9p4PpJVkhiwF0.INSTANCE);
            }
        });
    }
}

package defpackage;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: phf reason: default package */
public final class phf {
    /* access modifiers changed from: 0000 */
    public xip a;
    public boolean b;
    private final lon c;
    private final xil d;

    public phf(lon lon, xil xil, final a aVar) {
        this.c = lon;
        this.d = xil;
        aVar.a(new c() {
            public final void a() {
                if (phf.this.a != null) {
                    phf.this.a.unsubscribe();
                }
            }

            public final void aN_() {
                aVar.b(this);
            }

            public final void b(Bundle bundle) {
            }

            public final void c() {
                phf.this.a = phf.this.c.a().a(phf.this.d).a((xis<? super T>) new $$Lambda$phf$CjzOsKQFoIYnt1rqGnB2m172MxA<Object>(phf.this), (xis<Throwable>) $$Lambda$phf$nKApniCgb2rklnVHjPQjVReWlYA.INSTANCE);
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        this.b = bool.booleanValue();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Throwable th) {
        Logger.d(th, "Error shouldDisableExplicitContent", new Object[0]);
        xiq.a(th);
    }
}

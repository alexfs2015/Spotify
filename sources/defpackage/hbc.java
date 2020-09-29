package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;

/* renamed from: hbc reason: default package */
public final class hbc {
    /* access modifiers changed from: 0000 */
    public boolean a;
    xip b;
    private final lon c;

    public hbc(final lon lon, final a aVar) {
        this.c = lon;
        aVar.a(new c() {
            public final void a() {
                hbc.this.b.unsubscribe();
            }

            public final void aN_() {
                aVar.b(this);
            }

            public final void c() {
                hbc.this.b = lon.a().a((xis<? super T>) new $$Lambda$hbc$1$zA4Un6x7HdfCBQGF6f1k0ZhDL4<Object>(hbc.this), (xis<Throwable>) $$Lambda$hbc$1$TJr18KeotxfZjs1rhiOzaeM5FOA.INSTANCE);
            }
        });
    }

    public final void a(String str, String str2) {
        this.c.a(str, str2);
    }

    public final boolean a(boolean z) {
        return this.a && z;
    }
}

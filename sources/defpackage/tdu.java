package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.WazeBannerModel.Type;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* renamed from: tdu reason: default package */
public final class tdu implements kdi {
    /* access modifiers changed from: 0000 */
    public Disposable a = Disposables.a();
    public tgc b;
    private final tdt c;
    private final kcv d;

    public final void a() {
    }

    public final void a(kdj kdj) {
    }

    public tdu(tdt tdt, kcv kcv, a aVar) {
        this.c = tdt;
        this.d = kcv;
        aVar.a(new c() {
            public final void e() {
                tdu.this.a = tdu.this.d.a().a(Functions.a()).a((Consumer<? super T>) new $$Lambda$tdu$4NxZCIIMWXHK9ze2gBywSFgHAN8<Object>(tdu.this), (Consumer<? super Throwable>) $$Lambda$tdu$XSAi_zZvx4RrQtIXWV6DUfbsk70.INSTANCE);
            }

            public final void f() {
                tdu.this.a.bf_();
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(WazeBannerModel wazeBannerModel) {
        tgc tgc = this.b;
        if (tgc != null) {
            tgc.a(wazeBannerModel);
            d();
        }
    }

    public void d() {
        if (this.c.a()) {
            this.b.b();
        } else {
            this.b.c();
        }
    }

    public final void b() {
        this.c.c.a();
    }

    public final void c() {
        tdt tdt = this.c;
        tdt.a.a(WazeBannerModel.a(Type.NO_BANNER).a());
        tdt.d.a(true);
    }
}

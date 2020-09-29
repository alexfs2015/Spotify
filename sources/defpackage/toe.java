package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.mobile.android.waze.model.WazeBannerModel;
import com.spotify.mobile.android.waze.model.WazeBannerModel.Type;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;

/* renamed from: toe reason: default package */
public final class toe implements kfj {
    /* access modifiers changed from: 0000 */
    public Disposable a = Disposables.a();
    public tqu b;
    private final tod c;
    private final kew d;

    public toe(tod tod, kew kew, a aVar) {
        this.c = tod;
        this.d = kew;
        aVar.a(new c() {
            public final void e() {
                toe.this.a = toe.this.d.a().a(Functions.a()).a((Consumer<? super T>) new $$Lambda$toe$t7HFBTRs1CMYPjOftK6qWP8pFtk<Object>(toe.this), (Consumer<? super Throwable>) $$Lambda$toe$bpZOy1aCFHBVpOtlooiA4OslmC8.INSTANCE);
            }

            public final void f() {
                toe.this.a.bd_();
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(WazeBannerModel wazeBannerModel) {
        tqu tqu = this.b;
        if (tqu != null) {
            tqu.a(wazeBannerModel);
            d();
        }
    }

    public final void a() {
    }

    public final void a(kfk kfk) {
    }

    public final void b() {
        this.c.c.a();
    }

    public final void c() {
        tod tod = this.c;
        tod.a.a(WazeBannerModel.a(Type.NO_BANNER).a());
        tod.d.a(true);
    }

    public void d() {
        if (this.c.a()) {
            this.b.b();
        } else {
            this.b.c();
        }
    }
}

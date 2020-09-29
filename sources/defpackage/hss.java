package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import java.util.concurrent.TimeUnit;
import rx.internal.operators.NeverObservableHolder;

/* renamed from: hss reason: default package */
public final class hss implements a<ConnectManager>, hst {
    private final hip a;
    private final xac<ConnectManager> b = xac.e();
    private final xac<Boolean> c = xac.e();
    private wuk d;
    private final wug e;

    public final /* synthetic */ void a(Object obj) {
        this.b.onNext((ConnectManager) obj);
        this.a.b(this);
    }

    public hss(hip hip, wug wug) {
        this.a = hip;
        this.e = wug;
    }

    public final void a() {
        this.a.a(this);
        this.a.a();
    }

    public final void b() {
        this.a.b();
        wuk wuk = this.d;
        if (wuk != null && !wuk.isUnsubscribed()) {
            this.d.unsubscribe();
        }
    }

    public final void f() {
        this.c.onNext(Boolean.TRUE);
    }

    public final void g() {
        this.c.onNext(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ConnectManager connectManager) {
        if (!connectManager.u()) {
            connectManager.t();
        }
    }

    public final wud<Boolean> d() {
        return this.c.i(new $$Lambda$hss$imfgEj8oMOq11pYr_fZn2HFE67s(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Boolean bool) {
        if (bool.booleanValue()) {
            return wud.a(1, 1, TimeUnit.SECONDS, this.e).d((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$hss$5fHsEAtYaPoVhUG8codpP0t3MdI<Object,Object>(this)).b();
        }
        return NeverObservableHolder.a();
    }

    public final void e() {
        this.a.b(this);
    }

    public final void c() {
        this.d = this.b.c().a((wun<? super T>) $$Lambda$hss$9sG2Y42Ie4MbrK8jgleKFr7Yx9A.INSTANCE, (wun<Throwable>) $$Lambda$hss$k57qkXXxp2wpBYLrFLHPyuK_PXk.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(Long l) {
        return this.b.c().f($$Lambda$YxYWk4U1WXyj8CyholmUHllNxSs.INSTANCE);
    }
}

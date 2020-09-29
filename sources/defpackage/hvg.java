package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import java.util.concurrent.TimeUnit;
import rx.internal.operators.NeverObservableHolder;

/* renamed from: hvg reason: default package */
public final class hvg implements a<ConnectManager>, hvh {
    private final gtb a;
    private final xog<ConnectManager> b = xog.e();
    private final xog<Boolean> c = xog.e();
    private xip d;
    private final xil e;

    public hvg(gtb gtb, xil xil) {
        this.a = gtb;
        this.e = xil;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Boolean bool) {
        return bool.booleanValue() ? xii.a(1, 1, TimeUnit.SECONDS, this.e).d((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$hvg$zQuo8Q60rXWvOCOBRA0LwWVR44c<Object,Object>(this)).b() : NeverObservableHolder.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(Long l) {
        return this.b.c().e((xiy<? super T, ? extends R>) $$Lambda$SnxyqyikMf9445tAtsjZZGBVPk.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(ConnectManager connectManager) {
        if (!connectManager.u()) {
            connectManager.t();
        }
    }

    public final void a() {
        this.a.a(this);
        this.a.a();
    }

    public final /* synthetic */ void a(Object obj) {
        this.b.onNext((ConnectManager) obj);
        this.a.b(this);
    }

    public final void b() {
        this.a.b();
        xip xip = this.d;
        if (xip != null && !xip.isUnsubscribed()) {
            this.d.unsubscribe();
        }
    }

    public final void c() {
        this.d = this.b.c().a((xis<? super T>) $$Lambda$hvg$pKSIaVcMtndmD_eVLG0q4529dY4.INSTANCE, (xis<Throwable>) $$Lambda$hvg$GYJ1irseYbWKSh1YLpA7KaR5FiM.INSTANCE);
    }

    public final xii<Boolean> d() {
        return this.c.h(new $$Lambda$hvg$2QnTUM0SJrbrM6eyPia9_kXQY(this));
    }

    public final void e() {
        this.a.b(this);
    }

    public final void f() {
        this.c.onNext(Boolean.TRUE);
    }

    public final void g() {
        this.c.onNext(Boolean.FALSE);
    }
}

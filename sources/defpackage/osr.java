package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;

/* renamed from: osr reason: default package */
class osr {
    /* access modifiers changed from: 0000 */
    public final osp a;
    /* access modifiers changed from: 0000 */
    public osv b;
    /* access modifiers changed from: private */
    public final CompositeDisposable c = new CompositeDisposable();
    /* access modifiers changed from: private */
    public final String d;
    /* access modifiers changed from: private */
    public boolean e;
    /* access modifiers changed from: private */
    public boolean f;

    public osr(a aVar, uxh uxh, osp osp, String str, Scheduler scheduler, ofh ofh, Completable completable) {
        this.a = osp;
        this.d = str;
        final Completable completable2 = completable;
        final Scheduler scheduler2 = scheduler;
        final ofh ofh2 = ofh;
        final uxh uxh2 = uxh;
        final a aVar2 = aVar;
        AnonymousClass1 r1 = new c() {
            public final void a(Bundle bundle) {
                bundle.putBoolean(osr.class.getName(), osr.this.e);
                osr.this.b.a(bundle);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    osr.this.e = bundle.getBoolean(osr.class.getName(), false);
                    osr.this.b.b(bundle);
                }
            }

            public final void c() {
                osr.this.c.c();
                osr.this.c.a(completable2.a((ObservableSource<T>) Observable.b(Boolean.TRUE)).e(Boolean.FALSE).a(vun.a((c<T, R>) osr.this.a, BackpressureStrategy.BUFFER)).a(scheduler2).a((Consumer<? super T>) new $$Lambda$osr$1$4NFEahi6ifKTC29p7GQsBJQwfcw<Object>(this), (Consumer<? super Throwable>) new $$Lambda$osr$1$XBQezbOqw4RdPqiyVgEo5P9bvbA<Object>(this, ofh2)));
                if (!osr.this.e) {
                    osr.this.c.a(completable2.a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new $$Lambda$osr$1$kOSAJUbinv4TdEf5T73A3fEcZAU<Object>(this, uxh2))).a((Action) new $$Lambda$osr$1$KKqP1SLpfB5DHdG2iM_UYK4b4k(this), (Consumer<? super Throwable>) $$Lambda$osr$1$QJXmg9IxP65UP7p3f0nhN5zMNc.INSTANCE));
                }
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                if (bool.booleanValue()) {
                    osr.this.b.d();
                }
                osr.this.b.a(!bool.booleanValue() && !osr.this.f);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(ofh ofh, Throwable th) {
                osr.this.f = true;
                osr.this.b.a(false);
                osr.this.b.a((String) null);
                ofh.a(-1, 0);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ CompletableSource a(uxh uxh) {
                return uxh.a(osr.this.d);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void d() {
                osr.this.e = true;
            }

            public final void a() {
                osr.this.c.c();
            }

            public final void aP_() {
                aVar2.b(this);
            }
        };
        aVar.a(r1);
    }
}

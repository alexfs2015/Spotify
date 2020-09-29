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

@Deprecated
/* renamed from: nsx reason: default package */
class nsx {
    /* access modifiers changed from: 0000 */
    public final nsv a;
    /* access modifiers changed from: 0000 */
    public ntb b;
    /* access modifiers changed from: private */
    public final CompositeDisposable c = new CompositeDisposable();
    /* access modifiers changed from: private */
    public final String d;
    /* access modifiers changed from: private */
    public boolean e;
    /* access modifiers changed from: private */
    public boolean f;

    public nsx(a aVar, vjj vjj, nsv nsv, String str, Scheduler scheduler, oml oml, Completable completable) {
        this.a = nsv;
        this.d = str;
        final Completable completable2 = completable;
        final Scheduler scheduler2 = scheduler;
        final oml oml2 = oml;
        final vjj vjj2 = vjj;
        final a aVar2 = aVar;
        AnonymousClass1 r1 = new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ CompletableSource a(vjj vjj) {
                return vjj.a(nsx.this.d);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                if (bool.booleanValue()) {
                    nsx.this.b.d();
                }
                nsx.this.b.a(!bool.booleanValue() && !nsx.this.f);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(oml oml, Throwable th) {
                nsx.this.f = true;
                nsx.this.b.a(false);
                nsx.this.b.a((String) null);
                oml.a(-1, 0);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void d() {
                nsx.this.e = true;
            }

            public final void a() {
                nsx.this.c.c();
            }

            public final void a(Bundle bundle) {
                bundle.putBoolean(nsx.class.getName(), nsx.this.e);
                nsx.this.b.a(bundle);
            }

            public final void aN_() {
                aVar2.b(this);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    nsx.this.e = bundle.getBoolean(nsx.class.getName(), false);
                    nsx.this.b.b(bundle);
                }
            }

            public final void c() {
                nsx.this.c.c();
                nsx.this.c.a(completable2.a((ObservableSource<T>) Observable.b(Boolean.TRUE)).e(Boolean.FALSE).a(wit.a((c<T, R>) nsx.this.a, BackpressureStrategy.BUFFER)).a(scheduler2).a((Consumer<? super T>) new $$Lambda$nsx$1$9EX7oPVI8SZ79xsVCU5GBuARYzk<Object>(this), (Consumer<? super Throwable>) new $$Lambda$nsx$1$Fb3LFzewY_svre7B3rhBR1U7bts<Object>(this, oml2)));
                if (!nsx.this.e) {
                    nsx.this.c.a(completable2.a((CompletableSource) Completable.a((Callable<? extends CompletableSource>) new $$Lambda$nsx$1$whMpagXfkHBFtmcXxsgaKl3GNmc<Object>(this, vjj2))).a((Action) new $$Lambda$nsx$1$pQUULUIqXHX3db478kYP6H6q6ng(this), (Consumer<? super Throwable>) $$Lambda$nsx$1$36GIi5dx8UdTo4pSnFEKpUHnrKw.INSTANCE));
                }
            }
        };
        aVar.a(r1);
    }
}

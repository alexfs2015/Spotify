package defpackage;

import android.os.Bundle;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: ozy reason: default package */
final class ozy {
    final CompositeDisposable a = new CompositeDisposable();
    final ozw b;
    pac c;
    boolean d;

    public ozy(a aVar, ozw ozw, Scheduler scheduler, oml oml, Completable completable) {
        this.b = ozw;
        final Completable completable2 = completable;
        final Scheduler scheduler2 = scheduler;
        final oml oml2 = oml;
        final a aVar2 = aVar;
        AnonymousClass1 r1 = new c() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(Boolean bool) {
                if (bool.booleanValue()) {
                    ozy.this.c.d();
                }
                ozy.this.c.a(!bool.booleanValue() && !ozy.this.d);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(oml oml, Throwable th) {
                ozy ozy = ozy.this;
                ozy.d = true;
                ozy.c.a(false);
                ozy.this.c.a((String) null);
                oml.a(-1, 0);
            }

            public final void a() {
                ozy.this.a.c();
            }

            public final void a(Bundle bundle) {
                ozy.this.c.a(bundle);
            }

            public final void aN_() {
                aVar2.b(this);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    ozy.this.c.b(bundle);
                }
            }

            public final void c() {
                ozy.this.a.c();
                ozy.this.a.a(completable2.a((ObservableSource<T>) Observable.b(Boolean.TRUE)).e(Boolean.FALSE).a(wit.a((c<T, R>) ozy.this.b, BackpressureStrategy.BUFFER)).a(scheduler2).a((Consumer<? super T>) new $$Lambda$ozy$1$rdMaFrMbauUkQui6hN2Y2iX925o<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ozy$1$Br6RmTIETDiUPJPM8axGLTnDGh8<Object>(this, oml2)));
            }
        };
        aVar.a(r1);
    }
}

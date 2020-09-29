package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Targetings;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import java.util.Collections;
import java.util.EnumSet;

/* renamed from: ifp reason: default package */
public class ifp extends ift {
    private final EnumSet<StateType> a = EnumSet.of(StateType.MIDROLL_VIDEO_ADS, StateType.WATCH_NOW_SLOT);
    private final EnumSet<StateType> b = EnumSet.of(StateType.CAR_CONNECTED, StateType.WIFI_DISCONNECTED, StateType.PLAYING_FROM_SPONSORED_CONTEXT);
    private final CompositeDisposable c = new CompositeDisposable();
    private final EnumSet<StateType> d = EnumSet.noneOf(StateType.class);
    private boolean e = false;
    private final hzx f;

    /* renamed from: ifp$a */
    static class a extends DisposableObserver<Targetings> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void onComplete() {
            Logger.b("Request for updating targeting information completed", new Object[0]);
        }

        public final void onError(Throwable th) {
            Logger.b("Error in making request to targeting endpoint: %s", th.getMessage());
        }

        public final /* synthetic */ void onNext(Object obj) {
            Logger.b("Targeting information posted successfully", new Object[0]);
        }
    }

    public ifp(hzx hzx) {
        this.f = hzx;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        if (!this.e) {
            this.e = true;
            a aVar = new a(0);
            this.f.a("ad-product", "midroll-watch-now").h().d().subscribe(aVar);
            this.c.a((Disposable) aVar);
            Logger.b("MidRollTargeting Patched", new Object[0]);
        }
    }

    public final void a(ifo ifo) {
        if (this.a.contains(ifo.a) || this.b.contains(ifo.a)) {
            if (ifo.b) {
                this.d.add(ifo.a);
            } else {
                this.d.remove(ifo.a);
            }
            if (c()) {
                a();
                return;
            }
            b();
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.e) {
            this.e = false;
            a aVar = new a(0);
            this.f.a("ad-product", "no-midroll-watch-now").h().d().subscribe(aVar);
            this.c.a((Disposable) aVar);
            Logger.b("MidRollTargeting DePatched", new Object[0]);
        }
    }

    public final boolean c() {
        return this.d.containsAll(this.a) && Collections.disjoint(this.d, this.b);
    }

    public final boolean d() {
        return !c();
    }

    /* access modifiers changed from: protected */
    public final String e() {
        return getClass().getSimpleName();
    }

    /* access modifiers changed from: protected */
    public final void f() {
        this.c.c();
    }
}
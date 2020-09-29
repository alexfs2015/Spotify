package defpackage;

import com.google.android.gms.cast.CastDevice;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableDelaySubscriptionOther;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: mjk reason: default package */
public final class mjk {
    mjf a;
    final a b = new a(this, 0);
    nh c;
    final ni d;
    final CompositeDisposable e = new CompositeDisposable();
    boolean f;
    String g;
    final List<f> h = new ArrayList();
    final a i = new a() {
        public final void a(ni niVar, f fVar) {
            super.a(niVar, fVar);
            for (f fVar2 : mjk.this.h) {
                if (fVar2.c.equals(fVar.c)) {
                    return;
                }
            }
            mjk.this.h.add(fVar);
        }

        public final void b(ni niVar, f fVar) {
            super.b(niVar, fVar);
            mjk.this.h.remove(fVar);
        }
    };
    private final Scheduler j;
    private final List<f> k = new ArrayList();
    private final List<f> l = new ArrayList();

    /* renamed from: mjk$a */
    class a extends defpackage.ni.a {
        private a() {
        }

        /* synthetic */ a(mjk mjk, byte b) {
            this();
        }

        public final void a() {
            mjk.this.a.a((CastDevice) null);
        }

        public final void a(f fVar) {
            mjk.this.a.a(CastDevice.a(fVar.q));
        }

        public void a(ni niVar, f fVar) {
            mjk.this.a(false);
        }

        public void b(ni niVar, f fVar) {
            mjk.this.a(false);
        }

        public final void c(ni niVar, f fVar) {
            mjk.this.a(false);
        }
    }

    public mjk(ni niVar, String str, Scheduler scheduler) {
        this.d = niVar;
        this.g = str;
        this.j = scheduler;
        a();
    }

    private void a(List<f> list) {
        fdd.a((Iterable<T>) list, (fbq<? super T>) new $$Lambda$mjk$Ty8RN6W7Vx7MuBHbN4XT_HPZU<Object>(this));
    }

    private void a(List<f> list, boolean z) {
        if (z) {
            for (int size = this.l.size() - 1; size >= 0; size--) {
                f fVar = (f) this.l.get(size);
                this.l.remove(size);
                e(fVar);
            }
        } else {
            for (int size2 = this.l.size() - 1; size2 >= 0; size2--) {
                f fVar2 = (f) this.l.get(size2);
                $$Lambda$mjk$FMQgWvxSM9SNfdSe7CWELifILSo r1 = new $$Lambda$mjk$FMQgWvxSM9SNfdSe7CWELifILSo(fVar2);
                if (fdd.c(list, r1)) {
                    fdd.a((Iterable<T>) list, (fbq<? super T>) r1);
                } else {
                    this.l.remove(size2);
                    e(fVar2);
                }
            }
        }
        for (f fVar3 : list) {
            this.l.add(fVar3);
            d(fVar3);
        }
    }

    public static DiscoveredDevice b(f fVar) {
        return mje.a(CastDevice.a(fVar.q));
    }

    private List<f> c() {
        ArrayList arrayList = new ArrayList(ni.a());
        for (f fVar : this.h) {
            if (!arrayList.contains(fVar)) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    private boolean c(f fVar) {
        return !fVar.b() && fVar.g && fVar.a(this.c);
    }

    private void d(f fVar) {
        DiscoveredDevice b2 = b(fVar);
        if (!b2.getStatus().equals(DiscoveredDevice.DEVICE_FAILURE_UNKNOWN)) {
            this.a.a(b2);
        }
    }

    private void e(f fVar) {
        Logger.b("Cast device has been lost", new Object[0]);
        DiscoveredDevice b2 = b(fVar);
        if (!b2.getStatus().equals(DiscoveredDevice.DEVICE_FAILURE_UNKNOWN)) {
            this.a.b(b2);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean f(f fVar) {
        return !c(fVar);
    }

    /* access modifiers changed from: 0000 */
    public final f a(String str) {
        if (str != null) {
            for (f fVar : c()) {
                CastDevice a2 = CastDevice.a(fVar.q);
                if ((a2 != null && str.equals(a2.a())) && c(fVar)) {
                    return fVar;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        try {
            this.c = new defpackage.nh.a().a(bnz.a(this.g)).a();
        } catch (IllegalArgumentException unused) {
            Logger.e("CM - Cannot create MediaRouterManager: Invalid AppId", new Object[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(f fVar) {
        this.b.b(this.d, fVar);
        this.b.a(this.d, fVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        this.k.clear();
        this.k.addAll(c());
        a(this.k);
        a(this.k, z);
    }

    /* access modifiers changed from: protected */
    public final CastDevice b(String str) {
        for (f fVar : c()) {
            CastDevice a2 = CastDevice.a(fVar.q);
            if (a2 != null && str.equals(a2.a()) && c(fVar)) {
                return a2;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        if (!this.f) {
            if (this.c != null) {
                this.h.clear();
                this.d.a(this.c, this.i, 1);
            }
            this.f = true;
            CompositeDisposable compositeDisposable = this.e;
            Observable b2 = Observable.b((Callable<? extends T>) new Callable<Boolean>() {
                public final /* synthetic */ Object call() {
                    mjk mjk = mjk.this;
                    mjk.d.a((defpackage.ni.a) mjk.i);
                    mjk.this.f = false;
                    Logger.b("Stopped active scan after %d seconds", Integer.valueOf(12));
                    return Boolean.TRUE;
                }
            });
            Observable a2 = Observable.a(12, TimeUnit.SECONDS, this.j);
            ObjectHelper.a(a2, "other is null");
            compositeDisposable.a(RxJavaPlugins.a((Observable<T>) new ObservableDelaySubscriptionOther<T>(b2, a2)).a((Consumer<? super Throwable>) $$Lambda$mjk$8y9NuyjUy7IkS3w02DN5BLYaDhY.INSTANCE).b(this.j).a(vvd.a(), (Consumer<? super Throwable>) $$Lambda$mjk$Gflb8U4gn7nBpthlaOvSq5ktbe4.INSTANCE));
        }
    }

    /* access modifiers changed from: protected */
    public final boolean c(String str) {
        f a2 = a(str);
        if (a2 != null) {
            if (a2.a()) {
                this.b.a(a2);
            } else {
                ni.a(a2);
            }
            return true;
        }
        a(ni.c());
        ni.a(1);
        return false;
    }
}

package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.ConnectManagerState;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.ConnectManager.a;
import com.spotify.mobile.android.connect.ConnectManager.b;
import com.spotify.mobile.android.connect.ConnectManager.c;
import com.spotify.mobile.android.connect.ConnectManager.d;
import com.spotify.mobile.android.connect.model.ConnectDevice;
import com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.GaiaState;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import rx.internal.operators.OperatorReplay;

/* renamed from: mfo reason: default package */
public final class mfo implements ConnectManager, gkw {
    private vhz<GaiaState> A;
    private final gcg B;
    private final uck C;
    private final Scheduler D;
    private final rpg E;
    private final Observer<Float> F = new Observer<Float>() {
        public final void onComplete() {
        }

        public final void onSubscribe(Disposable disposable) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            Float f = (Float) obj;
            if (a()) {
                mfo.this.a(f.floatValue(), Integer.valueOf(90));
            }
        }

        public final void onError(Throwable th) {
            if (!a() || mfo.this.b == null) {
                Logger.b(th, "Error while listening to remote volume", new Object[0]);
                return;
            }
            mfo.this.b.a(th);
        }

        private boolean a() {
            return mfo.this.a == null || !mfo.this.a.g();
        }
    };
    private final b G = new b() {
        public final void a() {
            mfo.this.a("sp://connect/v1/discover", "all");
        }

        public final void b() {
            mfo.this.a("sp://connect/v1/discover", "restart");
        }

        public final void c() {
            Logger.b("CMC - disconnectCurrentDevice", new Object[0]);
        }
    };
    private final Runnable H = new Runnable() {
        public final void run() {
            mfo.this.w();
        }
    };
    c a;
    FlowableEmitter<Float> b;
    private final Context c;
    private final Handler d;
    private final grq e;
    private final gky<GaiaState> f;
    private final FireAndForgetResolver g;
    private Disposable h = Disposables.b();
    private boolean i = true;
    private ConnectManagerState j;
    private List<GaiaDevice> k = Collections.emptyList();
    private ConnectState l = ConnectState.UNKNOWN;
    private GaiaDevice m;
    private ConnectDevice n;
    private float o;
    private String p = "";
    private final Set<d> q = new CopyOnWriteArraySet();
    private final Set<b> r = new CopyOnWriteArraySet();
    private final Set<FlowableEmitter<ConnectManagerState>> s;
    private a t;
    private grn u;
    private final wlc<grn> v;
    private Observable<GaiaState> w;
    private Observable<GaiaState> x;
    private final String y;
    private vhz<GaiaState> z;

    public mfo(Application application, Handler handler, gkz gkz, FireAndForgetResolver fireAndForgetResolver, wlc<grn> wlc, grq grq, String str, gcg gcg, uck uck, rpg rpg, Scheduler scheduler) {
        this.c = (Context) fay.a(application.getApplicationContext());
        this.d = (Handler) fay.a(handler);
        this.f = gkz.a(GaiaState.class);
        this.g = fireAndForgetResolver;
        this.e = (grq) fay.a(grq);
        this.y = (String) fay.a(str);
        this.v = (wlc) fay.a(wlc);
        this.s = new LinkedHashSet(5);
        this.j = ConnectManagerState.NOT_STARTED;
        this.B = gcg;
        this.C = uck;
        this.E = rpg;
        this.D = scheduler;
        a(ConnectManagerState.NOT_STARTED);
    }

    private static RequestBuilder x() {
        return RequestBuilder.subscribe("sp://connect/v1/").with("include-local-device", "1");
    }

    private Observable<GaiaState> y() {
        if (this.e.b()) {
            if (this.w == null) {
                String str = "gaia state (local devices only)";
                this.A = new vhz<>(str, vun.b(OperatorReplay.a(this.f.resolve(x().with("exclude-non-local-devices", "1").build()), 1).e()));
                this.w = Observable.a((ObservableOnSubscribe<T>) this.A);
            }
            return this.w;
        }
        if (this.x == null) {
            String str2 = "gaia state";
            this.z = new vhz<>(str2, vun.b(OperatorReplay.a(this.f.resolve(x().build()), 1).e()));
            this.x = Observable.a((ObservableOnSubscribe<T>) this.z);
        }
        return this.x;
    }

    public final void k() {
        this.e.a();
        a(ConnectManagerState.STARTED);
        this.w = null;
        this.x = null;
        this.h.bf_();
        this.h = y().a(this.D).a((Consumer<? super T>) new $$Lambda$mfo$fhPr4Hnd85OuRc5_m_pfv0wHOEQ<Object>(this), (Consumer<? super Throwable>) $$Lambda$mfo$CWRdCrPDcw1lX_gQC2FmHb_VToc.INSTANCE);
        if (this.u != null) {
            A();
        }
        this.u = (grn) this.v.get();
        fay.a(this.u);
        this.u.a(this.F, g(), this.m);
        this.r.add(this.G);
        if (!this.p.isEmpty()) {
            c(this.p);
        }
        gcg gcg = this.B;
        gcg.b = new $$Lambda$8OEYb0bGLkEI2KQekZqdCe2_fM4(this);
        gcg.a(g());
        this.C.a();
    }

    /* access modifiers changed from: private */
    public void a(GaiaState gaiaState) {
        boolean z2;
        String str;
        List devices = gaiaState.getDevices();
        Iterator it = devices.iterator();
        ConnectDevice connectDevice = null;
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                GaiaDevice gaiaDevice = (GaiaDevice) it.next();
                ConnectDevice a2 = ConnectDevice.a(gaiaDevice, this.c, this.t);
                if (gaiaDevice.isActive()) {
                    this.m = gaiaDevice;
                    connectDevice = a2;
                }
                if (a2.c && gaiaState.shouldUseLocalPlayback()) {
                    connectDevice = a2;
                }
                if (gaiaDevice.getState() == GaiaDeviceState.CONNECTING || gaiaDevice.isBeingActivated()) {
                    z2 = true;
                }
            }
        }
        this.n = connectDevice;
        this.k = Collections.unmodifiableList(devices);
        boolean shouldUseLocalPlayback = gaiaState.shouldUseLocalPlayback();
        if (shouldUseLocalPlayback != this.i) {
            this.i = shouldUseLocalPlayback;
            Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.connect.SELF_ACTIVE_CHANGED");
            intent.putExtra("is_active", u());
            Context context = this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.y);
            sb.append(".permission.INTERNAL_BROADCAST");
            context.sendBroadcast(intent, sb.toString());
        }
        if (!(devices.size() > 1)) {
            this.l = ConnectState.NORMAL;
        } else if (z2) {
            this.l = ConnectState.CONNECTING;
        } else if (u()) {
            this.l = ConnectState.DETECTED;
        } else {
            this.l = ConnectState.ACTIVE;
        }
        ConnectDevice connectDevice2 = this.n;
        String str2 = "No active device";
        if (connectDevice2 != null) {
            str2 = connectDevice2.a;
            str = this.n.b;
        } else {
            str = str2;
        }
        String[] strArr = {String.format(Locale.ENGLISH, "DevicesCount:%d", new Object[]{Integer.valueOf(devices.size())}), String.format(Locale.ENGLISH, "ActiveDeviceId:%s, ActiveDeviceName: %s", new Object[]{str2, str})};
    }

    public final void l() {
        this.e.c();
        a(ConnectManagerState.STOPPED);
        A();
        FlowableEmitter<Float> flowableEmitter = this.b;
        if (flowableEmitter != null) {
            flowableEmitter.c();
        }
        this.h.bf_();
        this.C.a.a(Disposables.b());
        this.B.a.bf_();
        this.i = true;
        this.r.remove(this.G);
        this.p = "";
        gsl.b();
    }

    public final List<vie> m() {
        vhz<GaiaState> vhz = this.z;
        if (vhz != null) {
            return vhz.a();
        }
        return ImmutableList.d();
    }

    public final List<vie> n() {
        vhz<GaiaState> vhz = this.A;
        if (vhz != null) {
            return vhz.a();
        }
        return ImmutableList.d();
    }

    public final boolean o() {
        return this.j == ConnectManagerState.STARTED;
    }

    public final Observable<List<GaiaDevice>> e() {
        return y().c((Function<? super T, ? extends R>) $$Lambda$mfo$hS4hBw87sXi_Vp6gEfYZU7qIAyI.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ List c(GaiaState gaiaState) {
        if (gaiaState == null) {
            return Collections.emptyList();
        }
        return gaiaState.getDevices();
    }

    public final Observable<ConnectState> f() {
        return y().c((Function<? super T, ? extends R>) new $$Lambda$mfo$lqI_Cem6sdsz0JWgKiRC2XDcbl4<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r1 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ com.spotify.mobile.android.connect.ConnectManager.ConnectState b(com.spotify.mobile.android.connect.model.GaiaState r7) {
        /*
            r6 = this;
            java.util.List r0 = r7.getDevices()
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            if (r0 <= r2) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 == 0) goto L_0x0045
            java.util.List r0 = r7.getDevices()
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()
            com.spotify.mobile.android.connect.model.GaiaDevice r3 = (com.spotify.mobile.android.connect.model.GaiaDevice) r3
            com.spotify.mobile.android.connect.model.DeviceState r4 = r3.getState()
            com.spotify.mobile.android.connect.model.DeviceState$GaiaDeviceState r5 = com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState.CONNECTING
            if (r4 == r5) goto L_0x0033
            boolean r3 = r3.isBeingActivated()
            if (r3 == 0) goto L_0x0019
        L_0x0033:
            r1 = 1
        L_0x0034:
            if (r1 == 0) goto L_0x0039
            com.spotify.mobile.android.connect.ConnectManager$ConnectState r7 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.CONNECTING
            goto L_0x0047
        L_0x0039:
            boolean r7 = r7.shouldUseLocalPlayback()
            if (r7 == 0) goto L_0x0042
            com.spotify.mobile.android.connect.ConnectManager$ConnectState r7 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.DETECTED
            goto L_0x0047
        L_0x0042:
            com.spotify.mobile.android.connect.ConnectManager$ConnectState r7 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.ACTIVE
            goto L_0x0047
        L_0x0045:
            com.spotify.mobile.android.connect.ConnectManager$ConnectState r7 = com.spotify.mobile.android.connect.ConnectManager.ConnectState.NORMAL
        L_0x0047:
            r6.l = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfo.b(com.spotify.mobile.android.connect.model.GaiaState):com.spotify.mobile.android.connect.ConnectManager$ConnectState");
    }

    public final Observable<GaiaDevice> g() {
        return e().c((Function<? super T, ? extends R>) new mga<Object,Object>()).a((Predicate<? super T>) $$Lambda$CRrAQr3Yfz_kWOYoM12aBVAXY.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$5MlCDNSPfrUeqxB8DfUlCoM9QBE.INSTANCE).a((Function<? super T, K>) new mfy<Object,K>());
    }

    public final Observable<Optional<GaiaDevice>> h() {
        return e().c((Function<? super T, ? extends R>) new mgb<Object,Object>());
    }

    public final Optional<String> d() {
        if (this.p.isEmpty()) {
            return Optional.e();
        }
        return Optional.b(this.p);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(FlowableEmitter flowableEmitter) {
        this.b = flowableEmitter;
    }

    public final Observable<Float> i() {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$mfo$tYYCo_Ve9Uv9WNeYLLs4ygtAVvs<T>(this), BackpressureStrategy.LATEST).j();
    }

    public final Observable<ConnectManagerState> j() {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$mfo$NGeO8f2Skw8xs9D6L16C3KZDkdY<T>(this), BackpressureStrategy.BUFFER).j();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(FlowableEmitter flowableEmitter) {
        this.s.add(flowableEmitter);
        flowableEmitter.a(this.j);
        flowableEmitter.a(new $$Lambda$mfo$iFAjaf9vCny8tiS6o7EaByiU(this, flowableEmitter));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(FlowableEmitter flowableEmitter) {
        this.s.remove(flowableEmitter);
    }

    private void a(ConnectManagerState connectManagerState) {
        this.j = connectManagerState;
        z();
    }

    private void z() {
        for (Emitter a2 : this.s) {
            a2.a(this.j);
        }
    }

    public final void a(d dVar) {
        this.q.add(dVar);
        if (o()) {
            c(dVar);
        }
    }

    public final void b(d dVar) {
        this.q.remove(dVar);
    }

    /* access modifiers changed from: 0000 */
    public void w() {
        FlowableEmitter<Float> flowableEmitter = this.b;
        if (flowableEmitter != null) {
            flowableEmitter.a(Float.valueOf(this.o));
        }
        for (d c2 : this.q) {
            c(c2);
        }
    }

    private void c(d dVar) {
        dVar.a(this.o);
    }

    public final void a(b bVar) {
        this.r.add(bVar);
    }

    public final void b(b bVar) {
        this.r.remove(bVar);
    }

    public final void a(c cVar) {
        this.a = cVar;
    }

    public final void a(float f2) {
        c cVar = this.a;
        if (cVar != null && cVar.g()) {
            a(f2, Integer.valueOf(90));
        }
    }

    public final void a(a aVar) {
        this.t = aVar;
    }

    public final GaiaDevice a(final String str) {
        return (GaiaDevice) fcl.a(this.k, new faz<GaiaDevice>() {
            public final /* synthetic */ boolean apply(Object obj) {
                GaiaDevice gaiaDevice = (GaiaDevice) obj;
                return gaiaDevice != null && str.equals(gaiaDevice.getIdentifier());
            }
        }, null);
    }

    public final ConnectState p() {
        return this.l;
    }

    public final ConnectDevice q() {
        return this.n;
    }

    public final void r() {
        for (b a2 : this.r) {
            a2.a();
        }
    }

    public final void s() {
        for (b b2 : this.r) {
            b2.b();
        }
    }

    public final void c(String str) {
        if (this.j != ConnectManagerState.STOPPED) {
            this.p = str;
        }
        if (o()) {
            for (b c2 : this.r) {
                c2.c();
            }
            if (faw.a(str, "local_device")) {
                a("sp://connect/v1/pull", new String[0]);
                return;
            }
            a("sp://connect/v1/transfer", str);
        }
    }

    public final void t() {
        c("local_device");
    }

    public final void d(String str) {
        a("sp://connect/v1/attach", str);
    }

    public final void e(String str) {
        a("sp://connect/v1/logout", str);
    }

    public final void b(String str) {
        a("sp://connect/v1/set_preferred_zeroconf", str);
    }

    /* access modifiers changed from: 0000 */
    public void a(final String str, final String... strArr) {
        this.g.resolve(RequestBuilder.postBytes(str, fau.a("\n").a((Object[]) strArr).getBytes(Charset.defaultCharset())).build(), new ResolverCallbackReceiver(this.d) {
            public final void onResolved(Response response) {
                Logger.b("CMC - Executed gaia command: %s, data: %s => %d", str, fau.a(",").a((Object[]) strArr), Integer.valueOf(response.getStatus()));
            }

            public final void onError(Throwable th) {
                Logger.e(th, "CMC - Failed to resolve command: %s, data: %s => Resolver probably not ready!", str, fau.a(",").a((Object[]) strArr));
            }
        });
    }

    public final boolean u() {
        return this.i;
    }

    public final float c() {
        c cVar = this.a;
        if (cVar != null && cVar.g()) {
            return this.a.f();
        }
        grn grn = this.u;
        if (grn == null || !grn.g()) {
            return 0.0f;
        }
        return this.u.a;
    }

    public final boolean a(Float f2) {
        float floatValue = f2.floatValue();
        if (floatValue > 1.0f) {
            floatValue = 1.0f;
        } else if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        Float valueOf = Float.valueOf(floatValue);
        a(valueOf.floatValue(), (Integer) null);
        c cVar = this.a;
        if (cVar != null && cVar.g()) {
            return this.a.a(valueOf.floatValue());
        }
        grn grn = this.u;
        if (grn == null || !grn.g()) {
            return false;
        }
        return this.u.a(valueOf.floatValue());
    }

    public final boolean a() {
        a(c(), (Integer) null);
        this.E.a(1);
        c cVar = this.a;
        if (cVar != null && cVar.g()) {
            return this.a.d();
        }
        grn grn = this.u;
        if (grn == null || !grn.g()) {
            return false;
        }
        return this.u.d();
    }

    public final boolean b() {
        a(c(), (Integer) null);
        this.E.a(-1);
        c cVar = this.a;
        if (cVar != null && cVar.g()) {
            return this.a.e();
        }
        grn grn = this.u;
        if (grn == null || !grn.g()) {
            return false;
        }
        return this.u.e();
    }

    public final boolean v() {
        c cVar = this.a;
        if (cVar == null || !cVar.g()) {
            grn grn = this.u;
            if (grn == null || !grn.g()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(float f2, Integer num) {
        this.o = f2;
        if (num == null) {
            w();
            return;
        }
        this.d.removeCallbacks(this.H);
        this.d.postDelayed(this.H, (long) num.intValue());
    }

    private void A() {
        grn grn = this.u;
        if (grn != null) {
            grn.a();
        }
        this.u = null;
    }
}

package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.common.collect.ImmutableSet;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.connect.ConnectManager.b;
import com.spotify.mobile.android.connect.ConnectManager.c;
import com.spotify.mobile.android.connect.model.ConnectDevice;
import com.spotify.mobile.android.connect.model.DeviceState.GaiaDeviceState;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.connect.model.Message;
import com.spotify.mobile.android.connect.model.Message.Type;
import com.spotify.mobile.android.connect.model.Tech;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.music.R;
import com.spotify.music.connection.OfflineState;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.cast.discovery.DiscoveryConfiguration;
import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent;
import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent.EventType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: mkk reason: default package */
public final class mkk implements com.spotify.mobile.android.connect.ConnectManager.a, b, c, xij<GaiaDevice> {
    private final defpackage.mjp.a A = new defpackage.mjp.a() {
        public final void a(String str) {
            mjt a2 = mkk.this.a(str);
            if (a2 != null) {
                a2.i();
            }
        }

        public final void a(String str, String str2, String str3, String str4, String str5) {
            mjt a2 = mkk.this.a(str);
            if (a2 != null) {
                if (!a2.e(str)) {
                    mkk mkk = mkk.this;
                    mkk.n = true;
                    a2.a(str, mkk.p);
                } else if (!mkk.a(mkk.this)) {
                    a2.f(mjy.a(str2, str3, str4, str5));
                }
            }
        }
    };
    final Context a;
    final gtr b;
    final seb c;
    public final Set<a> d;
    public final ImmutableSet<mjt> e;
    public DiscoveryConfiguration f;
    public final mjq g;
    public final mkc h;
    public final xok i;
    public xip j = xon.b();
    public xip k = xon.b();
    public Disposable l = Disposables.b();
    public boolean m;
    boolean n;
    DiscoveredDevice o;
    final mjm p = new mjm() {
        public final void a(float f) {
            mkk.this.b.a(f);
        }

        public final void a(DiscoveredDevice discoveredDevice) {
            mkk.a(mkk.this, discoveredDevice);
            mkk.this.c.e();
            mjt a2 = mkk.this.a(discoveredDevice.getDeviceId());
            if (a2 != null) {
                a2.f(mjy.a(discoveredDevice));
            }
        }

        public final void a(String str, String str2) {
            Message a2 = mjy.a(str2);
            int i = AnonymousClass7.a[a2.type.ordinal()];
            if (i == 1) {
                DiscoveredDevice discoveredDevice = (DiscoveredDevice) mjy.a(a2.payload, DiscoveredDevice.class);
                if (discoveredDevice != null) {
                    discoveredDevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_INVALID_PUBLIC_KEY);
                } else {
                    discoveredDevice = DiscoveredDevice.errorStatusDevice(str, DiscoveredDevice.DEVICE_FAILURE_STATUS_BAD_REQUEST);
                }
                mkk.this.h.b(discoveredDevice);
            } else if (i == 2) {
                mkk mkk = mkk.this;
                if (!(mkk.o == null || !mkk.o.getDeviceId().equals(str) || mkk.b.p() == ConnectState.CONNECTING)) {
                    mjt a3 = mkk.a(str);
                    if (a3 != null && a3.c(str)) {
                        mkk.b.c(str);
                    }
                }
            } else if (i != 3) {
                Logger.b("Received unknown message from the Receiver app: %s", str2);
            } else {
                DiscoveredDevice discoveredDevice2 = (DiscoveredDevice) mjy.a(a2.payload, DiscoveredDevice.class);
                if (discoveredDevice2 == null) {
                    discoveredDevice2 = DiscoveredDevice.errorStatusDevice(str, DiscoveredDevice.DEVICE_FAILURE_STATUS_BAD_REQUEST);
                }
                mkk mkk2 = mkk.this;
                if (discoveredDevice2.getErrorCode() == 9) {
                    Toast.makeText(mkk2.a, R.string.connect_cast_device_premium_only, 1).show();
                }
                mkk.this.h.b(discoveredDevice2);
            }
        }

        public final void b(DiscoveredDevice discoveredDevice) {
            mkk.a(mkk.this, (DiscoveredDevice) null);
            mkk.this.c.f();
            if (discoveredDevice != null && !mkk.a(mkk.this)) {
                discoveredDevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_LOGIN_FAILED);
                discoveredDevice.setTokenType("");
                mkk.this.h.a(discoveredDevice);
            }
            mkk.this.b.r();
        }

        public final void c(DiscoveredDevice discoveredDevice) {
            mkk.a(mkk.this, (DiscoveredDevice) null);
            if (discoveredDevice != null) {
                discoveredDevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_LOGIN_FAILED);
                mkk.this.h.b(discoveredDevice);
            }
        }
    };
    private final ura q;
    private final xil r;
    private final hgy s;
    private final Observable<ConnectionType> t;
    private GaiaDevice u;
    private final xij<fqn> v = new xij<fqn>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            fqn fqn = (fqn) obj;
            mkk mkk = mkk.this;
            if (mkk.m) {
                fdz R_ = mkk.e.iterator();
                while (R_.hasNext()) {
                    mkk.a((mjt) R_.next());
                }
            }
        }
    };
    private final Consumer<ConnectionType> w = new Consumer<ConnectionType>() {
        public final /* synthetic */ void accept(Object obj) {
            if (((ConnectionType) obj).mIsp) {
                mkk.this.a();
            }
        }
    };
    private final Consumer<Throwable> x = $$Lambda$mkk$30a3RAQPzoNAHFBQTT9mMfBv4M.INSTANCE;
    private final xis<OfflineState> y = new xis<OfflineState>() {
        private boolean a;

        public final /* synthetic */ void call(Object obj) {
            OfflineState offlineState = (OfflineState) obj;
            if (offlineState.offline() != this.a) {
                mkk mkk = mkk.this;
                if (offlineState.offline()) {
                    mkk.j();
                } else {
                    mkk.i();
                }
            }
            this.a = offlineState.offline();
        }
    };
    private final xij<DiscoveryEvent> z = new xij<DiscoveryEvent>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            DiscoveryEvent discoveryEvent = (DiscoveryEvent) obj;
            DiscoveredDevice discoveredDevice = discoveryEvent.b;
            if (discoveryEvent.a == EventType.DISCOVER) {
                mkk.this.h.a(discoveredDevice);
                mkk.this.a(discoveredDevice.getDeviceId(), discoveredDevice.getRemoteName());
                return;
            }
            mkk.this.h.a(Request.DELETE, mkc.a(discoveredDevice.getDeviceId()), discoveredDevice);
        }
    };

    /* renamed from: mkk$7 reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.mobile.android.connect.model.Message$Type[] r0 = com.spotify.mobile.android.connect.model.Message.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.connect.model.Message$Type r1 = com.spotify.mobile.android.connect.model.Message.Type.GET_INFO_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.connect.model.Message$Type r1 = com.spotify.mobile.android.connect.model.Message.Type.ADD_USER_RESPONSE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.connect.model.Message$Type r1 = com.spotify.mobile.android.connect.model.Message.Type.ADD_USER_ERROR     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.mkk.AnonymousClass7.<clinit>():void");
        }
    }

    /* renamed from: mkk$a */
    public interface a {
        void a(boolean z);
    }

    public mkk(Context context, gtr gtr, seb seb, ImmutableSet<mjt> immutableSet, mjq mjq, DiscoveryConfiguration discoveryConfiguration, hgy hgy, mkc mkc, Observable<ConnectionType> observable, xil xil, ura ura) {
        this.a = context;
        this.b = gtr;
        this.c = seb;
        this.e = immutableSet;
        this.q = ura;
        this.d = new CopyOnWriteArraySet();
        this.g = mjq;
        this.f = discoveryConfiguration;
        this.s = hgy;
        this.h = mkc;
        this.t = observable;
        this.r = xil;
        this.i = new xok();
    }

    static /* synthetic */ void a(mkk mkk, DiscoveredDevice discoveredDevice) {
        if (mkk.o != discoveredDevice) {
            mkk.o = discoveredDevice;
            mkk.k();
        }
        mkk.n = false;
    }

    private static boolean a(DiscoveredDevice discoveredDevice, GaiaDevice gaiaDevice) {
        return (discoveredDevice.getDeviceId() == null || gaiaDevice.getIdentifier() == null || !gaiaDevice.getIdentifier().equals(discoveredDevice.getDeviceId())) ? false : true;
    }

    static /* synthetic */ boolean a(mkk mkk) {
        GaiaDevice gaiaDevice = mkk.u;
        if (gaiaDevice != null) {
            DiscoveredDevice discoveredDevice = mkk.o;
            if (discoveredDevice != null && a(discoveredDevice, gaiaDevice) && mkk.u.getState() == GaiaDeviceState.LOGGED_IN) {
                return true;
            }
        }
        return false;
    }

    public static void b(mjt mjt) {
        if (mjt.k()) {
            mjt.c();
        }
    }

    private void k() {
        for (a aVar : this.d) {
            if (aVar != null) {
                aVar.a(this.o != null);
            }
        }
    }

    private boolean l() {
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        if (activityManager != null) {
            return fa.a(activityManager);
        }
        return false;
    }

    public final SpotifyIcon a(ConnectDevice connectDevice) {
        if (this.m && Tech.of(connectDevice).isCast()) {
            String str = connectDevice.a;
            mjt a2 = a(str);
            if (a2 != null) {
                if (a2.c(str)) {
                    return SpotifyIcon.DEVICE_OTHER_32;
                }
                if (a2.d(str)) {
                    return SpotifyIcon.DEVICE_MULTISPEAKER_32;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public mjt a(String str) {
        fdz R_ = this.e.iterator();
        while (R_.hasNext()) {
            mjt mjt = (mjt) R_.next();
            if (mjt.a(str)) {
                return mjt;
            }
        }
        return null;
    }

    public final void a() {
        if (this.m && !l()) {
            fdz R_ = this.e.iterator();
            while (R_.hasNext()) {
                mjt mjt = (mjt) R_.next();
                if (mjt.k()) {
                    mjt.j();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2) {
        GaiaDevice gaiaDevice = this.u;
        if (gaiaDevice != null && !this.n && gaiaDevice.getIdentifier().equals(str)) {
            mjt a2 = a(str);
            if (a2 != null && !a2.e(str)) {
                a2.b(str, this.p);
                Logger.b("Reconnecting to %s", str2);
            }
        }
    }

    public void a(mjt mjt) {
        if (!mjt.k()) {
            mjt.b();
        }
    }

    public final boolean a(float f2) {
        if (g()) {
            mjt a2 = a(this.o.getDeviceId());
            if (a2 != null) {
                return a2.a(f2);
            }
        }
        return false;
    }

    public final void b() {
        a();
    }

    public final void c() {
        GaiaDevice gaiaDevice = this.u;
        if (gaiaDevice != null) {
            mjt a2 = a(gaiaDevice.getIdentifier());
            if (a2 != null) {
                a2.i();
            }
        }
    }

    public final boolean d() {
        if (g()) {
            mjt a2 = a(this.o.getDeviceId());
            if (a2 != null) {
                return a2.f();
            }
        }
        return false;
    }

    public final boolean e() {
        if (g()) {
            mjt a2 = a(this.o.getDeviceId());
            if (a2 != null) {
                return a2.g();
            }
        }
        return false;
    }

    public final float f() {
        if (g()) {
            mjt a2 = a(this.o.getDeviceId());
            if (a2 != null) {
                return a2.h();
            }
        }
        return 0.0f;
    }

    public final boolean g() {
        if (this.m) {
            DiscoveredDevice discoveredDevice = this.o;
            if (discoveredDevice != null && TextUtils.equals(discoveredDevice.getDeviceId(), ((GaiaDevice) fbp.a(this.u)).getIdentifier())) {
                return true;
            }
        }
        return false;
    }

    public final void h() {
        if (!this.m) {
            this.m = true;
            this.j = wit.a((xfk<T>) this.s.a()).a(this.v);
            this.h.a(this.A);
            fdz R_ = this.e.iterator();
            while (R_.hasNext()) {
                mjt mjt = (mjt) R_.next();
                mjt.d();
                this.i.a(wit.a((ObservableSource<T>) mjt.l(), BackpressureStrategy.BUFFER).a(this.r).a(this.z));
            }
            this.k = wit.a((ObservableSource<T>) this.q.a, BackpressureStrategy.BUFFER).a(this.y, (xis<Throwable>) $$Lambda$mkk$qudtIDZJHzLxjdMcLhOp_L57_0Y.INSTANCE);
            this.l = this.t.a(this.w, this.x);
            i();
            k();
        }
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        fdz R_ = this.e.iterator();
        while (R_.hasNext()) {
            a((mjt) R_.next());
        }
    }

    public void j() {
        fdz R_ = this.e.iterator();
        while (R_.hasNext()) {
            b((mjt) R_.next());
        }
    }

    public final void onCompleted() {
    }

    public final void onError(Throwable th) {
    }

    public final /* synthetic */ void onNext(Object obj) {
        this.u = (GaiaDevice) obj;
        if (this.m) {
            DiscoveredDevice discoveredDevice = this.o;
            if (discoveredDevice == null || a(discoveredDevice, this.u)) {
                a(this.u.getIdentifier(), this.u.getName());
            }
        }
    }
}

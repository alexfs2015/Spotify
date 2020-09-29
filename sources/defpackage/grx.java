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

/* renamed from: grx reason: default package */
public final class grx implements com.spotify.mobile.android.connect.ConnectManager.a, b, c, wue<GaiaDevice> {
    private final defpackage.mfd.a A = new defpackage.mfd.a() {
        public final void a(String str, String str2, String str3, String str4, String str5) {
            mfh a2 = grx.this.a(str);
            if (a2 != null) {
                if (!a2.e(str)) {
                    grx grx = grx.this;
                    grx.n = true;
                    a2.a(str, grx.p);
                } else if (!grx.a(grx.this)) {
                    a2.f(mfm.a(str2, str3, str4, str5));
                }
            }
        }

        public final void a(String str) {
            mfh a2 = grx.this.a(str);
            if (a2 != null) {
                a2.i();
            }
        }
    };
    final Context a;
    final grp b;
    final rur c;
    public final Set<a> d;
    public final ImmutableSet<mfh> e;
    public DiscoveryConfiguration f;
    public final mfe g;
    public final mfq h;
    public final xag i;
    public wuk j = xaj.b();
    public wuk k = xaj.b();
    public Disposable l = Disposables.b();
    public boolean m;
    boolean n;
    DiscoveredDevice o;
    final mfa p = new mfa() {
        public final void a(DiscoveredDevice discoveredDevice) {
            grx.a(grx.this, discoveredDevice);
            grx.this.c.e();
            mfh a2 = grx.this.a(discoveredDevice.getDeviceId());
            if (a2 != null) {
                a2.f(mfm.a(discoveredDevice));
            }
        }

        public final void b(DiscoveredDevice discoveredDevice) {
            grx.a(grx.this, (DiscoveredDevice) null);
            grx.this.c.f();
            if (discoveredDevice != null && !grx.a(grx.this)) {
                discoveredDevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_LOGIN_FAILED);
                discoveredDevice.setTokenType("");
                grx.this.h.a(discoveredDevice);
            }
            grx.this.b.r();
        }

        public final void c(DiscoveredDevice discoveredDevice) {
            grx.a(grx.this, (DiscoveredDevice) null);
            if (discoveredDevice != null) {
                discoveredDevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_LOGIN_FAILED);
                grx.this.h.b(discoveredDevice);
            }
        }

        public final void a(String str, String str2) {
            Message a2 = mfm.a(str2);
            int i = AnonymousClass7.a[a2.type.ordinal()];
            if (i == 1) {
                DiscoveredDevice discoveredDevice = (DiscoveredDevice) mfm.a(a2.payload, DiscoveredDevice.class);
                if (discoveredDevice != null) {
                    discoveredDevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_INVALID_PUBLIC_KEY);
                } else {
                    discoveredDevice = DiscoveredDevice.errorStatusDevice(str, DiscoveredDevice.DEVICE_FAILURE_STATUS_BAD_REQUEST);
                }
                grx.this.h.b(discoveredDevice);
            } else if (i == 2) {
                grx grx = grx.this;
                if (!(grx.o == null || !grx.o.getDeviceId().equals(str) || grx.b.p() == ConnectState.CONNECTING)) {
                    mfh a3 = grx.a(str);
                    if (a3 != null && a3.c(str)) {
                        grx.b.c(str);
                    }
                }
            } else if (i != 3) {
                Logger.b("Received unknown message from the Receiver app: %s", str2);
            } else {
                DiscoveredDevice discoveredDevice2 = (DiscoveredDevice) mfm.a(a2.payload, DiscoveredDevice.class);
                if (discoveredDevice2 == null) {
                    discoveredDevice2 = DiscoveredDevice.errorStatusDevice(str, DiscoveredDevice.DEVICE_FAILURE_STATUS_BAD_REQUEST);
                }
                grx grx2 = grx.this;
                if (discoveredDevice2.getErrorCode() == 9) {
                    Toast.makeText(grx2.a, R.string.connect_cast_device_premium_only, 1).show();
                }
                grx.this.h.b(discoveredDevice2);
            }
        }

        public final void a(float f) {
            grx.this.b.a(f);
        }
    };
    private final ufm q;
    private final wug r;
    private final hec s;
    private final Observable<ConnectionType> t;
    private GaiaDevice u;
    private final wue<fpt> v = new wue<fpt>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            fpt fpt = (fpt) obj;
            grx grx = grx.this;
            if (grx.m) {
                fdh R_ = grx.e.iterator();
                while (R_.hasNext()) {
                    grx.a((mfh) R_.next());
                }
            }
        }
    };
    private final Consumer<ConnectionType> w = new Consumer<ConnectionType>() {
        public final /* synthetic */ void accept(Object obj) {
            if (((ConnectionType) obj).mIsp) {
                grx.this.a();
            }
        }
    };
    private final Consumer<Throwable> x = $$Lambda$grx$D6hcMCu4rBck8VFVrG_r7Ld40OA.INSTANCE;
    private final wun<OfflineState> y = new wun<OfflineState>() {
        private boolean a;

        public final /* synthetic */ void call(Object obj) {
            OfflineState offlineState = (OfflineState) obj;
            if (offlineState.offline() != this.a) {
                grx grx = grx.this;
                if (offlineState.offline()) {
                    grx.j();
                } else {
                    grx.i();
                }
            }
            this.a = offlineState.offline();
        }
    };
    private final wue<DiscoveryEvent> z = new wue<DiscoveryEvent>() {
        public final void onCompleted() {
        }

        public final void onError(Throwable th) {
        }

        public final /* synthetic */ void onNext(Object obj) {
            DiscoveryEvent discoveryEvent = (DiscoveryEvent) obj;
            DiscoveredDevice discoveredDevice = discoveryEvent.b;
            if (discoveryEvent.a == EventType.DISCOVER) {
                grx.this.h.a(discoveredDevice);
                grx.this.a(discoveredDevice.getDeviceId(), discoveredDevice.getRemoteName());
                return;
            }
            grx.this.h.a(Request.DELETE, mfq.a(discoveredDevice.getDeviceId()), discoveredDevice);
        }
    };

    /* renamed from: grx$7 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.grx.AnonymousClass7.<clinit>():void");
        }
    }

    /* renamed from: grx$a */
    public interface a {
        void a(boolean z);
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

    grx(Context context, grp grp, rur rur, ImmutableSet<mfh> immutableSet, mfe mfe, DiscoveryConfiguration discoveryConfiguration, hec hec, mfq mfq, Observable<ConnectionType> observable, wug wug, ufm ufm) {
        this.a = context;
        this.b = grp;
        this.c = rur;
        this.e = immutableSet;
        this.q = ufm;
        this.d = new CopyOnWriteArraySet();
        this.g = mfe;
        this.f = discoveryConfiguration;
        this.s = hec;
        this.h = mfq;
        this.t = observable;
        this.r = wug;
        this.i = new xag();
    }

    public final void h() {
        if (!this.m) {
            this.m = true;
            this.j = vun.a((wrf<T>) this.s.a()).a(this.v);
            this.h.a(this.A);
            fdh R_ = this.e.iterator();
            while (R_.hasNext()) {
                mfh mfh = (mfh) R_.next();
                mfh.d();
                this.i.a(vun.a((ObservableSource<T>) mfh.l(), BackpressureStrategy.BUFFER).a(this.r).a(this.z));
            }
            this.k = vun.a((ObservableSource<T>) this.q.a, BackpressureStrategy.BUFFER).a(this.y, (wun<Throwable>) $$Lambda$grx$fy1wmkl0jjajCzFzI42PShDSwM.INSTANCE);
            this.l = this.t.a(this.w, this.x);
            i();
            k();
        }
    }

    private void k() {
        for (a aVar : this.d) {
            if (aVar != null) {
                aVar.a(this.o != null);
            }
        }
    }

    public final SpotifyIcon a(ConnectDevice connectDevice) {
        if (this.m && Tech.of(connectDevice).isCast()) {
            String str = connectDevice.a;
            mfh a2 = a(str);
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

    public final void a() {
        boolean z2;
        if (this.m) {
            ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
            if (activityManager != null) {
                z2 = fa.a(activityManager);
            } else {
                z2 = false;
            }
            if (!z2) {
                fdh R_ = this.e.iterator();
                while (R_.hasNext()) {
                    mfh mfh = (mfh) R_.next();
                    if (mfh.k()) {
                        mfh.j();
                    }
                }
            }
        }
    }

    public final void b() {
        a();
    }

    public final void c() {
        GaiaDevice gaiaDevice = this.u;
        if (gaiaDevice != null) {
            mfh a2 = a(gaiaDevice.getIdentifier());
            if (a2 != null) {
                a2.i();
            }
        }
    }

    public final boolean a(float f2) {
        if (g()) {
            mfh a2 = a(this.o.getDeviceId());
            if (a2 != null) {
                return a2.a(f2);
            }
        }
        return false;
    }

    public final boolean d() {
        if (g()) {
            mfh a2 = a(this.o.getDeviceId());
            if (a2 != null) {
                return a2.f();
            }
        }
        return false;
    }

    public final boolean e() {
        if (g()) {
            mfh a2 = a(this.o.getDeviceId());
            if (a2 != null) {
                return a2.g();
            }
        }
        return false;
    }

    public final float f() {
        if (g()) {
            mfh a2 = a(this.o.getDeviceId());
            if (a2 != null) {
                return a2.h();
            }
        }
        return 0.0f;
    }

    public final boolean g() {
        if (this.m) {
            DiscoveredDevice discoveredDevice = this.o;
            if (discoveredDevice != null && TextUtils.equals(discoveredDevice.getDeviceId(), ((GaiaDevice) fay.a(this.u)).getIdentifier())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void i() {
        fdh R_ = this.e.iterator();
        while (R_.hasNext()) {
            a((mfh) R_.next());
        }
    }

    public void j() {
        fdh R_ = this.e.iterator();
        while (R_.hasNext()) {
            b((mfh) R_.next());
        }
    }

    public void a(mfh mfh) {
        if (!mfh.k()) {
            mfh.b();
        }
    }

    public static void b(mfh mfh) {
        if (mfh.k()) {
            mfh.c();
        }
    }

    /* access modifiers changed from: 0000 */
    public mfh a(String str) {
        fdh R_ = this.e.iterator();
        while (R_.hasNext()) {
            mfh mfh = (mfh) R_.next();
            if (mfh.a(str)) {
                return mfh;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2) {
        GaiaDevice gaiaDevice = this.u;
        if (gaiaDevice != null && !this.n && gaiaDevice.getIdentifier().equals(str)) {
            mfh a2 = a(str);
            if (a2 != null && !a2.e(str)) {
                a2.b(str, this.p);
                Logger.b("Reconnecting to %s", str2);
            }
        }
    }

    private static boolean a(DiscoveredDevice discoveredDevice, GaiaDevice gaiaDevice) {
        return (discoveredDevice.getDeviceId() == null || gaiaDevice.getIdentifier() == null || !gaiaDevice.getIdentifier().equals(discoveredDevice.getDeviceId())) ? false : true;
    }

    static /* synthetic */ boolean a(grx grx) {
        GaiaDevice gaiaDevice = grx.u;
        if (gaiaDevice != null) {
            DiscoveredDevice discoveredDevice = grx.o;
            if (discoveredDevice != null && a(discoveredDevice, gaiaDevice) && grx.u.getState() == GaiaDeviceState.LOGGED_IN) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ void a(grx grx, DiscoveredDevice discoveredDevice) {
        if (grx.o != discoveredDevice) {
            grx.o = discoveredDevice;
            grx.k();
        }
        grx.n = false;
    }
}

package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import io.reactivex.Scheduler;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;
import java.io.IOException;

/* renamed from: mji reason: default package */
public final class mji {
    private static final String e = jun.a("8593116e1f761e31036d1032483410380b78096c186e0374546c1d670e38177415374875173640340c675f394a745c6507325c75406f047159680a741467027a466f1930196c0a68126f0b324c3107620a6d406919645532", "7a6d646e6d767031396d6832653473386a787a6c6c6e3974376c7267633839746637387578363434656739393374726564323475326f6b7134686f747767637a356f6d30376c7968776f6832393175626f6d6e696f646432");
    /* access modifiers changed from: 0000 */
    public DiscoveredDevice a;
    /* access modifiers changed from: 0000 */
    public b b;
    public boolean c;
    final SerialDisposable d = new SerialDisposable();
    private bom f;
    private final Context g;
    private boo h;
    private a i;
    private bpf j;
    private final ryd k;
    private final Scheduler l;
    private bow<boo> m;

    /* renamed from: mji$a */
    class a implements e {
        private a() {
        }

        /* synthetic */ a(mji mji, byte b) {
            this();
        }

        public final void a(CastDevice castDevice, String str) {
            mji.this.b.a(castDevice.a(), str);
        }
    }

    /* renamed from: mji$b */
    interface b {
        void a();

        void a(float f);

        void a(DiscoveredDevice discoveredDevice);

        void a(String str, String str2);

        void b(DiscoveredDevice discoveredDevice);

        void c(DiscoveredDevice discoveredDevice);
    }

    public mji(Context context, ryd ryd, Scheduler scheduler) {
        this.g = (Context) fbp.a(context);
        this.k = ryd;
        this.l = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Status status) {
        if (!status.c()) {
            Logger.e("Sending message failed", new Object[0]);
            this.b.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(GaiaDevice gaiaDevice) {
        boo boo = this.h;
        if (boo != null && boo.b() != null && !TextUtils.equals(this.h.b().a(), gaiaDevice.getIdentifier())) {
            h();
            Logger.c("Cast device not active anymore", new Object[0]);
        }
    }

    static /* synthetic */ void a(mji mji, boo boo) {
        mji.h = boo;
        Logger.c("Cast Application connected", new Object[0]);
        if (mji.i()) {
            mji.j = mji.h.a();
            if (mji.j != null) {
                mji.i = new a(mji, 0);
                try {
                    mji.h.a(mji.j.m(), (e) mji.j);
                    mji.h.a(e, (e) mji.i);
                    mji.b.a(mji.a);
                } catch (IOException e2) {
                    Logger.e("Error creating channels: %s", e2);
                    mji.b.c(mji.a);
                }
            }
        }
    }

    static /* synthetic */ void b(mji mji) {
        Logger.c("Cast Application disconnected", new Object[0]);
        mji.h();
    }

    private boolean f() {
        try {
            bso a2 = bso.a();
            int a3 = a2.a(this.g);
            Logger.b("Minimum version required by YOUR app: %d", Integer.valueOf(bso.a));
            Logger.b("Current version of Google Play Services: %d", Integer.valueOf(bso.d(this.g)));
            Logger.b("Status of Google Play Services: %d", Integer.valueOf(a3));
            if (a3 == 0) {
                Logger.b("Google Play Services OK", new Object[0]);
                return false;
            } else if (a2.a(a3)) {
                Logger.c("Resolvable Google Play Services error", new Object[0]);
                return true;
            } else {
                Logger.d("Not resolvable Google Play Services error", new Object[0]);
                return false;
            }
        } catch (RuntimeException e2) {
            Assertion.b("Check for Google PS failed with a RT exception", (Throwable) e2);
            return false;
        } catch (Exception e3) {
            Assertion.b("Check for Google Play Services failed", (Throwable) e3);
            return false;
        }
    }

    private void g() {
        try {
            if (this.h != null) {
                if (this.i != null) {
                    this.h.a(e);
                }
                if (this.j != null) {
                    this.h.a(this.j.m());
                }
            }
        } catch (IOException e2) {
            Logger.e("Error destroying channels: %s", e2);
        }
        this.i = null;
    }

    private void h() {
        Logger.b("CR - disconnectDevice and disassemble everything (isCastConnected(): %b)", Boolean.valueOf(i()));
        g();
        if (i()) {
            bpf bpf = this.j;
            if (bpf != null) {
                bpf.b();
                this.j = null;
                bom bom = this.f;
                if (bom != null) {
                    bom.b().a(true);
                }
            } else {
                throw new AssertionError();
            }
        }
        DiscoveredDevice discoveredDevice = this.a;
        if (discoveredDevice != null) {
            this.b.b(discoveredDevice);
        }
        this.h = null;
        this.a = null;
    }

    private boolean i() {
        boo boo = this.h;
        return boo != null && boo.f();
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        if (f()) {
            this.c = true;
            return;
        }
        this.c = false;
        try {
            Logger.b("CR - Cast was initialized", new Object[0]);
            this.f = bom.a(this.g);
            this.h = this.f.b().b();
            bom bom = this.f;
            $$Lambda$mji$QtaroVVqShB_vxnkoKNe21djtyE r4 = $$Lambda$mji$QtaroVVqShB_vxnkoKNe21djtyE.INSTANCE;
            bxo.b("Must be called from the main thread.");
            bxo.a(r4);
            bov bov = bom.c;
            bxo.a(r4);
            try {
                bov.b.a((bqy) new bqo(r4));
            } catch (RemoteException e2) {
                bov.a.a(e2, "Unable to call %s on %s.", "addCastStateListener", brg.class.getSimpleName());
            }
            this.m = new bow<boo>() {
                public final /* synthetic */ void a(bou bou) {
                    Logger.b("CR -------> onSessionStarting", new Object[0]);
                }

                public final /* synthetic */ void a(bou bou, int i) {
                    Logger.b("CR -------> onSessionStartFailed (Error code: %d)", Integer.valueOf(i));
                    mji.this.b.c(mji.this.a);
                    mji.b(mji.this);
                }

                public final /* synthetic */ void a(bou bou, String str) {
                    boo boo = (boo) bou;
                    Logger.b("CR -------> onSessionStarted", new Object[0]);
                    mji.a(mji.this, boo);
                }

                public final /* synthetic */ void a(bou bou, boolean z) {
                    boo boo = (boo) bou;
                    Logger.b("CR -------> onSessionResumed", new Object[0]);
                    mji.a(mji.this, boo);
                }

                public final /* bridge */ /* synthetic */ void b(bou bou) {
                    Logger.b("CR -------> onSessionEnding", new Object[0]);
                }

                public final /* synthetic */ void b(bou bou, int i) {
                    Logger.b("CR -------> onSessionEnded %d", Integer.valueOf(i));
                    mji.b(mji.this);
                }

                public final /* bridge */ /* synthetic */ void b(bou bou, String str) {
                    Logger.b("CR -------> onSessionResuming", new Object[0]);
                }

                public final /* synthetic */ void c(bou bou, int i) {
                    Logger.b("CR -------> onSessionResumeFailed %d", Integer.valueOf(i));
                    mji.b(mji.this);
                }

                public final /* synthetic */ void d(bou bou, int i) {
                    Logger.b("CR -------> onSessionSuspended %d", Integer.valueOf(i));
                }
            };
            this.f.b().a(this.m, boo.class);
        } catch (RuntimeException e3) {
            Logger.e("CR - Cast failed, a runtime exception occurred", new Object[0]);
            Assertion.b("CastContext failed with a RT exception", (Throwable) e3);
            this.f = null;
            this.h = null;
        } catch (Exception e4) {
            Logger.e("CR - Cast failed and we handled it", new Object[0]);
            Assertion.b("CastContext couldn't be acquired", (Throwable) e4);
            this.f = null;
            this.h = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        if (!i() || this.i == null) {
            Logger.e("No api or no channel", new Object[0]);
            this.b.a();
            return;
        }
        try {
            boo boo = this.h;
            String str2 = e;
            bxo.b("Must be called from the main thread.");
            (boo.b != null ? boo.a.a(boo.b, str2, str) : null).a((btd<? super R>) new $$Lambda$mji$1hlyWY0Gia9p1e7XEyko0j41EJ8<Object>(this));
        } catch (Exception e2) {
            Logger.e(e2, "Exception while sending message", new Object[0]);
            this.b.a();
        }
    }

    public final boolean a(float f2) {
        if (!i()) {
            return false;
        }
        try {
            this.h.a((double) f2);
            this.b.a(f2);
            Logger.b("CR - setVolume to %f", Float.valueOf(f2));
        } catch (IOException e2) {
            Logger.e(e2, e2.getMessage(), new Object[0]);
        }
        return true;
    }

    public final boolean b() {
        if (!i()) {
            return false;
        }
        try {
            this.h.a(Math.min(this.h.c() + 0.05d, 1.0d));
        } catch (RuntimeException e2) {
            Assertion.a("Error invoking mCastSession to set volume", (Throwable) e2);
        } catch (IOException unused) {
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        boo boo = this.h;
        if (boo == null || !boo.g()) {
            DiscoveredDevice discoveredDevice = this.a;
            if (discoveredDevice == null || !discoveredDevice.getDeviceId().equals(str) || !i()) {
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        if (!i()) {
            return false;
        }
        try {
            this.h.a(Math.max(this.h.c() - 0.05d, 0.0d));
        } catch (RuntimeException e2) {
            Assertion.a("Error invoking mCastSession to set volume", (Throwable) e2);
        } catch (IOException unused) {
        }
        return true;
    }

    public final float d() {
        float f2 = 0.0f;
        if (!i()) {
            return 0.0f;
        }
        try {
            f2 = (float) this.h.c();
            Logger.b("CR - getVolume and it is %f", Float.valueOf(f2));
        } catch (RuntimeException unused) {
        }
        return f2;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.d.a(this.k.a.a(this.l).d((Consumer<? super T>) new $$Lambda$mji$f3wxIOBXxw0tU8rdotFDmY7FLc<Object>(this)));
    }
}

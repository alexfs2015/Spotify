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

/* renamed from: mew reason: default package */
public final class mew {
    private static final String e = jsd.a("8593116e1f761e31036d1032483410380b78096c186e0374546c1d670e38177415374875173640340c675f394a745c6507325c75406f047159680a741467027a466f1930196c0a68126f0b324c3107620a6d406919645532", "7a6d646e6d767031396d6832653473386a787a6c6c6e3974376c7267633839746637387578363434656739393374726564323475326f6b7134686f747767637a356f6d30376c7968776f6832393175626f6d6e696f646432");
    /* access modifiers changed from: 0000 */
    public DiscoveredDevice a;
    /* access modifiers changed from: 0000 */
    public b b;
    public boolean c;
    final SerialDisposable d = new SerialDisposable();
    private bnv f;
    private final Context g;
    private bnx h;
    private a i;
    private boo j;
    private final rox k;
    private final Scheduler l;
    private bof<bnx> m;

    /* renamed from: mew$a */
    class a implements e {
        private a() {
        }

        /* synthetic */ a(mew mew, byte b) {
            this();
        }

        public final void a(CastDevice castDevice, String str) {
            mew.this.b.a(castDevice.a(), str);
        }
    }

    /* renamed from: mew$b */
    interface b {
        void a();

        void a(float f);

        void a(DiscoveredDevice discoveredDevice);

        void a(String str, String str2);

        void b(DiscoveredDevice discoveredDevice);

        void c(DiscoveredDevice discoveredDevice);
    }

    public mew(Context context, rox rox, Scheduler scheduler) {
        this.g = (Context) fay.a(context);
        this.k = rox;
        this.l = scheduler;
    }

    private boolean f() {
        try {
            brx a2 = brx.a();
            int a3 = a2.a(this.g);
            Logger.b("Minimum version required by YOUR app: %d", Integer.valueOf(brx.a));
            Logger.b("Current version of Google Play Services: %d", Integer.valueOf(brx.d(this.g)));
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

    /* access modifiers changed from: 0000 */
    public void a() {
        if (f()) {
            this.c = true;
            return;
        }
        this.c = false;
        try {
            Logger.b("CR - Cast was initialized", new Object[0]);
            this.f = bnv.a(this.g);
            this.h = this.f.b().b();
            bnv bnv = this.f;
            $$Lambda$mew$1i7CEXLDij9fo6FcUg69Un9l1g r4 = $$Lambda$mew$1i7CEXLDij9fo6FcUg69Un9l1g.INSTANCE;
            bwx.b("Must be called from the main thread.");
            bwx.a(r4);
            boe boe = bnv.c;
            bwx.a(r4);
            try {
                boe.b.a((bqh) new bpx(r4));
            } catch (RemoteException e2) {
                boe.a.a(e2, "Unable to call %s on %s.", "addCastStateListener", bqp.class.getSimpleName());
            }
            this.m = new bof<bnx>() {
                public final /* synthetic */ void a(bod bod, String str) {
                    bnx bnx = (bnx) bod;
                    Logger.b("CR -------> onSessionStarted", new Object[0]);
                    mew.a(mew.this, bnx);
                }

                public final /* synthetic */ void a(bod bod, boolean z) {
                    bnx bnx = (bnx) bod;
                    Logger.b("CR -------> onSessionResumed", new Object[0]);
                    mew.a(mew.this, bnx);
                }

                public final /* synthetic */ void d(bod bod, int i) {
                    Logger.b("CR -------> onSessionSuspended %d", Integer.valueOf(i));
                }

                public final /* synthetic */ void c(bod bod, int i) {
                    Logger.b("CR -------> onSessionResumeFailed %d", Integer.valueOf(i));
                    mew.b(mew.this);
                }

                public final /* bridge */ /* synthetic */ void b(bod bod, String str) {
                    Logger.b("CR -------> onSessionResuming", new Object[0]);
                }

                public final /* synthetic */ void b(bod bod, int i) {
                    Logger.b("CR -------> onSessionEnded %d", Integer.valueOf(i));
                    mew.b(mew.this);
                }

                public final /* bridge */ /* synthetic */ void b(bod bod) {
                    Logger.b("CR -------> onSessionEnding", new Object[0]);
                }

                public final /* synthetic */ void a(bod bod, int i) {
                    Logger.b("CR -------> onSessionStartFailed (Error code: %d)", Integer.valueOf(i));
                    mew.this.b.c(mew.this.a);
                    mew.b(mew.this);
                }

                public final /* synthetic */ void a(bod bod) {
                    Logger.b("CR -------> onSessionStarting", new Object[0]);
                }
            };
            this.f.b().a(this.m, bnx.class);
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

    /* access modifiers changed from: protected */
    public final void a(String str) {
        if (!i() || this.i == null) {
            Logger.e("No api or no channel", new Object[0]);
            this.b.a();
            return;
        }
        try {
            bnx bnx = this.h;
            String str2 = e;
            bwx.b("Must be called from the main thread.");
            (bnx.b != null ? bnx.a.a(bnx.b, str2, str) : null).a((bsm<? super R>) new $$Lambda$mew$Sa_xgWCNLXTR5_Q7nSmg05zdWRk<Object>(this));
        } catch (Exception e2) {
            Logger.e(e2, "Exception while sending message", new Object[0]);
            this.b.a();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Status status) {
        if (!status.c()) {
            Logger.e("Sending message failed", new Object[0]);
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

    private void h() {
        Logger.b("CR - disconnectDevice and disassemble everything (isCastConnected(): %b)", Boolean.valueOf(i()));
        g();
        if (i()) {
            boo boo = this.j;
            if (boo != null) {
                boo.b();
                this.j = null;
                bnv bnv = this.f;
                if (bnv != null) {
                    bnv.b().a(true);
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
        bnx bnx = this.h;
        return bnx != null && bnx.f();
    }

    /* access modifiers changed from: protected */
    public final boolean b(String str) {
        bnx bnx = this.h;
        if (bnx == null || !bnx.g()) {
            DiscoveredDevice discoveredDevice = this.a;
            if (discoveredDevice == null || !discoveredDevice.getDeviceId().equals(str) || !i()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.d.a(this.k.a.a(this.l).d((Consumer<? super T>) new $$Lambda$mew$rY6QSe6L6sdiJOQlkp_MUiQis<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(GaiaDevice gaiaDevice) {
        bnx bnx = this.h;
        if (bnx != null && bnx.b() != null && !TextUtils.equals(this.h.b().a(), gaiaDevice.getIdentifier())) {
            h();
            Logger.c("Cast device not active anymore", new Object[0]);
        }
    }

    static /* synthetic */ void a(mew mew, bnx bnx) {
        mew.h = bnx;
        Logger.c("Cast Application connected", new Object[0]);
        if (mew.i()) {
            mew.j = mew.h.a();
            if (mew.j != null) {
                mew.i = new a(mew, 0);
                try {
                    mew.h.a(mew.j.m(), (e) mew.j);
                    mew.h.a(e, (e) mew.i);
                    mew.b.a(mew.a);
                } catch (IOException e2) {
                    Logger.e("Error creating channels: %s", e2);
                    mew.b.c(mew.a);
                }
            }
        }
    }

    static /* synthetic */ void b(mew mew) {
        Logger.c("Cast Application disconnected", new Object[0]);
        mew.h();
    }
}

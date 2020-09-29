package defpackage;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent;
import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent.EventType;
import com.spotify.music.features.connect.cast.discovery.DiscoveryTechnology;

/* renamed from: meu reason: default package */
public final class meu extends mfb implements met {
    private static final DiscoveryTechnology e = DiscoveryTechnology.a;
    /* access modifiers changed from: private */
    public final mey f;
    private final mew g;
    /* access modifiers changed from: private */
    public mfa h;
    private final b i = new b() {
        public final void a(String str, String str2) {
            if (meu.this.h != null) {
                meu.this.h.a(str, str2);
            }
        }

        public final void a() {
            if (meu.this.h != null) {
                meu.this.h;
            }
        }

        public final void a(float f) {
            if (meu.this.h != null) {
                meu.this.h.a(f);
            }
        }

        public final void a(DiscoveredDevice discoveredDevice) {
            if (discoveredDevice != null) {
                f a2 = meu.this.f.a(discoveredDevice.getDeviceId());
                if (a2 != null) {
                    meu.this.f;
                    discoveredDevice = mey.b(a2);
                }
                if (meu.this.h != null) {
                    meu.this.h.a(discoveredDevice);
                }
            }
        }

        public final void b(DiscoveredDevice discoveredDevice) {
            if (meu.this.h != null) {
                meu.this.h.b(discoveredDevice);
            }
            mey b = meu.this.f;
            b.a(b.a(discoveredDevice.getDeviceId()));
        }

        public final void c(DiscoveredDevice discoveredDevice) {
            if (!(meu.this.h == null || discoveredDevice == null)) {
                meu.this.h.c(discoveredDevice);
            }
            meu.this.i();
        }
    };

    public meu(Context context, String str, mew mew, mey mey) {
        super(context, str);
        this.f = mey;
        this.g = mew;
        this.g.b = this.i;
        mey.a = this;
    }

    public final boolean a(String str) {
        boolean z;
        String str2 = "cast:";
        if (!str.startsWith(str2)) {
            StringBuilder sb = new StringBuilder(str2);
            sb.append(str);
            z = super.a(sb.toString());
        } else {
            z = false;
        }
        if (super.a(str) || z) {
            return true;
        }
        return false;
    }

    public final DiscoveryTechnology a() {
        return e;
    }

    public final void b() {
        super.b();
        mey mey = this.f;
        if (mey.c != null) {
            mey.d.a(mey.c, mey.b, 4);
            mey.a(true);
        }
    }

    public final void c() {
        super.c();
        mey mey = this.f;
        mey.d.a((a) mey.b);
        mey.e.c();
    }

    public final void d() {
        mew mew = this.g;
        mew.a();
        mew.e();
    }

    public final void e() {
        this.g.d.bf_();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(String str) {
        mey mey = this.f;
        mey.g = str;
        mey.a();
    }

    public final void b(String str) {
        $$Lambda$meu$G25rd5ciMY0BlkLO_72qrs6UXYo r0 = new $$Lambda$meu$G25rd5ciMY0BlkLO_72qrs6UXYo(this, str);
        if (!this.a.equals(str)) {
            this.a = str;
            if (this.b) {
                c();
                if (r0 != null) {
                    r0.run();
                }
                b();
            }
        }
    }

    public final boolean c(String str) {
        CastDevice b = this.f.b(str);
        return b != null && !(b.a.startsWith("__cast_nearby__") ^ true);
    }

    public final boolean d(String str) {
        CastDevice b = this.f.b(str);
        return b != null && b.a(32);
    }

    public final boolean e(String str) {
        return this.g.b(str);
    }

    public final void f(String str) {
        this.g.a(str);
    }

    public final boolean a(float f2) {
        return this.g.a(f2);
    }

    public final boolean f() {
        return this.g.b();
    }

    public final boolean g() {
        return this.g.c();
    }

    public final float h() {
        return this.g.d();
    }

    public final void a(String str, mfa mfa) {
        c(str, mfa);
    }

    public final void b(String str, mfa mfa) {
        c(str, mfa);
    }

    private void c(String str, mfa mfa) {
        this.h = mfa;
        if (!this.f.c(str)) {
            mfa.c(null);
        }
    }

    public final void i() {
        this.f.c((String) null);
    }

    public final void a(CastDevice castDevice) {
        if (castDevice != null) {
            mew mew = this.g;
            Logger.b("CR - connectDevice (%s - %s), available GP: %b", castDevice.d, castDevice.c, Boolean.valueOf(mew.c));
            mew.a = mes.a(castDevice);
        }
    }

    public final void b(DiscoveredDevice discoveredDevice) {
        if (discoveredDevice != null) {
            DiscoveredDevice discoveredDevice2 = (DiscoveredDevice) this.c.remove(discoveredDevice.getDeviceId());
            if (discoveredDevice2 != null) {
                super.c(discoveredDevice2);
            }
        }
    }

    public final void j() {
        this.f.b();
    }

    public final void a(DiscoveredDevice discoveredDevice) {
        if (discoveredDevice != null) {
            this.c.put(discoveredDevice.getDeviceId(), discoveredDevice);
            if (this.d != null) {
                this.d.a(new DiscoveryEvent(EventType.DISCOVER, discoveredDevice));
            }
        }
    }
}

package defpackage;

import android.content.Context;
import com.google.android.gms.cast.CastDevice;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.connect.cast.discovery.DiscoveredDevice;
import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent;
import com.spotify.music.features.connect.cast.discovery.DiscoveryEvent.EventType;
import com.spotify.music.features.connect.cast.discovery.DiscoveryTechnology;

/* renamed from: mjg reason: default package */
public final class mjg extends mjn implements mjf {
    private static final DiscoveryTechnology e = DiscoveryTechnology.a;
    /* access modifiers changed from: private */
    public final mjk f;
    private final mji g;
    /* access modifiers changed from: private */
    public mjm h;
    private final b i = new b() {
        public final void a() {
            if (mjg.this.h != null) {
                mjg.this.h;
            }
        }

        public final void a(float f) {
            if (mjg.this.h != null) {
                mjg.this.h.a(f);
            }
        }

        public final void a(DiscoveredDevice discoveredDevice) {
            if (discoveredDevice != null) {
                f a2 = mjg.this.f.a(discoveredDevice.getDeviceId());
                if (a2 != null) {
                    mjg.this.f;
                    discoveredDevice = mjk.b(a2);
                }
                if (mjg.this.h != null) {
                    mjg.this.h.a(discoveredDevice);
                }
            }
        }

        public final void a(String str, String str2) {
            if (mjg.this.h != null) {
                mjg.this.h.a(str, str2);
            }
        }

        public final void b(DiscoveredDevice discoveredDevice) {
            if (mjg.this.h != null) {
                mjg.this.h.b(discoveredDevice);
            }
            mjk b = mjg.this.f;
            b.a(b.a(discoveredDevice.getDeviceId()));
        }

        public final void c(DiscoveredDevice discoveredDevice) {
            if (!(mjg.this.h == null || discoveredDevice == null)) {
                mjg.this.h.c(discoveredDevice);
            }
            mjg.this.i();
        }
    };

    public mjg(Context context, String str, mji mji, mjk mjk) {
        super(context, str);
        this.f = mjk;
        this.g = mji;
        this.g.b = this.i;
        mjk.a = this;
    }

    private void c(String str, mjm mjm) {
        this.h = mjm;
        if (!this.f.c(str)) {
            mjm.c(null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(String str) {
        mjk mjk = this.f;
        mjk.g = str;
        mjk.a();
    }

    public final DiscoveryTechnology a() {
        return e;
    }

    public final void a(CastDevice castDevice) {
        if (castDevice != null) {
            mji mji = this.g;
            Logger.b("CR - connectDevice (%s - %s), available GP: %b", castDevice.d, castDevice.c, Boolean.valueOf(mji.c));
            mji.a = mje.a(castDevice);
        }
    }

    public final void a(DiscoveredDevice discoveredDevice) {
        if (discoveredDevice != null) {
            this.c.put(discoveredDevice.getDeviceId(), discoveredDevice);
            if (this.d != null) {
                this.d.a(new DiscoveryEvent(EventType.DISCOVER, discoveredDevice));
            }
        }
    }

    public final void a(String str, mjm mjm) {
        c(str, mjm);
    }

    public final boolean a(float f2) {
        return this.g.a(f2);
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
        return super.a(str) || z;
    }

    public final void b() {
        super.b();
        mjk mjk = this.f;
        if (mjk.c != null) {
            mjk.d.a(mjk.c, mjk.b, 4);
            mjk.a(true);
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

    public final void b(String str) {
        $$Lambda$mjg$tu5kynjm9wuorqedIBA7CwJ3ago r0 = new $$Lambda$mjg$tu5kynjm9wuorqedIBA7CwJ3ago(this, str);
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

    public final void b(String str, mjm mjm) {
        c(str, mjm);
    }

    public final void c() {
        super.c();
        mjk mjk = this.f;
        mjk.d.a((a) mjk.b);
        mjk.e.c();
    }

    public final boolean c(String str) {
        CastDevice b = this.f.b(str);
        return b != null && !(b.a.startsWith("__cast_nearby__") ^ true);
    }

    public final void d() {
        mji mji = this.g;
        mji.a();
        mji.e();
    }

    public final boolean d(String str) {
        CastDevice b = this.f.b(str);
        return b != null && b.a(32);
    }

    public final void e() {
        this.g.d.bd_();
    }

    public final boolean e(String str) {
        return this.g.b(str);
    }

    public final void f(String str) {
        this.g.a(str);
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

    public final void i() {
        this.f.c((String) null);
    }

    public final void j() {
        this.f.b();
    }
}

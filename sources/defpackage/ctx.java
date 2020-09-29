package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@cfp
/* renamed from: ctx reason: default package */
public final class ctx extends drr {
    final csh a;
    final Object b = new Object();
    drt c;
    boolean d;
    private final boolean e;
    private final boolean f;
    private final float g;
    private int h;
    private boolean i = true;
    private float j;
    private float k;
    private boolean l = true;
    private boolean m;
    private boolean n;

    public ctx(csh csh, float f2, boolean z, boolean z2) {
        this.a = csh;
        this.g = f2;
        this.e = z;
        this.f = z2;
    }

    private final void a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        cqo.a.execute(new cty(this, hashMap));
    }

    public final void a() {
        a("play", null);
    }

    public final void a(float f2, int i2, boolean z, float f3) {
        boolean z2;
        int i3;
        synchronized (this.b) {
            this.j = f2;
            z2 = this.i;
            this.i = z;
            i3 = this.h;
            this.h = i2;
            float f4 = this.k;
            this.k = f3;
            if (Math.abs(this.k - f4) > 1.0E-4f) {
                this.a.o().invalidate();
            }
        }
        Executor executor = cqo.a;
        ctz ctz = new ctz(this, i3, i2, z2, z);
        executor.execute(ctz);
    }

    public final void a(drt drt) {
        synchronized (this.b) {
            this.c = drt;
        }
    }

    public final void a(dsp dsp) {
        synchronized (this.b) {
            this.l = dsp.a;
            this.m = dsp.b;
            this.n = dsp.c;
        }
        a("initialState", bzy.a("muteStart", dsp.a ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY, "customControlsRequested", dsp.b ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY, "clickToExpandRequested", dsp.c ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY));
    }

    public final void a(boolean z) {
        a(z ? "mute" : "unmute", null);
    }

    public final void b() {
        a("pause", null);
    }

    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.i;
        }
        return z;
    }

    public final int d() {
        int i2;
        synchronized (this.b) {
            i2 = this.h;
        }
        return i2;
    }

    public final float e() {
        float f2;
        synchronized (this.b) {
            f2 = this.k;
        }
        return f2;
    }

    public final float f() {
        return this.g;
    }

    public final float g() {
        float f2;
        synchronized (this.b) {
            f2 = this.j;
        }
        return f2;
    }

    public final drt h() {
        drt drt;
        synchronized (this.b) {
            drt = this.c;
        }
        return drt;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.b) {
            z = this.e && this.m;
        }
        return z;
    }

    public final boolean j() {
        boolean z;
        boolean i2 = i();
        synchronized (this.b) {
            if (!i2) {
                try {
                    if (this.n && this.f) {
                        z = true;
                    }
                } finally {
                }
            }
            z = false;
        }
        return z;
    }
}

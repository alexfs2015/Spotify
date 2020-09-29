package defpackage;

import android.os.Handler;
import com.spotify.mobile.android.core.internal.AudioDriver;

/* renamed from: hxd reason: default package */
public final class hxd implements a {
    final Handler a;
    final jkp b;
    private final hin c;
    private final hhw d;
    private final ryk e;
    private final a f;
    private final a g = new a() {
        /* access modifiers changed from: private */
        public /* synthetic */ void b(boolean z) {
            jkp jkp = hxd.this.b;
            fbp.a(jkp.y);
            jkp.y.a(z);
        }

        public final void a(boolean z) {
            hxd.this.a.post(new $$Lambda$hxd$1$fpeFgfuysjaXl2gyhzcbqtse2Z8(this, z));
        }
    };

    hxd(hhw hhw, Handler handler, jkp jkp, hin hin, ryk ryk) {
        this.d = hhw;
        this.a = handler;
        this.b = jkp;
        this.c = hin;
        this.e = ryk;
        this.f = new $$Lambda$hxd$qEa9PIwRGG30THVRsRFqpYxNJpc(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fqn fqn) {
        if (this.e.a((fqm<?>) rzj.a)) {
            AudioDriver.setSoundDriverVolumeController(this.d.b);
        }
    }

    public final void a() {
        this.e.a(this.f);
        hin hin = this.c;
        hin.a.a(hin.c);
        AudioDriver.addListener(this.d.f);
        hhw hhw = this.d;
        a aVar = this.g;
        fbp.a(aVar);
        hhw.e.add(aVar);
    }

    public final void b() {
        this.e.b(this.f);
        AudioDriver.removeListener(this.d.f);
        AudioDriver.setSoundDriverVolumeController(null);
        this.d.e.clear();
        hin hin = this.c;
        hje hje = hin.a;
        b bVar = hin.c;
        fbp.a(bVar);
        hje.b.remove(bVar);
    }

    public final String c() {
        return "AudioSessionManager";
    }
}

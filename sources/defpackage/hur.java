package defpackage;

import android.os.Handler;
import com.spotify.mobile.android.core.internal.AudioDriver;

/* renamed from: hur reason: default package */
public final class hur implements a {
    final Handler a;
    final jhz b;
    private final hfr c;
    private final hfa d;
    private final rpe e;
    private final a f;
    private final a g = new a() {
        /* access modifiers changed from: private */
        public /* synthetic */ void b(boolean z) {
            jhz jhz = hur.this.b;
            fay.a(jhz.y);
            jhz.y.a(z);
        }

        public final void a(boolean z) {
            hur.this.a.post(new $$Lambda$hur$1$oIXGgeZ0dGlczen6jwI4_z3rdK0(this, z));
        }
    };

    public final String c() {
        return "AudioSessionManager";
    }

    hur(hfa hfa, Handler handler, jhz jhz, hfr hfr, rpe rpe) {
        this.d = hfa;
        this.a = handler;
        this.b = jhz;
        this.c = hfr;
        this.e = rpe;
        this.f = new $$Lambda$hur$_r34ZwZol6K1XWW5sdMx5nKj2xw(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(fpt fpt) {
        if (this.e.a((fps<?>) rpy.a)) {
            AudioDriver.setSoundDriverVolumeController(this.d.b);
        }
    }

    public final void a() {
        this.e.a(this.f);
        hfr hfr = this.c;
        hfr.a.a(hfr.c);
        AudioDriver.addListener(this.d.f);
        hfa hfa = this.d;
        a aVar = this.g;
        fay.a(aVar);
        hfa.e.add(aVar);
    }

    public final void b() {
        this.e.b(this.f);
        AudioDriver.removeListener(this.d.f);
        AudioDriver.setSoundDriverVolumeController(null);
        this.d.e.clear();
        hfr hfr = this.c;
        hgi hgi = hfr.a;
        b bVar = hfr.c;
        fay.a(bVar);
        hgi.b.remove(bVar);
    }
}

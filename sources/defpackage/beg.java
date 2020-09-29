package defpackage;

import android.os.Handler;
import android.view.Surface;

/* renamed from: beg reason: default package */
public interface beg {

    /* renamed from: beg$a */
    public static final class a {
        private final Handler a;
        private final beg b;

        public a(Handler handler, beg beg) {
            this.a = beg != null ? (Handler) bcu.a(handler) : null;
            this.b = beg;
        }

        public final void a(aru aru) {
            if (this.b != null) {
                this.a.post(new $$Lambda$beg$a$DQVVGLOW06gWkuuoXu7UisCsWQ(this, aru));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(aru aru) {
            this.b.a(aru);
        }

        public final void a(String str, long j, long j2) {
            if (this.b != null) {
                Handler handler = this.a;
                $$Lambda$beg$a$bXhfESVadTyARJqxQZs3dMiUW7A r1 = new $$Lambda$beg$a$bXhfESVadTyARJqxQZs3dMiUW7A(this, str, j, j2);
                handler.post(r1);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j, long j2) {
            this.b.a(str, j, j2);
        }

        public final void a(aqe aqe) {
            if (this.b != null) {
                this.a.post(new $$Lambda$beg$a$dNhcG__oBCkBey_tlrDuNfGtSEo(this, aqe));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(aqe aqe) {
            this.b.a(aqe);
        }

        public final void a(int i, long j) {
            if (this.b != null) {
                this.a.post(new $$Lambda$beg$a$infR9F9BK3urCst3dzCJVZCOldk(this, i, j));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i, long j) {
            this.b.a(i, j);
        }

        public final void a(int i, int i2, int i3, float f) {
            if (this.b != null) {
                Handler handler = this.a;
                $$Lambda$beg$a$AVZ0IHikCqwB1teZVMaUeXDDN8M r1 = new $$Lambda$beg$a$AVZ0IHikCqwB1teZVMaUeXDDN8M(this, i, i2, i3, f);
                handler.post(r1);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i, int i2, int i3, float f) {
            this.b.a(i, i2, i3, f);
        }

        public final void a(Surface surface) {
            if (this.b != null) {
                this.a.post(new $$Lambda$beg$a$hdSHiuFfcnRPCJeYg_oYh0kQ3g(this, surface));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Surface surface) {
            this.b.a(surface);
        }

        public final void b(aru aru) {
            if (this.b != null) {
                this.a.post(new $$Lambda$beg$a$FVp1Tz6CEwl26EYEctKWGPzwBPo(this, aru));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(aru aru) {
            this.b.b(aru);
        }
    }

    void a(int i, int i2, int i3, float f);

    void a(int i, long j);

    void a(Surface surface);

    void a(aqe aqe);

    void a(aru aru);

    void a(String str, long j, long j2);

    void b(aru aru);
}

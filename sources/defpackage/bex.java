package defpackage;

import android.os.Handler;
import android.view.Surface;

/* renamed from: bex reason: default package */
public interface bex {

    /* renamed from: bex$a */
    public static final class a {
        private final Handler a;
        private final bex b;

        public a(Handler handler, bex bex) {
            this.a = bex != null ? (Handler) bdl.a(handler) : null;
            this.b = bex;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i, int i2, int i3, float f) {
            this.b.a(i, i2, i3, f);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i, long j) {
            this.b.a(i, j);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(Surface surface) {
            this.b.a(surface);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(aqv aqv) {
            this.b.a(aqv);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j, long j2) {
            this.b.a(str, j, j2);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(asl asl) {
            this.b.b(asl);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(asl asl) {
            this.b.a(asl);
        }

        public final void a(int i, int i2, int i3, float f) {
            if (this.b != null) {
                Handler handler = this.a;
                $$Lambda$bex$a$qivQmfHJyQIQBWueNMEqHIBTe4 r1 = new $$Lambda$bex$a$qivQmfHJyQIQBWueNMEqHIBTe4(this, i, i2, i3, f);
                handler.post(r1);
            }
        }

        public final void a(int i, long j) {
            if (this.b != null) {
                this.a.post(new $$Lambda$bex$a$wuGwc1fOcvwpCCMpvxJJUnitwZQ(this, i, j));
            }
        }

        public final void a(Surface surface) {
            if (this.b != null) {
                this.a.post(new $$Lambda$bex$a$FtlifBy3wIgEqhLC0LuSobAa9d8(this, surface));
            }
        }

        public final void a(aqv aqv) {
            if (this.b != null) {
                this.a.post(new $$Lambda$bex$a$AQQ6WeO7xoeDwn1dJfifIyV6cys(this, aqv));
            }
        }

        public final void a(asl asl) {
            if (this.b != null) {
                this.a.post(new $$Lambda$bex$a$bRzODQYVWzzEbWXIQsFqp7tmrgE(this, asl));
            }
        }

        public final void a(String str, long j, long j2) {
            if (this.b != null) {
                Handler handler = this.a;
                $$Lambda$bex$a$V4FRb1cX13LAwfdQetHZNnmpI r1 = new $$Lambda$bex$a$V4FRb1cX13LAwfdQetHZNnmpI(this, str, j, j2);
                handler.post(r1);
            }
        }

        public final void b(asl asl) {
            if (this.b != null) {
                this.a.post(new $$Lambda$bex$a$44fzo7g1exMO1eKh6w8vOWuUvSY(this, asl));
            }
        }
    }

    void a(int i, int i2, int i3, float f);

    void a(int i, long j);

    void a(Surface surface);

    void a(aqv aqv);

    void a(asl asl);

    void a(String str, long j, long j2);

    void b(asl asl);
}

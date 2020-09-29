package defpackage;

import android.os.Handler;

/* renamed from: art reason: default package */
public interface art {

    /* renamed from: art$a */
    public static final class a {
        private final Handler a;
        private final art b;

        public a(Handler handler, art art) {
            this.a = art != null ? (Handler) bdl.a(handler) : null;
            this.b = art;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i) {
            this.b.a(i);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i, long j, long j2) {
            this.b.a(i, j, j2);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(aqv aqv) {
            this.b.b(aqv);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j, long j2) {
            this.b.b(str, j, j2);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(asl asl) {
            this.b.d(asl);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(asl asl) {
            this.b.c(asl);
        }

        public final void a(int i) {
            if (this.b != null) {
                this.a.post(new $$Lambda$art$a$Eu7b5I8_ebuMet5UWU61ScudIw(this, i));
            }
        }

        public final void a(int i, long j, long j2) {
            if (this.b != null) {
                Handler handler = this.a;
                $$Lambda$art$a$jCWtLqPKztuXfnaviNfAumyrNs r1 = new $$Lambda$art$a$jCWtLqPKztuXfnaviNfAumyrNs(this, i, j, j2);
                handler.post(r1);
            }
        }

        public final void a(aqv aqv) {
            if (this.b != null) {
                this.a.post(new $$Lambda$art$a$tBPCvWlRr9sy9onOUbt8zLxhJM(this, aqv));
            }
        }

        public final void a(asl asl) {
            if (this.b != null) {
                this.a.post(new $$Lambda$art$a$6AVI33apD6xCriE20kF4D78QyF8(this, asl));
            }
        }

        public final void a(String str, long j, long j2) {
            if (this.b != null) {
                Handler handler = this.a;
                $$Lambda$art$a$X4RjishcdUWKvKuchCAafJ3br4 r1 = new $$Lambda$art$a$X4RjishcdUWKvKuchCAafJ3br4(this, str, j, j2);
                handler.post(r1);
            }
        }

        public final void b(asl asl) {
            if (this.b != null) {
                this.a.post(new $$Lambda$art$a$7hy8Thulm_p4vwZEsTt4PBjJhRs(this, asl));
            }
        }
    }

    void a(int i);

    void a(int i, long j, long j2);

    void b(aqv aqv);

    void b(String str, long j, long j2);

    void c(asl asl);

    void d(asl asl);
}

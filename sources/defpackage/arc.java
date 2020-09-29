package defpackage;

import android.os.Handler;

/* renamed from: arc reason: default package */
public interface arc {

    /* renamed from: arc$a */
    public static final class a {
        private final Handler a;
        private final arc b;

        public a(Handler handler, arc arc) {
            this.a = arc != null ? (Handler) bcu.a(handler) : null;
            this.b = arc;
        }

        public final void a(aru aru) {
            if (this.b != null) {
                this.a.post(new $$Lambda$arc$a$yePJRGWMexAKVBrGfKwNx92QxJM(this, aru));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(aru aru) {
            this.b.c(aru);
        }

        public final void a(String str, long j, long j2) {
            if (this.b != null) {
                Handler handler = this.a;
                $$Lambda$arc$a$FFNyzOv7we3seGJr6nh24sKJdYE r1 = new $$Lambda$arc$a$FFNyzOv7we3seGJr6nh24sKJdYE(this, str, j, j2);
                handler.post(r1);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, long j, long j2) {
            this.b.b(str, j, j2);
        }

        public final void a(aqe aqe) {
            if (this.b != null) {
                this.a.post(new $$Lambda$arc$a$MKWb9j7r_xBm02Gd27ytq1Bco(this, aqe));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(aqe aqe) {
            this.b.b(aqe);
        }

        public final void a(int i, long j, long j2) {
            if (this.b != null) {
                Handler handler = this.a;
                $$Lambda$arc$a$8OBHGeo91g0iXE4rJbknu0TFOQ r1 = new $$Lambda$arc$a$8OBHGeo91g0iXE4rJbknu0TFOQ(this, i, j, j2);
                handler.post(r1);
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i, long j, long j2) {
            this.b.a(i, j, j2);
        }

        public final void b(aru aru) {
            if (this.b != null) {
                this.a.post(new $$Lambda$arc$a$k2l_moFy4K7qNgbsRxM1n1mRSFw(this, aru));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void c(aru aru) {
            this.b.d(aru);
        }

        public final void a(int i) {
            if (this.b != null) {
                this.a.post(new $$Lambda$arc$a$qFW1sQba1Cq0emVZZJAFwhQuTxU(this, i));
            }
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i) {
            this.b.a(i);
        }
    }

    void a(int i);

    void a(int i, long j, long j2);

    void b(aqe aqe);

    void b(String str, long j, long j2);

    void c(aru aru);

    void d(aru aru);
}

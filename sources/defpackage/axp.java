package defpackage;

import android.os.Handler;

/* renamed from: axp reason: default package */
public interface axp {

    /* renamed from: axp$a */
    public static final class a {
        public final Object a;
        public final int b;
        public final int c;
        public final long d;
        public final long e;

        public a(Object obj) {
            this(obj, -1);
        }

        private a(Object obj, long j) {
            this(obj, -1, -1, -1, Long.MIN_VALUE);
        }

        public a(Object obj, long j, long j2) {
            this(obj, -1, -1, j, j2);
        }

        public a(Object obj, int i, int i2, long j) {
            this(obj, i, i2, j, Long.MIN_VALUE);
        }

        private a(Object obj, int i, int i2, long j, long j2) {
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = j;
            this.e = j2;
        }

        public final boolean a() {
            return this.b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
            }
        }

        public final int hashCode() {
            return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + ((int) this.e);
        }
    }

    /* renamed from: axp$b */
    public interface b {
        void onSourceInfoRefreshed(axp axp, aqu aqu, Object obj);
    }

    axo a(a aVar, bbi bbi);

    void a(Handler handler, axq axq);

    void a(apz apz, boolean z, b bVar, bcd bcd);

    void a(axo axo);

    void a(b bVar);

    void a(axq axq);

    void b();
}

package defpackage;

import com.google.common.base.Suppliers;
import java.util.logging.Logger;

/* renamed from: fby reason: default package */
public final class fby<K, V> {
    private static fbu<? extends b> a = Suppliers.a(new b() {
        public final void a() {
        }

        public final void a(long j) {
        }

        public final void b(long j) {
        }
    });
    private boolean b = true;
    private int c = -1;
    private int d = -1;
    private long e = -1;
    private long f = -1;
    private long g = -1;
    private long h = -1;
    private long i = -1;
    private fbu<? extends b> j = a;

    static {
        new fca(0, 0, 0, 0, 0, 0);
        new fbu<b>() {
            public final /* synthetic */ Object get() {
                return new a();
            }
        };
        new fbw() {
            public final long a() {
                return 0;
            }
        };
        Logger.getLogger(fby.class.getName());
    }

    private fby() {
    }

    public final String toString() {
        a a2 = fbm.a(this);
        int i2 = this.c;
        if (i2 != -1) {
            a2.a("initialCapacity", i2);
        }
        int i3 = this.d;
        if (i3 != -1) {
            a2.a("concurrencyLevel", i3);
        }
        long j2 = this.e;
        if (j2 != -1) {
            a2.a("maximumSize", j2);
        }
        long j3 = this.f;
        if (j3 != -1) {
            a2.a("maximumWeight", j3);
        }
        String str = "ns";
        if (this.g != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.g);
            sb.append(str);
            a2.a("expireAfterWrite", (Object) sb.toString());
        }
        if (this.h != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.h);
            sb2.append(str);
            a2.a("expireAfterAccess", (Object) sb2.toString());
        }
        return a2.toString();
    }
}

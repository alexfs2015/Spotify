package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: xil reason: default package */
public abstract class xil {

    /* renamed from: xil$a */
    public static abstract class a implements xip {
        public long a() {
            return System.currentTimeMillis();
        }

        public abstract xip a(xir xir);

        public xip a(xir xir, long j, long j2, TimeUnit timeUnit) {
            return xlm.a(this, xir, j, j2, timeUnit, null);
        }

        public abstract xip a(xir xir, long j, TimeUnit timeUnit);
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public abstract a c();
}

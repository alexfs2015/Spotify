package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wug reason: default package */
public abstract class wug {

    /* renamed from: wug$a */
    public static abstract class a implements wuk {
        public abstract wuk a(wum wum);

        public abstract wuk a(wum wum, long j, TimeUnit timeUnit);

        public wuk a(wum wum, long j, long j2, TimeUnit timeUnit) {
            return wxh.a(this, wum, j, j2, timeUnit, null);
        }

        public long a() {
            return System.currentTimeMillis();
        }
    }

    public abstract a c();

    public long a() {
        return System.currentTimeMillis();
    }
}

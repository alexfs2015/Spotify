package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: wpb reason: default package */
public class wpb {
    public static final wpb b = new wpb() {
        public final wpb a(long j) {
            return this;
        }

        public final wpb a(long j, TimeUnit timeUnit) {
            return this;
        }

        public final void f() {
        }
    };
    private boolean a;
    private long c;
    private long d;

    public wpb a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("timeout < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            this.d = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long bj_() {
        return this.d;
    }

    public boolean bl_() {
        return this.a;
    }

    public long c() {
        if (this.a) {
            return this.c;
        }
        throw new IllegalStateException("No deadline");
    }

    public wpb a(long j) {
        this.a = true;
        this.c = j;
        return this;
    }

    public wpb d() {
        this.d = 0;
        return this;
    }

    public wpb bk_() {
        this.a = false;
        return this;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}

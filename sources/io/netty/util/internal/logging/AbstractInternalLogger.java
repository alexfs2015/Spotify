package io.netty.util.internal.logging;

import java.io.Serializable;

public abstract class AbstractInternalLogger implements Serializable, wyc {
    private static final long serialVersionUID = -6382972526573193470L;
    final String name;

    /* renamed from: io.netty.util.internal.logging.AbstractInternalLogger$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[InternalLogLevel.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                io.netty.util.internal.logging.InternalLogLevel[] r0 = io.netty.util.internal.logging.InternalLogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.TRACE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.INFO     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.WARN     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0040 }
                io.netty.util.internal.logging.InternalLogLevel r1 = io.netty.util.internal.logging.InternalLogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.netty.util.internal.logging.AbstractInternalLogger.AnonymousClass1.<clinit>():void");
        }
    }

    protected AbstractInternalLogger(String str) {
        if (str != null) {
            this.name = str;
            return;
        }
        throw new NullPointerException("name");
    }

    public final void a(InternalLogLevel internalLogLevel, String str) {
        int i = AnonymousClass1.a[internalLogLevel.ordinal()];
        if (i == 1) {
            a(str);
        } else if (i == 2) {
            b(str);
        } else if (i == 3) {
            c(str);
        } else if (i == 4) {
            d(str);
        } else if (i == 5) {
            e(str);
        } else {
            throw new Error();
        }
    }

    public final void a(InternalLogLevel internalLogLevel, String str, Throwable th) {
        int i = AnonymousClass1.a[internalLogLevel.ordinal()];
        if (i == 1) {
            a(str, th);
        } else if (i == 2) {
            b(str, th);
        } else if (i == 3) {
            c(str, th);
        } else if (i == 4) {
            d(str, th);
        } else if (i == 5) {
            e(str, th);
        } else {
            throw new Error();
        }
    }

    public final boolean a(InternalLogLevel internalLogLevel) {
        int i = AnonymousClass1.a[internalLogLevel.ordinal()];
        if (i == 1) {
            return a();
        }
        if (i == 2) {
            return b();
        }
        if (i == 3) {
            return c();
        }
        if (i == 4) {
            return d();
        }
        if (i == 5) {
            return e();
        }
        throw new Error();
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return wyd.a(this.name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wxt.a((Object) this));
        sb.append('(');
        sb.append(this.name);
        sb.append(')');
        return sb.toString();
    }
}

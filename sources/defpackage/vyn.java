package defpackage;

import io.netty.util.ResourceLeakDetector;
import io.netty.util.ResourceLeakDetector.Level;
import io.netty.util.internal.PlatformDependent;

/* renamed from: vyn reason: default package */
public abstract class vyn implements vyw {
    private final boolean b;
    private final vyv c;

    /* renamed from: vyn$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Level.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                io.netty.util.ResourceLeakDetector$Level[] r0 = io.netty.util.ResourceLeakDetector.Level.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.Level.SIMPLE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.Level.ADVANCED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                io.netty.util.ResourceLeakDetector$Level r1 = io.netty.util.ResourceLeakDetector.Level.PARANOID     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vyn.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: protected */
    public abstract vyv b(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract vyv c(int i, int i2);

    protected static vyv a(vyv vyv) {
        int i = AnonymousClass1.a[ResourceLeakDetector.b().ordinal()];
        if (i == 1) {
            whj a = vym.a.a(vyv);
            if (a != null) {
                return new vzt(vyv, a);
            }
        } else if (i == 2 || i == 3) {
            whj a2 = vym.a.a(vyv);
            if (a2 != null) {
                return new vyt(vyv, a2);
            }
        }
        return vyv;
    }

    protected static vzb a(vzb vzb) {
        int i = AnonymousClass1.a[ResourceLeakDetector.b().ordinal()];
        if (i == 1) {
            whj a = vym.a.a(vzb);
            if (a != null) {
                return new vzu(vzb, a);
            }
        } else if (i == 2 || i == 3) {
            whj a2 = vym.a.a(vzb);
            if (a2 != null) {
                return new vyu(vzb, a2);
            }
        }
        return vzb;
    }

    protected vyn(boolean z) {
        this.b = z && PlatformDependent.e();
        this.c = new vzd(this);
    }

    public final vyv a() {
        if (this.b) {
            return f(256, Integer.MAX_VALUE);
        }
        return e(256, Integer.MAX_VALUE);
    }

    public final vyv a(int i) {
        if (this.b) {
            return f(i, Integer.MAX_VALUE);
        }
        return e(i, Integer.MAX_VALUE);
    }

    public final vyv a(int i, int i2) {
        if (this.b) {
            return f(i, i2);
        }
        return e(i, i2);
    }

    public final vyv b(int i) {
        if (PlatformDependent.e()) {
            return f(i, Integer.MAX_VALUE);
        }
        return e(i, Integer.MAX_VALUE);
    }

    public final vyv c(int i) {
        return e(i, Integer.MAX_VALUE);
    }

    private vyv e(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this.c;
        }
        g(i, i2);
        return b(i, i2);
    }

    public final vyv d(int i) {
        return f(i, Integer.MAX_VALUE);
    }

    private vyv f(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this.c;
        }
        g(i, i2);
        return c(i, i2);
    }

    public final vzb e(int i) {
        if (this.b) {
            return g(Integer.MAX_VALUE);
        }
        return f(Integer.MAX_VALUE);
    }

    public vzb f(int i) {
        return a(new vzb(this, false, i));
    }

    public vzb g(int i) {
        return a(new vzb(this, true, i));
    }

    private static void g(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("initialCapacity: ");
            sb.append(i);
            sb.append(" (expectd: 0+)");
            throw new IllegalArgumentException(sb.toString());
        } else if (i > i2) {
            throw new IllegalArgumentException(String.format("initialCapacity: %d (expected: not greater than maxCapacity(%d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wjn.a((Object) this));
        sb.append("(directByDefault: ");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }

    public final int d(int i, int i2) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("minNewCapacity: ");
            sb.append(i);
            sb.append(" (expectd: 0+)");
            throw new IllegalArgumentException(sb.toString());
        } else if (i > i2) {
            throw new IllegalArgumentException(String.format("minNewCapacity: %d (expected: not greater than maxCapacity(%d)", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        } else if (i == 4194304) {
            return 4194304;
        } else {
            if (i > 4194304) {
                int i3 = (i / 4194304) * 4194304;
                if (i3 <= i2 - 4194304) {
                    i2 = i3 + 4194304;
                }
                return i2;
            }
            int i4 = 64;
            while (i4 < i) {
                i4 <<= 1;
            }
            return Math.min(i4, i2);
        }
    }
}

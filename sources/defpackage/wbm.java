package defpackage;

import com.comscore.util.log.LogLevel;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: wbm reason: default package */
public class wbm implements wao {
    private static final wby a = wbr.a;
    private static final AtomicIntegerFieldUpdater<wbm> b;
    private static final AtomicReferenceFieldUpdater<wbm, wcj> c;
    private wan d;
    private volatile vyw e;
    private volatile wcb f;
    private volatile wby g;
    private volatile int h;
    private volatile int i;
    private volatile int j;
    private volatile boolean k;
    private volatile wcj l;
    private volatile boolean m;

    /* access modifiers changed from: protected */
    public void j() {
    }

    static {
        Class<wbm> cls = wbm.class;
        AtomicIntegerFieldUpdater<wbm> b2 = PlatformDependent.b(cls, "autoRead");
        if (b2 == null) {
            b2 = AtomicIntegerFieldUpdater.newUpdater(cls, "j");
        }
        b = b2;
        AtomicReferenceFieldUpdater<wbm, wcj> a2 = PlatformDependent.a(cls, "writeBufferWaterMark");
        if (a2 == null) {
            a2 = AtomicReferenceFieldUpdater.newUpdater(cls, wcj.class, "l");
        }
        c = a2;
    }

    public wbm(wan wan) {
        this(wan, new wam());
    }

    private wbm(wan wan, wcb wcb) {
        this.e = vyw.a;
        this.g = a;
        this.h = LogLevel.NONE;
        this.i = 16;
        this.j = 1;
        this.k = true;
        this.l = wcj.a;
        this.m = true;
        waz E = wan.E();
        if (wcb instanceof wbx) {
            ((wbx) wcb).b(E.b);
        } else if (wcb == null) {
            throw new NullPointerException("allocator");
        }
        this.f = wcb;
        this.d = wan;
    }

    public <T> T a(wba<T> wba) {
        if (wba == null) {
            throw new NullPointerException("option");
        } else if (wba == wba.d) {
            return Integer.valueOf(this.h);
        } else {
            if (wba == wba.e) {
                return Integer.valueOf(k());
            }
            if (wba == wba.f) {
                return Integer.valueOf(this.i);
            }
            if (wba == wba.a) {
                return this.e;
            }
            if (wba == wba.b) {
                return this.f;
            }
            if (wba == wba.k) {
                return Boolean.valueOf(e());
            }
            if (wba == wba.l) {
                return Boolean.valueOf(this.k);
            }
            if (wba == wba.g) {
                return Integer.valueOf(this.l.c);
            }
            if (wba == wba.h) {
                return Integer.valueOf(this.l.b);
            }
            if (wba == wba.i) {
                return this.l;
            }
            if (wba == wba.c) {
                return this.g;
            }
            if (wba == wba.t) {
                return Boolean.valueOf(this.m);
            }
            return null;
        }
    }

    public <T> boolean a(wba<T> wba, T t) {
        b(wba, t);
        if (wba == wba.d) {
            a(((Integer) t).intValue());
        } else if (wba == wba.e) {
            b(((Integer) t).intValue());
        } else if (wba == wba.f) {
            c(((Integer) t).intValue());
        } else if (wba == wba.a) {
            a((vyw) t);
        } else if (wba == wba.b) {
            a((wcb) t);
        } else if (wba == wba.k) {
            a(((Boolean) t).booleanValue());
        } else if (wba == wba.l) {
            b(((Boolean) t).booleanValue());
        } else if (wba == wba.g) {
            d(((Integer) t).intValue());
        } else if (wba == wba.h) {
            e(((Integer) t).intValue());
        } else if (wba == wba.i) {
            a((wcj) t);
        } else if (wba == wba.c) {
            a((wby) t);
        } else if (wba != wba.t) {
            return false;
        } else {
            this.m = ((Boolean) t).booleanValue();
        }
        return true;
    }

    protected static <T> void b(wba<T> wba, T t) {
        if (wba != null) {
            wba.a(t);
            return;
        }
        throw new NullPointerException("option");
    }

    public final int a() {
        return this.h;
    }

    public wao a(int i2) {
        if (i2 >= 0) {
            this.h = i2;
            return this;
        }
        throw new IllegalArgumentException(String.format("connectTimeoutMillis: %d (expected: >= 0)", new Object[]{Integer.valueOf(i2)}));
    }

    public final int b() {
        return this.i;
    }

    public wao c(int i2) {
        if (i2 > 0) {
            this.i = i2;
            return this;
        }
        throw new IllegalArgumentException("writeSpinCount must be a positive integer.");
    }

    public final vyw c() {
        return this.e;
    }

    public wao a(vyw vyw) {
        if (vyw != null) {
            this.e = vyw;
            return this;
        }
        throw new NullPointerException("allocator");
    }

    public final <T extends wcb> T d() {
        return this.f;
    }

    public wao a(wcb wcb) {
        this.f = (wcb) wjk.a(wcb, "allocator");
        return this;
    }

    public final boolean e() {
        return this.j == 1;
    }

    public wao a(boolean z) {
        boolean z2 = true;
        if (b.getAndSet(this, z ? 1 : 0) != 1) {
            z2 = false;
        }
        if (z && !z2) {
            this.d.j();
        } else if (!z && z2) {
            j();
        }
        return this;
    }

    public final boolean f() {
        return this.k;
    }

    public wao b(boolean z) {
        this.k = z;
        return this;
    }

    public final int g() {
        return this.l.c;
    }

    public wao d(int i2) {
        wcj wcj;
        if (i2 >= 0) {
            do {
                wcj = this.l;
                if (i2 < wcj.b) {
                    StringBuilder sb = new StringBuilder("writeBufferHighWaterMark cannot be less than writeBufferLowWaterMark (");
                    sb.append(wcj.b);
                    sb.append("): ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } while (!c.compareAndSet(this, wcj, new wcj(wcj.b, i2, false)));
            return this;
        }
        throw new IllegalArgumentException("writeBufferHighWaterMark must be >= 0");
    }

    public final int h() {
        return this.l.b;
    }

    public wao e(int i2) {
        wcj wcj;
        if (i2 >= 0) {
            do {
                wcj = this.l;
                if (i2 > wcj.c) {
                    StringBuilder sb = new StringBuilder("writeBufferLowWaterMark cannot be greater than writeBufferHighWaterMark (");
                    sb.append(wcj.c);
                    sb.append("): ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } while (!c.compareAndSet(this, wcj, new wcj(i2, wcj.c, false)));
            return this;
        }
        throw new IllegalArgumentException("writeBufferLowWaterMark must be >= 0");
    }

    public wao a(wcj wcj) {
        this.l = (wcj) wjk.a(wcj, "writeBufferWaterMark");
        return this;
    }

    public final wby i() {
        return this.g;
    }

    public wao a(wby wby) {
        if (wby != null) {
            this.g = wby;
            return this;
        }
        throw new NullPointerException("estimator");
    }

    @Deprecated
    private int k() {
        try {
            return ((wbx) this.f).c();
        } catch (ClassCastException e2) {
            throw new IllegalStateException("getRecvByteBufAllocator() must return an object of type MaxMessagesRecvByteBufAllocator", e2);
        }
    }

    @Deprecated
    public wao b(int i2) {
        try {
            ((wbx) this.f).b(i2);
            return this;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("getRecvByteBufAllocator() must return an object of type MaxMessagesRecvByteBufAllocator", e2);
        }
    }
}

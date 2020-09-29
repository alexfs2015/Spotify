package defpackage;

import com.comscore.util.log.LogLevel;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: wps reason: default package */
public class wps implements wou {
    private static final wqe a = wpx.a;
    private static final AtomicIntegerFieldUpdater<wps> b;
    private static final AtomicReferenceFieldUpdater<wps, wqp> c;
    private wot d;
    private volatile wnc e;
    private volatile wqh f;
    private volatile wqe g;
    private volatile int h;
    private volatile int i;
    private volatile int j;
    private volatile boolean k;
    private volatile wqp l;
    private volatile boolean m;

    static {
        Class<wps> cls = wps.class;
        AtomicIntegerFieldUpdater<wps> b2 = PlatformDependent.b(cls, "autoRead");
        if (b2 == null) {
            b2 = AtomicIntegerFieldUpdater.newUpdater(cls, "j");
        }
        b = b2;
        AtomicReferenceFieldUpdater<wps, wqp> a2 = PlatformDependent.a(cls, "writeBufferWaterMark");
        if (a2 == null) {
            a2 = AtomicReferenceFieldUpdater.newUpdater(cls, wqp.class, "l");
        }
        c = a2;
    }

    public wps(wot wot) {
        this(wot, new wos());
    }

    private wps(wot wot, wqh wqh) {
        this.e = wnc.a;
        this.g = a;
        this.h = LogLevel.NONE;
        this.i = 16;
        this.j = 1;
        this.k = true;
        this.l = wqp.a;
        this.m = true;
        wpf E = wot.E();
        if (wqh instanceof wqd) {
            ((wqd) wqh).b(E.b);
        } else if (wqh == null) {
            throw new NullPointerException("allocator");
        }
        this.f = wqh;
        this.d = wot;
    }

    protected static <T> void b(wpg<T> wpg, T t) {
        if (wpg != null) {
            wpg.a(t);
            return;
        }
        throw new NullPointerException("option");
    }

    @Deprecated
    private int k() {
        try {
            return ((wqd) this.f).c();
        } catch (ClassCastException e2) {
            throw new IllegalStateException("getRecvByteBufAllocator() must return an object of type MaxMessagesRecvByteBufAllocator", e2);
        }
    }

    public final int a() {
        return this.h;
    }

    public <T> T a(wpg<T> wpg) {
        if (wpg == null) {
            throw new NullPointerException("option");
        } else if (wpg == wpg.d) {
            return Integer.valueOf(this.h);
        } else {
            if (wpg == wpg.e) {
                return Integer.valueOf(k());
            }
            if (wpg == wpg.f) {
                return Integer.valueOf(this.i);
            }
            if (wpg == wpg.a) {
                return this.e;
            }
            if (wpg == wpg.b) {
                return this.f;
            }
            if (wpg == wpg.k) {
                return Boolean.valueOf(e());
            }
            if (wpg == wpg.l) {
                return Boolean.valueOf(this.k);
            }
            if (wpg == wpg.g) {
                return Integer.valueOf(this.l.c);
            }
            if (wpg == wpg.h) {
                return Integer.valueOf(this.l.b);
            }
            if (wpg == wpg.i) {
                return this.l;
            }
            if (wpg == wpg.c) {
                return this.g;
            }
            if (wpg == wpg.t) {
                return Boolean.valueOf(this.m);
            }
            return null;
        }
    }

    public wou a(int i2) {
        if (i2 >= 0) {
            this.h = i2;
            return this;
        }
        throw new IllegalArgumentException(String.format("connectTimeoutMillis: %d (expected: >= 0)", new Object[]{Integer.valueOf(i2)}));
    }

    public wou a(wnc wnc) {
        if (wnc != null) {
            this.e = wnc;
            return this;
        }
        throw new NullPointerException("allocator");
    }

    public wou a(wqe wqe) {
        if (wqe != null) {
            this.g = wqe;
            return this;
        }
        throw new NullPointerException("estimator");
    }

    public wou a(wqh wqh) {
        this.f = (wqh) wxq.a(wqh, "allocator");
        return this;
    }

    public wou a(wqp wqp) {
        this.l = (wqp) wxq.a(wqp, "writeBufferWaterMark");
        return this;
    }

    public wou a(boolean z) {
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

    public <T> boolean a(wpg<T> wpg, T t) {
        b(wpg, t);
        if (wpg == wpg.d) {
            a(((Integer) t).intValue());
        } else if (wpg == wpg.e) {
            b(((Integer) t).intValue());
        } else if (wpg == wpg.f) {
            c(((Integer) t).intValue());
        } else if (wpg == wpg.a) {
            a((wnc) t);
        } else if (wpg == wpg.b) {
            a((wqh) t);
        } else if (wpg == wpg.k) {
            a(((Boolean) t).booleanValue());
        } else if (wpg == wpg.l) {
            b(((Boolean) t).booleanValue());
        } else if (wpg == wpg.g) {
            d(((Integer) t).intValue());
        } else if (wpg == wpg.h) {
            e(((Integer) t).intValue());
        } else if (wpg == wpg.i) {
            a((wqp) t);
        } else if (wpg == wpg.c) {
            a((wqe) t);
        } else if (wpg != wpg.t) {
            return false;
        } else {
            this.m = ((Boolean) t).booleanValue();
        }
        return true;
    }

    public final int b() {
        return this.i;
    }

    @Deprecated
    public wou b(int i2) {
        try {
            ((wqd) this.f).b(i2);
            return this;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("getRecvByteBufAllocator() must return an object of type MaxMessagesRecvByteBufAllocator", e2);
        }
    }

    public wou b(boolean z) {
        this.k = z;
        return this;
    }

    public final wnc c() {
        return this.e;
    }

    public wou c(int i2) {
        if (i2 > 0) {
            this.i = i2;
            return this;
        }
        throw new IllegalArgumentException("writeSpinCount must be a positive integer.");
    }

    public wou d(int i2) {
        wqp wqp;
        if (i2 >= 0) {
            do {
                wqp = this.l;
                if (i2 < wqp.b) {
                    StringBuilder sb = new StringBuilder("writeBufferHighWaterMark cannot be less than writeBufferLowWaterMark (");
                    sb.append(wqp.b);
                    sb.append("): ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } while (!c.compareAndSet(this, wqp, new wqp(wqp.b, i2, false)));
            return this;
        }
        throw new IllegalArgumentException("writeBufferHighWaterMark must be >= 0");
    }

    public final <T extends wqh> T d() {
        return this.f;
    }

    public wou e(int i2) {
        wqp wqp;
        if (i2 >= 0) {
            do {
                wqp = this.l;
                if (i2 > wqp.c) {
                    StringBuilder sb = new StringBuilder("writeBufferLowWaterMark cannot be greater than writeBufferHighWaterMark (");
                    sb.append(wqp.c);
                    sb.append("): ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } while (!c.compareAndSet(this, wqp, new wqp(i2, wqp.c, false)));
            return this;
        }
        throw new IllegalArgumentException("writeBufferLowWaterMark must be >= 0");
    }

    public final boolean e() {
        return this.j == 1;
    }

    public final boolean f() {
        return this.k;
    }

    public final int g() {
        return this.l.c;
    }

    public final int h() {
        return this.l.b;
    }

    public final wqe i() {
        return this.g;
    }

    /* access modifiers changed from: protected */
    public void j() {
    }
}

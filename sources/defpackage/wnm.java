package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import io.netty.buffer.PoolArena;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: wnm reason: default package */
public final class wnm<T> implements wnn {
    private static final Iterator<Object> a = Collections.emptyList().iterator();
    private static /* synthetic */ boolean h = (!wnm.class.desiredAssertionStatus());
    private final wnm<T> b;
    private final int c;
    private final int d;
    private final int e;
    private wnl<T> f;
    private wnm<T> g;

    public wnm(wnm<T> wnm, int i, int i2, int i3) {
        if (h || i <= i2) {
            this.b = wnm;
            this.c = i;
            this.d = i2;
            int max = Math.max(1, i);
            this.e = max == 100 ? 0 : (int) ((((long) i3) * (100 - ((long) max))) / 100);
            return;
        }
        throw new AssertionError();
    }

    private boolean b(wnl<T> wnl) {
        if (!h && wnl.a() >= this.d) {
            throw new AssertionError();
        } else if (wnl.a() < this.c) {
            return c(wnl);
        } else {
            d(wnl);
            return true;
        }
    }

    private boolean c(wnl<T> wnl) {
        wnm<T> wnm = this.g;
        if (wnm != null) {
            return wnm.b(wnl);
        }
        if (h || wnl.a() == 0) {
            return false;
        }
        throw new AssertionError();
    }

    private void d(wnl<T> wnl) {
        wnl.e = this;
        wnl<T> wnl2 = this.f;
        if (wnl2 == null) {
            this.f = wnl;
            wnl.f = null;
            wnl.g = null;
            return;
        }
        wnl.f = null;
        wnl.g = wnl2;
        wnl2.f = wnl;
        this.f = wnl;
    }

    private void e(wnl<T> wnl) {
        if (wnl == this.f) {
            this.f = wnl.g;
            wnl<T> wnl2 = this.f;
            if (wnl2 != null) {
                wnl2.f = null;
            }
        } else {
            wnl<T> wnl3 = wnl.g;
            wnl.f.g = wnl3;
            if (wnl3 != null) {
                wnl3.f = wnl.f;
            }
        }
    }

    public final void a(PoolArena<T> poolArena) {
        for (wnl<T> wnl = this.f; wnl != null; wnl = wnl.g) {
            poolArena.a(wnl);
        }
        this.f = null;
    }

    public final void a(wnl<T> wnl) {
        wnm wnm = this;
        while (wnl.a() >= wnm.d) {
            wnm = wnm.b;
        }
        wnm.d(wnl);
    }

    public final void a(wnm<T> wnm) {
        if (h || this.g == null) {
            this.g = wnm;
            return;
        }
        throw new AssertionError();
    }

    public final boolean a(wnl<T> wnl, long j) {
        wnl.a(j);
        if (wnl.a() >= this.c) {
            return true;
        }
        e(wnl);
        return c(wnl);
    }

    public final boolean a(wnq<T> wnq, int i, int i2) {
        wnl<T> wnl = this.f;
        if (wnl == null || i2 > this.e) {
            return false;
        }
        do {
            long a2 = wnl.a(i2);
            if (a2 < 0) {
                wnl = wnl.g;
            } else {
                wnl.a(wnq, a2, i);
                if (wnl.a() >= this.d) {
                    e(wnl);
                    this.b.a(wnl);
                }
                return true;
            }
        } while (wnl != null);
        return false;
    }

    public final Iterator<Object> iterator() {
        if (this.f == null) {
            return a;
        }
        ArrayList arrayList = new ArrayList();
        wnl<T> wnl = this.f;
        do {
            arrayList.add(wnl);
            wnl = wnl.g;
        } while (wnl != null);
        return arrayList.iterator();
    }

    public final String toString() {
        if (this.f == null) {
            return IdHelperAndroid.NO_ID_AVAILABLE;
        }
        StringBuilder sb = new StringBuilder();
        wnl<T> wnl = this.f;
        while (true) {
            sb.append(wnl);
            wnl = wnl.g;
            if (wnl == null) {
                return sb.toString();
            }
            sb.append(wxt.a);
        }
    }
}

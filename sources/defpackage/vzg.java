package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import io.netty.buffer.PoolArena;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: vzg reason: default package */
public final class vzg<T> implements vzh {
    private static final Iterator<Object> a = Collections.emptyList().iterator();
    private static /* synthetic */ boolean h = (!vzg.class.desiredAssertionStatus());
    private final vzg<T> b;
    private final int c;
    private final int d;
    private final int e;
    private vzf<T> f;
    private vzg<T> g;

    public vzg(vzg<T> vzg, int i, int i2, int i3) {
        int i4;
        if (h || i <= i2) {
            this.b = vzg;
            this.c = i;
            this.d = i2;
            int max = Math.max(1, i);
            if (max == 100) {
                i4 = 0;
            } else {
                i4 = (int) ((((long) i3) * (100 - ((long) max))) / 100);
            }
            this.e = i4;
            return;
        }
        throw new AssertionError();
    }

    public final void a(vzg<T> vzg) {
        if (h || this.g == null) {
            this.g = vzg;
            return;
        }
        throw new AssertionError();
    }

    public final boolean a(vzk<T> vzk, int i, int i2) {
        vzf<T> vzf = this.f;
        if (vzf == null || i2 > this.e) {
            return false;
        }
        do {
            long a2 = vzf.a(i2);
            if (a2 < 0) {
                vzf = vzf.g;
            } else {
                vzf.a(vzk, a2, i);
                if (vzf.a() >= this.d) {
                    e(vzf);
                    this.b.a(vzf);
                }
                return true;
            }
        } while (vzf != null);
        return false;
    }

    public final boolean a(vzf<T> vzf, long j) {
        vzf.a(j);
        if (vzf.a() >= this.c) {
            return true;
        }
        e(vzf);
        return c(vzf);
    }

    private boolean b(vzf<T> vzf) {
        if (!h && vzf.a() >= this.d) {
            throw new AssertionError();
        } else if (vzf.a() < this.c) {
            return c(vzf);
        } else {
            d(vzf);
            return true;
        }
    }

    private boolean c(vzf<T> vzf) {
        vzg<T> vzg = this.g;
        if (vzg != null) {
            return vzg.b(vzf);
        }
        if (h || vzf.a() == 0) {
            return false;
        }
        throw new AssertionError();
    }

    public final void a(vzf<T> vzf) {
        vzg vzg = this;
        while (vzf.a() >= vzg.d) {
            vzg = vzg.b;
        }
        vzg.d(vzf);
    }

    private void d(vzf<T> vzf) {
        vzf.e = this;
        vzf<T> vzf2 = this.f;
        if (vzf2 == null) {
            this.f = vzf;
            vzf.f = null;
            vzf.g = null;
            return;
        }
        vzf.f = null;
        vzf.g = vzf2;
        vzf2.f = vzf;
        this.f = vzf;
    }

    private void e(vzf<T> vzf) {
        if (vzf == this.f) {
            this.f = vzf.g;
            vzf<T> vzf2 = this.f;
            if (vzf2 != null) {
                vzf2.f = null;
            }
        } else {
            vzf<T> vzf3 = vzf.g;
            vzf.f.g = vzf3;
            if (vzf3 != null) {
                vzf3.f = vzf.f;
            }
        }
    }

    public final Iterator<Object> iterator() {
        if (this.f == null) {
            return a;
        }
        ArrayList arrayList = new ArrayList();
        vzf<T> vzf = this.f;
        do {
            arrayList.add(vzf);
            vzf = vzf.g;
        } while (vzf != null);
        return arrayList.iterator();
    }

    public final String toString() {
        if (this.f == null) {
            return IdHelperAndroid.NO_ID_AVAILABLE;
        }
        StringBuilder sb = new StringBuilder();
        vzf<T> vzf = this.f;
        while (true) {
            sb.append(vzf);
            vzf = vzf.g;
            if (vzf == null) {
                return sb.toString();
            }
            sb.append(wjn.a);
        }
    }

    public final void a(PoolArena<T> poolArena) {
        for (vzf<T> vzf = this.f; vzf != null; vzf = vzf.g) {
            poolArena.a(vzf);
        }
        this.f = null;
    }
}

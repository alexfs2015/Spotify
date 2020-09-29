package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: bbq reason: default package */
public abstract class bbq implements bbu {
    protected final int a;
    final aqv[] b;
    private ayn c;
    private int[] d;
    private final long[] e;
    private int f;

    /* renamed from: bbq$a */
    static final class a implements Comparator<aqv> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((aqv) obj2).c - ((aqv) obj).c;
        }
    }

    public bbq(ayn ayn, int... iArr) {
        int i = 0;
        bdl.b(iArr.length > 0);
        this.c = (ayn) bdl.a(ayn);
        this.a = iArr.length;
        this.b = new aqv[this.a];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.b[i2] = ayn.b[iArr[i2]];
        }
        Arrays.sort(this.b, new a(0));
        this.d = new int[this.a];
        while (true) {
            int i3 = this.a;
            if (i < i3) {
                this.d[i] = ayn.a(this.b[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    public int a(long j, List<? extends azb> list) {
        return list.size();
    }

    public final int a(aqv aqv) {
        for (int i = 0; i < this.a; i++) {
            if (this.b[i] == aqv) {
                return i;
            }
        }
        return -1;
    }

    public final aqv a(int i) {
        return this.b[i];
    }

    public void a(float f2) {
    }

    public /* synthetic */ void a(long j, long j2, long j3) {
        CC.$default$a(this, j, j2, j3);
    }

    public final boolean a(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b2 = b(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.a && !b2) {
            b2 = i2 != i && !b(i2, elapsedRealtime);
            i2++;
        }
        if (!b2) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + j);
        return true;
    }

    public final int b(int i) {
        return this.d[i];
    }

    /* access modifiers changed from: protected */
    public final boolean b(int i, long j) {
        return this.e[i] > j;
    }

    public final int c(int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            if (this.d[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public void d() {
    }

    public final ayn e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bbq bbq = (bbq) obj;
            return this.c == bbq.c && Arrays.equals(this.d, bbq.d);
        }
    }

    public final int f() {
        return this.d.length;
    }

    public final aqv g() {
        return this.b[a()];
    }

    public final int h() {
        return this.d[a()];
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = (System.identityHashCode(this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.f;
    }

    @Deprecated
    public /* synthetic */ void i() {
        CC.$default$i(this);
    }
}

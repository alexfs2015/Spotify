package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: baz reason: default package */
public abstract class baz implements bbd {
    protected final int a;
    final aqe[] b;
    private axw c;
    private int[] d;
    private final long[] e;
    private int f;

    /* renamed from: baz$a */
    static final class a implements Comparator<aqe> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((aqe) obj2).c - ((aqe) obj).c;
        }
    }

    public void a(float f2) {
    }

    public /* synthetic */ void a(long j, long j2, long j3) {
        CC.$default$a(this, j, j2, j3);
    }

    public void d() {
    }

    @Deprecated
    public /* synthetic */ void i() {
        CC.$default$i(this);
    }

    public baz(axw axw, int... iArr) {
        int i = 0;
        bcu.b(iArr.length > 0);
        this.c = (axw) bcu.a(axw);
        this.a = iArr.length;
        this.b = new aqe[this.a];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.b[i2] = axw.b[iArr[i2]];
        }
        Arrays.sort(this.b, new a(0));
        this.d = new int[this.a];
        while (true) {
            int i3 = this.a;
            if (i < i3) {
                this.d[i] = axw.a(this.b[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    public final axw e() {
        return this.c;
    }

    public final int f() {
        return this.d.length;
    }

    public final aqe a(int i) {
        return this.b[i];
    }

    public final int b(int i) {
        return this.d[i];
    }

    public final int a(aqe aqe) {
        for (int i = 0; i < this.a; i++) {
            if (this.b[i] == aqe) {
                return i;
            }
        }
        return -1;
    }

    public final int c(int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            if (this.d[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final aqe g() {
        return this.b[a()];
    }

    public final int h() {
        return this.d[a()];
    }

    public int a(long j, List<? extends ayk> list) {
        return list.size();
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

    /* access modifiers changed from: protected */
    public final boolean b(int i, long j) {
        return this.e[i] > j;
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = (System.identityHashCode(this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            baz baz = (baz) obj;
            return this.c == baz.c && Arrays.equals(this.d, baz.d);
        }
    }
}

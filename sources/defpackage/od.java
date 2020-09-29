package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.s;
import androidx.recyclerview.widget.RecyclerView.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: od reason: default package */
public final class od implements Runnable {
    public static final ThreadLocal<od> a = new ThreadLocal<>();
    private static Comparator<b> f = new Comparator<b>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            b bVar = (b) obj;
            b bVar2 = (b) obj2;
            int i = 0;
            if ((bVar.d == null) != (bVar2.d == null)) {
                if (bVar.d != null) {
                    return -1;
                }
                i = 1;
            } else if (bVar.a == bVar2.a) {
                int i2 = bVar2.b - bVar.b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = bVar.c - bVar2.c;
                if (i3 != 0) {
                    return i3;
                }
            } else if (!bVar.a) {
                return 1;
            } else {
                i = -1;
            }
            return i;
        }
    };
    public ArrayList<RecyclerView> b = new ArrayList<>();
    public long c;
    private long d;
    private ArrayList<b> e = new ArrayList<>();

    /* renamed from: od$a */
    public static class a implements androidx.recyclerview.widget.RecyclerView.i.a {
        int a;
        int b;
        int[] c;
        int d;

        public final void a() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        public final void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.d << 1;
                int[] iArr = this.c;
                if (iArr == null) {
                    this.c = new int[4];
                    Arrays.fill(this.c, -1);
                } else if (i3 >= iArr.length) {
                    this.c = new int[(i3 << 1)];
                    System.arraycopy(iArr, 0, this.c, 0, iArr.length);
                }
                int[] iArr2 = this.c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            i iVar = recyclerView.n;
            if (recyclerView.m != null && iVar != null && iVar.q) {
                if (z) {
                    if (!recyclerView.f.d()) {
                        iVar.a(recyclerView.m.b(), (androidx.recyclerview.widget.RecyclerView.i.a) this);
                    }
                } else if (!recyclerView.l()) {
                    iVar.a(this.a, this.b, recyclerView.E, (androidx.recyclerview.widget.RecyclerView.i.a) this);
                }
                if (this.d > iVar.r) {
                    iVar.r = this.d;
                    iVar.s = z;
                    recyclerView.e.b();
                }
            }
        }

        public final boolean a(int i) {
            if (this.c != null) {
                int i2 = this.d << 1;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: od$b */
    static class b {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        b() {
        }
    }

    private static u a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int b2 = recyclerView.g.b();
        int i2 = 0;
        while (true) {
            if (i2 >= b2) {
                z = false;
                break;
            }
            u d2 = RecyclerView.d(recyclerView.g.c(i2));
            if (d2.q == i && !d2.k()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        o oVar = recyclerView.e;
        try {
            recyclerView.g();
            u a2 = oVar.a(i, false, j);
            if (a2 != null) {
                if (!a2.m() || a2.k()) {
                    oVar.a(a2, false);
                } else {
                    oVar.a(a2.o);
                }
            }
            return a2;
        } finally {
            recyclerView.a(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.d == 0) {
            this.d = RecyclerView.m();
            recyclerView.post(this);
        }
        a aVar = recyclerView.D;
        aVar.a = i;
        aVar.b = i2;
    }

    public final void run() {
        b bVar;
        long j = 0;
        try {
            ha.a("RV Prefetch");
            if (!this.b.isEmpty()) {
                int size = this.b.size();
                long j2 = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j2 = Math.max(recyclerView.getDrawingTime(), j2);
                    }
                }
                if (j2 != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j2) + this.c;
                    int size2 = this.b.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView2 = (RecyclerView) this.b.get(i3);
                        if (recyclerView2.getWindowVisibility() == 0) {
                            recyclerView2.D.a(recyclerView2, false);
                            i2 += recyclerView2.D.d;
                        }
                    }
                    this.e.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView3 = (RecyclerView) this.b.get(i5);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            a aVar = recyclerView3.D;
                            int abs = Math.abs(aVar.a) + Math.abs(aVar.b);
                            int i6 = i4;
                            int i7 = 0;
                            while (i7 < (aVar.d << 1)) {
                                if (i6 >= this.e.size()) {
                                    bVar = new b();
                                    this.e.add(bVar);
                                } else {
                                    bVar = (b) this.e.get(i6);
                                }
                                int i8 = aVar.c[i7 + 1];
                                try {
                                    bVar.a = i8 <= abs;
                                    bVar.b = abs;
                                    bVar.c = i8;
                                    bVar.d = recyclerView3;
                                    bVar.e = aVar.c[i7];
                                    i6++;
                                    i7 += 2;
                                } catch (Throwable th) {
                                    th = th;
                                    j = 0;
                                    this.d = j;
                                    ha.a();
                                    throw th;
                                }
                            }
                            i4 = i6;
                        }
                    }
                    Collections.sort(this.e, f);
                    for (int i9 = 0; i9 < this.e.size(); i9++) {
                        b bVar2 = (b) this.e.get(i9);
                        if (bVar2.d == null) {
                            break;
                        }
                        u a2 = a(bVar2.d, bVar2.e, bVar2.a ? Long.MAX_VALUE : nanos);
                        if (a2 != null && a2.p != null && a2.m() && !a2.k()) {
                            RecyclerView recyclerView4 = (RecyclerView) a2.p.get();
                            if (recyclerView4 != null) {
                                if (recyclerView4.w && recyclerView4.g.b() != 0) {
                                    recyclerView4.b();
                                }
                                a aVar2 = recyclerView4.D;
                                aVar2.a(recyclerView4, true);
                                if (aVar2.d != 0) {
                                    ha.a("RV Nested Prefetch");
                                    s sVar = recyclerView4.E;
                                    androidx.recyclerview.widget.RecyclerView.a aVar3 = recyclerView4.m;
                                    sVar.d = 1;
                                    sVar.e = aVar3.b();
                                    sVar.g = false;
                                    sVar.h = false;
                                    sVar.i = false;
                                    for (int i10 = 0; i10 < (aVar2.d << 1); i10 += 2) {
                                        a(recyclerView4, aVar2.c[i10], nanos);
                                    }
                                    ha.a();
                                }
                            }
                        }
                        bVar2.a = false;
                        bVar2.b = 0;
                        bVar2.c = 0;
                        bVar2.d = null;
                        bVar2.e = 0;
                    }
                    j = 0;
                }
            }
            this.d = j;
            ha.a();
        } catch (Throwable th2) {
            th = th2;
            this.d = j;
            ha.a();
            throw th;
        }
    }
}

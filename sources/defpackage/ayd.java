package defpackage;

import android.util.SparseArray;

/* renamed from: ayd reason: default package */
public final class ayd implements asv {
    public final ast a;
    public aqe[] b;
    private final int c;
    private final aqe d;
    private final SparseArray<a> e = new SparseArray<>();
    private boolean f;
    private b g;
    private long h;
    private atb i;

    /* renamed from: ayd$a */
    static final class a implements atd {
        public aqe a;
        private final int b;
        private final int c;
        private final aqe d;
        private final ass e = new ass();
        private atd f;
        private long g;

        public a(int i, int i2, aqe aqe) {
            this.b = i;
            this.c = i2;
            this.d = aqe;
        }

        public final void a(b bVar, long j) {
            if (bVar == null) {
                this.f = this.e;
                return;
            }
            this.g = j;
            this.f = bVar.a(this.c);
            aqe aqe = this.a;
            if (aqe != null) {
                this.f.a(aqe);
            }
        }

        public final void a(aqe aqe) {
            aqe aqe2 = this.d;
            if (aqe2 != null) {
                aqe = aqe.a(aqe2);
            }
            this.a = aqe;
            this.f.a(this.a);
        }

        public final int a(asu asu, int i, boolean z) {
            return this.f.a(asu, i, z);
        }

        public final void a(bdj bdj, int i) {
            this.f.a(bdj, i);
        }

        public final void a(long j, int i, int i2, int i3, defpackage.atd.a aVar) {
            long j2 = this.g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f = this.e;
            }
            this.f.a(j, i, i2, i3, aVar);
        }
    }

    /* renamed from: ayd$b */
    public interface b {
        atd a(int i);
    }

    public ayd(ast ast, int i2, aqe aqe) {
        this.a = ast;
        this.c = i2;
        this.d = aqe;
    }

    public final void a(b bVar, long j, long j2) {
        this.g = bVar;
        this.h = j2;
        if (!this.f) {
            this.a.a((asv) this);
            if (j != -9223372036854775807L) {
                this.a.a(0, j);
            }
            this.f = true;
            return;
        }
        ast ast = this.a;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        ast.a(0, j);
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ((a) this.e.valueAt(i2)).a(bVar, j2);
        }
    }

    public final atd a(int i2, int i3) {
        a aVar = (a) this.e.get(i2);
        if (aVar == null) {
            bcu.b(this.b == null);
            aVar = new a(i2, i3, i3 == this.c ? this.d : null);
            aVar.a(this.g, this.h);
            this.e.put(i2, aVar);
        }
        return aVar;
    }

    public final void a() {
        aqe[] aqeArr = new aqe[this.e.size()];
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            aqeArr[i2] = ((a) this.e.valueAt(i2)).a;
        }
        this.b = aqeArr;
    }

    public final void a(atb atb) {
        this.i = atb;
    }
}

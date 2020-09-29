package defpackage;

import android.util.SparseArray;

/* renamed from: ayu reason: default package */
public final class ayu implements atm {
    public final atk a;
    public aqv[] b;
    private final int c;
    private final aqv d;
    private final SparseArray<a> e = new SparseArray<>();
    private boolean f;
    private b g;
    private long h;
    private ats i;

    /* renamed from: ayu$a */
    static final class a implements atu {
        public aqv a;
        private final int b;
        private final int c;
        private final aqv d;
        private final atj e = new atj();
        private atu f;
        private long g;

        public a(int i, int i2, aqv aqv) {
            this.b = i;
            this.c = i2;
            this.d = aqv;
        }

        public final int a(atl atl, int i, boolean z) {
            return this.f.a(atl, i, z);
        }

        public final void a(long j, int i, int i2, int i3, defpackage.atu.a aVar) {
            long j2 = this.g;
            if (j2 != -9223372036854775807L && j >= j2) {
                this.f = this.e;
            }
            this.f.a(j, i, i2, i3, aVar);
        }

        public final void a(aqv aqv) {
            aqv aqv2 = this.d;
            if (aqv2 != null) {
                aqv = aqv.a(aqv2);
            }
            this.a = aqv;
            this.f.a(this.a);
        }

        public final void a(b bVar, long j) {
            if (bVar == null) {
                this.f = this.e;
                return;
            }
            this.g = j;
            this.f = bVar.a(this.c);
            aqv aqv = this.a;
            if (aqv != null) {
                this.f.a(aqv);
            }
        }

        public final void a(bea bea, int i) {
            this.f.a(bea, i);
        }
    }

    /* renamed from: ayu$b */
    public interface b {
        atu a(int i);
    }

    public ayu(atk atk, int i2, aqv aqv) {
        this.a = atk;
        this.c = i2;
        this.d = aqv;
    }

    public final atu a(int i2, int i3) {
        a aVar = (a) this.e.get(i2);
        if (aVar == null) {
            bdl.b(this.b == null);
            aVar = new a(i2, i3, i3 == this.c ? this.d : null);
            aVar.a(this.g, this.h);
            this.e.put(i2, aVar);
        }
        return aVar;
    }

    public final void a() {
        aqv[] aqvArr = new aqv[this.e.size()];
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            aqvArr[i2] = ((a) this.e.valueAt(i2)).a;
        }
        this.b = aqvArr;
    }

    public final void a(ats ats) {
        this.i = ats;
    }

    public final void a(b bVar, long j, long j2) {
        this.g = bVar;
        this.h = j2;
        if (!this.f) {
            this.a.a((atm) this);
            if (j != -9223372036854775807L) {
                this.a.a(0, j);
            }
            this.f = true;
            return;
        }
        atk atk = this.a;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        atk.a(0, j);
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            ((a) this.e.valueAt(i2)).a(bVar, j2);
        }
    }
}

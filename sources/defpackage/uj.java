package defpackage;

import androidx.work.BackoffPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo.State;

/* renamed from: uj reason: default package */
public final class uj {
    public String a;
    public State b = State.ENQUEUED;
    public String c;
    public String d = OverwritingInputMerger.class.getName();
    public se e = se.a;
    public se f = se.a;
    public long g;
    public long h;
    public long i;
    public sc j = sc.a;
    public int k;
    public BackoffPolicy l = BackoffPolicy.EXPONENTIAL;
    public long m = 30000;
    public long n;
    public long o;
    public long p = -1;

    /* renamed from: uj$a */
    public static class a {
        public String a;
        public State b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b) {
                return false;
            }
            return this.a.equals(aVar.a);
        }

        public final int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    static {
        sg.a("WorkSpec");
        new Object() {
        };
    }

    public uj(String str, String str2) {
        this.a = str;
        this.c = str2;
    }

    public uj(uj ujVar) {
        this.a = ujVar.a;
        this.c = ujVar.c;
        this.b = ujVar.b;
        this.d = ujVar.d;
        this.e = new se(ujVar.e);
        this.f = new se(ujVar.f);
        this.g = ujVar.g;
        this.h = ujVar.h;
        this.i = ujVar.i;
        this.j = new sc(ujVar.j);
        this.k = ujVar.k;
        this.l = ujVar.l;
        this.m = ujVar.m;
        this.n = ujVar.n;
        this.o = ujVar.o;
        this.p = ujVar.p;
    }

    public final boolean a() {
        return this.h != 0;
    }

    public final boolean b() {
        return this.b == State.ENQUEUED && this.k > 0;
    }

    public final long c() {
        long j2;
        boolean z = false;
        if (b()) {
            if (this.l == BackoffPolicy.LINEAR) {
                z = true;
            }
            if (z) {
                j2 = this.m * ((long) this.k);
            } else {
                j2 = (long) Math.scalb((float) this.m, this.k - 1);
            }
            return this.n + Math.min(18000000, j2);
        }
        long j3 = 0;
        if (a()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = this.n;
            if (j4 == 0) {
                j4 = this.g + currentTimeMillis;
            }
            if (this.i != this.h) {
                z = true;
            }
            if (z) {
                if (this.n == 0) {
                    j3 = this.i * -1;
                }
                return j4 + this.h + j3;
            }
            if (this.n != 0) {
                j3 = this.h;
            }
            return j4 + j3;
        }
        long j5 = this.n;
        if (j5 == 0) {
            j5 = System.currentTimeMillis();
        }
        return j5 + this.g;
    }

    public final boolean d() {
        return !sc.a.equals(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            uj ujVar = (uj) obj;
            if (this.g != ujVar.g || this.h != ujVar.h || this.i != ujVar.i || this.k != ujVar.k || this.m != ujVar.m || this.n != ujVar.n || this.o != ujVar.o || this.p != ujVar.p || !this.a.equals(ujVar.a) || this.b != ujVar.b || !this.c.equals(ujVar.c)) {
                return false;
            }
            String str = this.d;
            if (str == null ? ujVar.d != null : !str.equals(ujVar.d)) {
                return false;
            }
            if (this.e.equals(ujVar.e) && this.f.equals(ujVar.f) && this.j.equals(ujVar.j) && this.l == ujVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        long j2 = this.g;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.i;
        int hashCode3 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.l.hashCode()) * 31;
        long j5 = this.m;
        int i4 = (hashCode3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.n;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.o;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.p;
        return i6 + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{WorkSpec: ");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}

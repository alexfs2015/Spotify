package defpackage;

import androidx.work.BackoffPolicy;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkInfo.State;

/* renamed from: ux reason: default package */
public final class ux {
    public String a;
    public State b = State.ENQUEUED;
    public String c;
    public String d = OverwritingInputMerger.class.getName();
    public ss e = ss.a;
    public ss f = ss.a;
    public long g;
    public long h;
    public long i;
    public sq j = sq.a;
    public int k;
    public BackoffPolicy l = BackoffPolicy.EXPONENTIAL;
    public long m = 30000;
    public long n;
    public long o;
    public long p = -1;

    /* renamed from: ux$a */
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
        su.a("WorkSpec");
        new Object() {
        };
    }

    public ux(String str, String str2) {
        this.a = str;
        this.c = str2;
    }

    public ux(ux uxVar) {
        this.a = uxVar.a;
        this.c = uxVar.c;
        this.b = uxVar.b;
        this.d = uxVar.d;
        this.e = new ss(uxVar.e);
        this.f = new ss(uxVar.f);
        this.g = uxVar.g;
        this.h = uxVar.h;
        this.i = uxVar.i;
        this.j = new sq(uxVar.j);
        this.k = uxVar.k;
        this.l = uxVar.l;
        this.m = uxVar.m;
        this.n = uxVar.n;
        this.o = uxVar.o;
        this.p = uxVar.p;
    }

    public final boolean a() {
        return this.h != 0;
    }

    public final boolean b() {
        return this.b == State.ENQUEUED && this.k > 0;
    }

    public final long c() {
        boolean z = false;
        if (b()) {
            if (this.l == BackoffPolicy.LINEAR) {
                z = true;
            }
            return this.n + Math.min(18000000, z ? this.m * ((long) this.k) : (long) Math.scalb((float) this.m, this.k - 1));
        }
        long j2 = 0;
        if (a()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.n;
            if (j3 == 0) {
                j3 = this.g + currentTimeMillis;
            }
            if (this.i != this.h) {
                z = true;
            }
            if (z) {
                if (this.n == 0) {
                    j2 = this.i * -1;
                }
                return j3 + this.h + j2;
            }
            if (this.n != 0) {
                j2 = this.h;
            }
            return j3 + j2;
        }
        long j4 = this.n;
        if (j4 == 0) {
            j4 = System.currentTimeMillis();
        }
        return j4 + this.g;
    }

    public final boolean d() {
        return !sq.a.equals(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ux uxVar = (ux) obj;
            if (this.g != uxVar.g || this.h != uxVar.h || this.i != uxVar.i || this.k != uxVar.k || this.m != uxVar.m || this.n != uxVar.n || this.o != uxVar.o || this.p != uxVar.p || !this.a.equals(uxVar.a) || this.b != uxVar.b || !this.c.equals(uxVar.c)) {
                return false;
            }
            String str = this.d;
            if (str == null ? uxVar.d != null : !str.equals(uxVar.d)) {
                return false;
            }
            if (this.e.equals(uxVar.e) && this.f.equals(uxVar.f) && this.j.equals(uxVar.j) && this.l == uxVar.l) {
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

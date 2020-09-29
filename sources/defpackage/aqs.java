package defpackage;

/* renamed from: aqs reason: default package */
public final class aqs {
    public static final aqs a = new aqs(0, 0);
    public static final aqs b = a;
    public final long c;
    public final long d;

    static {
        new aqs(Long.MAX_VALUE, Long.MAX_VALUE);
        new aqs(Long.MAX_VALUE, 0);
        new aqs(0, Long.MAX_VALUE);
    }

    public aqs(long j, long j2) {
        boolean z = true;
        bcu.a(j >= 0);
        if (j2 < 0) {
            z = false;
        }
        bcu.a(z);
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aqs aqs = (aqs) obj;
            return this.c == aqs.c && this.d == aqs.d;
        }
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }
}

package defpackage;

/* renamed from: ayk reason: default package */
public abstract class ayk extends ayc {
    public final long m;

    public abstract boolean g();

    public ayk(bbn bbn, bbp bbp, aqe aqe, int i, Object obj, long j, long j2, long j3) {
        super(bbn, bbp, 1, aqe, i, obj, j, j2);
        bcu.a(aqe);
        this.m = j3;
    }

    public long f() {
        long j = this.m;
        if (j != -1) {
            return j + 1;
        }
        return -1;
    }
}

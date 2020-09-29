package defpackage;

/* renamed from: azb reason: default package */
public abstract class azb extends ayt {
    public final long m;

    public azb(bce bce, bcg bcg, aqv aqv, int i, Object obj, long j, long j2, long j3) {
        super(bce, bcg, 1, aqv, i, obj, j, j2);
        bdl.a(aqv);
        this.m = j3;
    }

    public long f() {
        long j = this.m;
        if (j != -1) {
            return j + 1;
        }
        return -1;
    }

    public abstract boolean g();
}

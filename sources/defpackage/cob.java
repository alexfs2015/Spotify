package defpackage;

@cey
/* renamed from: cob reason: default package */
public final class cob {
    private long a;
    private long b = Long.MIN_VALUE;
    private Object c = new Object();

    public cob(long j) {
        this.a = j;
    }

    public final boolean a() {
        synchronized (this.c) {
            long b2 = bjl.l().b();
            if (this.b + this.a > b2) {
                return false;
            }
            this.b = b2;
            return true;
        }
    }
}

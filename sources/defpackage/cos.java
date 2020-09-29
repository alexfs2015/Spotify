package defpackage;

@cfp
/* renamed from: cos reason: default package */
public final class cos {
    private long a;
    private long b = Long.MIN_VALUE;
    private Object c = new Object();

    public cos(long j) {
        this.a = j;
    }

    public final boolean a() {
        synchronized (this.c) {
            long b2 = bkc.l().b();
            if (this.b + this.a > b2) {
                return false;
            }
            this.b = b2;
            return true;
        }
    }
}

package defpackage;

/* renamed from: cdb reason: default package */
final class cdb implements Runnable {
    private final /* synthetic */ ckz a;
    private final /* synthetic */ ccz b;

    cdb(ccz ccz, ckz ckz) {
        this.b = ccz;
        this.a = ckz;
    }

    public final void run() {
        synchronized (this.b.c) {
            ccz ccz = this.b;
            ccz.a.b(this.a);
        }
    }
}

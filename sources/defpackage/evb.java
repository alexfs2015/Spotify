package defpackage;

/* renamed from: evb reason: default package */
final class evb implements Runnable {
    private final /* synthetic */ euw a;

    evb(euw euw) {
        this.a = euw;
    }

    public final void run() {
        this.a.c.b = null;
        this.a.c.B();
    }
}

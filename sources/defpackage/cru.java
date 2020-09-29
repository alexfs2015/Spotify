package defpackage;

/* renamed from: cru reason: default package */
final /* synthetic */ class cru implements Runnable {
    private final crr a;

    private cru(crr crr) {
        this.a = crr;
    }

    static Runnable a(crr crr) {
        return new cru(crr);
    }

    public final void run() {
        this.a.b();
    }
}

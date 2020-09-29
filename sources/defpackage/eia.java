package defpackage;

/* renamed from: eia reason: default package */
final class eia implements Runnable {
    private final /* synthetic */ ehs a;
    private final /* synthetic */ ehl b;

    eia(ehs ehs, ehl ehl) {
        this.a = ehs;
        this.b = ehl;
    }

    public final void run() {
        ehs.a(this.a, this.b);
    }
}

package defpackage;

/* renamed from: cev reason: default package */
final class cev implements Runnable {
    private final /* synthetic */ cox a;
    private final /* synthetic */ String b;

    cev(cox cox, String str) {
        this.a = cox;
        this.b = str;
    }

    public final void run() {
        this.a.a(this.b);
    }
}

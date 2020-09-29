package defpackage;

/* renamed from: eae reason: default package */
final /* synthetic */ class eae implements Runnable {
    private final dzy a;
    private final String b;

    eae(dzy dzy, String str) {
        this.a = dzy;
        this.b = str;
    }

    public final void run() {
        dzy dzy = this.a;
        dzy.a.b(this.b);
    }
}

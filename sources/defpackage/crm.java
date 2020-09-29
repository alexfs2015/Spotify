package defpackage;

/* renamed from: crm reason: default package */
final class crm implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ crf c;

    crm(crf crf, int i, int i2) {
        this.c = crf;
        this.a = i;
        this.b = i2;
    }

    public final void run() {
        if (this.c.a != null) {
            this.c.a.a(this.a, this.b);
        }
    }
}

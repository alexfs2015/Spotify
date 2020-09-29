package defpackage;

/* renamed from: cqs reason: default package */
final class cqs implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ cqo c;

    cqs(cqo cqo, String str, String str2) {
        this.c = cqo;
        this.a = str;
        this.b = str2;
    }

    public final void run() {
        if (this.c.a != null) {
            this.c.a.a(this.a, this.b);
        }
    }
}

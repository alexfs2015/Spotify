package defpackage;

/* renamed from: crj reason: default package */
final class crj implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ crf c;

    crj(crf crf, String str, String str2) {
        this.c = crf;
        this.a = str;
        this.b = str2;
    }

    public final void run() {
        if (this.c.a != null) {
            this.c.a.a(this.a, this.b);
        }
    }
}

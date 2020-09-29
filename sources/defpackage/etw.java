package defpackage;

/* renamed from: etw reason: default package */
final class etw implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ long d;
    private final /* synthetic */ ett e;

    etw(ett ett, String str, String str2, Object obj, long j) {
        this.e = ett;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
    }

    public final void run() {
        this.e.a(this.a, this.b, this.c, this.d);
    }
}

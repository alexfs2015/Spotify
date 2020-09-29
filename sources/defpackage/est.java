package defpackage;

/* renamed from: est reason: default package */
final class est implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ long d;
    private final /* synthetic */ esa e;

    est(esa esa, String str, String str2, String str3, long j) {
        this.e = esa;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final void run() {
        String str = this.a;
        if (str == null) {
            this.e.a.b.h().a(this.b, null);
            return;
        }
        this.e.a.b.h().a(this.b, new eto(this.c, str, this.d));
    }
}

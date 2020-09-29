package defpackage;

/* renamed from: elr reason: default package */
final /* synthetic */ class elr implements elp {
    private final elq a;
    private final String b;

    elr(elq elq, String str) {
        this.a = elq;
        this.b = str;
    }

    public final Object a() {
        elq elq = this.a;
        return elh.a(elq.b.getContentResolver(), this.b);
    }
}

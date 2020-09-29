package defpackage;

/* renamed from: ehh reason: default package */
final class ehh implements Runnable {
    private final /* synthetic */ ehb a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;

    ehh(ehb ehb, String str, String str2) {
        this.a = ehb;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        e eVar;
        synchronized (this.a.q) {
            eVar = (e) this.a.q.get(this.b);
        }
        if (eVar != null) {
            eVar.a(this.a.o, this.c);
            return;
        }
        ehb.a.a("Discarded message for unknown namespace '%s'", this.b);
    }
}

package defpackage;

/* renamed from: rwb reason: default package */
public final class rwb implements a {
    private final rwa a;

    public final String c() {
        return "ColdStartCosmosLink";
    }

    public rwb(rwa rwa) {
        this.a = rwa;
    }

    public final void a() {
        this.a.a();
    }

    public final void b() {
        rwa rwa = this.a;
        rwa.a.b((gln) rwa);
        rwa.b.unsubscribe();
    }
}

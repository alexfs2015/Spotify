package defpackage;

/* renamed from: ghz reason: default package */
public final class ghz implements wly {
    private final String a;

    public ghz(String str) {
        this.a = str;
    }

    public final wmf a(a aVar) {
        a a2 = aVar.a().a();
        String str = this.a;
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(str);
        return aVar.a(a2.b("Authorization", sb.toString()).a());
    }
}

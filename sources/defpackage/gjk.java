package defpackage;

/* renamed from: gjk reason: default package */
public final class gjk implements xae {
    private final String a;

    public gjk(String str) {
        this.a = str;
    }

    public final xal a(a aVar) {
        a a2 = aVar.a().a();
        String str = this.a;
        StringBuilder sb = new StringBuilder("Bearer ");
        sb.append(str);
        return aVar.a(a2.b("Authorization", sb.toString()).a());
    }
}

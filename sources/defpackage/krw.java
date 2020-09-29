package defpackage;

/* renamed from: krw reason: default package */
public final class krw implements krv {
    private final jlr a;
    private final jtz b;

    public krw(jlr jlr, jtz jtz) {
        this.a = jlr;
        this.b = jtz;
    }

    private void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        be beVar = new be(null, "com.spotify.music.anchorfunnel", str3, str4, 0, "spotify:internal:anchorfunnel:yourlibrary", "user:impression", null, (double) this.b.a());
        this.a.a(beVar);
    }

    public final void a() {
        a("spotify:collection:podcasts:episodes", "your-library-anchor-link");
    }

    public final void b() {
        a("spotify:collection:podcasts:episodes", "your-library-anchor-emptystate");
    }

    public final void c() {
        a("spotify:collection:podcasts:following", "your-library-anchor-link");
    }

    public final void d() {
        a("spotify:collection:podcasts:following", "your-library-anchor-emptystate");
    }
}

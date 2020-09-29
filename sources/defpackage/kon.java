package defpackage;

/* renamed from: kon reason: default package */
public final class kon implements kom {
    private final jjf a;
    private final jrp b;

    public kon(jjf jjf, jrp jrp) {
        this.a = jjf;
        this.b = jrp;
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

    private void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        bf bfVar = new bf(null, "com.spotify.music.anchorfunnel", str3, str4, 0, "spotify:internal:anchorfunnel:yourlibrary", "user:impression", null, (double) this.b.a());
        this.a.a(bfVar);
    }
}

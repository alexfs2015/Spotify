package defpackage;

/* renamed from: pbn reason: default package */
public final class pbn implements pbm {
    private final String a;
    private final pbh b;

    public pbn(String str, pbh pbh) {
        this.a = str;
        this.b = pbh;
    }

    public final void a(String str) {
        this.b.a(str, "cover-art", "navigate-forward");
    }

    public final void b(String str) {
        this.b.a(str, "show-name", "navigate-forward");
    }

    public final void a() {
        this.b.a(this.a, "play-button", "play");
    }

    public final void b() {
        this.b.a(this.a, "play-button", "pause");
    }

    public final void c() {
        this.b.a("spotify:app:share-flow", "share-button", "navigate-forward");
    }

    public final void a(boolean z) {
        this.b.a(z);
    }

    public final void d() {
        this.b.a(this.a, "toolbar", "add-to-playlist");
    }

    public final void e() {
        this.b.a(this.a, "episode-description", "expand-description");
    }

    public final void c(String str) {
        this.b.a(str, "see-all-episodes", "navigate-forward");
    }

    public final void f() {
        this.b.a(this.a, "description-timestamp", "seek");
    }

    public final void g() {
        this.b.a(this.a, "description-web-link", "navigate-forward");
    }

    public final void d(String str) {
        this.b.a(str, "description-spotify-link", "navigate-forward");
    }

    public final void h() {
        this.b.a(this.a, "description-email", "navigate-forward");
    }

    public final void i() {
        this.b.a(this.a, "toolbar", "mark-as-played");
    }

    public final void j() {
        this.b.a(this.a, "toolbar", "mark-as-unplayed");
    }

    public final void k() {
        this.b.a(this.a, "toolbar", "add-to-queue");
    }

    public final void e(String str) {
        this.b.a(str, "toolbar", "navigate-forward");
    }
}

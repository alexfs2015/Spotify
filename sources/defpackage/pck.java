package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: pck reason: default package */
public final class pck implements pch {
    private final InteractionLogger a;
    private final a b;
    private final wbt c;

    public pck(owh owh, owk owk, wbt wbt, gkq gkq) {
        this.a = owh.a(gkq);
        this.b = new a(new owj(owk.a.toString()), 0);
        this.c = wbt;
    }

    public final void a() {
        this.a.a(null, "toolbar", 0, InteractionType.HIT, "menu-clicked");
        wbt wbt = this.c;
        b a2 = this.b.a();
        a a3 = owj.a(owj.this).a(a2.a);
        a3.e = "hit";
        a3.f = "ui_reveal";
        wbt.a(a3.a());
    }

    public final void a(String str) {
        String str2 = str;
        this.a.a(str2, "toolbar", 0, InteractionType.HIT, "add-songs-to-playlist");
        wbt wbt = this.c;
        C0068a aVar = new C0068a(this.b.a(), 0);
        a a2 = owj.a(owj.this).a(aVar.a);
        a2.e = "hit";
        a2.f = "ui_reveal";
        wbt.a(a2.a());
    }

    public final void a(String str, boolean z) {
        this.a.a(str, "toolbar", 0, InteractionType.HIT, z ? "like-disable" : "like-enable", z ? InteractionAction.UNLIKE : InteractionAction.LIKE);
        String str2 = "hit";
        if (z) {
            wbt wbt = this.c;
            f a2 = this.b.a().a();
            a a3 = owj.a(owj.this).a(a2.a);
            a3.e = str2;
            a3.f = "unlike";
            wbt.a(a3.a("item_to_be_unliked", str).a());
            return;
        }
        wbt wbt2 = this.c;
        f a4 = this.b.a().a();
        a a5 = owj.a(owj.this).a(a4.a);
        a5.e = str2;
        a5.f = "like";
        wbt2.a(a5.a("item_to_be_liked", str).a());
    }

    public final void b() {
        this.a.a(null, "toolbar", 0, InteractionType.HIT, "sort");
    }

    public final void b(String str) {
        String str2 = str;
        this.a.a(str2, "toolbar", 0, InteractionType.HIT, "edit-playlist");
        wbt wbt = this.c;
        e eVar = new e(this.b.a(), 0);
        a a2 = owj.a(owj.this).a(eVar.a);
        a2.e = "hit";
        a2.f = "ui_reveal";
        wbt.a(a2.a());
    }

    public final void b(String str, boolean z) {
        String str2 = str;
        this.a.a(str2, "toolbar", 0, InteractionType.HIT, z ? "collaborative-disable" : "collaborative-enable");
        String str3 = "hit";
        if (z) {
            wbt wbt = this.c;
            C0069b b2 = this.b.a().b();
            a a2 = owj.a(owj.this).a(b2.a);
            a2.e = str3;
            a2.f = "make_playlist_non_collaborative";
            wbt.a(a2.a("playlist_to_be_made_non_collaborative", str).a());
            return;
        }
        wbt wbt2 = this.c;
        C0069b b3 = this.b.a().b();
        a a3 = owj.a(owj.this).a(b3.a);
        a3.e = str3;
        a3.f = "make_playlist_collaborative";
        wbt2.a(a3.a("playlist_to_be_made_collaborative", str).a());
    }

    public final void c() {
        this.a.a(null, "toolbar", 0, InteractionType.HIT, "find");
    }

    public final void c(String str) {
        String str2 = str;
        this.a.a(str2, "toolbar", 0, InteractionType.HIT, "rename-playlist");
        wbt wbt = this.c;
        h hVar = new h(this.b.a(), 0);
        a a2 = owj.a(owj.this).a(hVar.a);
        a2.e = "hit";
        a2.f = "ui_reveal";
        wbt.a(a2.a());
    }

    public final void c(String str, boolean z) {
        String str2 = str;
        this.a.a(str2, "toolbar", 0, InteractionType.HIT, z ? "published-disable" : "published-enable");
        String str3 = "hit";
        if (z) {
            wbt wbt = this.c;
            g c2 = this.b.a().c();
            a a2 = owj.a(owj.this).a(c2.a);
            a2.e = str3;
            a2.f = "make_playlist_secret";
            wbt.a(a2.a("playlist_to_be_made_secret", str).a());
            return;
        }
        wbt wbt2 = this.c;
        g c3 = this.b.a().c();
        a a3 = owj.a(owj.this).a(c3.a);
        a3.e = str3;
        a3.f = "make_playlist_public";
        wbt2.a(a3.a("playlist_to_be_made_public", str).a());
    }

    public final void d() {
        this.a.a(null, "toolbar", 0, InteractionType.HIT, "back-navigation");
        wbt wbt = this.c;
        C0067a aVar = new C0067a(this.b, 0);
        a a2 = owj.a(owj.this).a(aVar.a);
        a2.e = "hit";
        a2.f = "ui_hide";
        wbt.a(a2.a());
    }

    public final void d(String str) {
        String str2 = str;
        this.a.a(str2, "toolbar", 0, InteractionType.HIT, "delete-playlist");
        wbt wbt = this.c;
        c e = this.b.a().e();
        a a2 = owj.a(owj.this).a(e.a);
        a2.e = "hit";
        a2.f = "ui_reveal";
        wbt.a(a2.a());
    }

    public final void d(String str, boolean z) {
        this.a.a(str, "download-toggle-toolbar-menu", 0, InteractionType.HIT, z ? "offline-enable" : "offline-disable");
        String str2 = "hit";
        if (z) {
            wbt wbt = this.c;
            d d = this.b.a().d();
            a a2 = owj.a(owj.this).a(d.a);
            a2.e = str2;
            a2.f = "download";
            wbt.a(a2.a("item_to_download", str).a());
            return;
        }
        wbt wbt2 = this.c;
        d d2 = this.b.a().d();
        a a3 = owj.a(owj.this).a(d2.a);
        a3.e = str2;
        a3.f = "remove_download";
        wbt2.a(a3.a("item_to_remove_from_downloads", str).a());
    }

    public final void e() {
        this.a.a(null, "toolbar", 0, InteractionType.HIT, "share");
    }

    public final void e(String str) {
        String str2 = str;
        this.a.a(str2, "delete-playlist-dialog", 0, InteractionType.HIT, "delete");
        wbt wbt = this.c;
        C0071b bVar = new C0071b(this.b.a().e(), 0);
        a a2 = owj.a(owj.this).a(bVar.a);
        a2.e = "hit";
        a2.f = "delete_playlist";
        wbt.a(a2.a("playlist_to_be_deleted", str).a());
    }

    public final void f(String str) {
        String str2 = str;
        this.a.a(str2, "delete-playlist-dialog", 0, InteractionType.HIT, "cancel");
        wbt wbt = this.c;
        C0070a aVar = new C0070a(this.b.a().e(), 0);
        a a2 = owj.a(owj.this).a(aVar.a);
        a2.e = "hit";
        a2.f = "ui_hide";
        wbt.a(a2.a());
    }
}

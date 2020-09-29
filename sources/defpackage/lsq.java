package defpackage;

import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;

/* renamed from: lsq reason: default package */
public final class lsq implements lse {
    public final lsk a;
    private final szp b;
    private final lso c;
    private final lsh d;

    public lsq(lsk lsk, szp szp, lso lso, lsh lsh) {
        this.a = (lsk) fbp.a(lsk);
        this.b = (szp) fbp.a(szp);
        this.c = (lso) fbp.a(lso);
        this.d = (lsh) fbp.a(lsh);
    }

    public final void a(String str) {
        this.d.a(str, ContextMenuEvent.START_RADIO);
        this.c.b(str);
    }

    public final void a(String str, String str2) {
        this.d.a(str, ContextMenuEvent.BROWSE_ARTIST);
        this.b.a(szk.a(str).b(str2).a());
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.d.a(str, ContextMenuEvent.ADD_TO_PLAYLIST);
        this.c.a(str, str4, str);
    }

    public final void a(String str, String str2, String str3, sso sso) {
        this.d.a(str, ContextMenuEvent.INSTALL_SHORTCUT);
        this.c.a(str, str2, str3, sso);
    }

    public final void b(String str) {
        this.d.a(str, ContextMenuEvent.ADD_TO_QUEUE);
        this.c.a(str);
    }

    public final void b(String str, String str2, String str3, String str4) {
        this.d.a(str, ContextMenuEvent.SHARE);
        this.c.a(str, str2, str3, str4);
    }
}

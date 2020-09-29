package defpackage;

import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;

/* renamed from: loq reason: default package */
public final class loq implements loe {
    public final lok a;
    private final spi b;
    private final loo c;
    private final loh d;

    public loq(lok lok, spi spi, loo loo, loh loh) {
        this.a = (lok) fay.a(lok);
        this.b = (spi) fay.a(spi);
        this.c = (loo) fay.a(loo);
        this.d = (loh) fay.a(loh);
    }

    public final void a(String str, String str2) {
        this.d.a(str, ContextMenuEvent.BROWSE_ARTIST);
        this.b.a(spd.a(str).b(str2).a());
    }

    public final void a(String str, String str2, String str3, String str4) {
        this.d.a(str, ContextMenuEvent.ADD_TO_PLAYLIST);
        this.c.a(str, str4, str);
    }

    public final void a(String str) {
        this.d.a(str, ContextMenuEvent.START_RADIO);
        this.c.b(str);
    }

    public final void b(String str) {
        this.d.a(str, ContextMenuEvent.ADD_TO_QUEUE);
        this.c.a(str);
    }

    public final void b(String str, String str2, String str3, String str4) {
        this.d.a(str, ContextMenuEvent.SHARE);
        this.c.a(str, str2, str3, str4);
    }

    public final void a(String str, String str2, String str3, sih sih) {
        this.d.a(str, ContextMenuEvent.INSTALL_SHORTCUT);
        this.c.a(str, str2, str3, sih);
    }
}

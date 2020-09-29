package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.music.R;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: meg reason: default package */
public final class meg {
    private final spi a;
    private final mee b;

    public meg(spi spi, mee mee) {
        this.a = spi;
        this.b = mee;
    }

    public final void a(fyt fyt, String str) {
        fyt.a((int) R.id.options_menu_browse_artist, (int) R.string.options_menu_browse_artist, fzf.a(fyt.a(), SpotifyIconV2.BROWSE)).a(new $$Lambda$meg$i2vNXN4E1IQm3ocCBwXbd57VzLc(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        String str2 = "toolbar-menu";
        String str3 = str;
        this.b.a.a(str3, str2, -1, InteractionType.HIT, ContextMenuEvent.BROWSE_ARTIST.toString());
        this.a.a(str);
    }
}

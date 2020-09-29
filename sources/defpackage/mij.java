package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.music.R;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: mij reason: default package */
public final class mij {
    private final szp a;
    private final mih b;

    public mij(szp szp, mih mih) {
        this.a = szp;
        this.b = mih;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        String str2 = "toolbar-menu";
        String str3 = str;
        this.b.a.a(str3, str2, -1, InteractionType.HIT, ContextMenuEvent.BROWSE_ARTIST.toString());
        this.a.a(str);
    }

    public final void a(fzn fzn, String str) {
        fzn.a((int) R.id.options_menu_browse_artist, (int) R.string.options_menu_browse_artist, fzz.a(fzn.a(), SpotifyIconV2.BROWSE)).a(new $$Lambda$mij$Kf5Bop0eTIOV25tNwOx5lIKUJ7E(this, str));
    }
}

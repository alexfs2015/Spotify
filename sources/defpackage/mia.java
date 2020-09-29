package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.music.R;

/* renamed from: mia reason: default package */
public final class mia {
    private final szp a;
    private final itb b;
    private final mhy c;

    public mia(szp szp, itb itb, mhy mhy) {
        this.a = szp;
        this.b = itb;
        this.c = mhy;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ContextMenuEvent contextMenuEvent, String str) {
        this.c.a(contextMenuEvent, str);
        this.a.a(str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.c.a(ContextMenuEvent.ADD_TO_QUEUE, str);
        this.b.a(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(fzn fzn, int i, int i2, ContextMenuEvent contextMenuEvent, String str) {
        fzn.a(i, i2, fzz.a(fzn.a(), SpotifyIconV2.BROWSE)).a(new $$Lambda$mia$KdJKaFtXugwcfsnVHsxzyciWfUk(this, contextMenuEvent, str));
    }

    public final void a(fzn fzn, String str) {
        fzn.a((int) R.id.options_menu_queue_item, (int) R.string.context_menu_add_to_queue, fzz.a(fzn.a(), SpotifyIconV2.QUEUE)).a(new $$Lambda$mia$paal54PZEBnhlzc1E1_fdL8low(this, str));
    }
}

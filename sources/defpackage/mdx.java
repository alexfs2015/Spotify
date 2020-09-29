package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.music.R;

/* renamed from: mdx reason: default package */
public final class mdx {
    private final spi a;
    private final iqo b;
    private final mdv c;

    public mdx(spi spi, iqo iqo, mdv mdv) {
        this.a = spi;
        this.b = iqo;
        this.c = mdv;
    }

    public final void a(fyt fyt, String str) {
        fyt.a((int) R.id.options_menu_queue_item, (int) R.string.context_menu_add_to_queue, fzf.a(fyt.a(), SpotifyIconV2.QUEUE)).a(new $$Lambda$mdx$oixF5iHRW2ycgNqBD3q_cJWxhkk(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.c.a(ContextMenuEvent.ADD_TO_QUEUE, str);
        this.b.a(str);
    }

    /* access modifiers changed from: 0000 */
    public void a(fyt fyt, int i, int i2, ContextMenuEvent contextMenuEvent, String str) {
        fyt.a(i, i2, fzf.a(fyt.a(), SpotifyIconV2.BROWSE)).a(new $$Lambda$mdx$s7BBmeqRetmpyNJu0N6_hM1rIpk(this, contextMenuEvent, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ContextMenuEvent contextMenuEvent, String str) {
        this.c.a(contextMenuEvent, str);
        this.a.a(str);
    }
}

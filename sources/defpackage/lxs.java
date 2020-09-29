package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: lxs reason: default package */
public final class lxs implements spt {
    private final twu a;
    private final spi b;
    private final saj c;

    public lxs(twu twu, spi spi, saj saj) {
        this.a = twu;
        this.b = spi;
        this.c = saj;
    }

    public final void a(sps sps) {
        $$Lambda$lxs$RzPf61wPVujJ5f_lpHWYXuI6Gt4 r0 = $$Lambda$lxs$RzPf61wPVujJ5f_lpHWYXuI6Gt4.INSTANCE;
        String str = "Page presenting the top level find content as an entry point to search and genres.";
        sps.a(LinkType.FIND, str, (spa) r0);
        sps.a(LinkType.BROWSE_ROOT, str, (spa) r0);
        sps.a(LinkType.BROWSE_GENRES, "Page presenting a browse genre.", (spa) r0);
        sps.a(LinkType.SPECIAL, "Page presenting special content in the scope of browse.", (spa) r0);
        sps.a("android.intent.action.SEARCH", "Open Find if NPT is enabled or Search if not.", (wup<Intent, fpt, SessionState>) new $$Lambda$lxs$9XuF5JezmVl4Qe0lcKBJTxYORm0<Intent,fpt,SessionState>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, fpt fpt, SessionState sessionState) {
        if (twu.a(fpt)) {
            this.b.a(ViewUris.af.toString());
            return;
        }
        this.c.a(sak.a(intent.getStringExtra("query")).toString());
    }
}

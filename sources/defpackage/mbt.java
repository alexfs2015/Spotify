package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mbt reason: default package */
public final class mbt implements taa {
    private final uix a;
    private final szp b;
    private final skq c;

    public mbt(uix uix, szp szp, skq skq) {
        this.a = uix;
        this.b = szp;
        this.c = skq;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Intent intent, fqn fqn, SessionState sessionState) {
        if (uix.a(fqn)) {
            this.b.a(ViewUris.ae.toString());
            return;
        }
        this.c.a(skr.a(intent.getStringExtra("query")).toString());
    }

    public final void a(szz szz) {
        $$Lambda$mbt$_0KmeL99k27pHlzmNhApc6HJMBY r0 = $$Lambda$mbt$_0KmeL99k27pHlzmNhApc6HJMBY.INSTANCE;
        String str = "Page presenting the top level find content as an entry point to search and genres.";
        szz.a(LinkType.FIND, str, (szh) r0);
        szz.a(LinkType.BROWSE_ROOT, str, (szh) r0);
        szz.a(LinkType.BROWSE_GENRES, "Page presenting a browse genre.", (szh) r0);
        szz.a(LinkType.SPECIAL, "Page presenting special content in the scope of browse.", (szh) r0);
        szz.a("android.intent.action.SEARCH", "Open Find if NPT is enabled or Search if not.", (xiu<Intent, fqn, SessionState>) new $$Lambda$mbt$XRJdOHeCuXuoDWGflN425kHCZ2U<Intent,fqn,SessionState>(this));
    }
}

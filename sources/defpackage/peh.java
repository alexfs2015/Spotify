package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper.ItemType;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: peh reason: default package */
public final class peh {
    public fzn a;
    private final utg b;
    private final ToolbarMenuHelper c;
    private final fzt d;
    private final izh e;
    private final sso f;
    private final fqn g;
    private final tye h;
    private final boolean i;

    public peh(utg utg, ToolbarMenuHelper toolbarMenuHelper, fzt fzt, izh izh, sso sso, fqn fqn, tye tye, boolean z) {
        this.b = utg;
        this.c = toolbarMenuHelper;
        this.d = fzt;
        this.e = izh;
        this.f = sso;
        this.g = fqn;
        this.h = tye;
        this.i = z;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(pfy pfy) {
        this.e.a(pfy.b(), pfy.a(), (String) null, pfy.c(), "", (String) null, jqg.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(pfy pfy) {
        this.h.a(pfy.b(), pfy.f());
    }

    /* access modifiers changed from: 0000 */
    public void a(fzn fzn, pfy pfy) {
        this.d.a(fzn, new $$Lambda$peh$X2p8zltNjUeI2WiZgoRQ8FJbdVs(this, pfy));
    }

    public void a(fzn fzn, pfy pfy, boolean z) {
        fzn.a(utg.a(pfy.a(), pfy.b(), true), SpotifyIconV2.PODCASTS, false, true);
        fzn.b(pfy.c());
        fzn.c(pfy.d());
        if (z) {
            fzn.a(pfy.e());
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(fzn fzn, pfy pfy, boolean z) {
        if (this.i) {
            this.c.a(fzn, this.f, pfy.f(), false, pfy.b(), ItemType.AUDIO_PODCAST, this.g);
            this.d.c(fzn, pfy.f(), new $$Lambda$peh$TwXaGfr9_mDIxa2iXBUdXVTMH90(this, pfy));
        }
    }
}

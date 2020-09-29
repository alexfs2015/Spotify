package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarMenuHelper.ItemType;
import com.spotify.android.paste.graphics.SpotifyIconV2;

/* renamed from: owu reason: default package */
public final class owu {
    public fyt a;
    private final uhs b;
    private final ToolbarMenuHelper c;
    private final fyz d;
    private final iww e;
    private final sih f;
    private final fpt g;
    private final tmj h;
    private final boolean i;

    public owu(uhs uhs, ToolbarMenuHelper toolbarMenuHelper, fyz fyz, iww iww, sih sih, fpt fpt, tmj tmj, boolean z) {
        this.b = uhs;
        this.c = toolbarMenuHelper;
        this.d = fyz;
        this.e = iww;
        this.f = sih;
        this.g = fpt;
        this.h = tmj;
        this.i = z;
    }

    public void a(fyt fyt, oym oym, boolean z) {
        fyt.a(uhs.a(oym.a(), oym.b(), true), SpotifyIconV2.PODCASTS, false, true);
        fyt.b(oym.c());
        fyt.c(oym.d());
        if (z) {
            fyt.a(oym.e());
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(fyt fyt, oym oym, boolean z) {
        if (this.i) {
            this.c.a(fyt, this.f, oym.f(), false, oym.b(), ItemType.AUDIO_PODCAST, this.g);
            this.d.c(fyt, oym.f(), new $$Lambda$owu$ecYA5g00h7M9Yblv68mFCXIwTDo(this, oym));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(oym oym) {
        this.h.a(oym.b(), oym.f());
    }

    /* access modifiers changed from: 0000 */
    public void a(fyt fyt, oym oym) {
        this.d.a(fyt, new $$Lambda$owu$1UCN8ujXRNaMOXl2YmH_FeHgM(this, oym));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(oym oym) {
        this.e.a(oym.b(), oym.a(), (String) null, oym.c(), "", (String) null, jnu.a);
    }
}

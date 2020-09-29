package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: mnv reason: default package */
public final class mnv {
    private final Context a;
    private final mnr b;
    private final jlr c;
    private final jtz d;
    private final String e;

    public mnv(mnr mnr, Context context, jlr jlr, jtz jtz, String str) {
        this.a = context;
        this.b = mnr;
        this.c = jlr;
        this.d = jtz;
        this.e = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vlc vlc) {
        this.b.a(vlc.getUri());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(vlc vlc, fzn fzn) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(vlc vlc, fzn fzn) {
        Resources resources = this.a.getResources();
        String string = this.a.getString(R.string.refresh_copy);
        fzn.a(R.id.actionbar_item_refresh, string).a((Drawable) new SpotifyIconDrawable(this.a, SpotifyIconV2.OFFLINE_SYNC, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size))).a((Runnable) new $$Lambda$mnv$6lRiWHwtCMaFRz40z2X7EGflRxU(this, vlc));
    }

    public final a a(fqn fqn) {
        if (!mno.d(fqn)) {
            return $$Lambda$mnv$vCy4oPz1ZJqeZozvBh6EZ96exCk.INSTANCE;
        }
        jlr jlr = this.c;
        be beVar = new be(null, "daily-mix-hub", this.e, null, 0, null, null, "toolbar", (double) this.d.a());
        jlr.a(beVar);
        return new $$Lambda$mnv$BiPljR_EPtVnSPAH2MLhJSBbk7E(this);
    }
}

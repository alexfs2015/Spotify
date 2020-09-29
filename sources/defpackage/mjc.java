package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;

/* renamed from: mjc reason: default package */
public final class mjc {
    private final Context a;
    private final miy b;
    private final jjf c;
    private final jrp d;
    private final String e;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(uyz uyz, fyt fyt) {
    }

    public mjc(miy miy, Context context, jjf jjf, jrp jrp, String str) {
        this.a = context;
        this.b = miy;
        this.c = jjf;
        this.d = jrp;
        this.e = str;
    }

    public final a a(fpt fpt) {
        if (!miv.d(fpt)) {
            return $$Lambda$mjc$024FRajxdJZUeEYlisqNXTN2_s.INSTANCE;
        }
        jjf jjf = this.c;
        bf bfVar = new bf(null, "daily-mix-hub", this.e, null, 0, null, null, "toolbar", (double) this.d.a());
        jjf.a(bfVar);
        return new $$Lambda$mjc$QjGvmLcM7MZJd5F96Cjc291cV_0(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(uyz uyz, fyt fyt) {
        Resources resources = this.a.getResources();
        String string = this.a.getString(R.string.refresh_copy);
        fyt.a(R.id.actionbar_item_refresh, string).a((Drawable) new SpotifyIconDrawable(this.a, SpotifyIconV2.OFFLINE_SYNC, (float) resources.getDimensionPixelSize(R.dimen.toolbar_icon_size))).a((Runnable) new $$Lambda$mjc$YrD5_CTkYbyWsDGLevWRbBb5GE4(this, uyz));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uyz uyz) {
        this.b.a(uyz.getUri());
    }
}

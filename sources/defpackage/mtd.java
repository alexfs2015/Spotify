package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: mtd reason: default package */
public final class mtd implements vua<rfs> {
    private final wlc<Context> a;
    private final wlc<fpt> b;
    private final wlc<Boolean> c;
    private final wlc<msm> d;

    private mtd(wlc<Context> wlc, wlc<fpt> wlc2, wlc<Boolean> wlc3, wlc<msm> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mtd a(wlc<Context> wlc, wlc<fpt> wlc2, wlc<Boolean> wlc3, wlc<msm> wlc4) {
        return new mtd(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        fpt fpt = (fpt) this.b.get();
        boolean booleanValue = ((Boolean) this.c.get()).booleanValue();
        msm msm = (msm) this.d.get();
        return (rfs) vuf.a(rfs.o().a(context.getString(R.string.album_title_default)).a(SpotifyIconV2.ALBUM).c(true).e(booleanValue).d(booleanValue).k(booleanValue).g(booleanValue || fpt.b(ufx.g)).i(true).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

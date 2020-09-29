package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: mwz reason: default package */
public final class mwz implements vua<rfs> {
    private final wlc<fpt> a;
    private final wlc<Context> b;
    private final wlc<Boolean> c;
    private final wlc<mwg> d;

    private mwz(wlc<fpt> wlc, wlc<Context> wlc2, wlc<Boolean> wlc3, wlc<mwg> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mwz a(wlc<fpt> wlc, wlc<Context> wlc2, wlc<Boolean> wlc3, wlc<mwg> wlc4) {
        return new mwz(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        fpt fpt = (fpt) this.a.get();
        mwg mwg = (mwg) this.d.get();
        return (rfs) vuf.a(rfs.o().a(((Context) this.b.get()).getString(R.string.artist_default_title)).a(SpotifyIconV2.ARTIST).a(true).b(true).g(((Boolean) this.c.get()).booleanValue() || fpt.b(ufx.g)).h(true).j(ruy.b(fpt)).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

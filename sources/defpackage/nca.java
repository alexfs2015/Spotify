package defpackage;

import android.content.Context;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;

/* renamed from: nca reason: default package */
public final class nca implements wig<rou> {
    private final wzi<fqn> a;
    private final wzi<Context> b;
    private final wzi<Boolean> c;
    private final wzi<nbh> d;

    private nca(wzi<fqn> wzi, wzi<Context> wzi2, wzi<Boolean> wzi3, wzi<nbh> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static nca a(wzi<fqn> wzi, wzi<Context> wzi2, wzi<Boolean> wzi3, wzi<nbh> wzi4) {
        return new nca(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        fqn fqn = (fqn) this.a.get();
        nbh nbh = (nbh) this.d.get();
        return (rou) wil.a(rou.o().a(((Context) this.b.get()).getString(R.string.artist_default_title)).a(SpotifyIconV2.ARTIST).a(true).b(true).g(((Boolean) this.c.get()).booleanValue() || fqn.b(url.g)).h(true).j(sei.b(fqn)).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.mediasession.SpotifyRemoteControlClient;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;

/* renamed from: sef reason: default package */
public final class sef implements wig<SpotifyRemoteControlClient> {
    private final wzi<Context> a;
    private final wzi<SpSharedPreferences<Object>> b;
    private final wzi<sed> c;
    private final wzi<Picasso> d;
    private final wzi<xil> e;
    private final wzi<Flowable<PlayerState>> f;
    private final wzi<jtz> g;

    private sef(wzi<Context> wzi, wzi<SpSharedPreferences<Object>> wzi2, wzi<sed> wzi3, wzi<Picasso> wzi4, wzi<xil> wzi5, wzi<Flowable<PlayerState>> wzi6, wzi<jtz> wzi7) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
    }

    public static sef a(wzi<Context> wzi, wzi<SpSharedPreferences<Object>> wzi2, wzi<sed> wzi3, wzi<Picasso> wzi4, wzi<xil> wzi5, wzi<Flowable<PlayerState>> wzi6, wzi<jtz> wzi7) {
        sef sef = new sef(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7);
        return sef;
    }

    public final /* synthetic */ Object get() {
        SpotifyRemoteControlClient spotifyRemoteControlClient = new SpotifyRemoteControlClient((Context) this.a.get(), (SpSharedPreferences) this.b.get(), (sed) this.c.get(), (Picasso) this.d.get(), (xil) this.e.get(), (Flowable) this.f.get(), (jtz) this.g.get());
        return spotifyRemoteControlClient;
    }
}

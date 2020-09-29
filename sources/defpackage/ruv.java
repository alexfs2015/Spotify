package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.mediasession.SpotifyRemoteControlClient;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;

/* renamed from: ruv reason: default package */
public final class ruv implements vua<SpotifyRemoteControlClient> {
    private final wlc<Context> a;
    private final wlc<SpSharedPreferences<Object>> b;
    private final wlc<rut> c;
    private final wlc<Picasso> d;
    private final wlc<wug> e;
    private final wlc<Flowable<PlayerState>> f;
    private final wlc<jrp> g;

    private ruv(wlc<Context> wlc, wlc<SpSharedPreferences<Object>> wlc2, wlc<rut> wlc3, wlc<Picasso> wlc4, wlc<wug> wlc5, wlc<Flowable<PlayerState>> wlc6, wlc<jrp> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static ruv a(wlc<Context> wlc, wlc<SpSharedPreferences<Object>> wlc2, wlc<rut> wlc3, wlc<Picasso> wlc4, wlc<wug> wlc5, wlc<Flowable<PlayerState>> wlc6, wlc<jrp> wlc7) {
        ruv ruv = new ruv(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return ruv;
    }

    public final /* synthetic */ Object get() {
        SpotifyRemoteControlClient spotifyRemoteControlClient = new SpotifyRemoteControlClient((Context) this.a.get(), (SpSharedPreferences) this.b.get(), (rut) this.c.get(), (Picasso) this.d.get(), (wug) this.e.get(), (Flowable) this.f.get(), (jrp) this.g.get());
        return spotifyRemoteControlClient;
    }
}

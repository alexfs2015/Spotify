package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.Scheduler;

/* renamed from: hcl reason: default package */
public final class hcl implements vua<hck> {
    private final wlc<Context> a;
    private final wlc<fpt> b;
    private final wlc<String> c;
    private final wlc<Integer> d;
    private final wlc<SpotifyIconDrawable> e;
    private final wlc<ObjectAnimator> f;
    private final wlc<ObjectMapper> g;
    private final wlc<Player> h;
    private final wlc<hcf> i;
    private final wlc<Boolean> j;
    private final wlc<SpSharedPreferences<Object>> k;
    private final wlc<hcd> l;
    private final wlc<fsc> m;
    private final wlc<Scheduler> n;
    private final wlc<lkn> o;
    private final wlc<uxh> p;
    private final wlc<hch> q;
    private final wlc<jsz> r;

    private hcl(wlc<Context> wlc, wlc<fpt> wlc2, wlc<String> wlc3, wlc<Integer> wlc4, wlc<SpotifyIconDrawable> wlc5, wlc<ObjectAnimator> wlc6, wlc<ObjectMapper> wlc7, wlc<Player> wlc8, wlc<hcf> wlc9, wlc<Boolean> wlc10, wlc<SpSharedPreferences<Object>> wlc11, wlc<hcd> wlc12, wlc<fsc> wlc13, wlc<Scheduler> wlc14, wlc<lkn> wlc15, wlc<uxh> wlc16, wlc<hch> wlc17, wlc<jsz> wlc18) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
        this.k = wlc11;
        this.l = wlc12;
        this.m = wlc13;
        this.n = wlc14;
        this.o = wlc15;
        this.p = wlc16;
        this.q = wlc17;
        this.r = wlc18;
    }

    public static hcl a(wlc<Context> wlc, wlc<fpt> wlc2, wlc<String> wlc3, wlc<Integer> wlc4, wlc<SpotifyIconDrawable> wlc5, wlc<ObjectAnimator> wlc6, wlc<ObjectMapper> wlc7, wlc<Player> wlc8, wlc<hcf> wlc9, wlc<Boolean> wlc10, wlc<SpSharedPreferences<Object>> wlc11, wlc<hcd> wlc12, wlc<fsc> wlc13, wlc<Scheduler> wlc14, wlc<lkn> wlc15, wlc<uxh> wlc16, wlc<hch> wlc17, wlc<jsz> wlc18) {
        hcl hcl = new hcl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13, wlc14, wlc15, wlc16, wlc17, wlc18);
        return hcl;
    }

    public final /* synthetic */ Object get() {
        hck hck = new hck(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        return hck;
    }
}

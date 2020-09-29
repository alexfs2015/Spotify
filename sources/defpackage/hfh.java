package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.Scheduler;

/* renamed from: hfh reason: default package */
public final class hfh implements wig<hfg> {
    private final wzi<Context> a;
    private final wzi<fqn> b;
    private final wzi<String> c;
    private final wzi<Integer> d;
    private final wzi<SpotifyIconDrawable> e;
    private final wzi<ObjectAnimator> f;
    private final wzi<ObjectMapper> g;
    private final wzi<Player> h;
    private final wzi<hfb> i;
    private final wzi<Boolean> j;
    private final wzi<SpSharedPreferences<Object>> k;
    private final wzi<hez> l;
    private final wzi<fsw> m;
    private final wzi<Scheduler> n;
    private final wzi<lon> o;
    private final wzi<vjj> p;
    private final wzi<hfd> q;
    private final wzi<jvf> r;

    private hfh(wzi<Context> wzi, wzi<fqn> wzi2, wzi<String> wzi3, wzi<Integer> wzi4, wzi<SpotifyIconDrawable> wzi5, wzi<ObjectAnimator> wzi6, wzi<ObjectMapper> wzi7, wzi<Player> wzi8, wzi<hfb> wzi9, wzi<Boolean> wzi10, wzi<SpSharedPreferences<Object>> wzi11, wzi<hez> wzi12, wzi<fsw> wzi13, wzi<Scheduler> wzi14, wzi<lon> wzi15, wzi<vjj> wzi16, wzi<hfd> wzi17, wzi<jvf> wzi18) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
        this.i = wzi9;
        this.j = wzi10;
        this.k = wzi11;
        this.l = wzi12;
        this.m = wzi13;
        this.n = wzi14;
        this.o = wzi15;
        this.p = wzi16;
        this.q = wzi17;
        this.r = wzi18;
    }

    public static hfh a(wzi<Context> wzi, wzi<fqn> wzi2, wzi<String> wzi3, wzi<Integer> wzi4, wzi<SpotifyIconDrawable> wzi5, wzi<ObjectAnimator> wzi6, wzi<ObjectMapper> wzi7, wzi<Player> wzi8, wzi<hfb> wzi9, wzi<Boolean> wzi10, wzi<SpSharedPreferences<Object>> wzi11, wzi<hez> wzi12, wzi<fsw> wzi13, wzi<Scheduler> wzi14, wzi<lon> wzi15, wzi<vjj> wzi16, wzi<hfd> wzi17, wzi<jvf> wzi18) {
        hfh hfh = new hfh(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8, wzi9, wzi10, wzi11, wzi12, wzi13, wzi14, wzi15, wzi16, wzi17, wzi18);
        return hfh;
    }

    public final /* synthetic */ Object get() {
        hfg hfg = new hfg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        return hfg;
    }
}

package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.Scheduler;

/* renamed from: hfg reason: default package */
public final class hfg {
    public final wzi<Context> a;
    public final wzi<fqn> b;
    public final wzi<String> c;
    public final wzi<Integer> d;
    public final wzi<SpotifyIconDrawable> e;
    public final wzi<ObjectAnimator> f;
    public final wzi<ObjectMapper> g;
    public final wzi<Player> h;
    public final wzi<hfb> i;
    public final wzi<Boolean> j;
    public final wzi<SpSharedPreferences<Object>> k;
    public final wzi<hez> l;
    public final wzi<fsw> m;
    public final wzi<Scheduler> n;
    public final wzi<lon> o;
    public final wzi<vjj> p;
    public final wzi<hfd> q;
    public final wzi<jvf> r;

    public hfg(wzi<Context> wzi, wzi<fqn> wzi2, wzi<String> wzi3, wzi<Integer> wzi4, wzi<SpotifyIconDrawable> wzi5, wzi<ObjectAnimator> wzi6, wzi<ObjectMapper> wzi7, wzi<Player> wzi8, wzi<hfb> wzi9, wzi<Boolean> wzi10, wzi<SpSharedPreferences<Object>> wzi11, wzi<hez> wzi12, wzi<fsw> wzi13, wzi<Scheduler> wzi14, wzi<lon> wzi15, wzi<vjj> wzi16, wzi<hfd> wzi17, wzi<jvf> wzi18) {
        wzi<Context> wzi19 = wzi;
        this.a = (wzi) a(wzi, 1);
        wzi<fqn> wzi20 = wzi2;
        this.b = (wzi) a(wzi2, 2);
        wzi<String> wzi21 = wzi3;
        this.c = (wzi) a(wzi3, 3);
        wzi<Integer> wzi22 = wzi4;
        this.d = (wzi) a(wzi4, 4);
        wzi<SpotifyIconDrawable> wzi23 = wzi5;
        this.e = (wzi) a(wzi5, 5);
        wzi<ObjectAnimator> wzi24 = wzi6;
        this.f = (wzi) a(wzi6, 6);
        wzi<ObjectMapper> wzi25 = wzi7;
        this.g = (wzi) a(wzi7, 7);
        wzi<Player> wzi26 = wzi8;
        this.h = (wzi) a(wzi8, 8);
        wzi<hfb> wzi27 = wzi9;
        this.i = (wzi) a(wzi9, 9);
        wzi<Boolean> wzi28 = wzi10;
        this.j = (wzi) a(wzi10, 10);
        wzi<SpSharedPreferences<Object>> wzi29 = wzi11;
        this.k = (wzi) a(wzi11, 11);
        wzi<hez> wzi30 = wzi12;
        this.l = (wzi) a(wzi12, 12);
        this.m = (wzi) a(wzi13, 13);
        this.n = (wzi) a(wzi14, 14);
        this.o = (wzi) a(wzi15, 15);
        this.p = (wzi) a(wzi16, 16);
        this.q = (wzi) a(wzi17, 17);
        this.r = (wzi) a(wzi18, 18);
    }

    public static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}

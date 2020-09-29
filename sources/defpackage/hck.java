package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.paste.spotifyicon.SpotifyIconDrawable;
import io.reactivex.Scheduler;

/* renamed from: hck reason: default package */
public final class hck {
    public final wlc<Context> a;
    public final wlc<fpt> b;
    public final wlc<String> c;
    public final wlc<Integer> d;
    public final wlc<SpotifyIconDrawable> e;
    public final wlc<ObjectAnimator> f;
    public final wlc<ObjectMapper> g;
    public final wlc<Player> h;
    public final wlc<hcf> i;
    public final wlc<Boolean> j;
    public final wlc<SpSharedPreferences<Object>> k;
    public final wlc<hcd> l;
    public final wlc<fsc> m;
    public final wlc<Scheduler> n;
    public final wlc<lkn> o;
    public final wlc<uxh> p;
    public final wlc<hch> q;
    public final wlc<jsz> r;

    public hck(wlc<Context> wlc, wlc<fpt> wlc2, wlc<String> wlc3, wlc<Integer> wlc4, wlc<SpotifyIconDrawable> wlc5, wlc<ObjectAnimator> wlc6, wlc<ObjectMapper> wlc7, wlc<Player> wlc8, wlc<hcf> wlc9, wlc<Boolean> wlc10, wlc<SpSharedPreferences<Object>> wlc11, wlc<hcd> wlc12, wlc<fsc> wlc13, wlc<Scheduler> wlc14, wlc<lkn> wlc15, wlc<uxh> wlc16, wlc<hch> wlc17, wlc<jsz> wlc18) {
        wlc<Context> wlc19 = wlc;
        this.a = (wlc) a(wlc, 1);
        wlc<fpt> wlc20 = wlc2;
        this.b = (wlc) a(wlc2, 2);
        wlc<String> wlc21 = wlc3;
        this.c = (wlc) a(wlc3, 3);
        wlc<Integer> wlc22 = wlc4;
        this.d = (wlc) a(wlc4, 4);
        wlc<SpotifyIconDrawable> wlc23 = wlc5;
        this.e = (wlc) a(wlc5, 5);
        wlc<ObjectAnimator> wlc24 = wlc6;
        this.f = (wlc) a(wlc6, 6);
        wlc<ObjectMapper> wlc25 = wlc7;
        this.g = (wlc) a(wlc7, 7);
        wlc<Player> wlc26 = wlc8;
        this.h = (wlc) a(wlc8, 8);
        wlc<hcf> wlc27 = wlc9;
        this.i = (wlc) a(wlc9, 9);
        wlc<Boolean> wlc28 = wlc10;
        this.j = (wlc) a(wlc10, 10);
        wlc<SpSharedPreferences<Object>> wlc29 = wlc11;
        this.k = (wlc) a(wlc11, 11);
        wlc<hcd> wlc30 = wlc12;
        this.l = (wlc) a(wlc12, 12);
        this.m = (wlc) a(wlc13, 13);
        this.n = (wlc) a(wlc14, 14);
        this.o = (wlc) a(wlc15, 15);
        this.p = (wlc) a(wlc16, 16);
        this.q = (wlc) a(wlc17, 17);
        this.r = (wlc) a(wlc18, 18);
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

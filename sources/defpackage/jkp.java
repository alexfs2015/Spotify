package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/* renamed from: jkp reason: default package */
public final class jkp {
    public final jik A = new jik(this.p, this.r);
    public final jkh B;
    public final jjw C;
    private final jjr D;
    private final jkj E;
    private final jkb F = new jkb(this.b);
    private final jio G;
    private final jjk H;
    private final jiw I;
    private final jke J;
    private final jjm K;
    private final Flowable<PlayerState> L;
    private final Scheduler M;
    private Disposable N = Disposables.a();
    final jku a;
    public final jkf b = new jkf("Playback");
    public final jkt c;
    public final jjs d;
    final jkj e;
    final jky f;
    final jiu g;
    final jjv h;
    final jjy i;
    final jks j;
    public final jkd k;
    final jjc l;
    public final jjx m;
    public final jjj n;
    public final jkv o;
    public final jkg p = new jkg("RemotePlayback");
    public final jip q;
    final jil r = new jil(this.b);
    final jju s;
    final jjb t;
    final jjo u;
    final jkw v;
    public final jjt w;
    public final jjl x;
    public final jki y = new jki("AudioDriver");
    final jir z;

    public jkp(jkk jkk, jir jir, Random random, Flowable<PlayerState> flowable, Scheduler scheduler) {
        Logger.b("StateManager Created", new Object[0]);
        this.L = flowable;
        this.M = scheduler;
        this.i = new jjy(jkk);
        this.t = new jjb(jkk);
        this.s = new jju(jkk);
        this.l = new jjc(jkk);
        this.m = new jjx(this.s, this.l);
        this.u = new jjo(this.t, this.m);
        this.d = new jjs();
        this.w = new jjt();
        this.n = new jjj(jkk);
        this.x = new jjl("DiscoveredDeviceConnection");
        this.c = new jkt("Sync");
        jjv jjv = new jjv(this.c, this.d, this.u, this.r, this.w, this.n, this.x);
        this.h = jjv;
        this.o = new jkv();
        this.E = new jkj("VideoPlayerPlayback");
        this.q = new jip("AdPlaying");
        this.k = new jkd(this.b);
        this.e = new jkx(jkk, this.b, this.c);
        this.f = new jky(jkk);
        this.j = new jks(this.c);
        this.C = new jjw(this.j, this.k, new Handler(Looper.getMainLooper()));
        this.g = new jiu(jkk);
        this.H = new jjk(this.r);
        this.I = new jiw(this.r);
        this.a = new jku(jkk, this.m);
        this.v = new jkw(this.b, this.c);
        this.G = new jio(this.q);
        jke jke = new jke(this.p, this.b, this.y, this.E, random);
        this.J = jke;
        this.B = new jkh("ScreenLockState", jkk.a);
        this.K = new jjm(jkk);
        this.z = jir;
        this.D = new jjr(jkk);
        d();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.F.onPlayerStateReceived(playerState);
        this.G.onPlayerStateReceived(playerState);
        this.H.onPlayerStateReceived(playerState);
        this.I.onPlayerStateReceived(playerState);
    }

    private List<jkj> g() {
        Field[] declaredFields = getClass().getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (jkj.class.isAssignableFrom(field.getType())) {
                try {
                    arrayList.add((jkj) field.get(this));
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
        return arrayList;
    }

    public final void a() {
        Logger.b("StateManager Tear Down", new Object[0]);
        this.i.d();
        this.r.d();
        this.t.d();
        this.s.d();
        this.l.d();
        this.m.d();
        this.u.d();
        this.d.d();
        this.C.d();
        this.h.d();
        this.k.d();
        this.e.d();
        this.f.d();
        this.j.d();
        this.g.d();
        this.a.d();
        this.v.d();
        this.n.d();
        this.o.d();
        this.z.d();
        this.J.d();
        this.B.d();
        this.K.d();
        this.D.d();
    }

    public final void a(boolean z2) {
        fbp.a(this.E);
        if (z2) {
            this.E.ah_();
        } else {
            this.E.ag_();
        }
    }

    public final void b() {
        this.N = this.L.a(this.M).c((Consumer<? super T>) new $$Lambda$jkp$hzyyb8UQvzxI46Grgt33abrx87E<Object>(this));
    }

    public final void c() {
        if (!this.N.b()) {
            this.N.bd_();
        }
        this.b.a();
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        for (jkj jkj : g()) {
            StringBuilder sb = new StringBuilder();
            sb.append(jkj);
            sb.append(" should be disabled");
            Assertion.a(sb.toString(), jkj.g());
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        for (jkj af_ : g()) {
            af_.af_();
        }
    }

    public final jjm f() {
        if (this.K.f()) {
            return this.K;
        }
        return null;
    }
}

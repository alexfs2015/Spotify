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

/* renamed from: jhz reason: default package */
public final class jhz {
    public final jfv A = new jfv(this.p, this.r);
    public final jhr B;
    public final jhg C;
    private final jht D;
    private final jhl E = new jhl(this.b);
    private final jfz F;
    private final jgv G;
    private final jgh H;
    private final jho I;
    private final jgx J;
    private final Flowable<PlayerState> K;
    private final Scheduler L;
    private Disposable M = Disposables.a();
    final jie a;
    public final jhp b = new jhp("Playback");
    public final jid c;
    public final jhc d;
    final jht e;
    final jii f;
    final jgf g;
    final jhf h;
    final jhi i;
    final jic j;
    public final jhn k;
    final jgn l;
    public final jhh m;
    public final jgu n;
    public final jif o;
    public final jhq p = new jhq("RemotePlayback");
    public final jga q;
    final jfw r = new jfw(this.b);
    final jhe s;
    final jgm t;
    final jgz u;
    final jig v;
    public final jhd w;
    public final jgw x;
    public final jhs y = new jhs("AudioDriver");
    final jgc z;

    public jhz(jhu jhu, jgc jgc, Random random, Flowable<PlayerState> flowable, Scheduler scheduler) {
        Logger.b("StateManager Created", new Object[0]);
        this.K = flowable;
        this.L = scheduler;
        this.i = new jhi(jhu);
        this.t = new jgm(jhu);
        this.s = new jhe(jhu);
        this.l = new jgn(jhu);
        this.m = new jhh(this.s, this.l);
        this.u = new jgz(this.t, this.m);
        this.d = new jhc();
        this.w = new jhd();
        this.n = new jgu(jhu);
        this.x = new jgw("DiscoveredDeviceConnection");
        this.c = new jid("Sync");
        jhf jhf = new jhf(this.c, this.d, this.u, this.r, this.w, this.n, this.x);
        this.h = jhf;
        this.o = new jif();
        this.D = new jht("VideoPlayerPlayback");
        this.q = new jga("AdPlaying");
        this.k = new jhn(this.b);
        this.e = new jih(jhu, this.b, this.c);
        this.f = new jii(jhu);
        this.j = new jic(this.c);
        this.C = new jhg(this.j, this.k, new Handler(Looper.getMainLooper()));
        this.g = new jgf(jhu);
        this.G = new jgv(this.r);
        this.H = new jgh(this.r);
        this.a = new jie(jhu, this.m);
        this.v = new jig(this.b, this.c);
        this.F = new jfz(this.q);
        jho jho = new jho(this.p, this.b, this.y, this.D, random);
        this.I = jho;
        this.B = new jhr("ScreenLockState", jhu.a);
        this.J = new jgx(jhu);
        this.z = jgc;
        d();
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
        this.I.d();
        this.B.d();
        this.J.d();
    }

    public final void b() {
        this.M = this.K.a(this.L).c((Consumer<? super T>) new $$Lambda$jhz$ltLQvnE11atRnO9iDptmMZpi3lY<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(PlayerState playerState) {
        this.E.onPlayerStateReceived(playerState);
        this.F.onPlayerStateReceived(playerState);
        this.G.onPlayerStateReceived(playerState);
        this.H.onPlayerStateReceived(playerState);
    }

    public final void c() {
        if (!this.M.b()) {
            this.M.bf_();
        }
        this.b.a();
    }

    public final void a(boolean z2) {
        fay.a(this.D);
        if (z2) {
            this.D.ah_();
        } else {
            this.D.ag_();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        for (jht jht : g()) {
            StringBuilder sb = new StringBuilder();
            sb.append(jht);
            sb.append(" should be disabled");
            Assertion.a(sb.toString(), jht.g());
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        for (jht af_ : g()) {
            af_.af_();
        }
    }

    private List<jht> g() {
        Field[] declaredFields = getClass().getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (jht.class.isAssignableFrom(field.getType())) {
                try {
                    arrayList.add((jht) field.get(this));
                } catch (IllegalAccessException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
        return arrayList;
    }

    public final jgx f() {
        if (this.J.f()) {
            return this.J;
        }
        return null;
    }
}

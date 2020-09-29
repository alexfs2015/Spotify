package defpackage;

import com.spotify.music.follow.FollowManager;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.Scheduler;

/* renamed from: prx reason: default package */
public final class prx {
    private final pqz a;
    private final pqw b;
    private final pqf c;
    private final pqh d;
    private final lbi e;
    private final Scheduler f;
    private final szp g;
    private final pry h;
    private final FollowManager i;
    private final hgz j;
    private final RxWebToken k;

    public prx(pqz pqz, pqw pqw, pqf pqf, pqh pqh, lbi lbi, Scheduler scheduler, szp szp, pry pry, FollowManager followManager, hgz hgz, RxWebToken rxWebToken) {
        this.a = pqz;
        this.b = pqw;
        this.c = pqf;
        this.d = pqh;
        this.e = lbi;
        this.f = scheduler;
        this.g = szp;
        this.h = pry;
        this.i = followManager;
        this.j = hgz;
        this.k = rxWebToken;
    }

    /* access modifiers changed from: 0000 */
    public c<psg, pse, psd> a(String str) {
        return kok.a((kni<M, E, F>) $$Lambda$5WtINFjCriOZZQMRPdVT4JT7qQ.INSTANCE, psh.a(this.a, this.b, this.c.a(str), this.d.a(str), this.f, this.g, this.h, this.i, this.j, this.k)).a((kmx<M, F>) $$Lambda$SvNn3SDjHP6_CgVrt4TteEkR9vk.INSTANCE).a(psi.a(this.e)).a(knq.a("profile"));
    }
}

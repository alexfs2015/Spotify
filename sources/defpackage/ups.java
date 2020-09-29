package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;
import io.reactivex.Scheduler;

/* renamed from: ups reason: default package */
public final class ups {
    private final via a;
    private final unp b;
    private final hxx c;
    private final szp d;
    private final uqc e;
    private final uqh f;
    private final upd g;
    private final upt h;
    private final Scheduler i;
    private final Scheduler j;

    public ups(via via, unp unp, hxx hxx, szp szp, upt upt, uqc uqc, uqh uqh, upd upd, Scheduler scheduler, Scheduler scheduler2) {
        this.a = via;
        this.b = unp;
        this.c = hxx;
        this.d = szp;
        this.h = upt;
        this.e = uqc;
        this.f = uqh;
        this.g = upd;
        this.i = scheduler;
        this.j = scheduler2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe b() {
        return new kom(this.j);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ koe c() {
        return new kom(this.j);
    }

    /* access modifiers changed from: 0000 */
    public c<uqa, upy, upx> a() {
        a a2 = kok.a((kni<M, E, F>) $$Lambda$aivBD8huo6UzxL7NOBU4SDLOvNw.INSTANCE, uqb.a(this.a, this.b, this.d, this.h, this.e, this.f, this.g, this.i)).a((kmx<M, F>) $$Lambda$sDD36SOprwwzF9mHaWRkSNopbno.INSTANCE).b(new $$Lambda$ups$kf0rHpJTFXKjJgktPswRNqFrXI(this)).a((kny<koe>) new $$Lambda$ups$6wLqiZ_cHjgEGWZsIGtohZ8gHc8<koe>(this)).a(uqe.a(this.b, this.c, this.e));
        DebugFlag debugFlag = DebugFlag.SOCIAL_LISTENING_MOBIUS_LOGGING;
        return a2;
    }
}

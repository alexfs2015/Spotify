package defpackage;

import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.follow.FollowManager;
import io.reactivex.Scheduler;

/* renamed from: rln reason: default package */
public final class rln implements wig<FollowManager> {
    private final wzi<RxResolver> a;
    private final wzi<FireAndForgetResolver> b;
    private final wzi<rwl> c;
    private final wzi<Scheduler> d;

    private rln(wzi<RxResolver> wzi, wzi<FireAndForgetResolver> wzi2, wzi<rwl> wzi3, wzi<Scheduler> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static rln a(wzi<RxResolver> wzi, wzi<FireAndForgetResolver> wzi2, wzi<rwl> wzi3, wzi<Scheduler> wzi4) {
        return new rln(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new FollowManager((RxResolver) this.a.get(), (FireAndForgetResolver) this.b.get(), (rwl) this.c.get(), (Scheduler) this.d.get());
    }
}

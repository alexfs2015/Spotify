package defpackage;

import android.content.Context;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.music.follow.FollowManager;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Scheduler;

/* renamed from: rcp reason: default package */
public final class rcp implements vua<FollowManager> {
    private final wlc<Context> a;
    private final wlc<RxResolver> b;
    private final wlc<FireAndForgetResolver> c;
    private final wlc<rnf> d;
    private final wlc<ToastieManager> e;
    private final wlc<Scheduler> f;

    private rcp(wlc<Context> wlc, wlc<RxResolver> wlc2, wlc<FireAndForgetResolver> wlc3, wlc<rnf> wlc4, wlc<ToastieManager> wlc5, wlc<Scheduler> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static rcp a(wlc<Context> wlc, wlc<RxResolver> wlc2, wlc<FireAndForgetResolver> wlc3, wlc<rnf> wlc4, wlc<ToastieManager> wlc5, wlc<Scheduler> wlc6) {
        rcp rcp = new rcp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return rcp;
    }

    public final /* synthetic */ Object get() {
        FollowManager followManager = new FollowManager((Context) this.a.get(), (RxResolver) this.b.get(), (FireAndForgetResolver) this.c.get(), (rnf) this.d.get(), (ToastieManager) this.e.get(), (Scheduler) this.f.get());
        return followManager;
    }
}

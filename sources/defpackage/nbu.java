package defpackage;

import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;
import com.spotify.music.follow.FollowManager.b;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observable;

/* renamed from: nbu reason: default package */
public final class nbu {
    public final FollowManager a;

    public nbu(FollowManager followManager) {
        this.a = (FollowManager) fbp.a(followManager);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, a aVar, final FlowableEmitter flowableEmitter) {
        AnonymousClass1 r0 = new b() {
            public final void a(a aVar) {
                flowableEmitter.a(aVar);
            }
        };
        flowableEmitter.a(new $$Lambda$nbu$etMnYT1eUcaqn3gp6FOt0Fh774(this, str, r0));
        this.a.a(str, (b) r0);
        this.a.a(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, b bVar) {
        this.a.b(str, bVar);
    }

    public final Observable<a> a(String str, a aVar) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$nbu$_DCRZCF3JtlorHOEC75pQYuxrTc<T>(this, str, aVar), BackpressureStrategy.BUFFER).j();
    }
}

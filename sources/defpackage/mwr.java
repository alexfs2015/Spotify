package defpackage;

import com.spotify.music.follow.FollowManager;
import com.spotify.music.follow.FollowManager.a;
import com.spotify.music.follow.FollowManager.b;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.Observable;

/* renamed from: mwr reason: default package */
public final class mwr {
    public final FollowManager a;

    public mwr(FollowManager followManager) {
        this.a = (FollowManager) fay.a(followManager);
    }

    public final Observable<a> a(String str, a aVar) {
        return Flowable.a((FlowableOnSubscribe<T>) new $$Lambda$mwr$GWQI1P3vWKLFPIYpit3HRKyGS4<T>(this, str, aVar), BackpressureStrategy.BUFFER).j();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, a aVar, final FlowableEmitter flowableEmitter) {
        AnonymousClass1 r0 = new b() {
            public final void a(a aVar) {
                flowableEmitter.a(aVar);
            }
        };
        flowableEmitter.a(new $$Lambda$mwr$mD_owuD5_fxY0wTvxPXss4NyxA8(this, str, r0));
        this.a.a(str, (b) r0);
        this.a.a(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, b bVar) {
        this.a.b(str, bVar);
    }
}

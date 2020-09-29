package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.AdSlotEvent;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: -$$Lambda$xt_suqzqqjE4GbBhK3-d7O5BVAU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$xt_suqzqqjE4GbBhK3d7O5BVAU implements Consumer {
    private final /* synthetic */ BehaviorSubject f$0;

    public /* synthetic */ $$Lambda$xt_suqzqqjE4GbBhK3d7O5BVAU(BehaviorSubject behaviorSubject) {
        this.f$0 = behaviorSubject;
    }

    public final void accept(Object obj) {
        this.f$0.onNext((AdSlotEvent) obj);
    }
}

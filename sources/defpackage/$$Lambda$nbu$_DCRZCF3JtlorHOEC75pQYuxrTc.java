package defpackage;

import com.spotify.music.follow.FollowManager.a;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$nbu$_DCRZCF3JtlorHOEC75pQYuxrTc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$nbu$_DCRZCF3JtlorHOEC75pQYuxrTc implements FlowableOnSubscribe {
    private final /* synthetic */ nbu f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ a f$2;

    public /* synthetic */ $$Lambda$nbu$_DCRZCF3JtlorHOEC75pQYuxrTc(nbu nbu, String str, a aVar) {
        this.f$0 = nbu;
        this.f$1 = str;
        this.f$2 = aVar;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, this.f$2, flowableEmitter);
    }
}

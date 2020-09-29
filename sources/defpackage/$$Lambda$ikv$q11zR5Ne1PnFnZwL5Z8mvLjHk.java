package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChildrenPageRequest;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$ikv$q11zR5Ne1PnFnZwL5-Z8mvLjH-k reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$q11zR5Ne1PnFnZwL5Z8mvLjHk implements SingleOnSubscribe {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ ChildrenPageRequest f$1;

    public /* synthetic */ $$Lambda$ikv$q11zR5Ne1PnFnZwL5Z8mvLjHk(ikv ikv, ChildrenPageRequest childrenPageRequest) {
        this.f$0 = ikv;
        this.f$1 = childrenPageRequest;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}

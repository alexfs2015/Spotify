package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.ChildrenPageRequest;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$iii$XfYprx2xaoDK14E0RXExxi8yMrg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$XfYprx2xaoDK14E0RXExxi8yMrg implements SingleOnSubscribe {
    private final /* synthetic */ iii f$0;
    private final /* synthetic */ ChildrenPageRequest f$1;

    public /* synthetic */ $$Lambda$iii$XfYprx2xaoDK14E0RXExxi8yMrg(iii iii, ChildrenPageRequest childrenPageRequest) {
        this.f$0 = iii;
        this.f$1 = childrenPageRequest;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        this.f$0.a(this.f$1, singleEmitter);
    }
}

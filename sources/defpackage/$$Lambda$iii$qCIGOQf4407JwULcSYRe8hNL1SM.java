package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$iii$qCIGOQf4407JwULcSYRe8hNL1SM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$qCIGOQf4407JwULcSYRe8hNL1SM implements Function {
    private final /* synthetic */ iii f$0;
    private final /* synthetic */ Saved f$1;

    public /* synthetic */ $$Lambda$iii$qCIGOQf4407JwULcSYRe8hNL1SM(iii iii, Saved saved) {
        this.f$0 = iii;
        this.f$1 = saved;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (PlayerState) obj);
    }
}

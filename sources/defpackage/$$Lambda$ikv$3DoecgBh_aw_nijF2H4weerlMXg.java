package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ikv$3DoecgBh_aw_nijF2H4weerlMXg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$3DoecgBh_aw_nijF2H4weerlMXg implements Function {
    private final /* synthetic */ Identifier f$0;

    public /* synthetic */ $$Lambda$ikv$3DoecgBh_aw_nijF2H4weerlMXg(Identifier identifier) {
        this.f$0 = identifier;
    }

    public final Object apply(Object obj) {
        return ikv.a(this.f$0, (PlayerState) obj);
    }
}

package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ikv$5hY-hJwsEShgPIzg4qAMb2QlQYo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$5hYhJwsEShgPIzg4qAMb2QlQYo implements Function {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ Saved f$1;

    public /* synthetic */ $$Lambda$ikv$5hYhJwsEShgPIzg4qAMb2QlQYo(ikv ikv, Saved saved) {
        this.f$0 = ikv;
        this.f$1 = saved;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (PlayerState) obj);
    }
}

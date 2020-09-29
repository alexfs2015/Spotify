package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ikv$1mDE69gNYZNNbJJNBENpDpdoCiY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$1mDE69gNYZNNbJJNBENpDpdoCiY implements Function {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ Shuffle f$1;

    public /* synthetic */ $$Lambda$ikv$1mDE69gNYZNNbJJNBENpDpdoCiY(ikv ikv, Shuffle shuffle) {
        this.f$0 = ikv;
        this.f$1 = shuffle;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (PlayerState) obj);
    }
}

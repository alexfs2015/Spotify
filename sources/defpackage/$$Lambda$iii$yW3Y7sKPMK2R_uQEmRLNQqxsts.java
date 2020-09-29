package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$iii$-yW3Y7sKPMK2R_uQEmRLNQqxsts reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$yW3Y7sKPMK2R_uQEmRLNQqxsts implements Function {
    private final /* synthetic */ iii f$0;
    private final /* synthetic */ Shuffle f$1;

    public /* synthetic */ $$Lambda$iii$yW3Y7sKPMK2R_uQEmRLNQqxsts(iii iii, Shuffle shuffle) {
        this.f$0 = iii;
        this.f$1 = shuffle;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (PlayerState) obj);
    }
}

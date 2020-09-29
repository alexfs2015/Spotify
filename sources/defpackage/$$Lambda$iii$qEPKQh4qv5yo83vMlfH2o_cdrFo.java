package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackPosition;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$iii$qEPKQh4qv5yo83vMlfH2o_cdrFo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$qEPKQh4qv5yo83vMlfH2o_cdrFo implements Function {
    private final /* synthetic */ iii f$0;
    private final /* synthetic */ PlaybackPosition f$1;

    public /* synthetic */ $$Lambda$iii$qEPKQh4qv5yo83vMlfH2o_cdrFo(iii iii, PlaybackPosition playbackPosition) {
        this.f$0 = iii;
        this.f$1 = playbackPosition;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (PlayerState) obj);
    }
}

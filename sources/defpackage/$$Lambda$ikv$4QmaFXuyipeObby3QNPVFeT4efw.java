package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackPosition;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ikv$4QmaFXuyipeObby3QNPVFeT4efw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ikv$4QmaFXuyipeObby3QNPVFeT4efw implements Function {
    private final /* synthetic */ ikv f$0;
    private final /* synthetic */ PlaybackPosition f$1;

    public /* synthetic */ $$Lambda$ikv$4QmaFXuyipeObby3QNPVFeT4efw(ikv ikv, PlaybackPosition playbackPosition) {
        this.f$0 = ikv;
        this.f$1 = playbackPosition;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (PlayerState) obj);
    }
}

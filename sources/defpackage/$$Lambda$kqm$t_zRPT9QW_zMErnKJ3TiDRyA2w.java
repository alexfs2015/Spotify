package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kqm$t_zRPT9QW_zMEr-nKJ3TiDRyA2w reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kqm$t_zRPT9QW_zMErnKJ3TiDRyA2w implements Function {
    private final /* synthetic */ Observable f$0;

    public /* synthetic */ $$Lambda$kqm$t_zRPT9QW_zMErnKJ3TiDRyA2w(Observable observable) {
        this.f$0 = observable;
    }

    public final Object apply(Object obj) {
        return Logger.b("AutoPlay: Player Context %s Playback ID has changed to %s", ((PlayerState) obj).contextUri(), ((PlayerState) obj).playbackId());
    }
}

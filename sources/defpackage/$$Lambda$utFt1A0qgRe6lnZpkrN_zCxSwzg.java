package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlayerState;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$utFt1A0qgRe6lnZpkrN_zCxSwzg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$utFt1A0qgRe6lnZpkrN_zCxSwzg implements Function {
    public static final /* synthetic */ $$Lambda$utFt1A0qgRe6lnZpkrN_zCxSwzg INSTANCE = new $$Lambda$utFt1A0qgRe6lnZpkrN_zCxSwzg();

    private /* synthetic */ $$Lambda$utFt1A0qgRe6lnZpkrN_zCxSwzg() {
    }

    public final Object apply(Object obj) {
        return PlayerState.playerStateFrom((com.spotify.mobile.android.cosmos.player.v2.PlayerState) obj);
    }
}

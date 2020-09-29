package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ktv$sS9UlY6GDxmSjwX2XDvu12WWKgc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ktv$sS9UlY6GDxmSjwX2XDvu12WWKgc implements Function {
    private final /* synthetic */ Observable f$0;

    public /* synthetic */ $$Lambda$ktv$sS9UlY6GDxmSjwX2XDvu12WWKgc(Observable observable) {
        this.f$0 = observable;
    }

    public final Object apply(Object obj) {
        return Logger.b("AutoPlay: Player Context %s Playback ID has changed to %s", ((PlayerState) obj).contextUri(), ((PlayerState) obj).playbackId());
    }
}

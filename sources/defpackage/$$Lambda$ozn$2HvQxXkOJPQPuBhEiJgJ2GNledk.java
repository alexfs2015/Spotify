package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ozn$2HvQxXkOJPQPuBhEiJgJ2GNledk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ozn$2HvQxXkOJPQPuBhEiJgJ2GNledk implements Function {
    private final /* synthetic */ PlayerTrack f$0;

    public /* synthetic */ $$Lambda$ozn$2HvQxXkOJPQPuBhEiJgJ2GNledk(PlayerTrack playerTrack) {
        this.f$0 = playerTrack;
    }

    public final Object apply(Object obj) {
        return ozn.a(this.f$0, (PlayerQueue) obj);
    }
}

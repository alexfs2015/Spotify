package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kwa$BJiBiwwnAuDWDRZc4lT1hzDie-o reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kwa$BJiBiwwnAuDWDRZc4lT1hzDieo implements Function {
    public static final /* synthetic */ $$Lambda$kwa$BJiBiwwnAuDWDRZc4lT1hzDieo INSTANCE = new $$Lambda$kwa$BJiBiwwnAuDWDRZc4lT1hzDieo();

    private /* synthetic */ $$Lambda$kwa$BJiBiwwnAuDWDRZc4lT1hzDieo() {
    }

    public final Object apply(Object obj) {
        return ((PlayerTrack) fay.a(((PlayerState) obj).track())).uri();
    }
}

package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$ktv$AfAh-lX5gfWuL6vAIY455vfBf5A reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ktv$AfAhlX5gfWuL6vAIY455vfBf5A implements Predicate {
    private final /* synthetic */ PlayerState f$0;

    public /* synthetic */ $$Lambda$ktv$AfAhlX5gfWuL6vAIY455vfBf5A(PlayerState playerState) {
        this.f$0 = playerState;
    }

    public final boolean test(Object obj) {
        return ktv.a(this.f$0, (PlayerState) obj);
    }
}

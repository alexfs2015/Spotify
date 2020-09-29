package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.genie.Wish;
import com.spotify.music.genie.Wish.Action;
import io.reactivex.Scheduler;
import io.reactivex.Single;

/* renamed from: rqf reason: default package */
public final class rqf {
    private final rqh a;
    private final Scheduler b;
    private final Scheduler c;

    public rqf(rqh rqh, Scheduler scheduler, Scheduler scheduler2) {
        this.a = rqh;
        this.b = scheduler;
        this.c = scheduler2;
    }

    public final Single<Wish> a(PlayerState playerState) {
        return !playerState.isPlaying() ? this.a.a().b(this.b).a(this.c).f($$Lambda$Ex0xD5km84BOVX4pFmtaDVi4tk.INSTANCE) : !playerState.isPaused() ? Single.b(Wish.a(Action.DO_NOTHING)) : Single.b(Wish.a(Action.PLAY_CURRENT_SESSION));
    }
}

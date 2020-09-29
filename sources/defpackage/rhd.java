package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.genie.Wish;
import com.spotify.music.genie.Wish.Action;
import io.reactivex.Scheduler;
import io.reactivex.Single;

/* renamed from: rhd reason: default package */
public final class rhd {
    private final rhf a;
    private final Scheduler b;
    private final Scheduler c;

    public rhd(rhf rhf, Scheduler scheduler, Scheduler scheduler2) {
        this.a = rhf;
        this.b = scheduler;
        this.c = scheduler2;
    }

    public final Single<Wish> a(PlayerState playerState) {
        if (!playerState.isPlaying()) {
            return this.a.a().b(this.b).a(this.c).f($$Lambda$Ex0xD5km84BOVX4pFmtaDVi4tk.INSTANCE);
        }
        if (!playerState.isPaused()) {
            return Single.b(Wish.a(Action.DO_NOTHING));
        }
        return Single.b(Wish.a(Action.PLAY_CURRENT_SESSION));
    }
}

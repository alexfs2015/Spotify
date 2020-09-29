package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.libs.connect.access.animation.logic.NudgeResolver;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Scheduler;

/* renamed from: rya reason: default package */
public final class rya implements wig<NudgeResolver> {
    private final wzi<Observable<Boolean>> a;
    private final wzi<Flowable<PlayerState>> b;
    private final wzi<Scheduler> c;

    private rya(wzi<Observable<Boolean>> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<Scheduler> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static rya a(wzi<Observable<Boolean>> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<Scheduler> wzi3) {
        return new rya(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new NudgeResolver((Observable) this.a.get(), (Flowable) this.b.get(), (Scheduler) this.c.get());
    }
}

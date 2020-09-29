package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function3;

/* renamed from: ilu reason: default package */
public final class ilu {
    private final hpt a;
    private final Scheduler b;

    public ilu(hpt hpt, Scheduler scheduler) {
        this.a = hpt;
        this.b = scheduler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(PlayerState playerState, SessionState sessionState, fqn fqn) {
        return !sessionState.loggedIn() ? ho.a(fqn, ho.a(null, null)) : ho.a(fqn, ho.a(playerState, new tmo().a(playerState)));
    }

    public final Observable<ho<fqn, ho<PlayerState, tmm>>> a() {
        return Observable.a((ObservableSource<? extends T1>) wit.b(this.a.d().a()), (ObservableSource<? extends T2>) this.a.g().a.j(), (ObservableSource<? extends T3>) this.a.i().a().j(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$ilu$cvZqKvjZYhm6mSjOhCej8Iz64o4.INSTANCE).a(this.b);
    }
}

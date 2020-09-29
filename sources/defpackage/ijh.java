package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function3;

/* renamed from: ijh reason: default package */
public final class ijh {
    private final hne a;
    private final Scheduler b;

    public ijh(hne hne, Scheduler scheduler) {
        this.a = hne;
        this.b = scheduler;
    }

    public final Observable<ho<fpt, ho<PlayerState, tcf>>> a() {
        return Observable.a((ObservableSource<? extends T1>) vun.b(this.a.d().a()), (ObservableSource<? extends T2>) this.a.g().a.j(), (ObservableSource<? extends T3>) this.a.i().a().j(), (Function3<? super T1, ? super T2, ? super T3, ? extends R>) $$Lambda$ijh$JHE_LaikpEZ7X34H0u3uBwMmOJU.INSTANCE).a(this.b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(PlayerState playerState, SessionState sessionState, fpt fpt) {
        if (!sessionState.loggedIn()) {
            return ho.a(fpt, ho.a(null, null));
        }
        return ho.a(fpt, ho.a(playerState, new tch().a(playerState)));
    }
}

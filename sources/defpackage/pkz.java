package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: pkz reason: default package */
public final class pkz {
    private final Flowable<PlayerState> a;

    public pkz(Flowable<PlayerState> flowable) {
        this.a = flowable;
    }

    public final Observable<pky> a() {
        return this.a.c((Function<? super T, ? extends R>) $$Lambda$uxjUwUBuFANHsc3s2HczgeNxKnw.INSTANCE).a(Functions.a()).j();
    }
}

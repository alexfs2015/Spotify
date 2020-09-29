package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.Callable;

/* renamed from: kqn reason: default package */
public final class kqn {
    /* access modifiers changed from: private */
    public static /* synthetic */ Observable a(Observable observable, RadioSeedBundle radioSeedBundle, Boolean bool) {
        if (bool.booleanValue()) {
            return observable.a((Predicate<? super T>) new $$Lambda$kqn$kqnwUqhUhBJyGns46gAkRKW2HrE<Object>(radioSeedBundle)).c(1).c((Function<? super T, ? extends R>) $$Lambda$kqn$HLOe0D_ffm_9a9E79XWwJkwWb_g.INSTANCE);
        }
        return Observable.b(Boolean.FALSE);
    }

    public static Observable<Boolean> a(Observable<PlayerState> observable, RadioSeedBundle radioSeedBundle, jjf jjf, jrp jrp, Context context, ufq ufq) {
        krd krd = new krd(radioSeedBundle, context, ufq, jjf, jrp);
        return Observable.b((Callable<? extends T>) krd).h(new $$Lambda$kqn$UjtzbUB3aA1YA4AWxcIqRTWZGM(observable, radioSeedBundle));
    }
}

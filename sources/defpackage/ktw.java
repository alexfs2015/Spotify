package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.concurrent.Callable;

/* renamed from: ktw reason: default package */
public final class ktw {
    /* access modifiers changed from: private */
    public static /* synthetic */ Observable a(Observable observable, RadioSeedBundle radioSeedBundle, Boolean bool) {
        return bool.booleanValue() ? observable.a((Predicate<? super T>) new $$Lambda$ktw$OFIEKCf78IRGRGszsdP3bRcxoQ<Object>(radioSeedBundle)).c(1).c((Function<? super T, ? extends R>) $$Lambda$ktw$LRjkpKVsq_spm0dz3gFkX1DVqJA.INSTANCE) : Observable.b(Boolean.FALSE);
    }

    public static Observable<Boolean> a(Observable<PlayerState> observable, RadioSeedBundle radioSeedBundle, jlr jlr, jtz jtz, Context context, ure ure) {
        kum kum = new kum(radioSeedBundle, context, ure, jlr, jtz);
        return Observable.b((Callable<? extends T>) kum).h(new $$Lambda$ktw$oMsd9MjptR7Ks8CAhJveVNpMc(observable, radioSeedBundle));
    }
}

package defpackage;

import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$kqo$jNTl2WbScoGAnhJF5Ny7K773VKY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kqo$jNTl2WbScoGAnhJF5Ny7K773VKY implements Function {
    private final /* synthetic */ Observable f$0;

    public /* synthetic */ $$Lambda$kqo$jNTl2WbScoGAnhJF5Ny7K773VKY(Observable observable) {
        this.f$0 = observable;
    }

    public final Object apply(Object obj) {
        return this.f$0.a((Predicate<? super T>) new $$Lambda$kqo$rPY5eEJrovv5IooyOC2olpJWabs<Object>((RadioSeedBundle) obj)).c(1).c((Function<? super T, ? extends R>) new $$Lambda$kqo$JdsC23mTbk0voJ_IHkH7b4m0F2Q<Object,Object>((RadioSeedBundle) obj));
    }
}

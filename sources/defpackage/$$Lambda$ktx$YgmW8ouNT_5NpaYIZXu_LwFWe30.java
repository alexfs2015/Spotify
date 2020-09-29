package defpackage;

import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$ktx$YgmW8ouNT_5NpaYIZXu_LwFWe30 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ktx$YgmW8ouNT_5NpaYIZXu_LwFWe30 implements Function {
    private final /* synthetic */ Observable f$0;

    public /* synthetic */ $$Lambda$ktx$YgmW8ouNT_5NpaYIZXu_LwFWe30(Observable observable) {
        this.f$0 = observable;
    }

    public final Object apply(Object obj) {
        return this.f$0.a((Predicate<? super T>) new $$Lambda$ktx$M9fMlmg_XzJJ_FalOeeJxp1Y1qg<Object>((RadioSeedBundle) obj)).c(1).c((Function<? super T, ? extends R>) new $$Lambda$ktx$mi0rny_bcV4wskAtnK5nre01c<Object,Object>((RadioSeedBundle) obj));
    }
}

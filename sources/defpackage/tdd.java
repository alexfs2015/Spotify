package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;

/* renamed from: tdd reason: default package */
public final class tdd {
    private final a a;

    public tdd(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: private */
    public static ImmersiveMode a(boolean z, boolean z2) {
        return z2 ? ImmersiveMode.SEMI_IMMERSIVE : z ? ImmersiveMode.NO_IMMERSIVE : ImmersiveMode.FULL_IMMERSIVE;
    }

    public final vcw<ImmersiveMode> a(Flowable<Boolean> flowable, Flowable<Boolean> flowable2) {
        return new vcw<>(Flowable.a((xfk<? extends T1>) flowable, (xfk<? extends T2>) flowable2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$tdd$qJzchYvgaGSlLdqepeJjOOGGE.INSTANCE).a(Functions.a()), this.a);
    }
}

package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.Functions;

/* renamed from: ssw reason: default package */
public final class ssw {
    private final a a;

    public ssw(a aVar) {
        this.a = aVar;
    }

    public final urr<ImmersiveMode> a(Flowable<Boolean> flowable, Flowable<Boolean> flowable2) {
        return new urr<>(Flowable.a((wrf<? extends T1>) flowable, (wrf<? extends T2>) flowable2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$ssw$Rl9B3EB3Zyb2dZFhCvcPwP4VEc.INSTANCE).a(Functions.a()), this.a);
    }

    /* access modifiers changed from: private */
    public static ImmersiveMode a(boolean z, boolean z2) {
        if (z2) {
            return ImmersiveMode.SEMI_IMMERSIVE;
        }
        return z ? ImmersiveMode.NO_IMMERSIVE : ImmersiveMode.FULL_IMMERSIVE;
    }
}

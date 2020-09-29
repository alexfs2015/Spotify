package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: tbx reason: default package */
public final class tbx {
    private final a a;

    public tbx(a aVar) {
        this.a = aVar;
    }

    public final urr<ImmersiveMode> a(Flowable<Boolean> flowable) {
        return new urr<>(flowable.c((Function<? super T, ? extends R>) $$Lambda$tbx$XaKmlo4zns1Lbe5k1mTX1HebHRM.INSTANCE), this.a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmersiveMode a(Boolean bool) {
        return bool.booleanValue() ? ImmersiveMode.NO_IMMERSIVE : ImmersiveMode.FULL_IMMERSIVE;
    }
}

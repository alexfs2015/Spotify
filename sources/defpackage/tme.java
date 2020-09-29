package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.nowplaying.core.immersive.ImmersiveMode;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: tme reason: default package */
public final class tme {
    private final a a;

    public tme(a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ImmersiveMode a(Boolean bool) {
        return bool.booleanValue() ? ImmersiveMode.NO_IMMERSIVE : ImmersiveMode.FULL_IMMERSIVE;
    }

    public final vcw<ImmersiveMode> a(Flowable<Boolean> flowable) {
        return new vcw<>(flowable.c((Function<? super T, ? extends R>) $$Lambda$tme$fpKs2H_XE9p8PMAmVhEkre2tGc.INSTANCE), this.a);
    }
}

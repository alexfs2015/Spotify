package defpackage;

import com.spotify.mobile.android.video.model.ContextPlayerConfiguration;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: kaj reason: default package */
public final class kaj {
    private final uiu a;

    public kaj(uiu uiu) {
        this.a = uiu;
    }

    public final Observable<kai> a() {
        return Observable.a((ObservableSource<? extends T1>) this.a.a(ContextPlayerConfiguration.PREFS_KEY_VIDEO_SUBTITLES, String.class), (ObservableSource<? extends T2>) this.a.a(ContextPlayerConfiguration.PREFS_KEY_VIDEO_SUBTITLES_CC, Boolean.class), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$X4H20DrAK3ezhXQ0QWDCsQQdfB4.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$kaj$DPZScI4ITJO3WjNvU13SED9jOCA.INSTANCE);
    }
}

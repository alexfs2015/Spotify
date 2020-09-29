package defpackage;

import com.spotify.mobile.android.video.model.ContextPlayerConfiguration;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;

/* renamed from: jyj reason: default package */
public final class jyj {
    private final twr a;

    public jyj(twr twr) {
        this.a = twr;
    }

    public final Observable<jyi> a() {
        return Observable.a((ObservableSource<? extends T1>) this.a.a(ContextPlayerConfiguration.PREFS_KEY_VIDEO_SUBTITLES, String.class), (ObservableSource<? extends T2>) this.a.a(ContextPlayerConfiguration.PREFS_KEY_VIDEO_SUBTITLES_CC, Boolean.class), (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$R4PUxoTDWte6U4lj5sYIeoea1EQ.INSTANCE).e((Function<? super Throwable, ? extends T>) $$Lambda$jyj$8YGKIXmC1_YQabtEbk6sHjGsfc0.INSTANCE);
    }
}

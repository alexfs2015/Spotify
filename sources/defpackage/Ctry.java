package defpackage;

import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.Functions;

/* renamed from: try reason: invalid class name and default package */
public interface Ctry {

    /* renamed from: try$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ OverlayDisplayMode a(Boolean bool, Boolean bool2, Long l, Boolean bool3) {
            return (!bool.booleanValue() || !bool3.booleanValue()) ? OverlayDisplayMode.HIDE_DISABLED : (!bool2.booleanValue() || l.longValue() <= 0) ? OverlayDisplayMode.AUTO_HIDE : OverlayDisplayMode.HIDE_ENABLED;
        }

        public static Flowable<OverlayDisplayMode> a(Flowable<Boolean> flowable, Flowable<Boolean> flowable2, Flowable<Long> flowable3, Flowable<Boolean> flowable4, Scheduler scheduler) {
            return Flowable.a(flowable, flowable2, flowable3.c(Long.valueOf(0)), flowable4, $$Lambda$try$RU6ApPFg69AybeuX_M4Buqbzeek.INSTANCE).a(scheduler).a(Functions.a());
        }
    }
}

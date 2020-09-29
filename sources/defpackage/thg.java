package defpackage;

import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.Functions;

/* renamed from: thg reason: default package */
public interface thg {

    /* renamed from: thg$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Flowable<OverlayDisplayMode> a(Flowable<Boolean> flowable, Flowable<Boolean> flowable2, Flowable<Long> flowable3, Flowable<Boolean> flowable4, Scheduler scheduler) {
            return Flowable.a(flowable, flowable2, flowable3.c(Long.valueOf(0)), flowable4, $$Lambda$thg$8zCBW6cb6X6WaIuj5pkUIHPlCZg.INSTANCE).a(scheduler).a(Functions.a());
        }

        public static /* synthetic */ OverlayDisplayMode a(Boolean bool, Boolean bool2, Long l, Boolean bool3) {
            if (!bool.booleanValue() || !bool3.booleanValue()) {
                return OverlayDisplayMode.HIDE_DISABLED;
            }
            if (!bool2.booleanValue() || l.longValue() <= 0) {
                return OverlayDisplayMode.AUTO_HIDE;
            }
            return OverlayDisplayMode.HIDE_ENABLED;
        }
    }
}

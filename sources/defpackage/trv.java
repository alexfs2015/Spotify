package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: trv reason: default package */
public interface trv {

    /* renamed from: trv$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ OrientationMode a(Boolean bool) {
            return bool.booleanValue() ? OrientationMode.PORTRAIT_ONLY : OrientationMode.UNSPECIFIED;
        }

        public static Flowable<OrientationMode> a(Flowable<Boolean> flowable) {
            return flowable.c((Function<? super T, ? extends R>) $$Lambda$trv$Vh5Il8rNDGaWruNMOkKah6ORK0.INSTANCE);
        }
    }
}

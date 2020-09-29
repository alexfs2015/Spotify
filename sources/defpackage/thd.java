package defpackage;

import com.spotify.music.nowplaying.core.orientation.OrientationMode;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: thd reason: default package */
public interface thd {

    /* renamed from: thd$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Flowable<OrientationMode> a(Flowable<Boolean> flowable) {
            return flowable.c((Function<? super T, ? extends R>) $$Lambda$thd$iGrEO3w61LJptGveh1kvERu3uts.INSTANCE);
        }

        public static /* synthetic */ OrientationMode a(Boolean bool) {
            return bool.booleanValue() ? OrientationMode.PORTRAIT_ONLY : OrientationMode.UNSPECIFIED;
        }
    }
}

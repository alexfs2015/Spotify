package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.observable.ObservablePublish;

/* renamed from: qzo reason: default package */
public interface qzo {

    /* renamed from: qzo$a */
    public interface a {

        /* renamed from: qzo$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static Observable<StoriesPlaybackState> a(kgu kgu) {
                return ObservablePublish.h(kgu.a).a();
            }

            public static Consumer<StoriesPlaybackState> b(kgu kgu) {
                kgu.getClass();
                return new $$Lambda$VxpktcxTb7GrWS0j8DibYUOXno4(kgu);
            }
        }
    }
}

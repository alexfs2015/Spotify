package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.observable.ObservablePublish;

/* renamed from: qqz reason: default package */
public interface qqz {

    /* renamed from: qqz$a */
    public interface a {

        /* renamed from: qqz$a$-CC reason: invalid class name */
        public final /* synthetic */ class CC {
            public static Consumer<StoriesPlaybackState> b(kes kes) {
                kes.getClass();
                return new $$Lambda$hys6YYNJhpdWSoMBHtSMCV8FhyY(kes);
            }

            public static Observable<StoriesPlaybackState> a(kes kes) {
                return ObservablePublish.h(kes.a).a();
            }
        }
    }
}

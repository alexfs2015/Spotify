package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.subjects.BehaviorSubject;

/* renamed from: kes reason: default package */
public final class kes {
    public final BehaviorSubject<StoriesPlaybackState> a = BehaviorSubject.a(StoriesPlaybackState.RESUMED);

    public final void a(StoriesPlaybackState storiesPlaybackState) {
        this.a.onNext(storiesPlaybackState);
    }
}

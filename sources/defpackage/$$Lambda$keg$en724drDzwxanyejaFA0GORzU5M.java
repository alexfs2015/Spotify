package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$keg$en724drDzwxanyejaFA0GORzU5M reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$keg$en724drDzwxanyejaFA0GORzU5M implements Action {
    private final /* synthetic */ Consumer f$0;

    public /* synthetic */ $$Lambda$keg$en724drDzwxanyejaFA0GORzU5M(Consumer consumer) {
        this.f$0 = consumer;
    }

    public final void run() {
        this.f$0.accept(StoriesPlaybackState.RESUMED);
    }
}

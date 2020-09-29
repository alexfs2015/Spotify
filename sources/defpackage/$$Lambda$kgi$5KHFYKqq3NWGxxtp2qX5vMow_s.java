package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kgi$5KHFYKqq3NWGxxtp2-qX5vMow_s reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kgi$5KHFYKqq3NWGxxtp2qX5vMow_s implements Action {
    private final /* synthetic */ Consumer f$0;

    public /* synthetic */ $$Lambda$kgi$5KHFYKqq3NWGxxtp2qX5vMow_s(Consumer consumer) {
        this.f$0 = consumer;
    }

    public final void run() {
        this.f$0.accept(StoriesPlaybackState.RESUMED);
    }
}

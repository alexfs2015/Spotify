package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kgi$J143yrwJZsv9Z5rfrbfxuyJ4Ab0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kgi$J143yrwJZsv9Z5rfrbfxuyJ4Ab0 implements Action {
    private final /* synthetic */ Consumer f$0;

    public /* synthetic */ $$Lambda$kgi$J143yrwJZsv9Z5rfrbfxuyJ4Ab0(Consumer consumer) {
        this.f$0 = consumer;
    }

    public final void run() {
        this.f$0.accept(StoriesPlaybackState.PAUSED);
    }
}

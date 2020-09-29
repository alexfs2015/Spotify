package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$keg$gxmoyaJa9NtEFhmtiGdrPV8Qyp4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$keg$gxmoyaJa9NtEFhmtiGdrPV8Qyp4 implements Action {
    private final /* synthetic */ Consumer f$0;

    public /* synthetic */ $$Lambda$keg$gxmoyaJa9NtEFhmtiGdrPV8Qyp4(Consumer consumer) {
        this.f$0 = consumer;
    }

    public final void run() {
        this.f$0.accept(StoriesPlaybackState.PAUSED);
    }
}

package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.functions.Consumer;

/* renamed from: qrc reason: default package */
public final class qrc implements vua<Consumer<StoriesPlaybackState>> {
    private final wlc<kes> a;

    private qrc(wlc<kes> wlc) {
        this.a = wlc;
    }

    public static qrc a(wlc<kes> wlc) {
        return new qrc(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Consumer) vuf.a(CC.b((kes) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

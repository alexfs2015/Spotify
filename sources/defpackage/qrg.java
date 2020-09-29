package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.Observable;

/* renamed from: qrg reason: default package */
public final class qrg implements vua<Observable<StoriesPlaybackState>> {
    private final wlc<kes> a;

    public static Observable<StoriesPlaybackState> a(kes kes) {
        return (Observable) vuf.a(CC.a(kes), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((kes) this.a.get());
    }
}

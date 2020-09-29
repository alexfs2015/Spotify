package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.playback.StoriesPlaybackState;
import io.reactivex.functions.Consumer;

/* renamed from: qzr reason: default package */
public final class qzr implements wig<Consumer<StoriesPlaybackState>> {
    private final wzi<kgu> a;

    private qzr(wzi<kgu> wzi) {
        this.a = wzi;
    }

    public static qzr a(wzi<kgu> wzi) {
        return new qzr(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Consumer) wil.a(CC.b((kgu) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

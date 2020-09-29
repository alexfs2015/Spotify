package defpackage;

import androidx.lifecycle.Lifecycle;
import com.spotify.mobile.android.wrapped2019.stories.container.StoriesContainerActivity;

/* renamed from: qzu reason: default package */
public final class qzu implements wig<Lifecycle> {
    private final wzi<StoriesContainerActivity> a;

    public static Lifecycle a(StoriesContainerActivity storiesContainerActivity) {
        return (Lifecycle) wil.a(storiesContainerActivity.a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((StoriesContainerActivity) this.a.get());
    }
}

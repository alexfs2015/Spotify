package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;

/* renamed from: khc reason: default package */
public abstract class khc implements Parcelable {
    public abstract StoryParagraph a();

    public static khc a(StoryParagraph storyParagraph) {
        return new kha(storyParagraph);
    }
}

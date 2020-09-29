package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;
import com.spotify.wrapped2019.v1.proto.Paragraph;

/* renamed from: kjp reason: default package */
public abstract class kjp implements Parcelable {
    public static kjp a(StoryParagraph storyParagraph) {
        return new kjn(storyParagraph);
    }

    public static kjp a(Paragraph paragraph) {
        return a(StoryParagraph.fromProto(paragraph));
    }

    public abstract StoryParagraph a();
}

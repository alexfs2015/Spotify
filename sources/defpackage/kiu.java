package defpackage;

import android.os.Parcelable;
import com.spotify.mobile.android.wrapped2019.stories.StoryParagraph;
import com.spotify.wrapped2019.v1.proto.DecadeTopTracksArtistsStory;
import com.spotify.wrapped2019.v1.proto.Year;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kiu reason: default package */
public abstract class kiu implements Parcelable {

    /* renamed from: kiu$a */
    public interface a {
        a a(StoryParagraph storyParagraph);

        a a(List<kiy> list);

        kiu a();
    }

    public static kiu a(StoryParagraph storyParagraph, List<kiy> list) {
        return new a().a(storyParagraph).a(list).a();
    }

    public static kiu a(DecadeTopTracksArtistsStory decadeTopTracksArtistsStory) {
        StoryParagraph fromProto = StoryParagraph.fromProto(decadeTopTracksArtistsStory.k());
        e<Year> eVar = decadeTopTracksArtistsStory.d;
        ArrayList arrayList = new ArrayList(eVar.size());
        for (Year year : eVar) {
            arrayList.add(kiy.a(year.d, year.k().h, year.k().d, year.k().e, year.l().h, year.l().d, year.l().e, year.e));
        }
        return a(fromProto, arrayList);
    }

    public abstract StoryParagraph a();

    public abstract List<kiy> b();
}

package defpackage;

import android.os.Parcelable;
import com.spotify.wrapped2019.v1.proto.Genre;
import com.spotify.wrapped2019.v1.proto.TopGenreStory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: kls reason: default package */
public abstract class kls implements Parcelable {

    /* renamed from: kls$a */
    public interface a {
        a a(String str);

        a a(List<klq> list);

        kls a();

        a b(String str);

        a c(String str);
    }

    public static kls a(TopGenreStory topGenreStory) {
        a c = new a().a(topGenreStory.e).b(topGenreStory.f).c(topGenreStory.d);
        e<Genre> eVar = topGenreStory.g;
        ArrayList arrayList = new ArrayList(eVar.size());
        for (Genre genre : eVar) {
            arrayList.add(new a().a(genre.d).a(genre.e).a());
        }
        return c.a((List<klq>) arrayList).a();
    }

    public static a e() {
        return new a();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract List<klq> d();
}

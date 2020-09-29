package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.wrapped2019.v1.proto.RankedEntity;
import com.spotify.wrapped2019.v1.proto.SecondaryArtistsStory;
import java.util.List;

/* renamed from: kke reason: default package */
public abstract class kke implements Parcelable {

    /* renamed from: kke$a */
    public static abstract class a {
        public abstract a a(String str);

        public abstract a a(List<kkd> list);

        public abstract kke a();
    }

    public static kke a(SecondaryArtistsStory secondaryArtistsStory) {
        a a2 = new a().a(secondaryArtistsStory.d);
        e<RankedEntity> eVar = secondaryArtistsStory.e;
        com.google.common.collect.ImmutableList.a g = ImmutableList.g();
        for (RankedEntity rankedEntity : eVar) {
            g.c(kkd.a(rankedEntity.f, rankedEntity.e, rankedEntity.d, rankedEntity.g));
        }
        return a2.a((List<kkd>) g.a()).a();
    }

    public static kke a(String str, List<kkd> list) {
        return new a().a(str).a(list).a();
    }

    public abstract String a();

    public abstract List<kkd> b();
}

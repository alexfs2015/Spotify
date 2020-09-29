package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.wrapped2019.v1.proto.Track;
import java.util.List;

/* renamed from: kmg reason: default package */
public abstract class kmg implements Parcelable {

    /* renamed from: kmg$a */
    public interface a {
        a a(String str);

        kmg a();

        a b(String str);

        a c(String str);

        a d(String str);
    }

    public static ImmutableList<kmg> a(List<Track> list) {
        com.google.common.collect.ImmutableList.a g = ImmutableList.g();
        for (Track track : list) {
            g.c(new a().a(track.f).b(track.e).c(track.d).d(track.g).a());
        }
        return g.a();
    }

    public static a e() {
        return new a();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();
}

package defpackage;

import android.os.Parcelable;
import com.spotify.wrapped2019.v1.proto.SeasonStory;

/* renamed from: kkq reason: default package */
public abstract class kkq implements Parcelable {

    /* renamed from: kkq$a */
    public interface a {
        a a(String str);

        a a(boolean z);

        kkq a();

        a b(String str);

        a c(String str);

        a d(String str);

        a e(String str);

        a f(String str);

        a g(String str);

        a h(String str);
    }

    public static kkq a(SeasonStory seasonStory, boolean z) {
        return new a().a(seasonStory.d).b(seasonStory.f).c(seasonStory.e).d(seasonStory.g).e(seasonStory.h).f(seasonStory.i).g(seasonStory.j).h(seasonStory.k).a(z).a();
    }

    public static a j() {
        return new a();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract boolean i();
}

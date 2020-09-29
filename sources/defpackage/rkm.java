package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.SortOption;
import java.util.List;

/* renamed from: rkm reason: default package */
public abstract class rkm implements Parcelable {
    public static final rkm f = i().a();

    /* renamed from: rkm$a */
    public static abstract class a {
        public abstract a a(ImmutableList<b> immutableList);

        public abstract a a(String str);

        public abstract a a(List<SortOption> list);

        public abstract rkm a();

        public abstract a b(String str);

        public abstract a c(String str);
    }

    /* renamed from: rkm$b */
    public static abstract class b implements Parcelable {

        /* renamed from: rkm$b$a */
        public static abstract class a {
            public abstract a a(SpotifyIconV2 spotifyIconV2);

            public abstract a a(String str);

            public abstract a a(boolean z);

            public abstract b a();

            public abstract a b(SpotifyIconV2 spotifyIconV2);

            public abstract a b(String str);

            public abstract a c(String str);
        }

        public static a h() {
            return new a();
        }

        public static Creator<b> i() {
            return new Creator<b>() {
                public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return (b) rkl.CREATOR.createFromParcel(parcel);
                }

                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new rkl[i];
                }
            };
        }

        public abstract String a();

        public abstract String b();

        public abstract String c();

        public abstract SpotifyIconV2 d();

        public abstract SpotifyIconV2 e();

        public abstract boolean f();

        public abstract a g();
    }

    /* renamed from: rkm$c */
    public static class c {
    }

    /* renamed from: rkm$d */
    public static class d {
    }

    public static a i() {
        String str = "";
        return new a().a(str).b(str).a((List<SortOption>) ImmutableList.d()).a(ImmutableList.d()).c(str);
    }

    public abstract ImmutableList<SortOption> a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract ImmutableList<b> e();

    public abstract a f();
}

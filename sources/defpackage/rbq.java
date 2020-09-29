package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.util.SortOption;
import java.util.List;

/* renamed from: rbq reason: default package */
public abstract class rbq implements Parcelable {
    public static final rbq f = i().a();

    /* renamed from: rbq$a */
    public static abstract class a {
        public abstract a a(ImmutableList<b> immutableList);

        public abstract a a(String str);

        public abstract a a(List<SortOption> list);

        public abstract rbq a();

        public abstract a b(String str);

        public abstract a c(String str);
    }

    /* renamed from: rbq$b */
    public static abstract class b implements Parcelable {

        /* renamed from: rbq$b$a */
        public static abstract class a {
            public abstract a a(SpotifyIconV2 spotifyIconV2);

            public abstract a a(String str);

            public abstract a a(boolean z);

            public abstract b a();

            public abstract a b(SpotifyIconV2 spotifyIconV2);

            public abstract a b(String str);

            public abstract a c(String str);
        }

        public abstract String a();

        public abstract String b();

        public abstract String c();

        public abstract SpotifyIconV2 d();

        public abstract SpotifyIconV2 e();

        public abstract boolean f();

        public abstract a g();

        public static a h() {
            return new a();
        }

        public static Creator<b> i() {
            return new Creator<b>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new rbp[i];
                }

                public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return (b) rbp.CREATOR.createFromParcel(parcel);
                }
            };
        }
    }

    /* renamed from: rbq$c */
    public static class c {
    }

    /* renamed from: rbq$d */
    public static class d {
    }

    public abstract ImmutableList<SortOption> a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract ImmutableList<b> e();

    public abstract a f();

    public static a i() {
        String str = "";
        return new a().a(str).b(str).a((List<SortOption>) ImmutableList.d()).a(ImmutableList.d()).c(str);
    }
}

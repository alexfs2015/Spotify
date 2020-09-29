package defpackage;

import com.spotify.mobile.android.util.SortOption;

/* renamed from: toe reason: default package */
public final class toe implements vua<SortOption> {
    private static final toe a = new toe();

    public static toe a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        SortOption sortOption = new SortOption("name");
        SortOption sortOption2 = new SortOption("addTime", true);
        sortOption2.mSecondarySortOption = sortOption;
        return (SortOption) vuf.a(sortOption2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

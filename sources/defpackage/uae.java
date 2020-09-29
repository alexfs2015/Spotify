package defpackage;

import com.spotify.mobile.android.util.SortOption;

/* renamed from: uae reason: default package */
public final class uae implements wig<SortOption> {
    private static final uae a = new uae();

    public static uae a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        SortOption sortOption = new SortOption("name");
        SortOption sortOption2 = new SortOption("addTime", true);
        sortOption2.mSecondarySortOption = sortOption;
        return (SortOption) wil.a(sortOption2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

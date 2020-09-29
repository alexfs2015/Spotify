package defpackage;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;

/* renamed from: uaz reason: default package */
public final class uaz implements wig<SortOption> {
    private static final uaz a = new uaz();

    public static uaz a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        SortOption sortOption = new SortOption("name");
        SortOption sortOption2 = new SortOption("publishDate", R.string.sort_order_date, true);
        sortOption2.mSecondarySortOption = sortOption;
        return (SortOption) wil.a(sortOption2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

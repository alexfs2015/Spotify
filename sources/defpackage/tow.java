package defpackage;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;

/* renamed from: tow reason: default package */
public final class tow implements vua<SortOption> {
    private static final tow a = new tow();

    public static tow a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        SortOption sortOption = new SortOption("name");
        SortOption sortOption2 = new SortOption("publishDate", R.string.sort_order_date, true);
        sortOption2.mSecondarySortOption = sortOption;
        return (SortOption) vuf.a(sortOption2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

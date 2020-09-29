package defpackage;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;

/* renamed from: tog reason: default package */
public final class tog implements vua<SortOption> {
    private static final tog a = new tog();

    public static tog a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        SortOption sortOption = new SortOption("name");
        SortOption sortOption2 = new SortOption("addTime", R.string.sort_order_recently_added, true);
        sortOption2.mSecondarySortOption = sortOption;
        return (SortOption) vuf.a(sortOption2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

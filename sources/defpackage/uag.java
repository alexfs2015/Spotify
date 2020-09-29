package defpackage;

import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;

/* renamed from: uag reason: default package */
public final class uag implements wig<SortOption> {
    private static final uag a = new uag();

    public static uag a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        SortOption sortOption = new SortOption("name");
        SortOption sortOption2 = new SortOption("addTime", R.string.sort_order_recently_added, true);
        sortOption2.mSecondarySortOption = sortOption;
        return (SortOption) wil.a(sortOption2, "Cannot return null from a non-@Nullable @Provides method");
    }
}

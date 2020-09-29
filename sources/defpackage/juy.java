package defpackage;

import com.spotify.mobile.android.util.SortOption;

/* renamed from: juy reason: default package */
public final class juy {
    @Deprecated
    public static SortOption a(way way) {
        SortOption sortOption = new SortOption(way.a());
        sortOption.a(way.b());
        way c = way.c();
        if (c != null) {
            sortOption.mSecondarySortOption = a(c);
        }
        return sortOption;
    }

    public static way a(SortOption sortOption) {
        SortOption sortOption2 = sortOption.mSecondarySortOption;
        return way.e().a(sortOption.mKey).a(sortOption.b()).a(sortOption2 != null ? a(sortOption2) : null).a();
    }
}

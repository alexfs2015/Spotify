package defpackage;

import com.spotify.mobile.android.util.SortOption;

/* renamed from: jsr reason: default package */
public final class jsr {
    @Deprecated
    public static SortOption a(vns vns) {
        SortOption sortOption = new SortOption(vns.a());
        sortOption.a(vns.b());
        vns c = vns.c();
        if (c != null) {
            sortOption.mSecondarySortOption = a(c);
        }
        return sortOption;
    }

    public static vns a(SortOption sortOption) {
        SortOption sortOption2 = sortOption.mSecondarySortOption;
        return vns.e().a(sortOption.mKey).a(sortOption.b()).a(sortOption2 != null ? a(sortOption2) : null).a();
    }
}

package defpackage;

import com.spotify.mobile.android.util.SortOption;

/* renamed from: juz reason: default package */
public final class juz {
    public final SortOption a;
    private SortOption b;

    public juz(SortOption sortOption) {
        this.b = sortOption;
        this.a = sortOption;
    }

    public final juz a(SortOption sortOption) {
        this.b.mSecondarySortOption = sortOption;
        this.b = sortOption;
        return this;
    }
}

package defpackage;

import com.spotify.mobile.android.util.SortOption;

/* renamed from: jss reason: default package */
public final class jss {
    public final SortOption a;
    private SortOption b;

    public jss(SortOption sortOption) {
        this.b = sortOption;
        this.a = sortOption;
    }

    public final jss a(SortOption sortOption) {
        this.b.mSecondarySortOption = sortOption;
        this.b = sortOption;
        return this;
    }
}

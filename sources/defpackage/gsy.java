package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.playlist.models.Show.ConsumptionOrder;
import io.reactivex.Single;

/* renamed from: gsy reason: default package */
public final class gsy {
    private static final SortOption a;
    private static final SortOption b;
    private final RxResolver c;
    private final wug d;
    private final wug e;

    static {
        String str = "number";
        SortOption sortOption = new SortOption(str, R.string.sort_order_date, true);
        String str2 = "publishDate";
        SortOption sortOption2 = new SortOption(str2, true);
        String str3 = "name";
        sortOption2.mSecondarySortOption = new SortOption(str3);
        sortOption.mSecondarySortOption = sortOption2;
        a = sortOption;
        SortOption a2 = new SortOption(str, R.string.sort_order_date, true).a(true);
        SortOption a3 = new SortOption(str2, true).a(true);
        a3.mSecondarySortOption = new SortOption(str3);
        a2.mSecondarySortOption = a3;
        b = a2;
    }

    public gsy(RxResolver rxResolver, wug wug, wug wug2) {
        this.c = rxResolver;
        this.d = wug;
        this.e = wug2;
    }

    public final Single<SortOption> a(String str) {
        return vun.a(new rxn(str, this.c, this.d, this.e).a.c($$Lambda$gsy$QiCM6re_u_9ZlYj8ze1KQwlhjjI.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SortOption a(rxl rxl) {
        if (rxl.a().j() == ConsumptionOrder.SEQUENTIAL) {
            return b;
        }
        return a;
    }
}

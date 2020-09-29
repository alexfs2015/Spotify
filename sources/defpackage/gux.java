package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.R;
import com.spotify.playlist.models.Show.ConsumptionOrder;
import io.reactivex.Single;

/* renamed from: gux reason: default package */
public final class gux {
    private static final SortOption a;
    private static final SortOption b;
    private final RxResolver c;
    private final xil d;
    private final xil e;

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

    public gux(RxResolver rxResolver, xil xil, xil xil2) {
        this.c = rxResolver;
        this.d = xil;
        this.e = xil2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SortOption a(sgv sgv) {
        return sgv.a().j() == ConsumptionOrder.SEQUENTIAL ? b : a;
    }

    public final Single<SortOption> a(String str) {
        return wit.a(new sgx(str, this.c, this.d, this.e).a.c($$Lambda$gux$trKUIZE8Q7CotSEpai8wg1Drgz8.INSTANCE));
    }
}

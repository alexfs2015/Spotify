package defpackage;

import com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType;
import io.reactivex.Flowable;

/* renamed from: qhd reason: default package */
public final class qhd implements wig<Flowable<hcs>> {
    private final wzi<soo> a;
    private final wzi<sot> b;
    private final wzi<SearchRequestType> c;

    private qhd(wzi<soo> wzi, wzi<sot> wzi2, wzi<SearchRequestType> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qhd a(wzi<soo> wzi, wzi<sot> wzi2, wzi<SearchRequestType> wzi3) {
        return new qhd(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        Flowable flowable;
        wzi<soo> wzi = this.a;
        wzi<sot> wzi2 = this.b;
        SearchRequestType searchRequestType = (SearchRequestType) this.c.get();
        if (searchRequestType == SearchRequestType.SEARCH_V4_NFT || searchRequestType == SearchRequestType.SEARCH_V4) {
            sot sot = (sot) wzi2.get();
            flowable = sot.a.a().a(sot.b);
        } else {
            flowable = ((soo) wzi.get()).a();
        }
        return (Flowable) wil.a(flowable, "Cannot return null from a non-@Nullable @Provides method");
    }
}

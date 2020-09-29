package defpackage;

import com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType;
import io.reactivex.Flowable;

/* renamed from: pyf reason: default package */
public final class pyf implements vua<Flowable<gzz>> {
    private final wlc<seh> a;
    private final wlc<sem> b;
    private final wlc<SearchRequestType> c;

    private pyf(wlc<seh> wlc, wlc<sem> wlc2, wlc<SearchRequestType> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static pyf a(wlc<seh> wlc, wlc<sem> wlc2, wlc<SearchRequestType> wlc3) {
        return new pyf(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        Flowable flowable;
        wlc<seh> wlc = this.a;
        wlc<sem> wlc2 = this.b;
        SearchRequestType searchRequestType = (SearchRequestType) this.c.get();
        if (searchRequestType == SearchRequestType.SEARCH_V4_NFT || searchRequestType == SearchRequestType.SEARCH_V4) {
            sem sem = (sem) wlc2.get();
            flowable = sem.a.a().a(sem.b);
        } else {
            flowable = ((seh) wlc.get()).a();
        }
        return (Flowable) vuf.a(flowable, "Cannot return null from a non-@Nullable @Provides method");
    }
}

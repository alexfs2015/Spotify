package defpackage;

import com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType;

/* renamed from: pym reason: default package */
public final class pym implements vua<SearchRequestType> {
    private final wlc<Boolean> a;
    private final wlc<Boolean> b;

    private pym(wlc<Boolean> wlc, wlc<Boolean> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pym a(wlc<Boolean> wlc, wlc<Boolean> wlc2) {
        return new pym(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        SearchRequestType searchRequestType;
        boolean booleanValue = ((Boolean) this.a.get()).booleanValue();
        if (((Boolean) this.b.get()).booleanValue()) {
            searchRequestType = SearchRequestType.SEARCH_V4_ASSISTED_CURATION;
        } else if (booleanValue) {
            searchRequestType = SearchRequestType.SEARCH_V4_NFT;
        } else {
            searchRequestType = SearchRequestType.SEARCH_V4;
        }
        return (SearchRequestType) vuf.a(searchRequestType, "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType;

/* renamed from: qgi reason: default package */
public final class qgi implements wig<SearchRequestType> {
    private final wzi<Boolean> a;
    private final wzi<Boolean> b;

    private qgi(wzi<Boolean> wzi, wzi<Boolean> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static qgi a(wzi<Boolean> wzi, wzi<Boolean> wzi2) {
        return new qgi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        SearchRequestType searchRequestType = ((Boolean) this.b.get()).booleanValue() ? SearchRequestType.SEARCH_V4_DRILLDOWN_ASSISTED_CURATION : ((Boolean) this.a.get()).booleanValue() ? SearchRequestType.SEARCH_V4_DRILLDOWN_NFT : SearchRequestType.SEARCH_V4_DRILLDOWN;
        return (SearchRequestType) wil.a(searchRequestType, "Cannot return null from a non-@Nullable @Provides method");
    }
}

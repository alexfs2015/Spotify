package defpackage;

import com.spotify.music.libs.search.rx.requests.SearchRequestFactory;
import com.spotify.music.libs.search.rx.requests.SearchRequestFactory.SearchRequestType;

/* renamed from: sqp reason: default package */
public final class sqp implements wig<SearchRequestFactory> {
    private final wzi<SearchRequestType> a;
    private final wzi<sli> b;

    private sqp(wzi<SearchRequestType> wzi, wzi<sli> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static sqp a(wzi<SearchRequestType> wzi, wzi<sli> wzi2) {
        return new sqp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new SearchRequestFactory((SearchRequestType) this.a.get(), (sli) this.b.get());
    }
}

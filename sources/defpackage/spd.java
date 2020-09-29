package defpackage;

import com.spotify.music.libs.search.rx.requests.SearchRequestFactory;

/* renamed from: spd reason: default package */
public final class spd implements wig<spc> {
    private final wzi<SearchRequestFactory> a;

    private spd(wzi<SearchRequestFactory> wzi) {
        this.a = wzi;
    }

    public static spd a(wzi<SearchRequestFactory> wzi) {
        return new spd(wzi);
    }

    public final /* synthetic */ Object get() {
        return new spc((SearchRequestFactory) this.a.get());
    }
}

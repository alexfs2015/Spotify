package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;
import java.util.Iterator;

/* renamed from: ryz reason: default package */
public final class ryz {
    private final rzf a;

    public ryz(rzf rzf) {
        this.a = (rzf) fay.a(rzf);
    }

    public final rze<SearchHistoryItem> a() {
        return this.a.d();
    }

    public final void a(SearchHistoryItem searchHistoryItem) {
        this.a.d().a(fay.a(searchHistoryItem));
    }

    public final void a(String str) {
        SearchHistoryItem searchHistoryItem;
        rze d = this.a.d();
        Iterator it = d.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                searchHistoryItem = null;
                break;
            }
            searchHistoryItem = (SearchHistoryItem) it.next();
            if (searchHistoryItem.getOriginUri().equals(str)) {
                break;
            }
        }
        if (searchHistoryItem != null) {
            d.b(searchHistoryItem);
        }
    }

    public final void b() {
        this.a.d().b();
    }

    public final boolean c() {
        return this.a.c();
    }

    public final void d() {
        this.a.b();
    }
}

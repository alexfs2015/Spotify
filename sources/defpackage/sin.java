package defpackage;

import com.spotify.music.libs.search.history.SearchHistoryItem;
import java.util.Iterator;

/* renamed from: sin reason: default package */
public final class sin {
    private final sit a;

    public sin(sit sit) {
        this.a = (sit) fbp.a(sit);
    }

    public final sis<SearchHistoryItem> a() {
        return this.a.d();
    }

    public final void a(SearchHistoryItem searchHistoryItem) {
        this.a.d().a(fbp.a(searchHistoryItem));
    }

    public final void a(String str) {
        SearchHistoryItem searchHistoryItem;
        sis d = this.a.d();
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

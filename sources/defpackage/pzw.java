package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: pzw reason: default package */
public final class pzw implements pzs {
    private Optional<pzs> a = Optional.e();

    public final void a(pzs pzs) {
        this.a = Optional.c(pzs);
    }

    public final void a(String str, int i, String str2, SearchHistoryItem searchHistoryItem) {
        if (this.a.b()) {
            ((pzs) this.a.c()).a(str, i, str2, searchHistoryItem);
        }
    }

    public final void a(String str, int i) {
        if (this.a.b()) {
            ((pzs) this.a.c()).a(str, i);
        }
    }

    public final void b(String str, int i) {
        if (this.a.b()) {
            ((pzs) this.a.c()).b(str, i);
        }
    }

    public final void a() {
        if (this.a.b()) {
            ((pzs) this.a.c()).a();
        }
    }
}

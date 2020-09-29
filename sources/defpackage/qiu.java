package defpackage;

import com.google.common.base.Optional;
import com.spotify.music.libs.search.history.SearchHistoryItem;

/* renamed from: qiu reason: default package */
public final class qiu implements qiq {
    private Optional<qiq> a = Optional.e();

    public final void a() {
        if (this.a.b()) {
            ((qiq) this.a.c()).a();
        }
    }

    public final void a(String str, int i) {
        if (this.a.b()) {
            ((qiq) this.a.c()).a(str, i);
        }
    }

    public final void a(String str, int i, String str2, SearchHistoryItem searchHistoryItem) {
        if (this.a.b()) {
            ((qiq) this.a.c()).a(str, i, str2, searchHistoryItem);
        }
    }

    public final void a(qiq qiq) {
        this.a = Optional.c(qiq);
    }

    public final void b(String str, int i) {
        if (this.a.b()) {
            ((qiq) this.a.c()).b(str, i);
        }
    }
}

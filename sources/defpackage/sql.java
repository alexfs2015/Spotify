package defpackage;

import com.spotify.music.search.podcasts.tabs.SearchTab;

/* renamed from: sql reason: default package */
public abstract class sql {
    public static sql a(SearchTab searchTab, sql sql) {
        return new sqg(sql.a(), new f(searchTab.mTabId), null);
    }

    public static sql a(String str) {
        return new sqg(str, new g(), null);
    }

    public abstract String a();

    public abstract sqm b();

    public abstract String c();
}

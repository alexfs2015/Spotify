package defpackage;

import com.spotify.music.search.podcasts.tabs.SearchTab;

/* renamed from: sge reason: default package */
public abstract class sge {
    public abstract String a();

    public abstract sgf b();

    public abstract String c();

    public static sge a(String str) {
        return new sfz(str, new g(), null);
    }

    public static sge a(SearchTab searchTab, sge sge) {
        return new sfz(sge.a(), new f(searchTab.mTabId), null);
    }
}

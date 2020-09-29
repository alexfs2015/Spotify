package defpackage;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import java.util.Collections;
import java.util.List;

/* renamed from: hrc reason: default package */
public final class hrc implements hpd {
    public List<MediaBrowserItem> a;
    public List<MediaBrowserItem> b;
    public List<MediaBrowserItem> c;
    public List<MediaBrowserItem> d;
    public String e;
    private final Context f;
    private final hrp g;

    public hrc(Context context, hrp hrp) {
        this.f = context;
        this.g = hrp;
    }

    public final void a() {
        this.e = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final void a(String str, hpe hpe) {
        String str2 = "com.spotify.search.albums";
        if (str2.equals(str)) {
            a(str2, this.a, hpe);
            return;
        }
        String str3 = "com.spotify.search.artists";
        if (str3.equals(str)) {
            a(str3, this.b, hpe);
            return;
        }
        String str4 = "com.spotify.search.playlists";
        if (str4.equals(str)) {
            a(str4, this.c, hpe);
            return;
        }
        String str5 = "com.spotify.search.tracks";
        if (str5.equals(str)) {
            a(str5, this.d, hpe);
        } else {
            hpe.a((Throwable) new IllegalArgumentException("Identifier is not supported by this MediaBrowserItemLoader."));
        }
    }

    public final boolean a(String str) {
        return "com.spotify.search.albums".equals(str) || "com.spotify.search.artists".equals(str) || "com.spotify.search.playlists".equals(str) || "com.spotify.search.tracks".equals(str);
    }

    public void a(List<MediaBrowserItem> list, boolean z, String str, int i) {
        if (z) {
            hpa hpa = new hpa(str);
            hpa.b = this.f.getString(i);
            hpa.a = ActionType.BROWSABLE;
            list.add(hpa.b());
        }
    }

    private void a(String str, List<MediaBrowserItem> list, hpe hpe) {
        if (list != null) {
            Logger.b("Returning search result for query = \"%s\", id = \"%s\", %d items.", this.e, str, Integer.valueOf(list.size()));
            hpe.a(list);
            return;
        }
        Logger.b("Returning EMPTY search result for query = \"%s\", id = \"%s\".", this.e, str);
        hpe.a(Collections.emptyList());
    }
}

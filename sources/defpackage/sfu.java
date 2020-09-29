package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: sfu reason: default package */
public final class sfu {
    private final fpt a;
    private final boolean b;

    public sfu(fpt fpt, boolean z) {
        this.a = (fpt) fay.a(fpt);
        this.b = z;
    }

    public final SearchHistoryItem a(String str, gzt gzt) {
        gzr a2 = a(gzt.componentId());
        String title = ((gzv) fay.a(((gzt) fay.a(gzt)).text())).title();
        if (title == null) {
            c(str, gzt);
        }
        String str2 = (String) jtc.a(title, "");
        String string = gzt.custom().string(SearchHistoryItem.SEARCH_HISTORY_SUBTITLE);
        return SearchHistoryItem.create(a2.id(), a2.category(), b(str, gzt), str2, string, a(gzt), str, rzj.e(gzt), lla.b(gzt), gww.a(gzt));
    }

    private static gzr a(gzr gzr) {
        return HubsGlueRow.NORMAL.category().equals(gzr.category()) ? gzr : HubsGlueRow.NORMAL;
    }

    private String b(String str, gzt gzt) {
        if (ViewUris.u.b(str)) {
            String string = gzt.metadata().string("album_uri");
            if (a(string)) {
                return string;
            }
        }
        return str;
    }

    private static String a(gzt gzt) {
        gzw main = gzt.images().main();
        if (main != null) {
            return main.uri();
        }
        String string = gzt.custom().string(SearchHistoryItem.SEARCH_HISTORY_IMAGE_URI);
        if (!fax.a(string)) {
            return string;
        }
        return null;
    }

    private static void c(String str, gzt gzt) {
        Assertion.a((Throwable) new IllegalStateException(String.format("HubsModel does not contain title, id = %s, uri = %s, requestId = %s", new Object[]{gzt.id(), str, rzj.d(gzt)})));
    }

    private boolean a(String str) {
        return !fax.a(str) && !sgt.a(this.a) && !this.b;
    }
}

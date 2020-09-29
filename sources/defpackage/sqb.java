package defpackage;

import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: sqb reason: default package */
public final class sqb {
    private final fqn a;
    private final boolean b;

    public sqb(fqn fqn, boolean z) {
        this.a = (fqn) fbp.a(fqn);
        this.b = z;
    }

    private static hck a(hck hck) {
        return HubsGlueRow.NORMAL.category().equals(hck.category()) ? hck : HubsGlueRow.NORMAL;
    }

    private static String a(hcm hcm) {
        hcp main = hcm.images().main();
        if (main != null) {
            return main.uri();
        }
        String string = hcm.custom().string(SearchHistoryItem.SEARCH_HISTORY_IMAGE_URI);
        if (!fbo.a(string)) {
            return string;
        }
        return null;
    }

    private boolean a(String str) {
        return !fbo.a(str) && !sra.a(this.a) && !this.b;
    }

    private String b(String str, hcm hcm) {
        if (ViewUris.t.b(str)) {
            String string = hcm.metadata().string("album_uri");
            if (a(string)) {
                return string;
            }
        }
        return str;
    }

    private static void c(String str, hcm hcm) {
        Assertion.a((Throwable) new IllegalStateException(String.format("HubsModel does not contain title, id = %s, uri = %s, requestId = %s", new Object[]{hcm.id(), str, six.d(hcm)})));
    }

    public final SearchHistoryItem a(String str, hcm hcm) {
        hck a2 = a(hcm.componentId());
        String title = ((hco) fbp.a(((hcm) fbp.a(hcm)).text())).title();
        if (title == null) {
            c(str, hcm);
        }
        String str2 = (String) jvi.a(title, "");
        String string = hcm.custom().string(SearchHistoryItem.SEARCH_HISTORY_SUBTITLE);
        return SearchHistoryItem.create(a2.id(), a2.category(), b(str, hcm), str2, string, a(hcm), str, six.e(hcm), lpa.b(hcm), gzg.a(hcm));
    }
}

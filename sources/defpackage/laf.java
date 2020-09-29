package defpackage;

import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: laf reason: default package */
public final class laf implements gxk {
    private final row b;
    private final has c;
    private final hcf d;
    private final wbt e;
    private final kyk f;
    private final fqn g;

    /* renamed from: laf$a */
    public static abstract class a implements rov {

        /* renamed from: laf$a$a reason: collision with other inner class name */
        public interface C0048a extends defpackage.rov.a<a, C0048a> {
        }

        public static a a(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
            lae lae = new lae(str, str2, str3, z, false, false, null, str4, str5, Collections.singletonList(str5), str6, null);
            return lae;
        }

        public abstract C0048a m();

        public final defpackage.rov.a<?, ?> n() {
            return m();
        }
    }

    public laf(row row, has has, hcf hcf, wbt wbt, kyk kyk, fqn fqn) {
        this.b = (row) fbp.a(row);
        this.c = (has) fbp.a(has);
        this.d = hcf;
        this.e = wbt;
        this.f = (kyk) fbp.a(kyk);
        this.g = (fqn) fbp.a(fqn);
    }

    private static ArrayList<rov> a(hcj[] hcjArr) {
        ArrayList<rov> a2 = Lists.a(hcjArr.length);
        for (hcj hcj : hcjArr) {
            String str = "";
            a2.add(a.a(hcj.string("trackUri", str), hcj.string("trackName", str), hcj.string("previewId", str), hcj.boolValue("isExplicit", false), hcj.string("albumName", str), hcj.string("artistName", str), hcj.string(SearchHistoryItem.SEARCH_HISTORY_IMAGE_URI, str)));
        }
        return a2;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("title", "");
        hcj[] bundleArray = hci.data().bundleArray("tracks");
        String string2 = hci.data().string("uri", "unknown_uri");
        if (bundleArray != null) {
            ArrayList a2 = a(bundleArray);
            if (!a2.isEmpty()) {
                if (!ViewUris.t.b(string2) && this.f.e(this.g)) {
                    this.b.b(this.g, a2, string, string2);
                } else {
                    this.b.a(this.g, a(bundleArray), string, string2);
                }
                this.c.logInteraction(string2, gwy.b, "trackCloudShowAllSongs", null);
                this.e.a(this.d.a(gwy).a());
                return;
            }
            Assertion.b("List of tracks cannot be empty.");
        }
    }
}

package defpackage;

import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.search.history.SearchHistoryItem;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: kww reason: default package */
public final class kww implements gvk {
    private final rfu b;
    private final gxz c;
    private final gzm d;
    private final vol e;
    private final kvb f;
    private final fpt g;

    /* renamed from: kww$a */
    public static abstract class a implements rft {

        /* renamed from: kww$a$a reason: collision with other inner class name */
        public interface C0047a extends defpackage.rft.a<a, C0047a> {
        }

        public abstract C0047a m();

        public static a a(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
            kwv kwv = new kwv(str, str2, str3, z, false, false, null, str4, str5, Collections.singletonList(str5), str6, null);
            return kwv;
        }

        public final defpackage.rft.a<?, ?> n() {
            return m();
        }
    }

    public kww(rfu rfu, gxz gxz, gzm gzm, vol vol, kvb kvb, fpt fpt) {
        this.b = (rfu) fay.a(rfu);
        this.c = (gxz) fay.a(gxz);
        this.d = gzm;
        this.e = vol;
        this.f = (kvb) fay.a(kvb);
        this.g = (fpt) fay.a(fpt);
    }

    public final void handleCommand(gzp gzp, guy guy) {
        String string = gzp.data().string("title", "");
        gzq[] bundleArray = gzp.data().bundleArray("tracks");
        String string2 = gzp.data().string("uri", "unknown_uri");
        if (bundleArray != null) {
            ArrayList a2 = a(bundleArray);
            if (!a2.isEmpty()) {
                if (!ViewUris.u.b(string2) && this.f.e(this.g)) {
                    this.b.b(this.g, a2, string, string2);
                } else {
                    this.b.a(this.g, a(bundleArray), string, string2);
                }
                this.c.logInteraction(string2, guy.b, "trackCloudShowAllSongs", null);
                this.e.a(this.d.a(guy).a());
                return;
            }
            Assertion.b("List of tracks cannot be empty.");
        }
    }

    private static ArrayList<rft> a(gzq[] gzqArr) {
        ArrayList<rft> a2 = Lists.a(gzqArr.length);
        for (gzq gzq : gzqArr) {
            String str = "";
            a2.add(a.a(gzq.string("trackUri", str), gzq.string("trackName", str), gzq.string("previewId", str), gzq.boolValue("isExplicit", false), gzq.string("albumName", str), gzq.string("artistName", str), gzq.string(SearchHistoryItem.SEARCH_HISTORY_IMAGE_URI, str)));
        }
        return a2;
    }
}

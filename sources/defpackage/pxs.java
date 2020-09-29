package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: pxs reason: default package */
public final class pxs implements vua<String> {
    private final wlc<String> a;

    private pxs(wlc<String> wlc) {
        this.a = wlc;
    }

    public static pxs a(wlc<String> wlc) {
        return new pxs(wlc);
    }

    public final /* synthetic */ Object get() {
        String str;
        String str2 = (String) this.a.get();
        fay.a(str2);
        if (ViewUris.ai.b(str2)) {
            str = (String) fay.a(jua.a().a(str2).a(1));
        } else {
            StringBuilder sb = new StringBuilder("Unable to extract search drillDown type from URI: ");
            sb.append(str2);
            Assertion.b(sb.toString());
            str = "";
        }
        return (String) vuf.a(str, "Cannot return null from a non-@Nullable @Provides method");
    }
}

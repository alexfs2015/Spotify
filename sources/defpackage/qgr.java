package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: qgr reason: default package */
public final class qgr implements wig<String> {
    private final wzi<String> a;

    private qgr(wzi<String> wzi) {
        this.a = wzi;
    }

    public static qgr a(wzi<String> wzi) {
        return new qgr(wzi);
    }

    public final /* synthetic */ Object get() {
        String str;
        String str2 = (String) this.a.get();
        fbp.a(str2);
        if (ViewUris.ah.b(str2)) {
            str = (String) fbp.a(jwi.a().a(str2).a(2, ":"));
        } else {
            StringBuilder sb = new StringBuilder("Unable to extract search query from URI: ");
            sb.append(str2);
            Assertion.b(sb.toString());
            str = "";
        }
        return (String) wil.a(str, "Cannot return null from a non-@Nullable @Provides method");
    }
}

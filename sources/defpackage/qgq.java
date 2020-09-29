package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: qgq reason: default package */
public final class qgq implements wig<String> {
    private final wzi<String> a;

    private qgq(wzi<String> wzi) {
        this.a = wzi;
    }

    public static qgq a(wzi<String> wzi) {
        return new qgq(wzi);
    }

    public final /* synthetic */ Object get() {
        String str;
        String str2 = (String) this.a.get();
        fbp.a(str2);
        if (ViewUris.ah.b(str2)) {
            str = (String) fbp.a(jwi.a().a(str2).a(1));
        } else {
            StringBuilder sb = new StringBuilder("Unable to extract search drillDown type from URI: ");
            sb.append(str2);
            Assertion.b(sb.toString());
            str = "";
        }
        return (String) wil.a(str, "Cannot return null from a non-@Nullable @Provides method");
    }
}

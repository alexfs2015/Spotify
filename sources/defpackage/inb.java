package defpackage;

import android.os.Bundle;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: inb reason: default package */
public final class inb {
    public static jqx a(String str, Bundle bundle, fqn fqn) {
        sso a = ViewUris.aJ.a(str);
        imy imy = new imy();
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putParcelable("artist_uri", a);
        imy.ae().g(bundle2);
        fqo.a(imy.ae(), fqn);
        return imy;
    }
}

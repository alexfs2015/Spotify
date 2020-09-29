package defpackage;

import android.os.Bundle;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: iko reason: default package */
public final class iko {
    public static jol a(String str, Bundle bundle, fpt fpt) {
        sih a = ViewUris.aK.a(str);
        ikl ikl = new ikl();
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        bundle2.putParcelable("artist_uri", a);
        ikl.ae().g(bundle2);
        fpu.a(ikl.ae(), fpt);
        return ikl;
    }
}

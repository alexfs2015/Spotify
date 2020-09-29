package defpackage;

import android.widget.ImageView;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;

/* renamed from: gwt reason: default package */
public final class gwt {
    static void a(HubsGlueImageDelegate hubsGlueImageDelegate, ImageView imageView, gzw gzw, String str, ImageConfig imageConfig) {
        if (str != null) {
            hubsGlueImageDelegate.a(imageView, str);
        } else {
            hubsGlueImageDelegate.a(imageView, gzw, imageConfig);
        }
    }

    static boolean a(gzt gzt) {
        return gzt.custom().bundle("calendar") != null;
    }

    public static boolean b(gzt gzt) {
        return (gzt.images().main() == null && gzt.images().icon() == null && !a(gzt)) ? false : true;
    }
}

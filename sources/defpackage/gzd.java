package defpackage;

import android.widget.ImageView;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate.ImageConfig;

/* renamed from: gzd reason: default package */
public final class gzd {
    static void a(HubsGlueImageDelegate hubsGlueImageDelegate, ImageView imageView, hcp hcp, String str, ImageConfig imageConfig) {
        if (str != null) {
            hubsGlueImageDelegate.a(imageView, str);
        } else {
            hubsGlueImageDelegate.a(imageView, hcp, imageConfig);
        }
    }

    static boolean a(hcm hcm) {
        return hcm.custom().bundle("calendar") != null;
    }

    public static boolean b(hcm hcm) {
        return (hcm.images().main() == null && hcm.images().icon() == null && !a(hcm)) ? false : true;
    }
}

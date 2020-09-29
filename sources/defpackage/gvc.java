package defpackage;

import com.spotify.mobile.android.converter.ConvertProductValueException;
import com.spotify.mobile.android.spotlets.ads.model.Ad;

/* renamed from: gvc reason: default package */
public final class gvc {
    public static Boolean a(String str) {
        if (fbo.a(str)) {
            return Boolean.FALSE;
        }
        if (str.equalsIgnoreCase("true") || "1".equals(str)) {
            return Boolean.TRUE;
        }
        if (str.equalsIgnoreCase("false") || Ad.DEFAULT_SKIPPABLE_AD_DELAY.equals(str)) {
            return Boolean.FALSE;
        }
        throw new ConvertProductValueException(Boolean.class, str);
    }
}

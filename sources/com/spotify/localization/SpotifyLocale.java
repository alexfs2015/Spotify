package com.spotify.localization;

import android.content.Context;
import java.util.Locale;

public final class SpotifyLocale {

    public enum Separator {
        UNDERSCORE("_"),
        DASH("-");
        
        public final String mSeparator;

        private Separator(String str) {
            this.mSeparator = str;
        }
    }

    public static String a() {
        return gos.a(Locale.getDefault(), Separator.UNDERSCORE.mSeparator);
    }

    public static String a(Context context) {
        fbp.a(context);
        return gos.a(jua.a(context), Separator.UNDERSCORE.mSeparator);
    }

    public static String b(Context context) {
        fbp.a(context);
        return gos.a(jua.a(context));
    }
}

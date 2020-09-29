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
        return gnd.a(Locale.getDefault(), Separator.UNDERSCORE.mSeparator);
    }

    public static String a(Context context) {
        fay.a(context);
        return gnd.a(jrq.a(context), Separator.UNDERSCORE.mSeparator);
    }

    public static String b(Context context) {
        fay.a(context);
        return gnd.a(jrq.a(context));
    }
}

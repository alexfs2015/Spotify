package com.spotify.mobile.android.spotlets.appprotocol.util;

import java.util.Locale;

public final class OptionExtrasUtil {

    public enum Streamtype {
        ALARM("alarm"),
        DEFAULT("default"),
        UNKNOWN_STREAMTYPE("unknown");
        
        public final String type;

        private Streamtype(String str) {
            this.type = str;
        }

        public static Streamtype a(String str) {
            if (ALARM.type.equals(str.toLowerCase(Locale.getDefault()))) {
                return ALARM;
            }
            return UNKNOWN_STREAMTYPE;
        }
    }

    public enum UriOptionExtras {
        STREAMTYPE("streamtype"),
        UNKNOWN_OPTION_EXTRA("unknown");
        
        public final String type;

        private UriOptionExtras(String str) {
            this.type = str;
        }
    }
}

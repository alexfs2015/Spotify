package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: meh reason: default package */
public final class meh implements tvp {
    public final a a() {
        return new a() {
            public final FormatListType a() {
                return FormatListType.CHART;
            }

            public final boolean a(fqn fqn) {
                return false;
            }

            public final Pattern b() {
                return Pattern.compile("chart");
            }

            public final String c() {
                return "spotify:internal:format_list_chart";
            }
        };
    }
}

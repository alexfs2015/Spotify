package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: mae reason: default package */
public final class mae implements tjx {
    public final a a() {
        return new a() {
            public final boolean a(fpt fpt) {
                return false;
            }

            public final String c() {
                return "spotify:internal:format_list_chart";
            }

            public final FormatListType a() {
                return FormatListType.CHART;
            }

            public final Pattern b() {
                return Pattern.compile("chart");
            }
        };
    }
}

package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: puv reason: default package */
public final class puv implements tjx {
    public final a a() {
        return new a() {
            public final boolean a(fpt fpt) {
                return false;
            }

            public final String c() {
                return "spotify:internal:format_list_personalized_sets";
            }

            public final FormatListType a() {
                return FormatListType.RELEASE_RADAR;
            }

            public final Pattern b() {
                return Pattern.compile("release-radar");
            }
        };
    }
}

package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: qdr reason: default package */
public final class qdr implements tvp {
    public final a a() {
        return new a() {
            public final FormatListType a() {
                return FormatListType.RELEASE_RADAR;
            }

            public final boolean a(fqn fqn) {
                return false;
            }

            public final Pattern b() {
                return Pattern.compile("release-radar");
            }

            public final String c() {
                return "spotify:internal:format_list_personalized_sets";
            }
        };
    }
}

package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: mqw reason: default package */
public final class mqw implements tvp {
    public final a a() {
        return new a() {
            public final FormatListType a() {
                return FormatListType.DISCOVER_WEEKLY;
            }

            public final boolean a(fqn fqn) {
                return false;
            }

            public final Pattern b() {
                return Pattern.compile("discover-weekly|personalised-sets-.*");
            }

            public final String c() {
                return "spotify:internal:format_list_personalized_sets";
            }
        };
    }
}

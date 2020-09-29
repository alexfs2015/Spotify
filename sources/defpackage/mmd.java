package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: mmd reason: default package */
public final class mmd implements tjx {
    public final a a() {
        return new a() {
            public final boolean a(fpt fpt) {
                return false;
            }

            public final String c() {
                return "spotify:internal:format_list_personalized_sets";
            }

            public final FormatListType a() {
                return FormatListType.DISCOVER_WEEKLY;
            }

            public final Pattern b() {
                return Pattern.compile("discover-weekly|personalised-sets-.*");
            }
        };
    }
}

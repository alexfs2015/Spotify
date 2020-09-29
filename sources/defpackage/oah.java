package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: oah reason: default package */
public final class oah implements tvp {
    public final a a() {
        return new a() {
            public final FormatListType a() {
                return FormatListType.MISSED_CONNECTIONS;
            }

            public final boolean a(fqn fqn) {
                return false;
            }

            public final Pattern b() {
                return Pattern.compile("recent-discoveries-.*");
            }

            public final String c() {
                return "";
            }
        };
    }
}

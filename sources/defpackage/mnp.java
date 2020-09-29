package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: mnp reason: default package */
public final class mnp implements tvp {
    public final a a() {
        return new a() {
            public final FormatListType a() {
                return FormatListType.DAILY_MIX;
            }

            public final boolean a(fqn fqn) {
                return false;
            }

            public final Pattern b() {
                return Pattern.compile("daily-mix");
            }

            public final String c() {
                return "";
            }
        };
    }
}

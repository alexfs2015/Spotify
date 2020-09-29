package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: miw reason: default package */
public final class miw implements tjx {
    public final a a() {
        return new a() {
            public final boolean a(fpt fpt) {
                return false;
            }

            public final String c() {
                return "";
            }

            public final FormatListType a() {
                return FormatListType.DAILY_MIX;
            }

            public final Pattern b() {
                return Pattern.compile("daily-mix");
            }
        };
    }
}

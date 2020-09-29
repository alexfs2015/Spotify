package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: oxa reason: default package */
public final class oxa implements tvp {
    public final a a() {
        return new a() {
            public final FormatListType a() {
                return FormatListType.P2S;
            }

            public final boolean a(fqn fqn) {
                return false;
            }

            public final Pattern b() {
                return Pattern.compile("format-shows|format-shows-shuffle");
            }

            public final String c() {
                return null;
            }
        };
    }
}

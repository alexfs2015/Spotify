package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: opu reason: default package */
public final class opu implements tjx {
    public final a a() {
        return new a() {
            public final boolean a(fpt fpt) {
                return false;
            }

            public final String c() {
                return null;
            }

            public final FormatListType a() {
                return FormatListType.P2S;
            }

            public final Pattern b() {
                return Pattern.compile("format-shows|format-shows-shuffle");
            }
        };
    }
}

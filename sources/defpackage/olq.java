package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: olq reason: default package */
public final class olq implements tvp {
    public final a a() {
        return new a() {
            public final FormatListType a() {
                return FormatListType.EDITORIAL;
            }

            public final boolean a(fqn fqn) {
                return false;
            }

            public final Pattern b() {
                return Pattern.compile("editorial");
            }

            public final String c() {
                return null;
            }
        };
    }
}

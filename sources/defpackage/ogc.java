package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: ogc reason: default package */
public final class ogc implements tjx {
    public final a a() {
        return new a() {
            public final boolean a(fpt fpt) {
                return false;
            }

            public final String c() {
                return null;
            }

            public final FormatListType a() {
                return FormatListType.CAR_MIX;
            }

            public final Pattern b() {
                return Pattern.compile("car-mix");
            }
        };
    }
}

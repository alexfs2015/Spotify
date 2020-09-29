package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: njt reason: default package */
public final class njt implements tjx {
    public final a a() {
        return new a() {
            public final String c() {
                return "spotify:internal:format_list_home_mix";
            }

            public final FormatListType a() {
                return FormatListType.HOME_MIX;
            }

            public final Pattern b() {
                return Pattern.compile("home-mix");
            }

            public final boolean a(fpt fpt) {
                return fpt.b(nol.a) || fpt.b(nol.b);
            }
        };
    }
}

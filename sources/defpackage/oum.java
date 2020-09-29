package defpackage;

import com.spotify.music.playlist.formatlisttype.FormatListType;
import java.util.regex.Pattern;

/* renamed from: oum reason: default package */
public final class oum implements tvp {
    final vry a;

    public oum(vry vry) {
        this.a = vry;
    }

    public final a a() {
        return new a() {
            public final FormatListType a() {
                return FormatListType.HOME_MIX;
            }

            public final boolean a(fqn fqn) {
                return (fqn.b(num.a) || fqn.b(num.b)) && !oum.this.a.a();
            }

            public final Pattern b() {
                return Pattern.compile("home-mix");
            }

            public final String c() {
                return "spotify:internal:format_list_home_mix";
            }
        };
    }
}

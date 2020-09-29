package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import java.util.concurrent.TimeUnit;

/* renamed from: uar reason: default package */
public final class uar implements fui {
    private final uah a;
    private final jsz b;
    private final String c;
    private final uai d;
    private final uab e;

    public uar(uab uab, uah uah, jsz jsz, String str, uai uai) {
        this.e = uab;
        this.a = uah;
        this.b = jsz;
        this.c = str;
        this.d = uai;
    }

    public final void onMenuItemClick(fug fug) {
        int h = fug.h();
        if (h == R.id.menu_item_sleep_timer_turn_off) {
            this.e.c();
            this.b.a(SpotifyIconV2.X, (int) R.string.context_menu_sleep_timer_turn_off_message, 0);
        } else if (h == R.id.menu_item_sleep_timer_end_of_episode || h == R.id.menu_item_sleep_timer_end_of_track) {
            uab uab = this.e;
            String str = this.c;
            uah uah = this.a;
            uab.c();
            uab.b.a(str, uah);
            this.b.a(SpotifyIconV2.CHECK, (int) R.string.context_menu_sleep_timer_select_message, 0);
        } else {
            uab uab2 = this.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long a2 = uao.a(h);
            uah uah2 = this.a;
            uab2.c();
            uab2.a.a(timeUnit, a2, uah2);
            this.b.a(SpotifyIconV2.CHECK, (int) R.string.context_menu_sleep_timer_select_message, 0);
        }
        uai uai = this.d;
        String str2 = this.c;
        String str3 = h == R.id.menu_item_sleep_timer_turn_off ? "turn_off_timer" : h == R.id.menu_item_sleep_timer_end_of_episode ? "end_of_episode" : h == R.id.menu_item_sleep_timer_end_of_track ? "end_of_track" : String.valueOf(uao.a(h));
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(':');
        sb.append(str3);
        bh bhVar = new bh(null, "sleeptimer", "spotify:contextmenu:sleeptimer", "", 0, sb.toString(), "hit", "set-sleep-timer", (double) uai.b.a());
        uai.a.a(bhVar);
    }
}

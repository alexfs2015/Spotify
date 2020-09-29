package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.R;
import java.util.concurrent.TimeUnit;

/* renamed from: unm reason: default package */
public final class unm implements fvc {
    private final unc a;
    private final jvf b;
    private final String c;
    private final und d;
    private final umw e;

    public unm(umw umw, unc unc, jvf jvf, String str, und und) {
        this.e = umw;
        this.a = unc;
        this.b = jvf;
        this.c = str;
        this.d = und;
    }

    public final void onMenuItemClick(fva fva) {
        int h = fva.h();
        if (h == R.id.menu_item_sleep_timer_turn_off) {
            this.e.c();
            this.b.a(SpotifyIconV2.X, (int) R.string.context_menu_sleep_timer_turn_off_message, 0);
        } else if (h == R.id.menu_item_sleep_timer_end_of_episode || h == R.id.menu_item_sleep_timer_end_of_track) {
            umw umw = this.e;
            String str = this.c;
            unc unc = this.a;
            umw.c();
            umw.b.a(str, unc);
            this.b.a(SpotifyIconV2.CHECK, (int) R.string.context_menu_sleep_timer_select_message, 0);
        } else {
            umw umw2 = this.e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long a2 = unj.a(h);
            unc unc2 = this.a;
            umw2.c();
            umw2.a.a(timeUnit, a2, unc2);
            this.b.a(SpotifyIconV2.CHECK, (int) R.string.context_menu_sleep_timer_select_message, 0);
        }
        und und = this.d;
        String str2 = this.c;
        String str3 = h == R.id.menu_item_sleep_timer_turn_off ? "turn_off_timer" : h == R.id.menu_item_sleep_timer_end_of_episode ? "end_of_episode" : h == R.id.menu_item_sleep_timer_end_of_track ? "end_of_track" : String.valueOf(unj.a(h));
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(':');
        sb.append(str3);
        bg bgVar = new bg(null, "sleeptimer", "spotify:contextmenu:sleeptimer", "", 0, sb.toString(), "hit", "set-sleep-timer", (double) und.b.a());
        und.a.a(bgVar);
    }
}

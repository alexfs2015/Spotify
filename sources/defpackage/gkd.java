package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: gkd reason: default package */
public final class gkd {
    private final DateFormat a = DateFormat.getDateInstance(2);
    private final SimpleDateFormat b = new SimpleDateFormat("MMM dd", Locale.getDefault());
    private final SimpleDateFormat c = new SimpleDateFormat("EEE", Locale.getDefault());
    private final jrp d;

    public gkd(jrp jrp) {
        this.d = jrp;
    }

    public final String a(Resources resources, gkf gkf) {
        switch ((int) gke.b(this.d.a() - gkf.c().getTime()).a) {
            case 0:
                return resources.getString(R.string.android_auto_podcast_episode_publication_today);
            case 1:
                return resources.getString(R.string.android_auto_podcast_episode_publication_yesterday);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return this.c.format(Long.valueOf(gkf.c().getTime()));
            default:
                Calendar calendar = (Calendar) this.d.f().clone();
                calendar.setTime(gkf.c());
                if (a(this.d.f(), calendar)) {
                    return this.b.format(Long.valueOf(gkf.c().getTime()));
                }
                return this.a.format(Long.valueOf(gkf.c().getTime()));
        }
    }

    private static boolean a(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1);
    }
}

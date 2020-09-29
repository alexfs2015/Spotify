package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: glo reason: default package */
public final class glo {
    private final DateFormat a = DateFormat.getDateInstance(2);
    private final SimpleDateFormat b = new SimpleDateFormat("MMM dd", Locale.getDefault());
    private final SimpleDateFormat c = new SimpleDateFormat("EEE", Locale.getDefault());
    private final jtz d;

    public glo(jtz jtz) {
        this.d = jtz;
    }

    private static boolean a(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1);
    }

    public final String a(Resources resources, glr glr) {
        switch ((int) glq.b(this.d.a() - glr.c().getTime()).a) {
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
                return this.c.format(Long.valueOf(glr.c().getTime()));
            default:
                Calendar calendar = (Calendar) this.d.f().clone();
                calendar.setTime(glr.c());
                return a(this.d.f(), calendar) ? this.b.format(Long.valueOf(glr.c().getTime())) : this.a.format(Long.valueOf(glr.c().getTime()));
        }
    }
}

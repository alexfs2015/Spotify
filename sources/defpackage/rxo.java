package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.playlist.models.Show;
import java.text.DateFormat;
import java.util.Calendar;

/* renamed from: rxo reason: default package */
public final class rxo {
    private final Context a;
    private final Calendar b;
    private final Calendar c;

    public rxo(Context context, Calendar calendar, Calendar calendar2) {
        this.a = context;
        this.b = calendar;
        this.c = calendar2;
    }

    public final String a(Show show) {
        String c2 = show.c();
        if (show.e() < 0) {
            return c2;
        }
        String b2 = b(show);
        return this.a.getString(R.string.collection_podcast_subtitle, new Object[]{b2, c2});
    }

    private String b(Show show) {
        long e = show.e();
        int a2 = a(e);
        if (a2 == 0) {
            return this.a.getString(R.string.collection_podcast_updated_today);
        }
        if (a2 == 1) {
            return this.a.getString(R.string.collection_podcast_updated_yesterday);
        }
        if (a2 <= 3) {
            return this.a.getResources().getQuantityString(R.plurals.collection_podcast_updated_days_ago, a2, new Object[]{Integer.valueOf(a2)});
        }
        return this.a.getString(R.string.collection_podcast_updated, new Object[]{b(e)});
    }

    private int a(long j) {
        this.c.setTimeInMillis(j * 1000);
        if (this.b.get(1) == this.c.get(1)) {
            return this.b.get(6) - this.c.get(6);
        }
        return (int) ((this.b.getTimeInMillis() - this.c.getTimeInMillis()) / 86400000);
    }

    private String b(long j) {
        this.c.setTimeInMillis(j * 1000);
        return DateFormat.getDateInstance(2).format(this.c.getTime());
    }
}

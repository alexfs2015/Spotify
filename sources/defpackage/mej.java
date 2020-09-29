package defpackage;

import android.content.res.Resources;
import android.text.format.DateUtils;
import com.spotify.music.R;

/* renamed from: mej reason: default package */
public final class mej extends juu {
    public mej(Resources resources) {
        super(resources);
    }

    public final String a(int i) {
        return a(R.plurals.charts_daily_plays, i, Integer.valueOf(i));
    }

    public final String a(long j) {
        return a(R.string.charts_meta_last_updated, DateUtils.getRelativeTimeSpanString(j));
    }

    public final String b(int i) {
        return a(R.plurals.charts_header_new_entry_count, i, Integer.valueOf(i));
    }
}

package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.R;

/* renamed from: ufp reason: default package */
public final class ufp {
    private static final ImmutableMap<String, Integer> a = ImmutableMap.a("today", Integer.valueOf(R.string.episodes_adapter_header_section_today), "yesterday", Integer.valueOf(R.string.episodes_adapter_header_section_yesterday), "thisWeek", Integer.valueOf(R.string.episodes_adapter_header_section_week), "twoDaysAgo", Integer.valueOf(R.string.episodes_adapter_header_section_two_days_ago), "unplayed", Integer.valueOf(R.string.episodes_adapter_header_section_unplayed));
    private final Context b;

    public ufp(Context context) {
        this.b = context;
    }

    public final String a(String str) {
        Integer num = (Integer) a.get(str);
        if (num == null) {
            num = Integer.valueOf(R.string.episodes_adapter_header_section_unplayed);
        }
        return this.b.getString(num.intValue());
    }
}

package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.music.R;

/* renamed from: rfo reason: default package */
public final class rfo {
    private final ImmutableMap<String, String> a;

    public rfo(Context context) {
        a g = ImmutableMap.g();
        g.b("available_offline_only", context.getString(R.string.your_library_music_pages_filtered_offline_only_indicator_title));
        this.a = g.b();
    }

    public final String a(String str) {
        return (String) this.a.get(str);
    }
}

package defpackage;

import android.content.Context;
import com.spotify.music.R;

/* renamed from: lwd reason: default package */
public final class lwd implements lwc {
    private final Context a;

    public lwd(Context context) {
        this.a = context;
    }

    public final String a(boolean z, boolean z2, boolean z3) {
        int i = (z || !z2) ? z3 ? R.string.find_search_field_hint_with_podcasts : R.string.find_search_field_hint : R.string.find_search_field_offline_hint;
        return this.a.getString(i);
    }

    public final String b(boolean z, boolean z2, boolean z3) {
        int i = (z || !z2) ? z3 ? R.string.find_search_field_hint_voice_with_podcasts : R.string.find_search_field_hint_voice : R.string.find_search_field_offline_hint;
        return this.a.getString(i);
    }
}

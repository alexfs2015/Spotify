package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: qli reason: default package */
public final class qli implements srj {
    private final Resources a;

    public qli(Resources resources) {
        this.a = resources;
    }

    public final sri a() {
        return sri.a(this.a.getString(R.string.search_section_tracks_synced), "");
    }

    public final sri b() {
        return sri.a(this.a.getString(R.string.search_section_episodes_synced), this.a.getString(R.string.search_section_episodes_subtitle));
    }

    public final sri c() {
        return sri.a(this.a.getString(R.string.search_section_playlists), this.a.getString(R.string.search_section_playlists_subtitle));
    }
}

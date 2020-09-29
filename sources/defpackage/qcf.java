package defpackage;

import android.content.res.Resources;
import com.spotify.music.R;

/* renamed from: qcf reason: default package */
public final class qcf implements shc {
    private final Resources a;

    public qcf(Resources resources) {
        this.a = resources;
    }

    public final shb a() {
        return shb.a(this.a.getString(R.string.search_section_tracks_synced), "");
    }

    public final shb b() {
        return shb.a(this.a.getString(R.string.search_section_episodes_synced), this.a.getString(R.string.search_section_episodes_subtitle));
    }

    public final shb c() {
        return shb.a(this.a.getString(R.string.search_section_playlists), this.a.getString(R.string.search_section_playlists_subtitle));
    }
}

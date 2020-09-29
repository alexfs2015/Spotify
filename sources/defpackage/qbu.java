package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.EntityType;

/* renamed from: qbu reason: default package */
public final class qbu implements rzw {
    private final Context a;

    public qbu(Context context) {
        this.a = context;
    }

    public final String b(Entity entity) {
        return qcc.a(this.a, entity);
    }

    public final String a(EntityType entityType, String str) {
        switch (entityType) {
            case ENTITY_TYPE_ARTIST:
                return this.a.getString(R.string.drilldown_artists_title, new Object[]{str});
            case ENTITY_TYPE_TRACK:
                return this.a.getString(R.string.drilldown_tracks_title, new Object[]{str});
            case ENTITY_TYPE_ALBUM:
                return this.a.getString(R.string.drilldown_albums_title, new Object[]{str});
            case ENTITY_TYPE_PLAYLIST:
                return this.a.getString(R.string.drilldown_playlists_title, new Object[]{str});
            case ENTITY_TYPE_GENRE:
                return this.a.getString(R.string.drilldown_genres_title, new Object[]{str});
            case ENTITY_TYPE_AUDIO_SHOW:
                return this.a.getString(R.string.drilldown_podcasts_title, new Object[]{str});
            case ENTITY_TYPE_AUDIO_EPISODE:
                return this.a.getString(R.string.drilldown_podcasts_episodes_title, new Object[]{str});
            case ENTITY_TYPE_PROFILE:
                return this.a.getString(R.string.drilldown_profiles_title, new Object[]{str});
            default:
                return this.a.getString(R.string.search_title, new Object[]{str});
        }
    }

    public final String a(Entity entity) {
        return qcc.a(entity);
    }
}

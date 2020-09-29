package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.spotify.music.R;
import com.spotify.searchview.proto.Album;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;

/* renamed from: qcc reason: default package */
final class qcc {
    public static String a(Context context, Entity entity) {
        return a(context, entity, a(entity));
    }

    private static String a(Context context, Entity entity, String str) {
        switch (EntityCase.a(entity.d)) {
            case ARTIST:
                return context.getString(R.string.search_main_entity_subtitle_artist);
            case TRACK:
                return a(context, (int) R.string.search_main_entity_subtitle_track, str);
            case ALBUM:
                return a(context, (int) R.string.search_main_entity_subtitle_album, str);
            case PLAYLIST:
                return context.getString(R.string.search_main_entity_subtitle_playlist);
            case GENRE:
                return context.getString(R.string.search_main_entity_subtitle_genre);
            case AUDIO_SHOW:
                return a(context, (int) R.string.search_main_entity_subtitle_audio_show, str);
            case AUDIO_EPISODE:
                return a(context, (int) R.string.search_main_entity_subtitle_audio_episode, str);
            case PROFILE:
                return context.getString(R.string.search_main_entity_subtitle_profile);
            default:
                return "";
        }
    }

    static String a(Entity entity) {
        int i = AnonymousClass1.a[EntityCase.a(entity.d).ordinal()];
        if (i == 2) {
            return b(entity);
        }
        String str = "";
        if (i == 3) {
            Album l = entity.l();
            return l.k() > 0 ? l.a(0) : str;
        } else if (i == 6) {
            return entity.m().d;
        } else {
            if (i != 7) {
                return str;
            }
            return entity.n().d;
        }
    }

    private static String a(Context context, int i, String str) {
        StringBuilder sb = new StringBuilder(context.getString(i));
        if (!fax.a(str)) {
            sb.append(" • ");
            sb.append(str);
        }
        return sb.toString();
    }

    private static String b(Entity entity) {
        return fau.a(", ").a((Iterable<?>) fbx.a((Iterable<E>) entity.k().f).a((Function<? super E, T>) $$Lambda$ktd9hDus4lJtKOzf2ecH_orbgE.INSTANCE));
    }
}

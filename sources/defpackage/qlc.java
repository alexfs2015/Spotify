package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.music.podcast.episode.util.DurationFormatter;
import com.spotify.music.podcast.episode.util.DurationFormatter.Format;
import com.spotify.remoteconfig.AndroidFeatureSearchProperties;
import com.spotify.remoteconfig.AndroidFeatureSearchProperties.NewPodcastResultComponents;
import com.spotify.searchview.proto.Album;
import com.spotify.searchview.proto.AudioEpisode;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.Entity.EntityCase;
import java.util.Locale;

/* renamed from: qlc reason: default package */
public final class qlc {
    private final boolean a;
    private final DurationFormatter b;

    public qlc(AndroidFeatureSearchProperties androidFeatureSearchProperties, DurationFormatter durationFormatter) {
        this.a = androidFeatureSearchProperties.b() == NewPodcastResultComponents.WITH_DURATION;
        this.b = durationFormatter;
    }

    private static String a(Context context, int i, String str) {
        StringBuilder sb = new StringBuilder(context.getString(i));
        if (!fbo.a(str)) {
            sb.append(" • ");
            sb.append(str);
        }
        return sb.toString();
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

    private String a(AudioEpisode audioEpisode) {
        String str = audioEpisode.d;
        if (!this.a) {
            return str;
        }
        long j = audioEpisode.k().d;
        if (j <= 2147483647L) {
            return this.b.a(Format.LONG_HOUR_AND_MINUTE, (int) j).toLowerCase(Locale.getDefault());
        }
        StringBuilder sb = new StringBuilder("Duration too large to be formatted: ");
        sb.append(j);
        Assertion.b(sb.toString());
        return str;
    }

    private static String b(Entity entity) {
        return fbl.a(", ").a((Iterable<?>) fcp.a((Iterable<E>) entity.k().f).a((Function<? super E, T>) $$Lambda$ktd9hDus4lJtKOzf2ecH_orbgE.INSTANCE));
    }

    public final String a(Context context, Entity entity) {
        return a(context, entity, a(entity));
    }

    /* access modifiers changed from: 0000 */
    public String a(Entity entity) {
        int i = AnonymousClass1.a[EntityCase.a(entity.d).ordinal()];
        if (i == 2) {
            return b(entity);
        }
        String str = "";
        if (i != 3) {
            return i != 6 ? i != 7 ? str : a(entity.n()) : entity.m().d;
        }
        Album l = entity.l();
        return l.k() > 0 ? l.a(0) : str;
    }
}

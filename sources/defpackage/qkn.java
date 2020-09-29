package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.spotify.searchview.proto.EntityType;

/* renamed from: qkn reason: default package */
public final class qkn implements sjc {
    private final boolean a;

    public qkn(boolean z) {
        this.a = z;
    }

    public final Optional<String> a(EntityType entityType, String str) {
        String str2;
        String a2 = skv.a(str);
        switch (entityType) {
            case ENTITY_TYPE_ARTIST:
                str2 = "artists";
                break;
            case ENTITY_TYPE_TRACK:
                str2 = "tracks";
                break;
            case ENTITY_TYPE_ALBUM:
                str2 = "albums";
                break;
            case ENTITY_TYPE_PLAYLIST:
                str2 = "playlists";
                break;
            case ENTITY_TYPE_GENRE:
                str2 = "genres";
                break;
            case ENTITY_TYPE_AUDIO_SHOW:
                if (!this.a) {
                    str2 = "shows";
                    break;
                } else {
                    str2 = "audioshows";
                    break;
                }
            case ENTITY_TYPE_AUDIO_EPISODE:
                str2 = "audioepisodes";
                break;
            case ENTITY_TYPE_PROFILE:
                str2 = "profiles";
                break;
            default:
                str2 = null;
                break;
        }
        return Optional.c(str2).a((Function<? super T, V>) new $$Lambda$qkn$lzSgA0V2_HfRn0v9Jk1ugoXMj5w<Object,V>(a2));
    }
}

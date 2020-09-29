package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;
import com.spotify.searchview.proto.Entity;
import com.spotify.searchview.proto.EntityType;
import com.spotify.searchview.proto.RecommendationsType;

/* renamed from: qla reason: default package */
public final class qla implements ska {
    private final Context a;
    private final qlc b;

    /* renamed from: qla$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[RecommendationsType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(2:19|20)|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0075 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007f */
        static {
            /*
                com.spotify.searchview.proto.EntityType[] r0 = com.spotify.searchview.proto.EntityType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                b = r0
                r0 = 1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.searchview.proto.EntityType r2 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_ARTIST     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = b     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.searchview.proto.EntityType r3 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_TRACK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.searchview.proto.EntityType r4 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_ALBUM     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.searchview.proto.EntityType r4 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_PLAYLIST     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.spotify.searchview.proto.EntityType r4 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_GENRE     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x004b }
                com.spotify.searchview.proto.EntityType r4 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_AUDIO_SHOW     // Catch:{ NoSuchFieldError -> 0x004b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.spotify.searchview.proto.EntityType r4 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_AUDIO_EPISODE     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r3 = b     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.spotify.searchview.proto.EntityType r4 = com.spotify.searchview.proto.EntityType.ENTITY_TYPE_PROFILE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                com.spotify.searchview.proto.RecommendationsType[] r3 = com.spotify.searchview.proto.RecommendationsType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                a = r3
                int[] r3 = a     // Catch:{ NoSuchFieldError -> 0x0075 }
                com.spotify.searchview.proto.RecommendationsType r4 = com.spotify.searchview.proto.RecommendationsType.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST     // Catch:{ NoSuchFieldError -> 0x0075 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0075 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0075 }
            L_0x0075:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x007f }
                com.spotify.searchview.proto.RecommendationsType r3 = com.spotify.searchview.proto.RecommendationsType.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE     // Catch:{ NoSuchFieldError -> 0x007f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.spotify.searchview.proto.RecommendationsType r1 = com.spotify.searchview.proto.RecommendationsType.RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qla.AnonymousClass1.<clinit>():void");
        }
    }

    public qla(Context context, qlc qlc) {
        this.a = context;
        this.b = qlc;
    }

    public final String a() {
        return this.a.getString(R.string.search_top_played);
    }

    public final String a(Entity entity) {
        return this.b.a(this.a, entity);
    }

    public final String a(EntityType entityType) {
        switch (entityType) {
            case ENTITY_TYPE_ARTIST:
                return this.a.getString(R.string.see_all_title_artist);
            case ENTITY_TYPE_TRACK:
                return this.a.getString(R.string.see_all_title_track);
            case ENTITY_TYPE_ALBUM:
                return this.a.getString(R.string.see_all_title_album);
            case ENTITY_TYPE_PLAYLIST:
                return this.a.getString(R.string.see_all_title_playlist);
            case ENTITY_TYPE_GENRE:
                return this.a.getString(R.string.see_all_title_genre);
            case ENTITY_TYPE_AUDIO_SHOW:
                return this.a.getString(R.string.see_all_title_audio_show);
            case ENTITY_TYPE_AUDIO_EPISODE:
                return this.a.getString(R.string.see_all_title_audio_episode);
            case ENTITY_TYPE_PROFILE:
                return this.a.getString(R.string.see_all_title_profile);
            default:
                StringBuilder sb = new StringBuilder("Could not resolve title for entity type: ");
                sb.append(entityType.name());
                Assertion.b(sb.toString());
                return "unknown";
        }
    }

    public final String a(RecommendationsType recommendationsType, String str) {
        int i = AnonymousClass1.a[recommendationsType.ordinal()];
        if (i == 1) {
            return this.a.getString(R.string.recs_title_featuring, new Object[]{str});
        } else if (i != 2) {
            return i != 3 ? str : this.a.getString(R.string.recs_title_song_appears_in);
        } else {
            return this.a.getString(R.string.recs_title_jump_in, new Object[]{str});
        }
    }

    public final String b(Entity entity) {
        return this.b.a(this.a, entity);
    }
}

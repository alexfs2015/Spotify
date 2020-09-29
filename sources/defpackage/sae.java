package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.TrackData;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.searchview.proto.EntityType;
import com.spotify.searchview.proto.MainViewResponse;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: sae reason: default package */
final class sae implements Function<rzz, List<gzt>> {
    private final saa a;
    private final rzo b;

    public sae(saa saa, rzo rzo) {
        this.a = saa;
        this.b = rzo;
    }

    /* renamed from: a */
    public final List<gzt> apply(rzz rzz) {
        return ImmutableList.a(fbx.a((Iterable<E>) new d<E>(rzz.c().e, MainViewResponse.f)).a((faz<? super E>) $$Lambda$sae$_mLfs6w_4uUr_Jzyvx9_RsB1qk.INSTANCE).a((com.google.common.base.Function<? super E, T>) new $$Lambda$sae$EbukaS3ZXt65sqwXXOs2sApzw<Object,T>(this, rzz)).a());
    }

    /* access modifiers changed from: private */
    public static boolean a(EntityType entityType) {
        return (entityType == EntityType.UNRECOGNIZED || entityType == EntityType.ENTITY_TYPE_UNKNOWN) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzt a(rzz rzz, EntityType entityType) {
        String str;
        String str2 = (String) this.b.a(entityType, rzz.b()).a("unsupported");
        String a2 = this.a.a(entityType);
        switch (entityType) {
            case ENTITY_TYPE_UNKNOWN:
                str = "unknown";
                break;
            case ENTITY_TYPE_ARTIST:
                str = "artist";
                break;
            case ENTITY_TYPE_TRACK:
                str = TrackData.TYPE_TRACK;
                break;
            case ENTITY_TYPE_ALBUM:
                str = "album";
                break;
            case ENTITY_TYPE_PLAYLIST:
                str = "playlist";
                break;
            case ENTITY_TYPE_GENRE:
                str = "genre";
                break;
            case ENTITY_TYPE_AUDIO_SHOW:
                str = "show";
                break;
            case ENTITY_TYPE_AUDIO_EPISODE:
                str = "audioepisode";
                break;
            case ENTITY_TYPE_PROFILE:
                str = "profile";
                break;
            case UNRECOGNIZED:
                str = "unrecognized";
                break;
            default:
                StringBuilder sb = new StringBuilder("Could not resolve see all identifier for unknown entity type: ");
                sb.append(entityType);
                Assertion.b(sb.toString());
                str = "invalid";
                break;
        }
        a builder = hae.builder();
        StringBuilder sb2 = new StringBuilder("all-");
        sb2.append(str);
        String str3 = "-results";
        sb2.append(str3);
        a a3 = builder.a(sb2.toString()).a((gzr) HubsGlueRow.NAVIGATION).a(haf.builder().a(a2)).a((gzy) gzx.a(str2));
        a builder2 = HubsImmutableComponentBundle.builder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(str3);
        return a3.c(builder2.a("ui:group", sb3.toString()).a("ui:index_in_block", 0).a("ui:source", rzz.a()).a()).a();
    }
}

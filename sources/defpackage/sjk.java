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

/* renamed from: sjk reason: default package */
final class sjk implements Function<sjh, List<hcm>> {
    private final ska a;
    private final sjc b;

    public sjk(ska ska, sjc sjc) {
        this.a = ska;
        this.b = sjc;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcm a(sjh sjh, EntityType entityType) {
        String str;
        String str2 = (String) this.b.a(entityType, sjh.b()).a("unsupported");
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
        a builder = hcx.builder();
        StringBuilder sb2 = new StringBuilder("all-");
        sb2.append(str);
        String str3 = "-results";
        sb2.append(str3);
        a a3 = builder.a(sb2.toString()).a((hck) HubsGlueRow.NAVIGATION).a(hcy.builder().a(a2)).a((hcr) hcq.a(str2));
        a builder2 = HubsImmutableComponentBundle.builder();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(str3);
        return a3.c(builder2.a("ui:group", sb3.toString()).a("ui:index_in_block", 0).a("ui:source", sjh.a()).a()).a();
    }

    /* access modifiers changed from: private */
    public static boolean a(EntityType entityType) {
        return (entityType == EntityType.UNRECOGNIZED || entityType == EntityType.ENTITY_TYPE_UNKNOWN) ? false : true;
    }

    /* renamed from: a */
    public final List<hcm> apply(sjh sjh) {
        return ImmutableList.a(fcp.a((Iterable<E>) new d<E>(sjh.c().e, MainViewResponse.f)).a((fbq<? super E>) $$Lambda$sjk$N4lsx15D7CA5ssKYD8W3JeD_Kg.INSTANCE).a((com.google.common.base.Function<? super E, T>) new $$Lambda$sjk$2mGM_a4kCnvffK3sG6rf0D5Mv3M<Object,T>(this, sjh)).a());
    }
}

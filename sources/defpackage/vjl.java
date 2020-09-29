package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest.Attributes;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest.Attributes.a;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: vjl reason: default package */
final class vjl implements vjj {
    private final vjk a;

    public vjl(vjk vjk) {
        this.a = vjk;
    }

    private Completable a(ModificationRequest modificationRequest, String str) {
        return this.a.a(str, modificationRequest).e(vkd.a());
    }

    private Completable a(String str, a aVar) {
        return a((ModificationRequest) ModificationRequest.k().a("set").a(aVar).g(), str);
    }

    public final Completable a(String str) {
        return this.a.b(str).e(vkd.a());
    }

    public final Completable a(String str, Optional<way> optional, boolean z) {
        Single single;
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            if (optional.b()) {
                linkedHashMap.put("sort", waz.a((way) optional.c()));
            }
            single = this.a.a(str, (Map<String, String>) linkedHashMap);
        } else {
            single = this.a.a(str);
        }
        return single.e(vkd.a());
    }

    public final Completable a(String str, String str2) {
        return a(str, Attributes.k().a(str2));
    }

    public final Completable a(String str, List<String> list) {
        return a((ModificationRequest) ModificationRequest.k().a("add").c("end").a((Iterable<String>) list).g(), str);
    }

    public final Completable a(String str, List<String> list, Optional<String> optional) {
        return a((ModificationRequest) ModificationRequest.k().a("move").b((Iterable<String>) list).b((String) optional.a("start")).g(), str);
    }

    public final Completable a(String str, boolean z) {
        return a(str, Attributes.k().b(z));
    }

    public final Completable b(String str, String str2) {
        return a(str, Attributes.k().b(str2));
    }

    public final Completable b(String str, List<String> list) {
        return a((ModificationRequest) ModificationRequest.k().a("remove").b((Iterable<String>) list).g(), str);
    }

    public final Completable b(String str, List<String> list, Optional<String> optional) {
        return a((ModificationRequest) ModificationRequest.k().a("move").b((Iterable<String>) list).c((String) optional.a("end")).g(), str);
    }

    public final Completable c(String str, String str2) {
        return a(str, Attributes.k().c(str2));
    }
}

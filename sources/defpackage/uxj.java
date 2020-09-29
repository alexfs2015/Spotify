package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.exceptions.InsufficientStorageException;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest.Attributes;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest.Attributes.a;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: uxj reason: default package */
final class uxj implements uxh {
    private final uxi a;

    public uxj(uxi uxi) {
        this.a = uxi;
    }

    public final Completable a(String str, Optional<vns> optional, boolean z) {
        if (!z) {
            return this.a.a(str);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (optional.b()) {
            linkedHashMap.put("sort", vnt.a((vns) optional.c()));
        }
        return this.a.a(str, (Map<String, String>) linkedHashMap);
    }

    public final Completable a(String str) {
        return this.a.b(str);
    }

    public final Completable a(String str, boolean z) {
        return a(str, Attributes.k().b(z));
    }

    public final Completable a(String str, String str2) {
        return a(str, Attributes.k().a(str2));
    }

    public final Completable b(String str, String str2) {
        return a(str, Attributes.k().b(str2));
    }

    public final Completable c(String str, String str2) {
        return a(str, Attributes.k().c(str2));
    }

    public final Completable a(String str, List<String> list) {
        return this.a.b(str, (ModificationRequest) ModificationRequest.k().a("add").c("end").a((Iterable<String>) list).g()).e(new $$Lambda$uxj$bg3D8aA7Um3dGSTIe8ylcLdhHbU(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ CompletableSource a(String str, Response response) {
        if (response.getStatus() == 507) {
            return Completable.a((Throwable) new InsufficientStorageException(str, response));
        }
        return Completable.a();
    }

    public final Completable b(String str, List<String> list) {
        return this.a.a(str, (ModificationRequest) ModificationRequest.k().a("remove").b((Iterable<String>) list).g());
    }

    public final Completable a(String str, List<String> list, Optional<String> optional) {
        return this.a.a(str, (ModificationRequest) ModificationRequest.k().a("move").b((Iterable<String>) list).b((String) optional.a("start")).g());
    }

    public final Completable b(String str, List<String> list, Optional<String> optional) {
        return this.a.a(str, (ModificationRequest) ModificationRequest.k().a("move").b((Iterable<String>) list).c((String) optional.a("end")).g());
    }

    private Completable a(String str, a aVar) {
        return this.a.a(str, (ModificationRequest) ModificationRequest.k().a("set").a(aVar).g());
    }
}

package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest.Attributes;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;

/* renamed from: uxv reason: default package */
final class uxv implements uxt {
    private final uxu a;

    uxv(uxu uxu) {
        this.a = uxu;
    }

    public final Completable a(String str) {
        return this.a.b((ModificationRequest) ModificationRequest.k().a("add").b("start").e(str).g());
    }

    public final Completable b(String str) {
        return this.a.b((ModificationRequest) ModificationRequest.k().a("remove").b((Iterable<String>) Collections.singletonList(str)).b(false).g());
    }

    public final Completable a(String str, boolean z) {
        return this.a.b((ModificationRequest) ModificationRequest.k().a("set").f(str).a(Attributes.k().a(z)).g());
    }

    public final Single<String> a(String str, List<String> list, Optional<String> optional) {
        Single single;
        ModificationRequest modificationRequest = (ModificationRequest) ModificationRequest.k().a("create").a(true).d(str).b("start").a((Iterable<String>) list).g();
        if (optional.b()) {
            single = this.a.a((String) optional.c(), modificationRequest);
        } else {
            single = this.a.a(modificationRequest);
        }
        return single.f($$Lambda$RDFZXcnh7CeQsJpgCCXA3Anz0ow.INSTANCE);
    }
}

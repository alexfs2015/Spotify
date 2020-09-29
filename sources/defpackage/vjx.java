package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationRequest.Attributes;
import com.spotify.playlist.endpoints.proto.PlaylistModificationRequest.ModificationResponse;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;

/* renamed from: vjx reason: default package */
final class vjx implements vjv {
    private final vjw a;

    vjx(vjw vjw) {
        this.a = vjw;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ModificationResponse a(fli fli) {
        return (ModificationResponse) fli;
    }

    private Completable a(ModificationRequest modificationRequest) {
        return this.a.b(modificationRequest).e(vkd.a());
    }

    public final Completable a(String str) {
        return a((ModificationRequest) ModificationRequest.k().a("add").b("start").e(str).g());
    }

    public final Completable a(String str, boolean z) {
        return a((ModificationRequest) ModificationRequest.k().a("set").f(str).a(Attributes.k().a(z)).g());
    }

    public final Single<String> a(String str, List<String> list, Optional<String> optional) {
        ModificationRequest modificationRequest = (ModificationRequest) ModificationRequest.k().a("create").a(true).d(str).b("start").a((Iterable<String>) list).g();
        return (optional.b() ? this.a.a((String) optional.c(), modificationRequest) : this.a.a(modificationRequest)).a(vkd.a(ModificationResponse.l())).f($$Lambda$vjx$ylQN9gMcQayIC54jR3_Nqyu_kw.INSTANCE).f($$Lambda$RDFZXcnh7CeQsJpgCCXA3Anz0ow.INSTANCE);
    }

    public final Completable b(String str) {
        return a((ModificationRequest) ModificationRequest.k().a("remove").b((Iterable<String>) Collections.singletonList(str)).b(false).g());
    }
}

package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Observable;

/* renamed from: neh reason: default package */
public final class neh implements vua<Observable<uyv>> {
    private final wlc<uxn> a;

    private neh(wlc<uxn> wlc) {
        this.a = wlc;
    }

    public static neh a(wlc<uxn> wlc) {
        return new neh(wlc);
    }

    public final /* synthetic */ Object get() {
        uxn uxn = (uxn) this.a.get();
        PlaylistMetadataDecorationPolicy a2 = PlaylistMetadataDecorationPolicy.builder().b(Boolean.TRUE).e(Boolean.TRUE).d(Boolean.TRUE).g(Boolean.TRUE).i(Boolean.TRUE).a();
        return (Observable) vuf.a(uxn.a(Optional.e(), a.m().a(true).a(Optional.b(RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a(a2).a(FolderMetadataDecorationPolicy.builder().f(Boolean.TRUE).a()).a()).a())).c(Optional.b(Boolean.TRUE)).b(Optional.b(uya.e)).a(200).e(uyd.a(0, 20)).a()).d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

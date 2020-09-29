package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Observable;

/* renamed from: njw reason: default package */
public final class njw implements wig<Observable<vky>> {
    private final wzi<vjp> a;

    private njw(wzi<vjp> wzi) {
        this.a = wzi;
    }

    public static njw a(wzi<vjp> wzi) {
        return new njw(wzi);
    }

    public final /* synthetic */ Object get() {
        vjp vjp = (vjp) this.a.get();
        PlaylistMetadataDecorationPolicy a2 = PlaylistMetadataDecorationPolicy.builder().b(Boolean.TRUE).e(Boolean.TRUE).d(Boolean.TRUE).g(Boolean.TRUE).i(Boolean.TRUE).a();
        return (Observable) wil.a(vjp.a(Optional.e(), a.m().a(true).a(Optional.b(RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a(a2).a(FolderMetadataDecorationPolicy.builder().f(Boolean.TRUE).a()).a()).a())).c(Optional.b(Boolean.TRUE)).b(Optional.b(vkc.e)).a(200).e(vkg.a(0, 20)).a()).d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Observable;

/* renamed from: hvn reason: default package */
public final class hvn implements wig<Observable<vky>> {
    private final wzi<vjp> a;
    private final wzi<PlaylistMetadataDecorationPolicy> b;
    private final wzi<FolderMetadataDecorationPolicy> c;

    private hvn(wzi<vjp> wzi, wzi<PlaylistMetadataDecorationPolicy> wzi2, wzi<FolderMetadataDecorationPolicy> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hvn a(wzi<vjp> wzi, wzi<PlaylistMetadataDecorationPolicy> wzi2, wzi<FolderMetadataDecorationPolicy> wzi3) {
        return new hvn(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        FolderMetadataDecorationPolicy folderMetadataDecorationPolicy = (FolderMetadataDecorationPolicy) this.c.get();
        return (Observable) wil.a(((vjp) this.a.get()).a(Optional.e(), a.m().a(true).a(Optional.b(RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a((PlaylistMetadataDecorationPolicy) this.b.get()).a(folderMetadataDecorationPolicy).a()).a())).c(Optional.b(Boolean.TRUE)).b(Optional.b(vkc.e)).a(200).a()).d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

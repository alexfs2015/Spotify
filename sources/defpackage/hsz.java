package defpackage;

import com.google.common.base.Optional;
import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.FolderRequestPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Observable;

/* renamed from: hsz reason: default package */
public final class hsz implements vua<Observable<uyv>> {
    private final wlc<uxn> a;
    private final wlc<PlaylistMetadataDecorationPolicy> b;
    private final wlc<FolderMetadataDecorationPolicy> c;

    private hsz(wlc<uxn> wlc, wlc<PlaylistMetadataDecorationPolicy> wlc2, wlc<FolderMetadataDecorationPolicy> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hsz a(wlc<uxn> wlc, wlc<PlaylistMetadataDecorationPolicy> wlc2, wlc<FolderMetadataDecorationPolicy> wlc3) {
        return new hsz(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        FolderMetadataDecorationPolicy folderMetadataDecorationPolicy = (FolderMetadataDecorationPolicy) this.c.get();
        return (Observable) vuf.a(((uxn) this.a.get()).a(Optional.e(), a.m().a(true).a(Optional.b(RootlistRequestPayload.builder().a(FolderRequestPolicy.builder().a((PlaylistMetadataDecorationPolicy) this.b.get()).a(folderMetadataDecorationPolicy).a()).a())).c(Optional.b(Boolean.TRUE)).b(Optional.b(uya.e)).a(200).a()).d(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

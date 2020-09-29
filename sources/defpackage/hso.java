package defpackage;

import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;

/* renamed from: hso reason: default package */
public final class hso implements vua<hsn> {
    private final wlc<uxn> a;
    private final wlc<PlaylistMetadataDecorationPolicy> b;
    private final wlc<FolderMetadataDecorationPolicy> c;
    private final wlc<hpb> d;

    private hso(wlc<uxn> wlc, wlc<PlaylistMetadataDecorationPolicy> wlc2, wlc<FolderMetadataDecorationPolicy> wlc3, wlc<hpb> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static hso a(wlc<uxn> wlc, wlc<PlaylistMetadataDecorationPolicy> wlc2, wlc<FolderMetadataDecorationPolicy> wlc3, wlc<hpb> wlc4) {
        return new hso(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new hsn((uxn) this.a.get(), (PlaylistMetadataDecorationPolicy) this.b.get(), (FolderMetadataDecorationPolicy) this.c.get(), (hpb) this.d.get());
    }
}

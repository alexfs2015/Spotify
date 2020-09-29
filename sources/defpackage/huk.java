package defpackage;

import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;

/* renamed from: huk reason: default package */
public final class huk implements wig<huj> {
    private final wzi<vjp> a;
    private final wzi<PlaylistMetadataDecorationPolicy> b;
    private final wzi<FolderMetadataDecorationPolicy> c;
    private final wzi<hrc> d;

    private huk(wzi<vjp> wzi, wzi<PlaylistMetadataDecorationPolicy> wzi2, wzi<FolderMetadataDecorationPolicy> wzi3, wzi<hrc> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static huk a(wzi<vjp> wzi, wzi<PlaylistMetadataDecorationPolicy> wzi2, wzi<FolderMetadataDecorationPolicy> wzi3, wzi<hrc> wzi4) {
        return new huk(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new huj((vjp) this.a.get(), (PlaylistMetadataDecorationPolicy) this.b.get(), (FolderMetadataDecorationPolicy) this.c.get(), (hrc) this.d.get());
    }
}

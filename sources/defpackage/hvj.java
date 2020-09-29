package defpackage;

import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy;

/* renamed from: hvj reason: default package */
public final class hvj implements wig<PlaylistMetadataDecorationPolicy> {
    private static final hvj a = new hvj();

    public static hvj a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (PlaylistMetadataDecorationPolicy) wil.a(PlaylistMetadataDecorationPolicy.builder().d(Boolean.TRUE).e(Boolean.TRUE).f(Boolean.TRUE).g(Boolean.TRUE).a(PlaylistUserDecorationPolicy.builder().c(Boolean.TRUE).a()).h(Boolean.TRUE).j(Boolean.TRUE).i(Boolean.TRUE).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

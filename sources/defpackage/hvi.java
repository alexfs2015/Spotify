package defpackage;

import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;

/* renamed from: hvi reason: default package */
public final class hvi implements wig<FolderMetadataDecorationPolicy> {
    private static final hvi a = new hvi();

    public static hvi a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (FolderMetadataDecorationPolicy) wil.a(FolderMetadataDecorationPolicy.builder().c(Boolean.TRUE).d(Boolean.TRUE).e(Boolean.TRUE).f(Boolean.TRUE).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

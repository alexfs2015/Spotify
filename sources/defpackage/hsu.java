package defpackage;

import com.spotify.playlist.endpoints.policy.rootlist.FolderMetadataDecorationPolicy;

/* renamed from: hsu reason: default package */
public final class hsu implements vua<FolderMetadataDecorationPolicy> {
    private static final hsu a = new hsu();

    public static hsu a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (FolderMetadataDecorationPolicy) vuf.a(FolderMetadataDecorationPolicy.builder().c(Boolean.TRUE).d(Boolean.TRUE).e(Boolean.TRUE).f(Boolean.TRUE).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

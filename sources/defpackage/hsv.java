package defpackage;

import com.spotify.playlist.endpoints.policy.rootlist.PlaylistMetadataDecorationPolicy;
import com.spotify.playlist.endpoints.policy.rootlist.PlaylistUserDecorationPolicy;

/* renamed from: hsv reason: default package */
public final class hsv implements vua<PlaylistMetadataDecorationPolicy> {
    private static final hsv a = new hsv();

    public static hsv a() {
        return a;
    }

    public final /* synthetic */ Object get() {
        return (PlaylistMetadataDecorationPolicy) vuf.a(PlaylistMetadataDecorationPolicy.builder().d(Boolean.TRUE).e(Boolean.TRUE).f(Boolean.TRUE).g(Boolean.TRUE).a(PlaylistUserDecorationPolicy.builder().c(Boolean.TRUE).a()).h(Boolean.TRUE).j(Boolean.TRUE).i(Boolean.TRUE).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}

package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.playlist.proto.PlaylistRootlistRequest.ProtoPlaylistRootResponse;
import com.spotify.playlist.endpoints.policy.rootlist.RootlistRequestPayload;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: vjr reason: default package */
final class vjr implements vjp {
    private final vjq a;

    public vjr(vjq vjq) {
        this.a = vjq;
    }

    public final Single<vky> a(Optional<String> optional, a aVar) {
        Optional a2 = aVar.a();
        Single single = a2.b() ? optional.b() ? this.a.a((String) optional.c(), aVar.n(), (RootlistRequestPayload) a2.c()) : this.a.a(aVar.n(), (RootlistRequestPayload) a2.c()) : optional.b() ? this.a.a((String) optional.c(), aVar.n()) : this.a.a(aVar.n());
        return single.a(vkd.a(ProtoPlaylistRootResponse.m())).f($$Lambda$vjr$x1BhhLGMc5rAZRZffqzDya8JXRA.INSTANCE);
    }

    public final Observable<vky> b(Optional<String> optional, a aVar) {
        Optional a2 = aVar.a();
        Observable observable = a2.b() ? optional.b() ? this.a.b((String) optional.c(), aVar.n(), (RootlistRequestPayload) a2.c()) : this.a.b(aVar.n(), (RootlistRequestPayload) a2.c()) : optional.b() ? this.a.b((String) optional.c(), aVar.n()) : this.a.b(aVar.n());
        return observable.a(vkd.b(ProtoPlaylistRootResponse.m())).c((Function<? super T, ? extends R>) $$Lambda$vjr$FWfiDwMeEnzNnN_kiSdYqn0D2w.INSTANCE);
    }
}

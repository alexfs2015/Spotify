package defpackage;

import com.spotify.stories.v1.view.rpc.proto.GetStoryViewResponse;
import io.reactivex.Single;

/* renamed from: nfs reason: default package */
public interface nfs {
    @xhs(a = {"Accept: application/protobuf"})
    @xhn(a = "stories-view/v1/stories")
    Single<GetStoryViewResponse> a(@xib(a = "uri") String str);
}

package defpackage;

import com.spotify.stories.v1.view.rpc.proto.GetStoryViewResponse;
import io.reactivex.Single;

/* renamed from: nal reason: default package */
public interface nal {
    @wtn(a = {"Accept: application/protobuf"})
    @wti(a = "stories-view/v1/stories")
    Single<GetStoryViewResponse> a(@wtw(a = "uri") String str);
}

package defpackage;

import com.spotify.stories.v1.header.proto.GetStoryHeaderResponse;
import io.reactivex.Single;

/* renamed from: pbd reason: default package */
public interface pbd {
    @xhs(a = {"Accept: application/protobuf"})
    @xhn(a = "stories-view/v1/stories/header")
    Single<GetStoryHeaderResponse> a(@xib(a = "uri") String str);
}

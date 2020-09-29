package defpackage;

import com.spotify.stories.v1.header.proto.GetStoryHeaderResponse;
import io.reactivex.Single;

/* renamed from: ots reason: default package */
public interface ots {
    @wtn(a = {"Accept: application/protobuf"})
    @wti(a = "stories-view/v1/stories/header")
    Single<GetStoryHeaderResponse> a(@wtw(a = "uri") String str);
}

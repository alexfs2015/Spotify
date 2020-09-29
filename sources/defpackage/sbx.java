package defpackage;

import com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto.GetAllPlaylistsResponse;
import io.reactivex.Single;

/* renamed from: sbx reason: default package */
public interface sbx {
    @xhs(a = {"Accept: application/protobuf"})
    @xhn(a = "stories-view/v1/stories/playlists")
    Single<GetAllPlaylistsResponse> a();
}

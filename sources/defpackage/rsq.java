package defpackage;

import com.spotify.music.libs.fullscreen.story.prefetcher.v1.proto.GetAllPlaylistsResponse;
import io.reactivex.Single;

/* renamed from: rsq reason: default package */
public interface rsq {
    @wtn(a = {"Accept: application/protobuf"})
    @wti(a = "stories-view/v1/stories/playlists")
    Single<GetAllPlaylistsResponse> a();
}

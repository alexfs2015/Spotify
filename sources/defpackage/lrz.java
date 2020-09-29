package defpackage;

import com.spotify.music.libs.album.model.Album;
import io.reactivex.Single;

/* renamed from: lrz reason: default package */
public interface lrz {
    @xhn(a = "album/v1/album-app/album/{albumUri}/android")
    Single<Album> a(@xia(a = "albumUri") String str, @xhq(a = "cache-identifier") String str2);
}

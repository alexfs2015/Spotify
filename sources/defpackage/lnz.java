package defpackage;

import com.spotify.music.libs.album.model.Album;
import io.reactivex.Single;

/* renamed from: lnz reason: default package */
public interface lnz {
    @wti(a = "album/v1/album-app/album/{albumUri}/android")
    Single<Album> a(@wtv(a = "albumUri") String str, @wtl(a = "cache-identifier") String str2);
}

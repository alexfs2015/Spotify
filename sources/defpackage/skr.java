package defpackage;

import com.spotify.music.lyrics.model.LyricsColorsModel;
import io.reactivex.Single;

/* renamed from: skr reason: default package */
public interface skr {
    @wti(a = "color-lyrics/v1/track/{trackId}")
    Single<LyricsColorsModel> a(@wtv(a = "trackId") String str);

    @wti(a = "color-lyrics/v1/track/{trackId}/image/{imageUri}")
    Single<LyricsColorsModel> a(@wtv(a = "trackId") String str, @wtv(a = "imageUri") String str2);
}

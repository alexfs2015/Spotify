package defpackage;

import com.spotify.music.lyrics.model.LyricsColorsModel;
import io.reactivex.Single;

/* renamed from: suy reason: default package */
public interface suy {
    @xhn(a = "color-lyrics/v1/track/{trackId}")
    Single<LyricsColorsModel> a(@xia(a = "trackId") String str);

    @xhn(a = "color-lyrics/v1/track/{trackId}/image/{imageUri}")
    Single<LyricsColorsModel> a(@xia(a = "trackId") String str, @xia(a = "imageUri") String str2);
}

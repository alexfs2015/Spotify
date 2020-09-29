package defpackage;

import com.spotify.music.genie.omakasse.OmakaseRequest;
import com.spotify.music.genie.omakasse.OmakaseResponse;
import io.reactivex.Single;

/* renamed from: rhg reason: default package */
public interface rhg {
    @wtn(a = {"Content-Type: Application/json", "Accept: Application/json"})
    @wtr(a = "omakase/v1/recommend")
    Single<OmakaseResponse> a(@wtd OmakaseRequest omakaseRequest);
}

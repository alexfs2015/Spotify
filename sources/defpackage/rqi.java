package defpackage;

import com.spotify.music.genie.omakasse.OmakaseRequest;
import com.spotify.music.genie.omakasse.OmakaseResponse;
import io.reactivex.Single;

/* renamed from: rqi reason: default package */
public interface rqi {
    @xhs(a = {"Content-Type: Application/json", "Accept: Application/json"})
    @xhw(a = "omakase/v1/recommend")
    Single<OmakaseResponse> a(@xhi OmakaseRequest omakaseRequest);
}

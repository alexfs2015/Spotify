package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;
import io.reactivex.Single;

/* renamed from: qks reason: default package */
public interface qks {
    @wti
    Single<ArtistPickerResponse> a(@wua String str);

    @wti(a = "nftonboarding/v1/questionnaire/single?platform=android")
    Single<ArtistPickerResponse> a(@wtw(a = "manufacturer") String str, @wtw(a = "model") String str2, @wtw(a = "deepLink") String str3);

    @wti(a = "nftonboarding/v1/questionnaire/single?retake=true&platform=android")
    Single<ArtistPickerResponse> b(@wtw(a = "manufacturer") String str, @wtw(a = "model") String str2, @wtw(a = "deepLink") String str3);
}

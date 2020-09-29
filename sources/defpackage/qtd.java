package defpackage;

import com.spotify.music.features.tasteonboarding.artistpicker.model.ArtistPickerResponse;
import com.spotify.music.features.tasteonboarding.artistpicker.model.RelatedArtistsResponse;
import io.reactivex.Single;

/* renamed from: qtd reason: default package */
public interface qtd {
    @xhn
    Single<ArtistPickerResponse> a(@xif String str);

    @xhn(a = "nftonboarding/v1/questionnaire/single?platform=android")
    Single<ArtistPickerResponse> a(@xib(a = "manufacturer") String str, @xib(a = "model") String str2, @xib(a = "deepLink") String str3);

    @xhn
    Single<RelatedArtistsResponse> b(@xif String str);

    @xhn(a = "nftonboarding/v1/questionnaire/single?retake=true&platform=android")
    Single<ArtistPickerResponse> b(@xib(a = "manufacturer") String str, @xib(a = "model") String str2, @xib(a = "deepLink") String str3);
}

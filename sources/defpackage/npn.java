package defpackage;

import com.spotify.music.features.languagepicker.model.AvailableLanguage;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;

/* renamed from: npn reason: default package */
public interface npn {
    @wts(a = "language-onboarding/v1/user/languages")
    Completable a(@wtd List<String> list);

    @wti(a = "language-onboarding/v1/languages")
    Single<List<AvailableLanguage>> a();

    @wti(a = "language-onboarding/v1/user/languages")
    Single<List<String>> b();
}

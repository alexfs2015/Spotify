package defpackage;

import com.spotify.music.features.languagepicker.model.AvailableLanguage;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;

/* renamed from: nvq reason: default package */
public interface nvq {
    @xhx(a = "language-onboarding/v1/user/languages")
    Completable a(@xhi List<String> list);

    @xhn(a = "language-onboarding/v1/languages")
    Single<List<AvailableLanguage>> a();

    @xhn(a = "language-onboarding/v1/user/languages")
    Single<List<String>> b();
}

package defpackage;

import com.spotify.music.features.speakercompanion.model.EntityFeedbackResponse;
import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse;
import io.reactivex.Single;

/* renamed from: qgj reason: default package */
public interface qgj {
    @wti(a = "vcs-entity-feedback/v1/feedback")
    Single<EntityFeedbackResponse> a(@wtw(a = "uid") String str);

    @wti(a = "vcs-entity-feedback/v1/companion-page")
    Single<EntityResultsPageResponse> b(@wtw(a = "uid") String str);
}

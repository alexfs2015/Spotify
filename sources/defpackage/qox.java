package defpackage;

import com.spotify.music.features.speakercompanion.model.EntityFeedbackResponse;
import com.spotify.music.features.speakercompanion.model.EntityResultsPageResponse;
import io.reactivex.Single;

/* renamed from: qox reason: default package */
public interface qox {
    @xhn(a = "vcs-entity-feedback/v1/feedback")
    Single<EntityFeedbackResponse> a(@xib(a = "uid") String str);

    @xhn(a = "vcs-entity-feedback/v1/companion-page")
    Single<EntityResultsPageResponse> b(@xib(a = "uid") String str);
}

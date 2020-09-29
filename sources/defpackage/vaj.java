package defpackage;

import com.spotify.podcastonboarding.api.CompleteRequestBody;
import com.spotify.podcastonboarding.api.TopicsApiResponse;
import io.reactivex.Completable;
import io.reactivex.Single;

/* renamed from: vaj reason: default package */
public interface vaj {
    @wtr(a = "nftonboarding/v1/complete")
    Completable a(@wtd CompleteRequestBody completeRequestBody);

    @wti(a = "nftonboarding/v3/questionnaire/podcast")
    Single<TopicsApiResponse> a();

    @wtr(a = "nftonboarding/v1/complete/artist")
    Completable b();
}

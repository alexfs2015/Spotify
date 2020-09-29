package defpackage;

import com.spotify.podcastonboarding.api.CompleteRequestBody;
import com.spotify.podcastonboarding.api.TopicsApiResponse;
import io.reactivex.Completable;
import io.reactivex.Single;

/* renamed from: vmx reason: default package */
public interface vmx {
    @xhw(a = "nftonboarding/v1/complete")
    Completable a(@xhi CompleteRequestBody completeRequestBody);

    @xhn(a = "nftonboarding/v3/questionnaire/podcast")
    Single<TopicsApiResponse> a();

    @xhw(a = "nftonboarding/v1/complete/artist")
    Completable b();
}

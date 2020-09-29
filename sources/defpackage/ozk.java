package defpackage;

import io.reactivex.Single;

/* renamed from: ozk reason: default package */
public interface ozk {
    @wtn(a = {"Accept: application/json"})
    @wti(a = "podcast-topics-view/v1/podcasts/{showUri}/topics")
    Single<ozm> a(@wtv(a = "showUri") String str);
}

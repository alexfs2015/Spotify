package defpackage;

import com.spotify.mobile.android.wrapped2019.stories.loading.StoryStatus;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kgi$ucn3JxqZgIbkhaLiRtWa8s1OZcg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kgi$ucn3JxqZgIbkhaLiRtWa8s1OZcg implements Function {
    private final /* synthetic */ kgt f$0;

    public /* synthetic */ $$Lambda$kgi$ucn3JxqZgIbkhaLiRtWa8s1OZcg(kgt kgt) {
        this.f$0 = kgt;
    }

    public final Object apply(Object obj) {
        return this.f$0.a.b(Long.toString((long) ((kfp) obj).hashCode()), kfq.c((kfp) obj)).a((SingleSource<T>) Single.b(new a().a(StoryStatus.READY).a((kfp) obj).a())).c(kgs.a((kfp) obj)).f($$Lambda$LTAs2yLGM2f9Y3Yl7OoaQFWWyAc.INSTANCE).c(kgf.a(kgs.a((kfp) obj)));
    }
}

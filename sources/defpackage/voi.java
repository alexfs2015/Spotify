package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.spotify.podcastonboarding.api.TopicsApiResponse;
import com.spotify.podcastonboarding.api.TopicsApiResponse.a;
import com.spotify.podcastonboarding.topicpicker.model.TopicItem;
import io.reactivex.Single;
import java.util.List;

/* renamed from: voi reason: default package */
public final class voi {
    private final vmx a;

    public voi(vmx vmx) {
        this.a = vmx;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ImmutableList a(TopicsApiResponse topicsApiResponse) {
        List<a> sections = topicsApiResponse.sections();
        ImmutableList.a g = ImmutableList.g();
        for (a aVar : sections) {
            String b = aVar.b();
            if (!TextUtils.isEmpty(b)) {
                g.c(new voa(b));
            }
            for (TopicItem topicItem : aVar.c()) {
                if (aVar.a().equals("PILLS")) {
                    g.c(vof.a(topicItem.id(), topicItem.name(), topicItem.color(), topicItem.selected(), topicItem.type()));
                } else if (aVar.a().equals("PILLOWS")) {
                    g.c(vog.a(topicItem.id(), topicItem.name(), topicItem.color(), topicItem.selected(), topicItem.type(), topicItem.image()));
                }
            }
        }
        return g.a();
    }

    public final Single<ImmutableList<voe>> a() {
        return this.a.a().f(new $$Lambda$voi$eRT7AR1Qc4mf9mMxJbsZXe9KgQ(this));
    }
}

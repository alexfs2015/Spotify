package defpackage;

import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import com.spotify.podcastonboarding.api.TopicsApiResponse;
import com.spotify.podcastonboarding.api.TopicsApiResponse.a;
import com.spotify.podcastonboarding.topicpicker.model.TopicItem;
import io.reactivex.Single;
import java.util.List;

/* renamed from: vbu reason: default package */
public final class vbu {
    private final vaj a;

    public vbu(vaj vaj) {
        this.a = vaj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ImmutableList a(TopicsApiResponse topicsApiResponse) {
        List<a> sections = topicsApiResponse.sections();
        ImmutableList.a g = ImmutableList.g();
        for (a aVar : sections) {
            String b = aVar.b();
            if (!TextUtils.isEmpty(b)) {
                g.c(new vbm(b));
            }
            for (TopicItem topicItem : aVar.c()) {
                if (aVar.a().equals("PILLS")) {
                    g.c(vbr.a(topicItem.id(), topicItem.name(), topicItem.color(), topicItem.selected(), topicItem.type()));
                } else if (aVar.a().equals("PILLOWS")) {
                    g.c(vbs.a(topicItem.id(), topicItem.name(), topicItem.color(), topicItem.selected(), topicItem.type(), topicItem.image()));
                }
            }
        }
        return g.a();
    }

    public final Single<ImmutableList<vbq>> a() {
        return this.a.a().f(new $$Lambda$vbu$C0loidnmmn50Ur1QNAghKYjngQo(this));
    }
}

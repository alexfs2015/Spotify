package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: hqq reason: default package */
public final class hqq implements hqx {
    private final hsh b;
    private final hpg c;
    private final jro d;
    private final hox e;
    private final jrf f;
    private final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());

    public hqq(hsh hsh, hpg hpg, jro jro, jrf jrf, hox hox) {
        this.b = hsh;
        this.c = hpg;
        this.d = jro;
        this.e = hox;
        this.f = jrf;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        Map a = CC.a(this.d, this.g, this.f);
        a.put("region", str);
        return this.e.a().a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hqq$rlzcOjugkqPzYwKnWskSIf0oH3E<Object,Object>(this, a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Map map, Map map2) {
        return this.b.a(map, map2).f(new $$Lambda$hqq$9Z0OHZ0VDZav4kdRu8cPtGefqo(this));
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(HubsJsonViewModel hubsJsonViewModel) {
        ArrayList arrayList = new ArrayList(hubsJsonViewModel.body().size());
        for (gzt children : hubsJsonViewModel.body()) {
            for (gzt a : children.children()) {
                Optional a2 = CC.a(a, this.c, ActionType.BROWSABLE);
                if (a2.b()) {
                    arrayList.add(((hpa) a2.c()).b());
                }
            }
        }
        return arrayList;
    }
}

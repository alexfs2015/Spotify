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

/* renamed from: hqo reason: default package */
public final class hqo implements hqx {
    private final hsh b;
    private final hpg c;
    private final jro d;
    private final hox e;
    private final jrf f;
    private final SimpleDateFormat g = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());

    public hqo(hsh hsh, hpg hpg, jro jro, jrf jrf, hox hox) {
        this.b = hsh;
        this.c = hpg;
        this.d = jro;
        this.e = hox;
        this.f = jrf;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        String replace = hnd.a().replace("spotify:genre:", "");
        Map a = CC.a(this.d, this.g, this.f);
        a.put("region", str);
        return this.e.a().a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hqo$lTEf9ybv3AMq6i0COdPIqL1Hjac<Object,Object>(this, replace, a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, Map map, Map map2) {
        return this.b.a(str, map, map2).f(new $$Lambda$hqo$EiLxp0xbSgEDnsVQGRMlJ1VvQ4(this));
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(HubsJsonViewModel hubsJsonViewModel) {
        ArrayList arrayList = new ArrayList(hubsJsonViewModel.body().size());
        for (gzt a : hubsJsonViewModel.body()) {
            Optional a2 = CC.a(a, this.c, ActionType.PLAYABLE);
            if (a2.b()) {
                arrayList.add(((hpa) a2.c()).b());
            }
        }
        return arrayList;
    }
}

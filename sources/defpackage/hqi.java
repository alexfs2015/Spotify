package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: hqi reason: default package */
public final class hqi implements hqx {
    private final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());
    private final hsg c;
    private final jro d;
    private final hox e;
    private final jrf f;
    private final hpg g;

    public hqi(hsg hsg, hpg hpg, jro jro, jrf jrf, hox hox) {
        this.g = hpg;
        this.c = hsg;
        this.d = jro;
        this.e = hox;
        this.f = jrf;
    }

    public final Single<List<MediaBrowserItem>> a(hnd hnd, String str) {
        Map a = CC.a(this.d, this.b, this.f);
        a.put("region", str);
        return this.e.a().a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hqi$4lF_n9akoSTgwtPv6LdFJFr5ZIg<Object,Object>(this, a));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Map map, Map map2) {
        return this.c.a(map, map2).f(new $$Lambda$hqi$BNHAoOfAiWixhMXqBffg6UB_SCk(this));
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(HubsJsonViewModel hubsJsonViewModel) {
        ArrayList arrayList = new ArrayList(hubsJsonViewModel.body().size());
        for (gzt gzt : hubsJsonViewModel.body()) {
            for (gzt gzt2 : gzt.children()) {
                String a = hsb.a(gzt2);
                boolean z = false;
                if (a != null && jst.a(a).b == LinkType.SHOW_SHOW) {
                    z = true;
                }
                gox a2 = new gox().a(gzt.text().title());
                Optional a3 = CC.a(gzt2, this.g, z ? ActionType.BROWSABLE : ActionType.PLAYABLE);
                if (z) {
                    a2.b(1);
                }
                if (a3.b()) {
                    hpa hpa = (hpa) a3.c();
                    hpa.a(a2.a);
                    arrayList.add(hpa.b());
                }
            }
        }
        return arrayList;
    }
}

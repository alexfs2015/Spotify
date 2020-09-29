package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: hss reason: default package */
public final class hss implements hth {
    private final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());
    private final huy c;
    private final jty d;
    private final hra e;
    private final hgz f;
    private final jtp g;
    private final hre h;

    public hss(huy huy, hre hre, jty jty, jtp jtp, hra hra, hgz hgz) {
        this.h = hre;
        this.c = huy;
        this.d = jty;
        this.e = hra;
        this.f = hgz;
        this.g = jtp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Map map) {
        return this.e.a().a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hss$pk0kpgG3SNQUM0pEbu7tx6AnLiE<Object,Object>(this, map));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Map map, Map map2) {
        return this.c.a(map, map2).f(new $$Lambda$hss$dm3c2rPFOa2DY9wdFCNatCE7_LA(this));
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(HubsJsonViewModel hubsJsonViewModel) {
        ArrayList arrayList = new ArrayList(hubsJsonViewModel.body().size());
        for (hcm hcm : hubsJsonViewModel.body()) {
            for (hcm hcm2 : hcm.children()) {
                String a = hut.a(hcm2);
                boolean z = false;
                if (a != null && jva.a(a).b == LinkType.SHOW_SHOW) {
                    z = true;
                }
                gqn a2 = new gqn().a(hcm.text().title());
                Optional a3 = CC.a(hcm2, this.h, z ? ActionType.BROWSABLE : ActionType.PLAYABLE);
                if (z) {
                    a2.b(1);
                }
                if (a3.b()) {
                    hup hup = (hup) a3.c();
                    hup.a(a2.a);
                    arrayList.add(hup.b());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map a(String str) {
        Map a = CC.a(this.d, this.b, this.g);
        a.put("region", str);
        return a;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.f.b("country_code").c(1).h().f(new $$Lambda$hss$Gvg6qjSMXw2003QhSHkqZ9bJ3Jw(this)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hss$vR0VNBbRMn5mvZWGHmAsoLbBdbY<Object,Object>(this));
    }
}

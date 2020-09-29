package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem;
import com.spotify.mobile.android.service.media.browser.loaders.browse.MediaBrowserItem.ActionType;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: hsy reason: default package */
public final class hsy implements hth {
    private final huz b;
    private final hre c;
    private final jty d;
    private final hra e;
    private final hgz f;
    private final jtp g;
    private final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());

    public hsy(huz huz, hre hre, jty jty, jtp jtp, hra hra, hgz hgz) {
        this.b = huz;
        this.c = hre;
        this.d = jty;
        this.e = hra;
        this.f = hgz;
        this.g = jtp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Map map) {
        return this.e.a().a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hsy$X_ySonud02fyRQTY3rDSGVSZeTg<Object,Object>(this, map));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(Map map, Map map2) {
        return this.b.a(map, map2).f(new $$Lambda$hsy$gbqK5MtQo2z9dxs776nb5TcAHK8(this));
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(HubsJsonViewModel hubsJsonViewModel) {
        ArrayList arrayList = new ArrayList(hubsJsonViewModel.body().size());
        for (hcm children : hubsJsonViewModel.body()) {
            for (hcm a : children.children()) {
                Optional a2 = CC.a(a, this.c, ActionType.BROWSABLE);
                if (a2.b()) {
                    arrayList.add(((hup) a2.c()).b());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Map a(String str) {
        Map a = CC.a(this.d, this.h, this.g);
        a.put("region", str);
        return a;
    }

    public final Single<List<MediaBrowserItem>> a(huo huo, boolean z) {
        return this.f.b("country_code").c(1).h().f(new $$Lambda$hsy$3cxz1jayyCP_fxDDSYWzHYqaKKU(this)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hsy$oktHPN3AVp3qT1othxmdVIt0d6o<Object,Object>(this));
    }
}

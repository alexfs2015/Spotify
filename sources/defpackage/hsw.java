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

/* renamed from: hsw reason: default package */
public final class hsw implements hth {
    private final huz b;
    private final hre c;
    private final jty d;
    private final hra e;
    private final hgz f;
    private final jtp g;
    private final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00", Locale.getDefault());

    public hsw(huz huz, hre hre, jty jty, jtp jtp, hra hra, hgz hgz) {
        this.b = huz;
        this.c = hre;
        this.d = jty;
        this.e = hra;
        this.f = hgz;
        this.g = jtp;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, Map map) {
        return this.e.a().a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hsw$Lr64lAfn2yYSy984t57eAKan73w<Object,Object>(this, str, map));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str, Map map, Map map2) {
        return this.b.a(str, map, map2).f(new $$Lambda$hsw$2VPw9g5PHZFM_yyE4sBem5KKU88(this));
    }

    /* access modifiers changed from: private */
    public List<MediaBrowserItem> a(HubsJsonViewModel hubsJsonViewModel) {
        ArrayList arrayList = new ArrayList(hubsJsonViewModel.body().size());
        for (hcm a : hubsJsonViewModel.body()) {
            Optional a2 = CC.a(a, this.c, ActionType.PLAYABLE);
            if (a2.b()) {
                arrayList.add(((hup) a2.c()).b());
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
        return this.f.b("country_code").c(1).h().f(new $$Lambda$hsw$lQQkqVJ6mLmLhAlzf7ahM97m0(this)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hsw$WoCB5FYdccQ1uv6DTILGFVcQKNM<Object,Object>(this, huo.b().replace("spotify:genre:", "")));
    }
}

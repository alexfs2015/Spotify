package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.partnerapps.PartnerType;
import com.spotify.music.libs.partnerapps.api.NavigationPartnerIntegrationsEntry;
import com.spotify.music.libs.partnerapps.api.NavigationPartnerIntegrationsResponse;
import io.reactivex.Single;
import java.util.Map.Entry;

/* renamed from: rvg reason: default package */
public final class rvg {
    private final rvi a;
    private final nuv b;

    public rvg(rvi rvi, nuv nuv) {
        this.a = rvi;
        this.b = nuv;
    }

    public final Single<ImmutableMap<PartnerType, rvn>> a() {
        return this.a.a().f(new $$Lambda$rvg$zcvK9Vwnkzl1WedewhHv_XAjTjI(this)).f($$Lambda$rvg$j4y0Xq4sPNgFIp5Es4K43i0Pm2A.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static ImmutableMap<PartnerType, rvn> a(ImmutableMap<PartnerType, rvn> immutableMap) {
        a g = ImmutableMap.g();
        fdh R_ = immutableMap.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            if (entry.getKey() != PartnerType.GOOGLE_MAPS) {
                g.b(entry.getKey(), entry.getValue());
            }
        }
        return g.b();
    }

    /* access modifiers changed from: private */
    public ImmutableMap<PartnerType, rvn> a(NavigationPartnerIntegrationsResponse navigationPartnerIntegrationsResponse) {
        a g = ImmutableMap.g();
        for (NavigationPartnerIntegrationsEntry navigationPartnerIntegrationsEntry : navigationPartnerIntegrationsResponse.partnerIntegrations()) {
            PartnerType a2 = PartnerType.a(navigationPartnerIntegrationsEntry.partnerIntegrationId());
            if (a2 != PartnerType.UNKNOWN) {
                g.b(a2, new rvl(navigationPartnerIntegrationsEntry.isConnected(), this.b.a(a2.mPackageName)));
            } else {
                Logger.e("Unknown partner type: %s", navigationPartnerIntegrationsEntry.partnerIntegrationId());
            }
        }
        return g.b();
    }

    public final Single<ImmutableMap<PartnerType, rvo>> b() {
        return this.a.a().f($$Lambda$rvg$1GFgjpyX0PowaKr8TSCVXE16Zs.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static ImmutableMap<PartnerType, rvo> b(NavigationPartnerIntegrationsResponse navigationPartnerIntegrationsResponse) {
        a g = ImmutableMap.g();
        for (NavigationPartnerIntegrationsEntry navigationPartnerIntegrationsEntry : navigationPartnerIntegrationsResponse.partnerIntegrations()) {
            PartnerType a2 = PartnerType.a(navigationPartnerIntegrationsEntry.partnerIntegrationId());
            if (a2 != PartnerType.UNKNOWN) {
                g.b(a2, rvo.create(navigationPartnerIntegrationsEntry.isConnected(), navigationPartnerIntegrationsEntry.clientId(), navigationPartnerIntegrationsEntry.partnerIntegrationId()));
            } else {
                Logger.e("Unknown partner type: %s", navigationPartnerIntegrationsEntry.partnerIntegrationId());
            }
        }
        return g.b();
    }
}

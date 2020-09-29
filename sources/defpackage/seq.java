package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.partnerapps.PartnerType;
import com.spotify.music.libs.partnerapps.api.NavigationPartnerIntegrationsEntry;
import com.spotify.music.libs.partnerapps.api.NavigationPartnerIntegrationsResponse;
import io.reactivex.Single;
import java.util.Map.Entry;

/* renamed from: seq reason: default package */
public final class seq {
    private final ses a;
    private final obi b;

    public seq(ses ses, obi obi) {
        this.a = ses;
        this.b = obi;
    }

    /* access modifiers changed from: private */
    public static ImmutableMap<PartnerType, sex> a(ImmutableMap<PartnerType, sex> immutableMap) {
        a g = ImmutableMap.g();
        fdz R_ = immutableMap.entrySet().iterator();
        while (R_.hasNext()) {
            Entry entry = (Entry) R_.next();
            if (entry.getKey() != PartnerType.GOOGLE_MAPS) {
                g.b(entry.getKey(), entry.getValue());
            }
        }
        return g.b();
    }

    /* access modifiers changed from: private */
    public ImmutableMap<PartnerType, sex> a(NavigationPartnerIntegrationsResponse navigationPartnerIntegrationsResponse) {
        a g = ImmutableMap.g();
        for (NavigationPartnerIntegrationsEntry navigationPartnerIntegrationsEntry : navigationPartnerIntegrationsResponse.partnerIntegrations()) {
            PartnerType a2 = PartnerType.a(navigationPartnerIntegrationsEntry.partnerIntegrationId());
            if (a2 != PartnerType.UNKNOWN) {
                g.b(a2, new sev(navigationPartnerIntegrationsEntry.isConnected(), this.b.a(a2.mPackageName)));
            } else {
                Logger.e("Unknown partner type: %s", navigationPartnerIntegrationsEntry.partnerIntegrationId());
            }
        }
        return g.b();
    }

    /* access modifiers changed from: private */
    public static ImmutableMap<PartnerType, sey> b(NavigationPartnerIntegrationsResponse navigationPartnerIntegrationsResponse) {
        a g = ImmutableMap.g();
        for (NavigationPartnerIntegrationsEntry navigationPartnerIntegrationsEntry : navigationPartnerIntegrationsResponse.partnerIntegrations()) {
            PartnerType a2 = PartnerType.a(navigationPartnerIntegrationsEntry.partnerIntegrationId());
            if (a2 != PartnerType.UNKNOWN) {
                g.b(a2, sey.create(navigationPartnerIntegrationsEntry.isConnected(), navigationPartnerIntegrationsEntry.clientId(), navigationPartnerIntegrationsEntry.partnerIntegrationId()));
            } else {
                Logger.e("Unknown partner type: %s", navigationPartnerIntegrationsEntry.partnerIntegrationId());
            }
        }
        return g.b();
    }

    public final Single<ImmutableMap<PartnerType, sex>> a() {
        return this.a.a().f(new $$Lambda$seq$RPCMakx2IfHzo2FuIoR4TS8tCls(this)).f($$Lambda$seq$ioMWpBJz69LxZx5JfT5_zEttNlY.INSTANCE);
    }

    public final Single<ImmutableMap<PartnerType, sey>> b() {
        return this.a.a().f($$Lambda$seq$UXDHLoPbAGUtCRoB5SL3XWpRg.INSTANCE);
    }
}

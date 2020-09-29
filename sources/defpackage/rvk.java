package defpackage;

import com.spotify.music.libs.partnerapps.api.NavigationPartnerIntegrationsResponse;
import io.reactivex.Single;

/* renamed from: rvk reason: default package */
public interface rvk {
    @wti(a = "partner-client-integrations/v1/categories/navigation")
    Single<NavigationPartnerIntegrationsResponse> a();
}

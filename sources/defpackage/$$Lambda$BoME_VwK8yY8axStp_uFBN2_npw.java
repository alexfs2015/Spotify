package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;
import java.util.List;

/* renamed from: -$$Lambda$BoME_VwK8yY8axStp_uFBN2_npw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$BoME_VwK8yY8axStp_uFBN2_npw implements a {
    private final /* synthetic */ a f$0;

    public /* synthetic */ $$Lambda$BoME_VwK8yY8axStp_uFBN2_npw(a aVar) {
        this.f$0 = aVar;
    }

    public final void onActionForbidden(List list) {
        this.f$0.onError(list);
    }

    public /* synthetic */ void onActionSuccess() {
        CC.$default$onActionSuccess(this);
    }
}

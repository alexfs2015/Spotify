package defpackage;

import com.spotify.mobile.android.service.plugininterfaces.SpotifyServiceIntentProcessor.a;
import java.util.List;

/* renamed from: -$$Lambda$gxKDgkbpGuz5yOjyLkdW_iRO8pE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gxKDgkbpGuz5yOjyLkdW_iRO8pE implements a {
    private final /* synthetic */ a f$0;

    public /* synthetic */ $$Lambda$gxKDgkbpGuz5yOjyLkdW_iRO8pE(a aVar) {
        this.f$0 = aVar;
    }

    public final void onActionForbidden(List list) {
        this.f$0.onError(list);
    }

    public /* synthetic */ void onActionSuccess() {
        CC.$default$onActionSuccess(this);
    }
}

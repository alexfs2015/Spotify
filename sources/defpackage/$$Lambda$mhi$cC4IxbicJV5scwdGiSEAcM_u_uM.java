package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.ConnectManagerState;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$mhi$cC4IxbicJV5scwdGiSEAcM_u_uM reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mhi$cC4IxbicJV5scwdGiSEAcM_u_uM implements Function {
    private final /* synthetic */ ConnectManager f$0;

    public /* synthetic */ $$Lambda$mhi$cC4IxbicJV5scwdGiSEAcM_u_uM(ConnectManager connectManager) {
        this.f$0 = connectManager;
    }

    public final Object apply(Object obj) {
        return mhi.a(this.f$0, (ConnectManagerState) obj);
    }
}

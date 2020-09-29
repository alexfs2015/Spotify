package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.ConnectManager.ConnectManagerState;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$mlw$MapIapkKj_AcktpUbDgi4MlfIHo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mlw$MapIapkKj_AcktpUbDgi4MlfIHo implements Function {
    private final /* synthetic */ ConnectManager f$0;

    public /* synthetic */ $$Lambda$mlw$MapIapkKj_AcktpUbDgi4MlfIHo(ConnectManager connectManager) {
        this.f$0 = connectManager;
    }

    public final Object apply(Object obj) {
        return mlw.a(this.f$0, (ConnectManagerState) obj);
    }
}

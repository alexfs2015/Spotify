package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$mlw$GRrvg9SMWRxiu3v6rY2OjWJkPck reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mlw$GRrvg9SMWRxiu3v6rY2OjWJkPck implements Function {
    private final /* synthetic */ ConnectManager f$0;

    public /* synthetic */ $$Lambda$mlw$GRrvg9SMWRxiu3v6rY2OjWJkPck(ConnectManager connectManager) {
        this.f$0 = connectManager;
    }

    public final Object apply(Object obj) {
        return mlw.a(this.f$0, (GaiaDevice) obj);
    }
}

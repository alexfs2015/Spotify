package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mhi$sN9RGUOFM5kIdJmk2BDmHgthz7o reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mhi$sN9RGUOFM5kIdJmk2BDmHgthz7o implements Consumer {
    private final /* synthetic */ grz f$0;

    public /* synthetic */ $$Lambda$mhi$sN9RGUOFM5kIdJmk2BDmHgthz7o(grz grz) {
        this.f$0 = grz;
    }

    public final void accept(Object obj) {
        ((ConnectManager) obj).c(this.f$0.getIdentifier());
    }
}

package defpackage;

import android.content.ServiceConnection;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$vhw$J6kt48Jlw_ENc0o0KFsC1G2-GbE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vhw$J6kt48Jlw_ENc0o0KFsC1G2GbE implements Cancellable {
    private final /* synthetic */ vhw f$0;
    private final /* synthetic */ ServiceConnection f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$vhw$J6kt48Jlw_ENc0o0KFsC1G2GbE(vhw vhw, ServiceConnection serviceConnection, String str) {
        this.f$0 = vhw;
        this.f$1 = serviceConnection;
        this.f$2 = str;
    }

    public final void cancel() {
        this.f$0.a(this.f$1, this.f$2);
    }
}

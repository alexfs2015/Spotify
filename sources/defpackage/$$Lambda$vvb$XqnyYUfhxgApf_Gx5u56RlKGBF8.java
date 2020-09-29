package defpackage;

import android.content.ServiceConnection;
import io.reactivex.functions.Cancellable;

/* renamed from: -$$Lambda$vvb$XqnyYUfhxgApf_Gx5u56RlKGBF8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vvb$XqnyYUfhxgApf_Gx5u56RlKGBF8 implements Cancellable {
    private final /* synthetic */ vvb f$0;
    private final /* synthetic */ ServiceConnection f$1;
    private final /* synthetic */ String f$2;

    public /* synthetic */ $$Lambda$vvb$XqnyYUfhxgApf_Gx5u56RlKGBF8(vvb vvb, ServiceConnection serviceConnection, String str) {
        this.f$0 = vvb;
        this.f$1 = serviceConnection;
        this.f$2 = str;
    }

    public final void cancel() {
        this.f$0.a(this.f$1, this.f$2);
    }
}

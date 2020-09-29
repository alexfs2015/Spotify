package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$z1-2Ri_3cDEthXFrDGwN55udQeE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$z12Ri_3cDEthXFrDGwN55udQeE implements Function {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$upm$z12Ri_3cDEthXFrDGwN55udQeE(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final Object apply(Object obj) {
        return upm.a(this.f$0, this.f$1.getString(R.string.social_listening_notification_snack_session_created_as_participant, new Object[]{((g) obj).a})).e();
    }
}

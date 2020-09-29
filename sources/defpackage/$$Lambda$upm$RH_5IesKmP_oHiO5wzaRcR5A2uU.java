package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$RH_5IesKmP_oHiO5wzaRcR5A2uU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$RH_5IesKmP_oHiO5wzaRcR5A2uU implements Function {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$upm$RH_5IesKmP_oHiO5wzaRcR5A2uU(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final Object apply(Object obj) {
        return upm.a(this.f$0, this.f$1.getString(R.string.social_listening_notification_snack_participant_joined, new Object[]{((c) obj).a})).e();
    }
}

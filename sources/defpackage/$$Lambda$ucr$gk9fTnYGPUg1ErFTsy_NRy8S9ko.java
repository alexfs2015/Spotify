package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ucr$gk9fTnYGPUg1ErFTsy_NRy8S9ko reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ucr$gk9fTnYGPUg1ErFTsy_NRy8S9ko implements Function {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$ucr$gk9fTnYGPUg1ErFTsy_NRy8S9ko(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final Object apply(Object obj) {
        return ucr.a(this.f$0, this.f$1.getString(R.string.social_listening_notification_snack_session_created_as_host, new Object[]{((b) obj).a})).e();
    }
}

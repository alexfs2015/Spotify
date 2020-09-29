package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ucr$cE3KmfLZi3m8ABTq7xVFfsZU9HU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ucr$cE3KmfLZi3m8ABTq7xVFfsZU9HU implements Function {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$ucr$cE3KmfLZi3m8ABTq7xVFfsZU9HU(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final Object apply(Object obj) {
        return ucr.a(this.f$0, this.f$1.getString(R.string.social_listening_notification_snack_session_created_as_participant, new Object[]{((h) obj).a})).e();
    }
}

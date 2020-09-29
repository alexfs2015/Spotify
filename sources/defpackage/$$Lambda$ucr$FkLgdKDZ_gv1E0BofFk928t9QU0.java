package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ucr$FkLgdKDZ_gv1E0BofFk928t9QU0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ucr$FkLgdKDZ_gv1E0BofFk928t9QU0 implements Function {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$ucr$FkLgdKDZ_gv1E0BofFk928t9QU0(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final Object apply(Object obj) {
        return ucr.a(this.f$0, this.f$1.getString(R.string.social_listening_notification_snack_participant_left, new Object[]{((e) obj).a})).e();
    }
}

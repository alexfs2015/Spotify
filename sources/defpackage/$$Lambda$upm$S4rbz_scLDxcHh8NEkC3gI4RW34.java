package defpackage;

import android.content.Context;
import com.spotify.music.R;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$upm$S4rbz_scLDxcHh8NEkC3gI4RW34 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$upm$S4rbz_scLDxcHh8NEkC3gI4RW34 implements Function {
    private final /* synthetic */ ToastieManager f$0;
    private final /* synthetic */ Context f$1;

    public /* synthetic */ $$Lambda$upm$S4rbz_scLDxcHh8NEkC3gI4RW34(ToastieManager toastieManager, Context context) {
        this.f$0 = toastieManager;
        this.f$1 = context;
    }

    public final Object apply(Object obj) {
        return upm.a(this.f$0, this.f$1.getString(R.string.social_listening_notification_snack_participant_left, new Object[]{((d) obj).a})).e();
    }
}

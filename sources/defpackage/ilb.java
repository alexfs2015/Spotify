package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.Request;
import com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider.RegisterableCardReceiver;

/* renamed from: ilb reason: default package */
public final class ilb extends RegisterableCardReceiver {
    private final ikt d;

    public ilb(Context context, ikt ikt) {
        super(context);
        this.d = ikt;
    }

    public final void a(Context context, int[] iArr) {
        if (context != null && iArr != null) {
            this.d.a(Request.UPDATE, iArr);
        }
    }

    public final void b(Context context, int[] iArr) {
        if (context != null && iArr != null) {
            this.d.a(Request.ENABLE, iArr);
        }
    }

    public final void c(Context context, int[] iArr) {
        if (context != null && iArr != null) {
            this.d.a(Request.DISABLE, iArr);
        }
    }

    public final void a(Context context, int i, foq foq) {
        if (context != null && i != -1) {
            this.d.a(Request.RECEIVE_EVENT, i, foq.a);
        }
    }
}

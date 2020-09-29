package defpackage;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.Request;
import com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider.RegisterableCardReceiver;

/* renamed from: ino reason: default package */
public final class ino extends RegisterableCardReceiver {
    private final ing d;

    public ino(Context context, ing ing) {
        super(context);
        this.d = ing;
    }

    public final void a(Context context, int i, fpk fpk) {
        if (context != null && i != -1) {
            this.d.a(Request.RECEIVE_EVENT, i, fpk.a);
        }
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
}

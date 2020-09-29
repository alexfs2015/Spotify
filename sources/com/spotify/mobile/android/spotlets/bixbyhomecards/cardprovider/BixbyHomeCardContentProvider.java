package com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.Request;
import java.util.Random;

public class BixbyHomeCardContentProvider extends foh {
    public final void a(Context context, int[] iArr) {
        if (context != null && iArr != null) {
            a(context).a(Request.UPDATE, iArr);
        }
    }

    public final void b(Context context, int[] iArr) {
        if (context != null && iArr != null) {
            a(context).a(Request.ENABLE, iArr);
        }
    }

    public final void c(Context context, int[] iArr) {
        if (context != null && iArr != null) {
            a(context).a(Request.DISABLE, iArr);
        }
    }

    public final void a(Context context, int i, foq foq) {
        if (context != null && i != -1) {
            a(context).a(Request.RECEIVE_EVENT, i, foq.a);
        }
    }

    private static ikt a(Context context) {
        return new ikt(context, new vjo(context, new Random(), new jrf()), new ikv(context));
    }
}

package com.spotify.mobile.android.spotlets.bixbyhomecards.cardprovider;

import android.content.Context;
import com.spotify.mobile.android.spotlets.bixbyhomecards.BixbyHomeCardService.Request;
import java.util.Random;

public class BixbyHomeCardContentProvider extends fpb {
    private static ing a(Context context) {
        return new ing(context, new vwu(context, new Random(), new jtp()), new ini(context));
    }

    public final void a(Context context, int i, fpk fpk) {
        if (!(context == null || i == -1)) {
            a(context).a(Request.RECEIVE_EVENT, i, fpk.a);
        }
    }

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
        if (!(context == null || iArr == null)) {
            a(context).a(Request.DISABLE, iArr);
        }
    }
}

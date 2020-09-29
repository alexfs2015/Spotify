package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.reactivex.Observable;

/* renamed from: vii reason: default package */
public final class vii {
    public static Observable<Intent> a(Context context, IntentFilter intentFilter) {
        return new vih(context, intentFilter);
    }
}

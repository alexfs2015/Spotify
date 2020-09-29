package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.reactivex.Observable;

/* renamed from: vvn reason: default package */
public final class vvn {
    public static Observable<Intent> a(Context context, IntentFilter intentFilter) {
        return new vvm(context, intentFilter);
    }
}

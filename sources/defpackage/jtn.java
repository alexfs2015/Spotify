package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.provider.Settings.System;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.concurrent.Callable;

/* renamed from: jtn reason: default package */
public final class jtn {
    final Observable<Boolean> a;

    public jtn(Context context) {
        this.a = Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$jtn$WRKoOyH1eZCDA7Wu4wm8tLG_nLU<Object>(context, new IntentFilter("android.intent.action.AIRPLANE_MODE")));
    }

    private static boolean a(Context context) {
        String str = "airplane_mode_on";
        return VERSION.SDK_INT >= 17 ? Global.getInt(context.getContentResolver(), str, 0) != 0 : System.getInt(context.getContentResolver(), str, 0) != 0;
    }
}

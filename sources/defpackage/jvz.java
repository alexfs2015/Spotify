package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;

/* renamed from: jvz reason: default package */
public final class jvz {
    final Observable<Boolean> a;

    public jvz(Context context) {
        this.a = Observable.a((Callable<? extends ObservableSource<? extends T>>) new $$Lambda$jvz$nmv4Fdqw0y3n9aNZgRIFNlUa_ZM<Object>(context)).a(Functions.a()).c(Boolean.FALSE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Handler handler, final Context context, ContentResolver contentResolver, Uri uri, final ObservableEmitter observableEmitter) {
        AnonymousClass1 r0 = new ContentObserver(handler) {
            public final void onChange(boolean z) {
                observableEmitter.a(Boolean.valueOf(jvz.a(context)));
            }
        };
        contentResolver.registerContentObserver(uri, false, r0);
        observableEmitter.a(Disposables.a((Runnable) new $$Lambda$jvz$x1HzCRfLHvayqoHooP7cUdS9yPE(contentResolver, r0)));
        observableEmitter.a(Boolean.valueOf(a(context)));
    }

    static boolean a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return false;
        }
        if (VERSION.SDK_INT >= 26) {
            int phoneCount = telephonyManager.getPhoneCount();
            for (int i = 0; i < phoneCount; i++) {
                if (telephonyManager.getSimState(i) == 5) {
                    return b(context);
                }
            }
        } else if (telephonyManager.getSimState() == 5) {
            return b(context);
        }
        return false;
    }

    private static boolean b(Context context) {
        String str = "mobile_data";
        return VERSION.SDK_INT >= 17 ? Global.getInt(context.getContentResolver(), str, 1) != 1 : Secure.getInt(context.getContentResolver(), str, 1) != 1;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource c(Context context) {
        String str = "mobile_data";
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$jvz$AHjXSLu2JHuldnIv3pbkPYXzGQ<T>(new Handler(Looper.getMainLooper()), context, context.getContentResolver(), VERSION.SDK_INT >= 17 ? Global.getUriFor(str) : Secure.getUriFor(str)));
    }
}

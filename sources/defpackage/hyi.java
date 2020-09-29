package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.flags.RolloutFlag;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.webbrowser.AdWebViewActivity;
import com.spotify.music.libs.web.RxWebToken;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: hyi reason: default package */
public final class hyi {
    private final RxWebToken a;
    private final hgy b;
    private final gfk<fli> c;
    private final jtz d;
    private final giz e;
    private final CompositeDisposable f = new CompositeDisposable();
    private Handler g;

    public hyi(RxWebToken rxWebToken, hgy hgy, gfk<fli> gfk, jtz jtz, giz giz) {
        this.a = rxWebToken;
        this.b = hgy;
        this.c = gfk;
        this.d = jtz;
        this.e = giz;
    }

    private static Single<Boolean> a(Single<RolloutFlag> single, Single<Uri> single2) {
        return Single.a((SingleSource<? extends T1>) single, (SingleSource<? extends T2>) single2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$hyi$o_h0Dr2cWkJ3aZpeLBfvBY2RysA.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleSource a(Single single, Single single2, Boolean bool) {
        return bool.booleanValue() ? single : single2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(RolloutFlag rolloutFlag, Uri uri) {
        return Boolean.valueOf(rolloutFlag == RolloutFlag.ENABLED && uri != null && uri.getHost().equalsIgnoreCase("www.spotify.com"));
    }

    private void a() {
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.g = null;
        }
        this.f.c();
    }

    private void a(Activity activity, fqa fqa, Uri uri, Consumer<Uri> consumer) {
        try {
            a();
            this.f.a(a(this.b.a(hyn.j).c(1).i(), Single.b(uri)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hyi$e7Sr8B18Vxa7dChSeYXJuLQePc<Object,Object>(this.a.a(uri).c(2, TimeUnit.SECONDS).a(AndroidSchedulers.a()).c(1).d(uri).b((Consumer<? super T>) new $$Lambda$hyi$Iercx2DZqVfTm5T8AGRG_JATgWM<Object>(fqa, activity)).c((Consumer<? super Throwable>) new $$Lambda$hyi$pwoN_E7qpyjn5bj3HCwO9B47JTs<Object>(activity, uri)), Single.b(uri).b(consumer))).a(AndroidSchedulers.a()).a((Consumer<? super T>) $$Lambda$hyi$K6lVuBY5Dplf0RO_PJbCeX_DM.INSTANCE, (Consumer<? super Throwable>) new $$Lambda$hyi$mpf49A_os0ae8vfdCAH0JcBwGw<Object>(uri)));
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder("Ad External Actions - Could not open ad URI: ");
            sb.append(uri);
            Assertion.b(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, fqa fqa, Uri uri, String str, RolloutFlag rolloutFlag) {
        String str2 = "android.intent.action.VIEW";
        if (rolloutFlag == RolloutFlag.ENABLED) {
            hzh hzh = new hzh(activity, fqa, uri, this.c, this.d);
            Context context = (Context) hzh.a.get();
            Uri uri2 = hzh.b;
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(new Intent(str2, uri2), 0);
            ArrayList arrayList = new ArrayList(0);
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                Intent intent = new Intent();
                intent.setAction("android.support.customtabs.action.CustomTabsService");
                intent.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent, 0) != null) {
                    arrayList.add(resolveInfo);
                }
            }
            if (!arrayList.isEmpty()) {
                this.g = new Handler();
                hzh.e = this.g;
                hzh.a();
            } else {
                Intent intent2 = new Intent(activity, AdWebViewActivity.class);
                intent2.putExtra("advertiser", str);
                intent2.putExtra("url", uri.toString());
                activity.startActivity(intent2);
            }
        } else {
            activity.startActivity(new Intent(str2, uri));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity, fqa fqa, String str, Uri uri) {
        Single i = this.b.a(hyn.m).c(1).i();
        $$Lambda$hyi$MSWno7ecDFVNen3NeC7WLNbQU r1 = new $$Lambda$hyi$MSWno7ecDFVNen3NeC7WLNbQU(this, activity, fqa, uri, str);
        this.f.a(i.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) $$Lambda$hyi$MOdDWmN96zwGwLgrSITTJOJ3A_g.INSTANCE));
    }

    public final void a(Activity activity, fqa fqa, Uri uri) {
        a(activity, fqa, uri, (Consumer<Uri>) new $$Lambda$hyi$sPkocOkFbbOJDboSNWM0rrKFrP0<Uri>(activity));
    }

    public final void a(Activity activity, fqa fqa, String str, Uri uri) {
        a(activity, fqa, uri, (Consumer<Uri>) new $$Lambda$hyi$5pYUqSdPYljYweQEkNdxHw6cJo<Uri>(this, activity, fqa, str));
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            xai.a(this.e.b, new a().a(Request.GET, (xak) null).a(str).a(), false).a(new wzq() {
                public final void onFailure(wzp wzp, IOException iOException) {
                    Logger.e(iOException, "request.failed: %s", iOException.getMessage());
                }

                public final void onResponse(wzp wzp, xal xal) {
                    int i = xal.c;
                    if (i < 200 || i >= 300) {
                        Logger.e("Request failed: %s", xal);
                        return;
                    }
                    Logger.b("Success", new Object[0]);
                }
            });
        }
    }
}

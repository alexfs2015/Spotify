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

/* renamed from: hvw reason: default package */
public final class hvw {
    private final RxWebToken a;
    private final hec b;
    private final jjf c;
    private final jrp d;
    private final gho e;
    private final CompositeDisposable f = new CompositeDisposable();
    private Handler g;

    public hvw(RxWebToken rxWebToken, hec hec, jjf jjf, jrp jrp, gho gho) {
        this.a = rxWebToken;
        this.b = hec;
        this.c = jjf;
        this.d = jrp;
        this.e = gho;
    }

    public final void a(Activity activity, fpg fpg, String str, Uri uri) {
        a(activity, fpg, uri, (Consumer<Uri>) new $$Lambda$hvw$FgIgptzsmeIgn3EswWNFCPeqic<Uri>(this, activity, fpg, str));
    }

    public final void a(Activity activity, fpg fpg, Uri uri) {
        a(activity, fpg, uri, (Consumer<Uri>) new $$Lambda$hvw$rrK2K1R6ig31avcVliYo2LDtVg<Uri>(activity));
    }

    private void a(Activity activity, fpg fpg, Uri uri, Consumer<Uri> consumer) {
        try {
            a();
            this.f.a(a(this.b.a(hwb.j).c(1).i(), Single.b(uri)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$hvw$YxVqA4Z561mLTcdfLFtuDrNdn8<Object,Object>(this.a.a(uri).c(2, TimeUnit.SECONDS).a(AndroidSchedulers.a()).c(1).d(uri).b((Consumer<? super T>) new $$Lambda$hvw$NFmA7kuKZAp1wGBFYALEGlmn2Ww<Object>(fpg, activity)).c((Consumer<? super Throwable>) new $$Lambda$hvw$xyrr9zK5GzBtpq7VUWOBLo8RK90<Object>(activity, uri)), Single.b(uri).b(consumer))).a(AndroidSchedulers.a()).a((Consumer<? super T>) $$Lambda$hvw$Rmn7yWistaRS47CFmgYIoregmK8.INSTANCE, (Consumer<? super Throwable>) new $$Lambda$hvw$vBlydWS2rgsd1KwLw5MwZhlyq2A<Object>(uri)));
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder("Ad External Actions - Could not open ad URI: ");
            sb.append(uri);
            Assertion.b(sb.toString());
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleSource a(Single single, Single single2, Boolean bool) {
        return bool.booleanValue() ? single : single2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, fpg fpg, Uri uri, String str, RolloutFlag rolloutFlag) {
        String str2 = "android.intent.action.VIEW";
        if (rolloutFlag == RolloutFlag.ENABLED) {
            hwv hwv = new hwv(activity, fpg, uri, this.c, this.d);
            Context context = (Context) hwv.a.get();
            Uri uri2 = hwv.b;
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
                hwv.e = this.g;
                hwv.a();
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

    private static Single<Boolean> a(Single<RolloutFlag> single, Single<Uri> single2) {
        return Single.a((SingleSource<? extends T1>) single, (SingleSource<? extends T2>) single2, (BiFunction<? super T1, ? super T2, ? extends R>) $$Lambda$hvw$V7JXH8lQtnUtJhJSKWYXJaFGTn4.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(RolloutFlag rolloutFlag, Uri uri) {
        return Boolean.valueOf(rolloutFlag == RolloutFlag.ENABLED && uri != null && uri.getHost().equalsIgnoreCase("www.spotify.com"));
    }

    public final void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            wmc.a(this.e.b, new a().a(Request.GET, (wme) null).a(str).a(), false).a(new wlk() {
                public final void onFailure(wlj wlj, IOException iOException) {
                    Logger.e(iOException, "request.failed: %s", iOException.getMessage());
                }

                public final void onResponse(wlj wlj, wmf wmf) {
                    int i = wmf.c;
                    if (i < 200 || i >= 300) {
                        Logger.e("Request failed: %s", wmf);
                        return;
                    }
                    Logger.b("Success", new Object[0]);
                }
            });
        }
    }

    private void a() {
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.g = null;
        }
        this.f.c();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Activity activity, fpg fpg, String str, Uri uri) {
        Single i = this.b.a(hwb.m).c(1).i();
        $$Lambda$hvw$aJQl4gdJ0HO_uHx1kAgUC7OGzMM r1 = new $$Lambda$hvw$aJQl4gdJ0HO_uHx1kAgUC7OGzMM(this, activity, fpg, uri, str);
        this.f.a(i.a((Consumer<? super T>) r1, (Consumer<? super Throwable>) $$Lambda$hvw$__6vWOdEu_WC0XveiRGZiW2CSIo.INSTANCE));
    }
}

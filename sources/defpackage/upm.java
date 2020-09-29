package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.spotify.music.R;
import com.spotify.music.sociallistening.dialog.SocialListeningEducationActivity;
import com.spotify.music.sociallistening.dialog.SocialListeningSessionEndedActivity;
import com.spotify.music.toastie.ToastieManager;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: upm reason: default package */
public final class upm {
    private static Completable a(ToastieManager toastieManager, String str) {
        return Completable.a((Action) new $$Lambda$upm$QMQMM5CUaV3eIA5TlqcxJRPIRD8(toastieManager, str));
    }

    private static Completable a(ToastieManager toastieManager, String str, Scheduler scheduler) {
        return Completable.a(1000, TimeUnit.MILLISECONDS, scheduler).b((CompletableSource) a(toastieManager, str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Context context, ToastieManager toastieManager, Scheduler scheduler, e eVar) {
        String string = context.getString(R.string.social_listening_notification_snack_you_ended);
        return eVar.a ? a(toastieManager, string, scheduler).e() : a(toastieManager, string).e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Context context, ToastieManager toastieManager, Scheduler scheduler, h hVar) {
        String string = context.getString(R.string.social_listening_notification_snack_you_left);
        return hVar.a ? a(toastieManager, string, scheduler).e() : a(toastieManager, string).e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(ToastieManager toastieManager, Context context, f fVar) {
        int i = fVar.b - 2;
        return a(toastieManager, context.getResources().getQuantityString(R.plurals.social_listening_notification_snack_joined_existing_session, i, new Object[]{Integer.valueOf(i), fVar.a})).e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(lbs lbs, Context context, k kVar) {
        if (!lbs.c()) {
            return Observable.c();
        }
        a(context, kVar.a, true);
        return Observable.b(new a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(lbs lbs, Context context, l lVar) {
        if (!lbs.c()) {
            return Observable.c();
        }
        a(context, lVar.a, false);
        return Observable.b(new b());
    }

    public static ObservableTransformer<a, upj> a(Context context, ToastieManager toastieManager) {
        return new $$Lambda$upm$IpCeZ2i5J20dTGr5xYOwzogsuN4(toastieManager, context);
    }

    public static ObservableTransformer<h, upj> a(Context context, ToastieManager toastieManager, Scheduler scheduler) {
        return new $$Lambda$upm$v0eUBB0I9hsU0ebXwdACTGzHFA(context, toastieManager, scheduler);
    }

    public static ObservableTransformer<k, upj> a(Context context, lbs lbs) {
        return new $$Lambda$upm$ySxD4LjdDvb8GoiwfMG7p2qxA8w(lbs, context);
    }

    public static Consumer<b> a(Context context, NotificationManager notificationManager, lbs lbs) {
        return new $$Lambda$upm$QWHk016DJNY87Hl696xRPHf0Kdk(lbs, context, notificationManager);
    }

    public static Consumer<i> a(upn upn) {
        return new $$Lambda$upm$7ytuecgwnOIc9eGMKX6PNE7xKY(upn);
    }

    private static void a(Context context, String str, boolean z) {
        Intent a = SocialListeningEducationActivity.a(context, str, z);
        a.setFlags(268435456);
        context.startActivity(a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(lbs lbs, Context context, NotificationManager notificationManager, b bVar) {
        String str;
        if (lbs.c()) {
            Intent a = SocialListeningSessionEndedActivity.a(context, bVar.a);
            a.setFlags(268435456);
            context.startActivity(a);
            return;
        }
        String str2 = bVar.a;
        if (str2 != null) {
            str = context.getResources().getString(R.string.social_listening_notification_message_title_containing_host_name, new Object[]{str2});
        } else {
            str = context.getResources().getString(R.string.social_listening_notification_message_title);
        }
        String str3 = "social_listening_channel";
        c b = new c(context, str3).a((CharSequence) str).b((CharSequence) context.getString(R.string.social_listening_notification_message_subtitle));
        b.h = 2;
        Notification b2 = b.a((int) R.drawable.icn_notification).b();
        if (VERSION.SDK_INT >= 26 && notificationManager.getNotificationChannel(str3) == null) {
            notificationManager.createNotificationChannel(new NotificationChannel(str3, context.getString(R.string.social_listening_notification_channel_title), 4));
        }
        notificationManager.notify(R.id.notification_id, b2);
    }

    public static ObservableTransformer<g, upj> b(Context context, ToastieManager toastieManager) {
        return new $$Lambda$upm$U2lcU9cuQ6OMOu2lJJthEZIEY2Q(toastieManager, context);
    }

    public static ObservableTransformer<e, upj> b(Context context, ToastieManager toastieManager, Scheduler scheduler) {
        return new $$Lambda$upm$nxFccAKUCxQ6n3LEDGUMDl5_gPk(context, toastieManager, scheduler);
    }

    public static ObservableTransformer<l, upj> b(Context context, lbs lbs) {
        return new $$Lambda$upm$zlHMp6HbilWOFAmvgkR0wr0Om68(lbs, context);
    }

    public static Consumer<j> b(upn upn) {
        return new $$Lambda$upm$EwWOYGOwJpD3kCN28afA8lki36Y(upn);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(ToastieManager toastieManager, String str) {
        if (toastieManager.b()) {
            toastieManager.a(uzy.a(str, 3000).c(R.color.white).b(R.color.cat_black).a());
        }
    }

    public static ObservableTransformer<f, upj> c(Context context, ToastieManager toastieManager) {
        return new $$Lambda$upm$FJRkR1bdPPUjqe8rXXper1Iq0NM(toastieManager, context);
    }

    public static ObservableTransformer<c, upj> d(Context context, ToastieManager toastieManager) {
        return new $$Lambda$upm$IRQoW1jyjaOEd2P3X_WqsEZHZHo(toastieManager, context);
    }

    public static ObservableTransformer<d, upj> e(Context context, ToastieManager toastieManager) {
        return new $$Lambda$upm$HFWacBNH0XteQ81dKjNqkhiQCkU(toastieManager, context);
    }
}

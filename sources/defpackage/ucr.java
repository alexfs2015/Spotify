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

/* renamed from: ucr reason: default package */
public final class ucr {
    public static ObservableTransformer<a, uco> a(uau uau) {
        return new $$Lambda$ucr$wO9wdeDvU0Z5DYvS4aL_ecnAhKY(uau);
    }

    public static Consumer<j> a(ucs ucs) {
        return new $$Lambda$ucr$742upEHyjnqEgCR2KSW1yffk4h4(ucs);
    }

    public static Consumer<k> b(ucs ucs) {
        return new $$Lambda$ucr$YcCqyxNBCxrCUSBOij98t_JMVU(ucs);
    }

    public static ObservableTransformer<b, uco> a(Context context, ToastieManager toastieManager) {
        return new $$Lambda$ucr$UW6PCPPV2H7DEajTamwj3uEqscI(toastieManager, context);
    }

    public static ObservableTransformer<h, uco> b(Context context, ToastieManager toastieManager) {
        return new $$Lambda$ucr$ffUQWSPEDdzIy7T1i8lRxxevn4k(toastieManager, context);
    }

    public static ObservableTransformer<g, uco> c(Context context, ToastieManager toastieManager) {
        return new $$Lambda$ucr$V1eqWnEDp0y26Sut4Wuh4pNwWI(toastieManager, context);
    }

    public static ObservableTransformer<d, uco> d(Context context, ToastieManager toastieManager) {
        return new $$Lambda$ucr$mIgvAqu4jqxou_fu8fZAbjm_28o(toastieManager, context);
    }

    public static Consumer<c> a(Context context, NotificationManager notificationManager, kyj kyj) {
        return new $$Lambda$ucr$2dkGSWpFMKBByzfqHjqrF7yZCqs(kyj, context, notificationManager);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(kyj kyj, Context context, NotificationManager notificationManager, c cVar) {
        String str;
        if (kyj.c()) {
            Intent a = SocialListeningSessionEndedActivity.a(context, cVar.a);
            a.setFlags(268435456);
            context.startActivity(a);
            return;
        }
        String str2 = cVar.a;
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

    public static ObservableTransformer<i, uco> a(Context context, ToastieManager toastieManager, Scheduler scheduler) {
        return new $$Lambda$ucr$jR0lFwK99BBTxx7q_K3Ppx34HGM(context, toastieManager, scheduler);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Context context, ToastieManager toastieManager, Scheduler scheduler, i iVar) {
        String string = context.getString(R.string.social_listening_notification_snack_you_left);
        if (iVar.a) {
            return a(toastieManager, string, scheduler).e();
        }
        return a(toastieManager, string).e();
    }

    public static ObservableTransformer<f, uco> b(Context context, ToastieManager toastieManager, Scheduler scheduler) {
        return new $$Lambda$ucr$VexpyKFXstMWm54k76XRwXikWns(context, toastieManager, scheduler);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Context context, ToastieManager toastieManager, Scheduler scheduler, f fVar) {
        String string = context.getString(R.string.social_listening_notification_snack_you_ended);
        if (fVar.a) {
            return a(toastieManager, string, scheduler).e();
        }
        return a(toastieManager, string).e();
    }

    public static ObservableTransformer<e, uco> e(Context context, ToastieManager toastieManager) {
        return new $$Lambda$ucr$hpddUeCQJsUt03BpyG09Mylh3iI(toastieManager, context);
    }

    public static ObservableTransformer<l, uco> a(Context context, kyj kyj) {
        return new $$Lambda$ucr$eqlrtHF34pU7Yq33_hPsf3vB_WE(kyj, context);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(kyj kyj, Context context, l lVar) {
        if (!kyj.c()) {
            return Observable.c();
        }
        a(context, lVar.a, true);
        return Observable.b(new a());
    }

    public static ObservableTransformer<m, uco> b(Context context, kyj kyj) {
        return new $$Lambda$ucr$cfjSy2mVvfLotav_fUuE9m2ef7s(kyj, context);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(kyj kyj, Context context, m mVar) {
        if (!kyj.c()) {
            return Observable.c();
        }
        a(context, mVar.a, false);
        return Observable.b(new b());
    }

    private static Completable a(ToastieManager toastieManager, String str) {
        return Completable.a((Action) new $$Lambda$ucr$eTzZlTdEfic5hGO_WlSdpRxSh3g(toastieManager, str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(ToastieManager toastieManager, String str) {
        if (toastieManager.b()) {
            toastieManager.a(uos.a(str, 3000).c(R.color.white).b(R.color.cat_black).a());
        }
    }

    private static Completable a(ToastieManager toastieManager, String str, Scheduler scheduler) {
        return Completable.a(1000, TimeUnit.MILLISECONDS, scheduler).b((CompletableSource) a(toastieManager, str));
    }

    private static void a(Context context, String str, boolean z) {
        Intent a = SocialListeningEducationActivity.a(context, str, z);
        a.setFlags(268435456);
        context.startActivity(a);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(ToastieManager toastieManager, Context context, g gVar) {
        int i = gVar.b - 2;
        return a(toastieManager, context.getResources().getQuantityString(R.plurals.social_listening_notification_snack_joined_existing_session, i, new Object[]{Integer.valueOf(i), gVar.a})).e();
    }
}

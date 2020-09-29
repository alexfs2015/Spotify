package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import com.spotify.music.R;
import com.spotify.music.libs.facebook.FacebookWebPermissionsActivity;
import com.spotify.music.libs.facebook.PermissionRequestResponse;
import com.spotify.music.libs.facebook.PermissionsRequest;
import com.spotify.music.libs.facebook.SocialError;
import com.spotify.music.libs.facebook.SocialEvent;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.SerialDisposable;
import io.reactivex.functions.Consumer;

/* renamed from: rrb reason: default package */
public final class rrb {
    final SerialDisposable a = new SerialDisposable();
    private final rra b;
    private final jsz c;
    private final Context d;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
    }

    public rrb(rra rra, jsz jsz, Context context) {
        this.b = rra;
        this.c = jsz;
        this.d = context;
    }

    public final void a() {
        this.a.a(this.b.a().h(new $$Lambda$rrb$l4H08PBNPFwkkjuWkpRHcySZcQg(this)).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$rrb$fWNdMUBWfkPf_PSOyHLNLPSTB2w<Object>(this), (Consumer<? super Throwable>) $$Lambda$rrb$_dgm0UAwegSTciNkskM9WracQ.INSTANCE));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(SocialEvent socialEvent) {
        SocialError socialError = socialEvent.socialError();
        if (socialError == SocialError.SERVICE_CONNECT_NOT_PERMITTED) {
            return Observable.b(new c());
        }
        if (socialError == SocialError.PERMISSIONS) {
            return this.b.a(PermissionsRequest.builder().permissions(rqu.c).build()).f($$Lambda$rrb$LU_89vSHXuqutn4at6DLH9ASWfY.INSTANCE).d();
        }
        return Observable.b(new b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rqo rqo) {
        rqo.a(new $$Lambda$rrb$Ivo5Uspp2p7bD7x3bxpr7uUW3So(this), new $$Lambda$rrb$xLaqH98TCCdRhlkXn2MnjRS_Mk0(this), $$Lambda$rrb$ehIuoTq4UHuUv2UVC2k4UFuw07Y.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        Intent intent = new Intent(this.d, FacebookWebPermissionsActivity.class);
        intent.putExtra("auth_url", aVar.a);
        intent.putExtra("success_url", aVar.b);
        NotificationManager notificationManager = (NotificationManager) this.d.getSystemService("notification");
        if (notificationManager != null) {
            String str = "spotify_social_error_channel";
            if (VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel(str, this.d.getString(R.string.app_remote_notification_channel_title), 3));
            }
            Resources resources = this.d.getResources();
            c cVar = new c(this.d, str);
            c a2 = cVar.a((CharSequence) resources.getString(R.string.notification_facebook_error_title)).b((CharSequence) resources.getString(R.string.notification_facebook_error_message)).a((int) R.drawable.icn_notification).a(true).a(0);
            a2.p = "err";
            a2.h = 0;
            a2.b(true);
            intent.addFlags(268468224);
            cVar.f = PendingIntent.getActivity(this.d, 1337, intent, 268435456);
            notificationManager.notify(R.id.notification_facebook_publish_error, cVar.b());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.c.a((int) R.string.toast_merge_social_error, 1, new Object[0]);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rqo a(PermissionRequestResponse permissionRequestResponse) {
        return !fax.a(permissionRequestResponse.missingPermissions()) ? new a(permissionRequestResponse.requestPermissionsUrl(), permissionRequestResponse.authSuccessUrl()) : new b();
    }
}

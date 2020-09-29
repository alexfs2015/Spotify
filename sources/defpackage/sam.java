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

/* renamed from: sam reason: default package */
public final class sam {
    final SerialDisposable a = new SerialDisposable();
    private final sal b;
    private final jvf c;
    private final Context d;

    public sam(sal sal, jvf jvf, Context context) {
        this.b = sal;
        this.c = jvf;
        this.d = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(SocialEvent socialEvent) {
        SocialError socialError = socialEvent.socialError();
        return socialError == SocialError.SERVICE_CONNECT_NOT_PERMITTED ? Observable.b(new c()) : socialError == SocialError.PERMISSIONS ? this.b.a(PermissionsRequest.builder().permissions(saf.c).build()).f($$Lambda$sam$nKpHg56S_8etOSu9nR4Ax5FLNMs.INSTANCE).d() : Observable.b(new b());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rzz a(PermissionRequestResponse permissionRequestResponse) {
        return !fbo.a(permissionRequestResponse.missingPermissions()) ? new a(permissionRequestResponse.requestPermissionsUrl(), permissionRequestResponse.authSuccessUrl()) : new b();
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
    public static /* synthetic */ void a(b bVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.c.a((int) R.string.toast_merge_social_error, 1, new Object[0]);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(rzz rzz) {
        rzz.a(new $$Lambda$sam$0CWOrl_AeUEjWzJFjqrKrWIkrsA(this), new $$Lambda$sam$cR5ytKG6_T9ABVzp3VvyeXSyCTs(this), $$Lambda$sam$EsHFtekjqO8_WlWj1EB_hUfWA4.INSTANCE);
    }

    public final void a() {
        this.a.a(this.b.a().h(new $$Lambda$sam$DeleadGWZUf6Slu6Gkibfo6TE(this)).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$sam$fARMwluEu3Q94ye5x1ZSxFyu780<Object>(this), (Consumer<? super Throwable>) $$Lambda$sam$eYGofdjv11SVCvyEGS_B1sjOLt0.INSTANCE));
    }
}

package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.spotify.music.R;
import io.reactivex.subjects.PublishSubject;

/* renamed from: vng reason: default package */
public final class vng implements vni {
    private static OnClickListener b = $$Lambda$vng$IQyUicvUm0qXEdD8blZCH0JRgkM.INSTANCE;
    final PublishSubject<vld> a = PublishSubject.a();
    private final Context c;
    private final fss d;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(DialogInterface dialogInterface, int i) {
    }

    public vng(Context context, fss fss) {
        this.c = context;
        this.d = fss;
    }

    public final void a() {
        this.d.a(this.c.getString(R.string.signup_error_generic_title)).a(this.c.getString(R.string.signup_action_ok), b).a().a();
    }

    public final void b() {
        this.d.a(this.c.getString(R.string.signup_age_error_invalid_age)).a(this.c.getString(R.string.signup_action_ok), b).a().a();
    }

    public final void c() {
        this.d.a(this.c.getString(R.string.signup_email_error_email_already_taken_title), this.c.getString(R.string.signup_email_error_email_already_taken_message)).a(this.c.getString(R.string.signup_action_go_to_login), $$Lambda$vng$fqjRbTGq5ErzfSW0wYnZvNwfJNM.INSTANCE).b(this.c.getString(R.string.signup_action_close), b).a().a();
    }

    public final void d() {
        this.d.a(this.c.getString(R.string.signup_email_no_connection)).a(this.c.getString(R.string.signup_action_ok), b).a().a();
    }

    public final void a(vld vld, vld vld2) {
        fsr a2 = this.d.a(this.c.getString(R.string.signup_generic_error));
        a2.f = new $$Lambda$vng$GG9mCYZDG3u11EbYfJwlF4DO7c(this, vld2);
        a2.a(this.c.getString(R.string.signup_action_retry), new $$Lambda$vng$wMKJmwyh8FieiYrpOMJqxE7Jd8A(this, vld)).b(this.c.getString(R.string.signup_action_close), new $$Lambda$vng$UX99NeZxA0yWxFvSDK98wDheCGI(this, vld2)).a().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vld vld, DialogInterface dialogInterface) {
        this.a.onNext(vld);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(vld vld, DialogInterface dialogInterface, int i) {
        this.a.onNext(vld);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vld vld, DialogInterface dialogInterface, int i) {
        this.a.onNext(vld);
    }

    public final void a(String str) {
        fsr b2 = this.d.a(this.c.getString(R.string.signup_email_error_email_already_taken_title), this.c.getString(R.string.signup_email_error_email_already_taken_message)).a(this.c.getString(R.string.signup_action_go_to_login), new $$Lambda$vng$bJf2xt7BhEy3yjxI2syHkSiM55Q(this, str)).b(this.c.getString(R.string.signup_action_close), new $$Lambda$vng$6XtK0g2MT_28qYQy4w7xj3Fzy8(this, str));
        b2.f = new $$Lambda$vng$ZVX12ZmqWwjGWMOIuyY1tVt7bFY(this, str);
        b2.a().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, DialogInterface dialogInterface, int i) {
        this.a.onNext(new q(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i) {
        this.a.onNext(vld.a(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface) {
        this.a.onNext(vld.a(str));
    }
}

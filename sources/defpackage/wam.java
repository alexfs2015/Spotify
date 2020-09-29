package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.spotify.music.R;
import io.reactivex.subjects.PublishSubject;

/* renamed from: wam reason: default package */
public final class wam implements wao {
    private static OnClickListener b = $$Lambda$wam$RkKnTB4pOg38xDnd0Mz0hPMlI.INSTANCE;
    final PublishSubject<vyj> a = PublishSubject.a();
    private final Context c;
    private final ftm d;

    public wam(Context context, ftm ftm) {
        this.c = context;
        this.d = ftm;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface) {
        this.a.onNext(vyj.a(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, DialogInterface dialogInterface, int i) {
        this.a.onNext(vyj.a(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vyj vyj, DialogInterface dialogInterface) {
        this.a.onNext(vyj);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vyj vyj, DialogInterface dialogInterface, int i) {
        this.a.onNext(vyj);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(DialogInterface dialogInterface, int i) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, DialogInterface dialogInterface, int i) {
        this.a.onNext(new q(str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(vyj vyj, DialogInterface dialogInterface, int i) {
        this.a.onNext(vyj);
    }

    public final void a() {
        this.d.a(this.c.getString(R.string.signup_error_generic_title)).a(this.c.getString(R.string.signup_action_ok), b).a().a();
    }

    public final void a(String str) {
        ftl b2 = this.d.a(this.c.getString(R.string.signup_email_error_email_already_taken_title), this.c.getString(R.string.signup_email_error_email_already_taken_message)).a(this.c.getString(R.string.signup_action_go_to_login), new $$Lambda$wam$nfvqtfvmrLKWT05zn9z60dZ_XI4(this, str)).b(this.c.getString(R.string.signup_action_close), new $$Lambda$wam$ZrrPB9887zGiUK5XBSor_tPeGc(this, str));
        b2.f = new $$Lambda$wam$4PK7jcoQQoEkozdXsRfKeM9uvUQ(this, str);
        b2.a().a();
    }

    public final void a(vyj vyj, vyj vyj2) {
        ftl a2 = this.d.a(this.c.getString(R.string.signup_generic_error));
        a2.f = new $$Lambda$wam$Na8eXZXmUaLXfxGBcdN2_eru_c(this, vyj2);
        a2.a(this.c.getString(R.string.signup_action_retry), new $$Lambda$wam$VPBxFVlbRxnV2FapBizlJtOyasM(this, vyj)).b(this.c.getString(R.string.signup_action_close), new $$Lambda$wam$z58MUwJiVUnihs3mPFxEdwlm4(this, vyj2)).a().a();
    }

    public final void b() {
        this.d.a(this.c.getString(R.string.signup_age_error_invalid_age)).a(this.c.getString(R.string.signup_action_ok), b).a().a();
    }

    public final void c() {
        this.d.a(this.c.getString(R.string.signup_email_error_email_already_taken_title), this.c.getString(R.string.signup_email_error_email_already_taken_message)).a(this.c.getString(R.string.signup_action_go_to_login), $$Lambda$wam$DoQHG8ind_TJl_rA2NPpbg5Gak.INSTANCE).b(this.c.getString(R.string.signup_action_close), b).a().a();
    }

    public final void d() {
        this.d.a(this.c.getString(R.string.signup_email_no_connection)).a(this.c.getString(R.string.signup_action_ok), b).a().a();
    }
}

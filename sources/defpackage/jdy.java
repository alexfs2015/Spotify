package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.mobile.android.sso.ClientIdentity.ValidationException;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: jdy reason: default package */
public final class jdy {
    private ObservableEmitter<jet> a;
    private final jfr b;
    private final jed c;
    private final jry d;
    private final Activity e;

    jdy(jfr jfr, jed jed, jry jry, Activity activity) {
        this.b = jfr;
        this.c = jed;
        this.d = jry;
        this.e = activity;
    }

    public final void a(Intent intent) {
        ObservableEmitter<jet> observableEmitter = this.a;
        if (observableEmitter != null) {
            observableEmitter.a(b(intent));
        }
    }

    private jet b(Intent intent) {
        jfq a2 = this.b.a(intent);
        return jet.a(AuthorizationRequest.a(a2.c(), a2.e(), a2.f(), a(a2), a2.a(), a2.b(), a2.g()), jfr.b(intent), this.d.a(), false);
    }

    private ClientIdentity a(jfq jfq) {
        try {
            jed jed = this.c;
            Activity activity = this.e;
            if (ClientIdentity.a(activity)) {
                return jfq.d();
            }
            return ClientIdentity.a((Context) activity, activity.getCallingActivity());
        } catch (ValidationException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.a = observableEmitter;
    }

    public final Observable<jet> a() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$jdy$pnFnDRPoZRev7dyWrAMRqyqQWuA<T>(this));
    }
}

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

/* renamed from: jgn reason: default package */
public final class jgn {
    private ObservableEmitter<jhi> a;
    private final jig b;
    private final jgs c;
    private final jui d;
    private final Activity e;

    jgn(jig jig, jgs jgs, jui jui, Activity activity) {
        this.b = jig;
        this.c = jgs;
        this.d = jui;
        this.e = activity;
    }

    private ClientIdentity a(jif jif) {
        try {
            jgs jgs = this.c;
            Activity activity = this.e;
            return ClientIdentity.a(activity) ? jif.d() : ClientIdentity.a((Context) activity, activity.getCallingActivity());
        } catch (ValidationException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ObservableEmitter observableEmitter) {
        this.a = observableEmitter;
    }

    private jhi b(Intent intent) {
        jif a2 = this.b.a(intent);
        return jhi.a(AuthorizationRequest.a(a2.c(), a2.e(), a2.f(), a(a2), a2.a(), a2.b(), a2.g()), jig.b(intent), this.d.a(), false);
    }

    public final Observable<jhi> a() {
        return Observable.a((ObservableOnSubscribe<T>) new $$Lambda$jgn$cQaQCp6wgUKlfMwoyLFCTCRNzIU<T>(this));
    }

    public final void a(Intent intent) {
        ObservableEmitter<jhi> observableEmitter = this.a;
        if (observableEmitter != null) {
            observableEmitter.a(b(intent));
        }
    }
}

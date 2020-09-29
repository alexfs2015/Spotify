package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;

/* renamed from: war reason: default package */
public final class war implements geb {
    final Subject<gea> a = BehaviorSubject.a();
    Credential b;
    private final waq c;
    private final Subject<Boolean> d = BehaviorSubject.a();
    private final Subject<Object> e = BehaviorSubject.a();

    public war(waq waq) {
        this.c = waq;
    }

    public final void a() {
        this.c.a((wau) new wau() {
            public final void a(Credential credential) {
                war war = war.this;
                war.b = credential;
                war.a.onNext("https://www.facebook.com".equals(credential.c) ? new a() : new c(credential.a, (String) fbp.a(credential.b)));
            }

            public final void ar_() {
            }

            public final void d() {
                war.this.a.onNext(new b());
            }
        }, false);
    }

    public final Observable<gea> b() {
        return this.a.f();
    }

    public final void c() {
        Credential credential = this.b;
        if (credential != null) {
            this.c.a(credential);
        }
    }
}

package defpackage;

import com.google.android.gms.auth.api.credentials.Credential;
import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.Subject;

/* renamed from: vnl reason: default package */
public final class vnl implements gcq {
    final Subject<gcp> a = BehaviorSubject.a();
    Credential b;
    private final vnk c;
    private final Subject<Boolean> d = BehaviorSubject.a();
    private final Subject<Object> e = BehaviorSubject.a();

    public vnl(vnk vnk) {
        this.c = vnk;
    }

    public final void a() {
        this.c.a((vno) new vno() {
            public final void a() {
            }

            public final void d() {
                vnl.this.a.onNext(new b());
            }

            public final void a(Credential credential) {
                Object obj;
                vnl vnl = vnl.this;
                vnl.b = credential;
                Subject<gcp> subject = vnl.a;
                if ("https://www.facebook.com".equals(credential.c)) {
                    obj = new a();
                } else {
                    obj = new c(credential.a, (String) fay.a(credential.b));
                }
                subject.onNext(obj);
            }
        }, false);
    }

    public final Observable<gcp> b() {
        return this.a.f();
    }

    public final void c() {
        Credential credential = this.b;
        if (credential != null) {
            this.c.a(credential);
        }
    }
}

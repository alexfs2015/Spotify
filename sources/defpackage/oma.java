package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: oma reason: default package */
public final class oma implements a {
    public final BehaviorSubject<rmb> a = BehaviorSubject.a();
    public final CompletableSubject b = CompletableSubject.f();
    public gkq c = PageIdentifiers.UNKNOWN;
    private final String d;

    public oma(String str) {
        this.d = str;
    }

    public final void a(Throwable th) {
        CompletableSubject completableSubject = this.b;
        if (!(completableSubject.a.get() == CompletableSubject.b && completableSubject.c != null)) {
            this.b.onError(th);
        }
    }

    public final sso ae_() {
        return ViewUris.aA.a(this.d);
    }
}

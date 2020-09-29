package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.CompletableSubject;

/* renamed from: oeu reason: default package */
public final class oeu implements a {
    public final BehaviorSubject<rdd> a = BehaviorSubject.a();
    public final CompletableSubject b = CompletableSubject.f();
    public gjf c = PageIdentifiers.UNKNOWN;
    private final String d;

    public oeu(String str) {
        this.d = str;
    }

    public final sih ae_() {
        return ViewUris.aB.a(this.d);
    }

    public final void a(Throwable th) {
        if (!this.b.g()) {
            this.b.onError(th);
        }
    }
}

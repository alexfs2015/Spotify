package defpackage;

import io.reactivex.Completable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: ofy reason: default package */
public final class ofy {
    private final String a;
    private final oga b;
    private final osd c;

    public ofy(String str, oga oga, osd osd) {
        this.a = str;
        this.b = oga;
        this.c = osd;
    }

    public final Completable a() {
        String al = this.c.al();
        if (!fax.a(al)) {
            return this.b.a(this.a, al).a(1200, TimeUnit.MILLISECONDS).h($$Lambda$ofy$4q2NBAQYZG599Cxi4sltOZkAek.INSTANCE).b((Consumer<? super T>) new $$Lambda$ofy$9wiVUTJ80EgZ6x249F6gRlt12AA<Object>(this)).b();
        }
        return Completable.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.c.am();
    }
}

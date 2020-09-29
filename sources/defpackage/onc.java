package defpackage;

import io.reactivex.Completable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: onc reason: default package */
public final class onc {
    private final String a;
    private final one b;
    private final ozj c;

    public onc(String str, one one, ozj ozj) {
        this.a = str;
        this.b = one;
        this.c = ozj;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.c.am();
    }

    public final Completable a() {
        String al = this.c.al();
        return !fbo.a(al) ? this.b.a(this.a, al).a(1200, TimeUnit.MILLISECONDS).h($$Lambda$onc$FrQ8cAHGjiJMs7XORqiV_WK5_WY.INSTANCE).b((Consumer<? super T>) new $$Lambda$onc$2oP6VdTfTA46DwDpSh4tz4HU784<Object>(this)).b() : Completable.a();
    }
}

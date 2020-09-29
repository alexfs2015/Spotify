package defpackage;

import android.content.Context;
import io.reactivex.Observable;

/* renamed from: hui reason: default package */
public final class hui implements wig<huh> {
    private final wzi<Context> a;
    private final wzi<hgz> b;
    private final wzi<irc> c;
    private final wzi<Observable<String>> d;

    private hui(wzi<Context> wzi, wzi<hgz> wzi2, wzi<irc> wzi3, wzi<Observable<String>> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static hui a(wzi<Context> wzi, wzi<hgz> wzi2, wzi<irc> wzi3, wzi<Observable<String>> wzi4) {
        return new hui(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new huh((Context) this.a.get(), (hgz) this.b.get(), (irc) this.c.get(), (Observable) this.d.get());
    }
}

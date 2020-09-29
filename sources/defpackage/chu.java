package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: chu reason: default package */
final class chu implements Callable<chr> {
    private final /* synthetic */ Context a;
    private final /* synthetic */ cht b;

    chu(cht cht, Context context) {
        this.b = cht;
        this.a = context;
    }

    public final /* synthetic */ Object call() {
        chr chr;
        chv chv = (chv) this.b.a.get(this.a);
        if (chv != null) {
            if (!(chv.a + ((Long) dpn.f().a(dsp.bo)).longValue() < bjl.l().a())) {
                if (((Boolean) dpn.f().a(dsp.bn)).booleanValue()) {
                    chr = new chs(this.a, chv.b).a();
                    this.b.a.put(this.a, new chv(chr));
                    return chr;
                }
            }
        }
        chr = new chs(this.a).a();
        this.b.a.put(this.a, new chv(chr));
        return chr;
    }
}

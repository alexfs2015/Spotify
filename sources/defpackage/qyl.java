package defpackage;

import android.content.Context;

/* renamed from: qyl reason: default package */
public final class qyl implements wig<qyk> {
    private final wzi<Context> a;
    private final wzi<gcb> b;
    private final wzi<qyu> c;
    private final wzi<qze> d;
    private final wzi<scu> e;
    private final wzi<jty> f;

    private qyl(wzi<Context> wzi, wzi<gcb> wzi2, wzi<qyu> wzi3, wzi<qze> wzi4, wzi<scu> wzi5, wzi<jty> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static qyl a(wzi<Context> wzi, wzi<gcb> wzi2, wzi<qyu> wzi3, wzi<qze> wzi4, wzi<scu> wzi5, wzi<jty> wzi6) {
        qyl qyl = new qyl(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return qyl;
    }

    public final /* synthetic */ Object get() {
        qyk qyk = new qyk((Context) this.a.get(), (gcb) this.b.get(), (qyu) this.c.get(), (qze) this.d.get(), (scu) this.e.get(), (jty) this.f.get());
        return qyk;
    }
}

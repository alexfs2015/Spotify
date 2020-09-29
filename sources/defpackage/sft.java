package defpackage;

import android.app.Application;
import java.util.Random;

/* renamed from: sft reason: default package */
public final class sft implements wig<gnb> {
    private final wzi<gnd> a;
    private final wzi<jlr> b;
    private final wzi<Random> c;
    private final wzi<Application> d;

    private sft(wzi<gnd> wzi, wzi<jlr> wzi2, wzi<Random> wzi3, wzi<Application> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static sft a(wzi<gnd> wzi, wzi<jlr> wzi2, wzi<Random> wzi3, wzi<Application> wzi4) {
        return new sft(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (gnb) wil.a(new gnb((gnd) this.a.get(), new sfn((jlr) this.b.get()), (Random) this.c.get(), ((Application) this.d.get()).getApplicationContext()), "Cannot return null from a non-@Nullable @Provides method");
    }
}

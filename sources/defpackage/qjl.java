package defpackage;

import io.reactivex.functions.Function;

/* renamed from: qjl reason: default package */
public final class qjl implements wig<qjk> {
    private final wzi<Function<sjh, hcs>> a;
    private final wzi<qje> b;
    private final wzi<sim> c;
    private final wzi<siv> d;
    private final wzi<snp> e;
    private final wzi<sre> f;

    private qjl(wzi<Function<sjh, hcs>> wzi, wzi<qje> wzi2, wzi<sim> wzi3, wzi<siv> wzi4, wzi<snp> wzi5, wzi<sre> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static qjl a(wzi<Function<sjh, hcs>> wzi, wzi<qje> wzi2, wzi<sim> wzi3, wzi<siv> wzi4, wzi<snp> wzi5, wzi<sre> wzi6) {
        qjl qjl = new qjl(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return qjl;
    }

    public final /* synthetic */ Object get() {
        qjk qjk = new qjk((Function) this.a.get(), (qje) this.b.get(), (sim) this.c.get(), (siv) this.d.get(), (snp) this.e.get(), (sre) this.f.get());
        return qjk;
    }
}

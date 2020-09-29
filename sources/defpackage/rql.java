package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;

/* renamed from: rql reason: default package */
public final class rql implements wig<rqk> {
    private final wzi<Context> a;
    private final wzi<Picasso> b;
    private final wzi<rqw> c;
    private final wzi<hap> d;
    private final wzi<rst> e;
    private final wzi<fqn> f;

    private rql(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<rqw> wzi3, wzi<hap> wzi4, wzi<rst> wzi5, wzi<fqn> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static rql a(wzi<Context> wzi, wzi<Picasso> wzi2, wzi<rqw> wzi3, wzi<hap> wzi4, wzi<rst> wzi5, wzi<fqn> wzi6) {
        rql rql = new rql(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return rql;
    }

    public final /* synthetic */ Object get() {
        rqk rqk = new rqk((Context) this.a.get(), (Picasso) this.b.get(), (rqw) this.c.get(), (hap) this.d.get(), (rst) this.e.get(), (fqn) this.f.get());
        return rqk;
    }
}

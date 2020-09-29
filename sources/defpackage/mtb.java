package defpackage;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.List;

/* renamed from: mtb reason: default package */
public final class mtb implements sbh {
    private final mta a;

    public mtb(mta mta) {
        this.a = mta;
    }

    public final Single<sbf> a() {
        return this.a.a().b(Schedulers.b());
    }

    public final Single<List<sbe>> b() {
        return this.a.b().b(Schedulers.b());
    }
}

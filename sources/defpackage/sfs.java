package defpackage;

import io.reactivex.Single;
import io.reactivex.functions.Function;

/* renamed from: sfs reason: default package */
public final class sfs implements sfn {
    private final sbf a;
    private final Function<rzz, gzz> b;

    public sfs(sbf sbf, Function<rzz, gzz> function) {
        this.a = sbf;
        this.b = function;
    }

    public final Single<sgg<gzz>> a(sgh sgh) {
        if (sgh.c()) {
            return Single.b(sgg.c());
        }
        return this.a.c(sgh.b(), sgh.a()).f(new $$Lambda$sfs$gk4WgSFbUJQNTqTOH1k5ZdrX5oU(sgh)).f(this.b).f(new $$Lambda$sfs$SbSgz1U6z4cEPI6apznTh5QZEU(sgh));
    }
}

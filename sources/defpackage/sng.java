package defpackage;

import com.moat.analytics.mobile.MoatAdEvent;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import java.util.Map;

/* renamed from: sng reason: default package */
public final class sng {
    private final lbi a;
    private final hgz b;
    private final String c;

    public sng(lbi lbi, hgz hgz, String str) {
        this.a = lbi;
        this.b = hgz;
        this.c = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ smg a(Map map) {
        return new slw(this.c, (String) map.get(MoatAdEvent.EVENT_TYPE), (String) map.get("country_code"));
    }

    public final kmv<slz> a() {
        return koj.a(this.a.a.a(1).a().c((Function<? super T, ? extends R>) $$Lambda$mawitVwbaVvt_0uq_S4PllnlA.INSTANCE).a(Functions.a()), this.b.a.c((Function<? super T, ? extends R>) new $$Lambda$sng$_kZM6CXNLFYH1ebHCGdPu_peh34<Object,Object>(this)).c((Function<? super T, ? extends R>) $$Lambda$9EpfFVXMPpkQBLT7lOhBrnYtDOk.INSTANCE).a(Functions.a()));
    }
}

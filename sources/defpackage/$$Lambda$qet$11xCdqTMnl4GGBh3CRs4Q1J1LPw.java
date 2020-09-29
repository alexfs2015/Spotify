package defpackage;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$qet$11xCdqTMnl4GGBh3CRs4Q1J1LPw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qet$11xCdqTMnl4GGBh3CRs4Q1J1LPw implements Function {
    public static final /* synthetic */ $$Lambda$qet$11xCdqTMnl4GGBh3CRs4Q1J1LPw INSTANCE = new $$Lambda$qet$11xCdqTMnl4GGBh3CRs4Q1J1LPw();

    private /* synthetic */ $$Lambda$qet$11xCdqTMnl4GGBh3CRs4Q1J1LPw() {
    }

    public final Object apply(Object obj) {
        return Observable.b(new b()).c(500, TimeUnit.MILLISECONDS, Schedulers.a());
    }
}

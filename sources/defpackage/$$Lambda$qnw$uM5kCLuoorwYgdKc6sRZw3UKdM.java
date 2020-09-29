package defpackage;

import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* renamed from: -$$Lambda$qnw$uM5-kCLuoorwYgdKc6sRZw3UKdM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$qnw$uM5kCLuoorwYgdKc6sRZw3UKdM implements Function {
    public static final /* synthetic */ $$Lambda$qnw$uM5kCLuoorwYgdKc6sRZw3UKdM INSTANCE = new $$Lambda$qnw$uM5kCLuoorwYgdKc6sRZw3UKdM();

    private /* synthetic */ $$Lambda$qnw$uM5kCLuoorwYgdKc6sRZw3UKdM() {
    }

    public final Object apply(Object obj) {
        return Observable.b(new b()).c(500, TimeUnit.MILLISECONDS, Schedulers.a());
    }
}

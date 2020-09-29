package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* renamed from: ntb reason: default package */
public interface ntb {

    /* renamed from: ntb$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<SessionState> a(hvl hvl) {
            return hvl.a.a((Predicate<? super T>) $$Lambda$e4mv30H7KYvrXlczsuVnyxQNJs.INSTANCE).c(600, TimeUnit.MILLISECONDS).a(Functions.a()).j();
        }
    }
}

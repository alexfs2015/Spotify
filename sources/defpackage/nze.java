package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.TimeUnit;

/* renamed from: nze reason: default package */
public interface nze {

    /* renamed from: nze$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<SessionState> a(hxx hxx) {
            return hxx.a.a((Predicate<? super T>) $$Lambda$gFz_cVPYAl5maQZ7xewFvMizyXk.INSTANCE).c(600, TimeUnit.MILLISECONDS).a(Functions.a()).j();
        }
    }
}

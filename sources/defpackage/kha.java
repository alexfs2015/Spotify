package defpackage;

import android.content.Context;
import android.os.Looper;
import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservablePublish;

/* renamed from: kha reason: default package */
public interface kha {

    /* renamed from: kha$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static aqq a(Context context) {
            return aqr.a(context, (ari) new aqp(context), (bbw) new bbr(), (aqx) new aqn(), null, Looper.getMainLooper());
        }

        public static atd a(giz giz) {
            return new atd(giz.b, "wrapped-preview-player");
        }

        public static c a(a aVar) {
            return new c(aVar);
        }

        public static a a(Context context, atd atd) {
            return new bck(context, (a) atd);
        }

        public static Observable<khi> a(khm khm) {
            return ObservablePublish.h(khm.a).a();
        }
    }
}

package defpackage;

import android.content.Context;
import android.os.Looper;
import io.reactivex.Observable;
import io.reactivex.internal.operators.observable.ObservablePublish;

/* renamed from: key reason: default package */
public interface key {

    /* renamed from: key$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static apz a(Context context) {
            return aqa.a(context, (aqr) new apy(context), (bbf) new bba(), (aqg) new apw(), null, Looper.getMainLooper());
        }

        public static c a(a aVar) {
            return new c(aVar);
        }

        public static a a(Context context, asm asm) {
            return new bbt(context, (a) asm);
        }

        public static asm a(gho gho) {
            return new asm(gho.b, "wrapped-preview-player");
        }

        public static Observable<kfg> a(kfk kfk) {
            return ObservablePublish.h(kfk.a).a();
        }
    }
}

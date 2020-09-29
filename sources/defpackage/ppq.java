package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: ppq reason: default package */
public final class ppq {
    public static kjm<ppm> a(pni pni) {
        return kla.a(b(pni));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, String str2) {
        return !str2.equalsIgnoreCase(str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str) {
        return !str.equalsIgnoreCase(ViewUris.V.toString());
    }

    private static Observable<ppm> b(pni pni) {
        return pni.b.c((Function<? super T, ? extends R>) $$Lambda$vmAirAjViK7B7o0_34zfRJs9yMQ.INSTANCE).a((Predicate<? super T>) new $$Lambda$ppq$LXbPmOW2mLlSHxng8jG9b5wzABg<Object>(pni.a)).a((Predicate<? super T>) $$Lambda$ppq$bZbfCzIHgny4R3YdbiU0XlzMb1g.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$ppq$enuMn3oY0kCm9VVAw5ROUNfuCVI.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ppm a(String str) {
        return new c();
    }
}

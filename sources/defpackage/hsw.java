package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: hsw reason: default package */
public final class hsw {
    static Observable<uyy<uys>> a(RxResolver rxResolver, hvl hvl) {
        return hvl.a.c((Function<? super T, ? extends R>) $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4.INSTANCE).a(Functions.a()).j().c((Function<? super T, ? extends R>) new $$Lambda$hsw$BeLgzvsutOGBV60ZlEhr9zlw1Es<Object,Object>(rxResolver)).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$hsw$4nlv2GnL8AG46eoRhNknhiWD2jk.INSTANCE, false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rxh a(RxResolver rxResolver, String str) {
        rxf rxf = new rxf(rxResolver, str, false);
        rxf.a(false, true, false);
        rxf.c = new SortOption("name");
        rxf.a = MediaType.AUDIO;
        return rxf;
    }
}

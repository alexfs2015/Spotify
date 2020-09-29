package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: hvk reason: default package */
public final class hvk {
    static Observable<vlb<vkv>> a(RxResolver rxResolver, hxx hxx) {
        return hxx.a.c((Function<? super T, ? extends R>) $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4.INSTANCE).a(Functions.a()).j().c((Function<? super T, ? extends R>) new $$Lambda$hvk$BvJuyx50S7dtL5UbzVMk_Vi2QY<Object,Object>(rxResolver)).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$hvk$1oXs22_a1zyJQfNXwidTmZjtwc.INSTANCE, false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ sgr a(RxResolver rxResolver, String str) {
        sgp sgp = new sgp(rxResolver, str, false);
        sgp.a(false, true, false);
        sgp.c = new SortOption("name");
        sgp.a = MediaType.AUDIO;
        return sgp;
    }
}

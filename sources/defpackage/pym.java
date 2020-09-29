package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: pym reason: default package */
public final class pym {
    public static kmv<pyi> a(pwe pwe) {
        return koj.a(b(pwe));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ pyi a(String str) {
        return new c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(String str, String str2) {
        return !str2.equalsIgnoreCase(str);
    }

    private static Observable<pyi> b(pwe pwe) {
        return pwe.b.c((Function<? super T, ? extends R>) $$Lambda$HZqz4H7phlF9YisYNloXyLLjhBo.INSTANCE).a((Predicate<? super T>) new $$Lambda$pym$XxKrMZakz_7QFdCBi105PjZ82sk<Object>(pwe.a)).a((Predicate<? super T>) $$Lambda$pym$LZhbkPwWkGyMLjFoNAaMFx2LEpk.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$pym$ijgvlMioNRG7D_VwehvB3E7vM.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(String str) {
        return !str.equalsIgnoreCase(ViewUris.U.toString());
    }
}

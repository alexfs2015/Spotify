package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: rhq reason: default package */
public final class rhq {
    public static Observable<rhm> a(Observable<Boolean> observable) {
        return observable.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$rhq$M9V0F6vPk0UtS_n4unvQPPX2lF8.INSTANCE);
    }

    public static Observable<rhm> a(rda rda, int i) {
        return rda.b().c((Function<? super T, ? extends R>) new $$Lambda$rhq$J2p84oNbtKccIYNoZJ9eOqbYI<Object,Object>(i)).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rhm a(int i, rdc rdc) {
        int k = rdc.k();
        a g = ImmutableList.g();
        int i2 = 0;
        for (int i3 = 0; i3 < k && i2 < i; i3++) {
            MusicItem a = rdc.a(i3);
            if (a.v() && !a.w().h()) {
                g.c(rdc.a(i3).j());
                i2++;
            }
        }
        return new d(g.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rhm a(Boolean bool) {
        return new a(bool.booleanValue());
    }
}

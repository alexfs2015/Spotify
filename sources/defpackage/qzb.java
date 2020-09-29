package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: qzb reason: default package */
public final class qzb {
    public static Observable<qyx> a(qul qul, int i) {
        return qul.b().c((Function<? super T, ? extends R>) new $$Lambda$qzb$w2WubGaKwtWbR1T31ACcHDym78<Object,Object>(i)).a(Functions.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qyx a(int i, qun qun) {
        int k = qun.k();
        a g = ImmutableList.g();
        int i2 = 0;
        for (int i3 = 0; i3 < k && i2 < i; i3++) {
            MusicItem a = qun.a(i3);
            if (a.v() && !a.w().h()) {
                g.c(qun.a(i3).j());
                i2++;
            }
        }
        return new d(g.a());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qyx a(Boolean bool) {
        return new a(bool.booleanValue());
    }

    public static Observable<qyx> a(Observable<Boolean> observable) {
        return observable.a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$qzb$pleJJ2Yh_XinTU1ZOWb2CkGy2HI.INSTANCE);
    }
}

package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Ad;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$iez$H10wP2zCYt5qUVcGB3M-DMa5EgA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iez$H10wP2zCYt5qUVcGB3MDMa5EgA implements Function {
    private final /* synthetic */ Flowable f$0;

    public /* synthetic */ $$Lambda$iez$H10wP2zCYt5qUVcGB3MDMa5EgA(Flowable flowable) {
        this.f$0 = flowable;
    }

    public final Object apply(Object obj) {
        return this.f$0.c((Function<? super T, ? extends R>) new $$Lambda$iez$tRZdjVzAIK8zWyK9uQ1GctKZ1lg<Object,Object>((Ad) obj));
    }
}

package defpackage;

import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vkd$uX6LGYdDBBZOU_F3F0_PcB73EnE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vkd$uX6LGYdDBBZOU_F3F0_PcB73EnE implements SingleTransformer {
    private final /* synthetic */ fli f$0;

    public /* synthetic */ $$Lambda$vkd$uX6LGYdDBBZOU_F3F0_PcB73EnE(fli fli) {
        this.f$0 = fli;
    }

    public final SingleSource apply(Single single) {
        return single.a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$vkd$kqqRN0BFeY2qrSLFFb36kB7XUw<Object,Object>(this.f$0));
    }
}

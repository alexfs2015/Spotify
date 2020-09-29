package defpackage;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;

/* renamed from: -$$Lambda$nib$OBoRGqavaN9_hOBsF9MNQK8JrQc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$nib$OBoRGqavaN9_hOBsF9MNQK8JrQc implements ObservableTransformer {
    private final /* synthetic */ nii f$0;
    private final /* synthetic */ nil f$1;
    private final /* synthetic */ heq f$2;
    private final /* synthetic */ nde f$3;

    public /* synthetic */ $$Lambda$nib$OBoRGqavaN9_hOBsF9MNQK8JrQc(nii nii, nil nil, heq heq, nde nde) {
        this.f$0 = nii;
        this.f$1 = nil;
        this.f$2 = heq;
        this.f$3 = nde;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.h(new $$Lambda$nib$752t0Q5z_Lc_9bjWi0Uj1F4i5Jw(this.f$0, this.f$1, this.f$2, this.f$3));
    }
}

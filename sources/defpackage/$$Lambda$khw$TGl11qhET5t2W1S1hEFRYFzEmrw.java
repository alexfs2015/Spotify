package defpackage;

import android.graphics.Bitmap;
import com.spotify.mobile.android.wrapped2019.stories.endpoint.share.ConsumerShareResponse;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$khw$TGl11qhET5t2W1S1hEFRYFzEmrw reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$khw$TGl11qhET5t2W1S1hEFRYFzEmrw implements Function {
    private final /* synthetic */ khw f$0;
    private final /* synthetic */ ConsumerShareResponse f$1;

    public /* synthetic */ $$Lambda$khw$TGl11qhET5t2W1S1hEFRYFzEmrw(khw khw, ConsumerShareResponse consumerShareResponse) {
        this.f$0 = khw;
        this.f$1 = consumerShareResponse;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, (Bitmap) obj);
    }
}

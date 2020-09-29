package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$kpu$mhNcW9hl2QPgYZhli6gNoaXsj-o reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kpu$mhNcW9hl2QPgYZhli6gNoaXsjo implements Function {
    private final /* synthetic */ kqa f$0;

    public /* synthetic */ $$Lambda$kpu$mhNcW9hl2QPgYZhli6gNoaXsjo(kqa kqa) {
        this.f$0 = kqa;
    }

    public final Object apply(Object obj) {
        return Flowable.b((Callable<? extends T>) new kpz<Object>((Context) kqa.a(this.f$0.a.get(), 1), (Picasso) kqa.a(this.f$0.b.get(), 2), (kqc) kqa.a((kqc) obj, 3)));
    }
}

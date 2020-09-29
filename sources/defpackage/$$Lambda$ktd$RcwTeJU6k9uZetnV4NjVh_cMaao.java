package defpackage;

import android.content.Context;
import com.squareup.picasso.Picasso;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* renamed from: -$$Lambda$ktd$RcwTeJU6k9uZetnV4NjVh_cMaao reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ktd$RcwTeJU6k9uZetnV4NjVh_cMaao implements Function {
    private final /* synthetic */ ktj f$0;

    public /* synthetic */ $$Lambda$ktd$RcwTeJU6k9uZetnV4NjVh_cMaao(ktj ktj) {
        this.f$0 = ktj;
    }

    public final Object apply(Object obj) {
        return Flowable.b((Callable<? extends T>) new kti<Object>((Context) ktj.a(this.f$0.a.get(), 1), (Picasso) ktj.a(this.f$0.b.get(), 2), (ktl) ktj.a((ktl) obj, 3)));
    }
}

package defpackage;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItem;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.plugins.RxJavaPlugins;

/* renamed from: ktd reason: default package */
public interface ktd {

    /* renamed from: ktd$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Flowable<ktl> a(Context context, Flowable<RecentlyPlayedItems> flowable) {
            Flowable a = flowable.c((Function<? super T, ? extends R>) new $$Lambda$ktd$xHZTqqzEfaMCyDyTu4zEdj7rLzA<Object,Object>(context)).a(Functions.a());
            $$Lambda$ktd$3KhmyEren2esFMAIRmuijGY4X1c r3 = $$Lambda$ktd$3KhmyEren2esFMAIRmuijGY4X1c.INSTANCE;
            int a2 = Flowable.a();
            ObjectHelper.a(r3, "mapper is null");
            ObjectHelper.a(a2, "bufferSize");
            return RxJavaPlugins.a((Flowable<T>) new FlowableFlattenIterable<T>(a, r3, a2));
        }

        public static Flowable<ShortcutInfo> a(Flowable<ktl> flowable, ktj ktj) {
            $$Lambda$ktd$RcwTeJU6k9uZetnV4NjVh_cMaao r2 = new $$Lambda$ktd$RcwTeJU6k9uZetnV4NjVh_cMaao(ktj);
            int a = Flowable.a();
            int a2 = Flowable.a();
            ObjectHelper.a(r2, "mapper is null");
            ObjectHelper.a(a, "maxConcurrency");
            ObjectHelper.a(a2, "prefetch");
            FlowableConcatMapEager flowableConcatMapEager = new FlowableConcatMapEager(flowable, r2, a, a2, ErrorMode.IMMEDIATE);
            return RxJavaPlugins.a((Flowable<T>) flowableConcatMapEager);
        }

        public static /* synthetic */ Iterable a(ImmutableList immutableList) {
            return immutableList;
        }

        public static /* synthetic */ boolean b(Context context, RecentlyPlayedItem recentlyPlayedItem) {
            return !fbo.a(recentlyPlayedItem.getTitle(context));
        }
    }
}

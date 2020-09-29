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

/* renamed from: kpu reason: default package */
public interface kpu {

    /* renamed from: kpu$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Iterable a(ImmutableList immutableList) {
            return immutableList;
        }

        public static Flowable<kqc> a(Context context, Flowable<RecentlyPlayedItems> flowable) {
            Flowable a = flowable.c((Function<? super T, ? extends R>) new $$Lambda$kpu$sC8V2FcVv9XxS6h79ywTc7xQoXo<Object,Object>(context)).a(Functions.a());
            $$Lambda$kpu$j6gGurfC8hPJAoAcjuh5c9VXPZg r3 = $$Lambda$kpu$j6gGurfC8hPJAoAcjuh5c9VXPZg.INSTANCE;
            int a2 = Flowable.a();
            ObjectHelper.a(r3, "mapper is null");
            ObjectHelper.a(a2, "bufferSize");
            return RxJavaPlugins.a((Flowable<T>) new FlowableFlattenIterable<T>(a, r3, a2));
        }

        public static /* synthetic */ boolean b(Context context, RecentlyPlayedItem recentlyPlayedItem) {
            return !fax.a(recentlyPlayedItem.getTitle(context));
        }

        public static Flowable<ShortcutInfo> a(Flowable<kqc> flowable, kqa kqa) {
            $$Lambda$kpu$mhNcW9hl2QPgYZhli6gNoaXsjo r2 = new $$Lambda$kpu$mhNcW9hl2QPgYZhli6gNoaXsjo(kqa);
            int a = Flowable.a();
            int a2 = Flowable.a();
            ObjectHelper.a(r2, "mapper is null");
            ObjectHelper.a(a, "maxConcurrency");
            ObjectHelper.a(a2, "prefetch");
            FlowableConcatMapEager flowableConcatMapEager = new FlowableConcatMapEager(flowable, r2, a, a2, ErrorMode.IMMEDIATE);
            return RxJavaPlugins.a((Flowable<T>) flowableConcatMapEager);
        }
    }
}

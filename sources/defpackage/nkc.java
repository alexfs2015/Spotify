package defpackage;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.spotify.mobile.android.recentlyplayed.model.RecentlyPlayedItems;
import com.spotify.mobile.android.util.Assertion;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.operators.maybe.MaybeSubscribeOn;
import io.reactivex.internal.operators.maybe.MaybeToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: nkc reason: default package */
public final class nkc implements ObservableTransformer<RecentlyPlayedItems, RecentlyPlayedItems> {
    private final nkb a;
    private final ObjectMapper b;
    private final Scheduler c;
    private final boolean d;

    nkc(nkb nkb, rwl rwl, boolean z, Scheduler scheduler) {
        this.a = nkb;
        this.b = rwl.a().a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(Include.ALWAYS).a();
        this.d = z;
        this.c = scheduler;
    }

    /* access modifiers changed from: private */
    public void a(RecentlyPlayedItems recentlyPlayedItems) {
        FileChannel fileChannel;
        try {
            byte[] writeValueAsBytes = this.b.writeValueAsBytes(recentlyPlayedItems);
            if (writeValueAsBytes.length > 0) {
                fileChannel = null;
                try {
                    fileChannel = new FileOutputStream(this.a.b()).getChannel();
                    fileChannel.lock();
                    fileChannel.write(ByteBuffer.wrap(writeValueAsBytes));
                    fileChannel.close();
                } catch (IOException e) {
                    Assertion.a("Failed to cache Recently Played items", (Throwable) e);
                }
                xdl.a((Closeable) fileChannel);
            }
        } catch (IOException e2) {
            Assertion.a("Failed to serialize RecentlyPlayedItems", (Throwable) e2);
        } catch (Throwable th) {
            xdl.a((Closeable) fileChannel);
            throw th;
        }
    }

    public final /* synthetic */ ObservableSource apply(Observable observable) {
        Observable b2 = observable.a(this.c).b((Consumer<? super T>) new $$Lambda$nkc$tspcT6A5GNtgC1cW_2GvBgjvusI<Object>(this));
        if (!this.d) {
            Maybe a2 = this.a.a();
            Scheduler scheduler = this.c;
            ObjectHelper.a(scheduler, "scheduler is null");
            Maybe a3 = RxJavaPlugins.a((Maybe<T>) new MaybeSubscribeOn<T>(a2, scheduler));
            b2 = (a3 instanceof FuseToObservable ? ((FuseToObservable) a3).be_() : RxJavaPlugins.a((Observable<T>) new MaybeToObservable<T>(a3))).c((ObservableSource<? extends T>) b2);
        }
        return b2.d((ObservableSource<? extends T>) observable).b(this.c);
    }
}

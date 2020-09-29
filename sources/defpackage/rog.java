package defpackage;

import android.os.Environment;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: rog reason: default package */
public final class rog {
    private final rwl a;
    private final Scheduler b;

    /* renamed from: rog$a */
    static class a implements Function<Long, Long> {
        private final String a;

        private a(String str) {
            this.a = str;
        }

        /* synthetic */ a(String str, byte b) {
            this(str);
        }

        private Long a() {
            try {
                return Long.valueOf(new File(this.a).lastModified());
            } catch (Exception unused) {
                return Long.valueOf(0);
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a();
        }
    }

    public rog(rwl rwl, Scheduler scheduler) {
        this.a = rwl;
        this.b = scheduler;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ HubsJsonViewModel a(String str) {
        Logger.b("Loading model from %s", str);
        return (HubsJsonViewModel) this.a.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a().readValue(new File(str), HubsJsonViewModel.class);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xfk a(String str, Long l) {
        return Flowable.b((Callable<? extends T>) new $$Lambda$rog$qQ0WlqLbFEf7kF32Nezn0OG8dIY<Object>(this, str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Long l) {
        return l.longValue() > 0;
    }

    public final Flowable<hcs> a() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append('/');
        sb.append("hubs-live.json");
        String sb2 = sb.toString();
        return Flowable.a(1, TimeUnit.SECONDS).b(this.b).c((Function<? super T, ? extends R>) new a<Object,Object>(sb2, 0)).a((Predicate<? super T>) $$Lambda$rog$MUAENuQQOuezVt5UIbitojB2uxY.INSTANCE).a(Functions.a()).b((Function<? super T, ? extends xfk<? extends R>>) new $$Lambda$rog$9ZgZ8NEDw8egWDvttCFZ3SQ3JQw<Object,Object>(this, sb2));
    }
}

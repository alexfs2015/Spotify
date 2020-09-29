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

/* renamed from: rfe reason: default package */
public final class rfe {
    private final rnf a;
    private final Scheduler b;

    /* renamed from: rfe$a */
    static class a implements Function<Long, Long> {
        private final String a;

        /* synthetic */ a(String str, byte b) {
            this(str);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a();
        }

        private a(String str) {
            this.a = str;
        }

        private Long a() {
            try {
                return Long.valueOf(new File(this.a).lastModified());
            } catch (Exception unused) {
                return Long.valueOf(0);
            }
        }
    }

    public rfe(rnf rnf, Scheduler scheduler) {
        this.a = rnf;
        this.b = scheduler;
    }

    public final Flowable<gzz> a() {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getPath());
        sb.append('/');
        sb.append("hubs-live.json");
        String sb2 = sb.toString();
        return Flowable.a(1, TimeUnit.SECONDS).b(this.b).c((Function<? super T, ? extends R>) new a<Object,Object>(sb2, 0)).a((Predicate<? super T>) $$Lambda$rfe$TjAkjOmsj3f2EhrisppJ28qmS1k.INSTANCE).a(Functions.a()).b((Function<? super T, ? extends wrf<? extends R>>) new $$Lambda$rfe$yzmz1HLdYXsD7CljHHpcXUdEV4g<Object,Object>(this, sb2));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Long l) {
        return l.longValue() > 0;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wrf a(String str, Long l) {
        return Flowable.b((Callable<? extends T>) new $$Lambda$rfe$Z__ckO2FLtfOZg0HFrIGeAbVA<Object>(this, str));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ HubsJsonViewModel a(String str) {
        Logger.b("Loading model from %s", str);
        return (HubsJsonViewModel) this.a.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a().readValue(new File(str), HubsJsonViewModel.class);
    }
}

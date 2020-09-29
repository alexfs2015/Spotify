package defpackage;

import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Ad.AdType;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.Event;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.util.HashMap;
import java.util.Map;

/* renamed from: igq reason: default package */
public final class igq {
    public final CompositeDisposable a = new CompositeDisposable();
    final iil b;
    private final gmm<Event> c;
    private final hzt d;
    private final Scheduler e;
    private final Consumer<Ad> f = new Consumer<Ad>() {
        public final /* synthetic */ void accept(Object obj) {
            Ad ad = (Ad) obj;
            igq.a(igq.this, "time", Integer.parseInt((String) ad.metadata().get("rewardValue")), (String) ad.metadata().get(Ad.METADATA_AD_SPONSOR_ID));
            igq.this.b.a(AdSlot.STREAM);
        }
    };

    /* renamed from: igq$a */
    static class a implements Predicate<Ad> {
        a() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Map metadata = ((Ad) obj).metadata();
            if (metadata != null) {
                if ("Ad-Free Listening".equals(metadata.get("rewardType")) && metadata.containsKey("rewardValue")) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: igq$b */
    static final class b {
        public static Observable<Ad> a(gmm<Event> gmm) {
            Request request = new Request(Request.SUB, "sp://ads/v1/events/started");
            request.setBody("{\"format\": \"audio\"}".getBytes(fbi.c));
            return wit.b(gmm.resolve(request)).c((Function<? super T, ? extends R>) $$Lambda$DIVczWkg58zz3VKciVB89TjFJA8.INSTANCE).a((Predicate<? super T>) $$Lambda$igq$b$B8ovUOlk_VL6MZAgpLvwx0ZCxls.INSTANCE).a((Predicate<? super T>) new a<Object>()).a((Predicate<? super T>) new c<Object>());
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ boolean a(Ad ad) {
            return AdType.END_CARD_AD == ad.getAdType();
        }
    }

    /* renamed from: igq$c */
    static class c implements Predicate<Ad> {
        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            return TextUtils.isDigitsOnly((String) ((Ad) obj).metadata().get("rewardValue"));
        }
    }

    public igq(gmm<Event> gmm, hzt hzt, iil iil, Scheduler scheduler) {
        this.c = gmm;
        this.d = hzt;
        this.b = iil;
        this.e = scheduler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Response response) {
        if (response.getStatus() < 200 || response.getStatus() >= 300) {
            Logger.b("Failed to apply reward", new Object[0]);
            return;
        }
        Logger.b("Reward successfully applied", new Object[0]);
    }

    static /* synthetic */ void a(igq igq, String str, int i, String str2) {
        HashMap hashMap = new HashMap();
        String str3 = "skip";
        String str4 = "reward";
        if (str.equals(str3)) {
            hashMap.put(str4, str3);
        } else {
            String str5 = "time";
            String str6 = "reward_seconds";
            if (str.equals(str5)) {
                hashMap.put(str4, str5);
                hashMap.put(str6, Integer.valueOf(i));
            } else {
                hashMap.put(str4, str5);
                hashMap.put(str6, Integer.valueOf(0));
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("sponsor_id", str2);
        }
        igq.a.a(igq.d.a(hashMap).h().a(igq.e).a((Consumer<? super T>) $$Lambda$igq$EjJ9Qk0vNmzgvHIlNCrOOQ68M.INSTANCE, (Consumer<? super Throwable>) $$Lambda$igq$CPdxOhxIAuTW93bdB0YqGMixMzQ.INSTANCE));
    }

    public final void a() {
        if (this.a.d() <= 0) {
            this.a.a(b.a(this.c).a(this.f, (Consumer<? super Throwable>) $$Lambda$igq$kv1dFnq8vTMZsQcOanLt9BcfMlg.INSTANCE));
        }
    }
}

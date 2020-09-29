package defpackage;

import android.app.Application;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.Targetings;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: hut reason: default package */
final class hut extends AsyncTask<Void, Void, huq> {
    private final WeakReference<Application> a;
    private final hxl b;

    /* renamed from: hut$a */
    static class a implements SingleObserver<Targetings> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void onSubscribe(Disposable disposable) {
            Logger.b("Targeting information onSubscribed is called", new Object[0]);
        }

        public final void onError(Throwable th) {
            Logger.b("Error in making request to targeting endpoint: %s", th.getMessage());
        }

        public final /* synthetic */ void c_(Object obj) {
            Logger.b("Request for updating targeting information completed successfully", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        huq huq = (huq) obj;
        Logger.b("advertising id: %s", huq.a);
        this.b.a("rdid", TextUtils.isEmpty(huq.a) ? "" : huq.a).h().b((SingleObserver<? super T>) new a<Object>(0));
        this.b.a("idtype", "gaid").h().b((SingleObserver<? super T>) new a<Object>(0));
        if (huq.b != null) {
            this.b.a("is_lat", huq.b.booleanValue() ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY).h().b((SingleObserver<? super T>) new a<Object>(0));
        }
    }

    hut(Application application, hxl hxl) {
        fay.a(application);
        this.a = new WeakReference<>(application);
        this.b = hxl;
    }

    private huq a() {
        Application application = (Application) this.a.get();
        if (application != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Boolean bool = null;
            int i = 3;
            String str = "";
            while (i > 0) {
                try {
                    Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(application);
                    str = advertisingIdInfo.getId();
                    bool = Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled());
                    Logger.b("Ad id fetched in %d ms.", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                } catch (IOException unused) {
                    Logger.b("Error connecting to Google Play services (e.g.the old version of the service doesn't support getting AdvertisingId).", new Object[0]);
                } catch (SecurityException unused2) {
                    Logger.b("Encountered security error connecting to Google Play services.", new Object[0]);
                } catch (GooglePlayServicesNotAvailableException unused3) {
                    Logger.b("Google Play services is not available entirely.", new Object[0]);
                } catch (GooglePlayServicesRepairableException unused4) {
                    Logger.b("Encountered a recoverable error connecting to Google Play services.", new Object[0]);
                    i--;
                }
                i = 0;
            }
            return new huq(str, bool);
        }
        throw new AssertionError();
    }
}

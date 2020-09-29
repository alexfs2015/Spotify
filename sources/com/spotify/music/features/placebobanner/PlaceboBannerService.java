package com.spotify.music.features.placebobanner;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.placebobanner.models.BannerConfiguration;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class PlaceboBannerService extends vtp {
    public ocr a;
    public Scheduler b;
    public BannerConfigurationRequester c;
    public jrp d;
    private final IBinder e = new a();

    public class a extends Binder {
        a() {
        }
    }

    public Function<BannerConfiguration, Observable<BannerConfiguration>> a() {
        return new Function() {
            public final Object apply(Object obj) {
                return PlaceboBannerService.this.b((BannerConfiguration) obj);
            }
        };
    }

    public Callable<BannerConfiguration> b() {
        return new Callable() {
            public final Object call() {
                return PlaceboBannerService.this.c();
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ BannerConfiguration c() {
        Logger.b("loadValue", new Object[0]);
        return this.a.b();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(BannerConfiguration bannerConfiguration) {
        Logger.b("saveValue", new Object[0]);
        ocr ocr = this.a;
        Logger.b("save %s", bannerConfiguration);
        try {
            ocr.c.a().a(ocr.a, new JSONObject(ocr.b.writeValueAsString(bannerConfiguration))).a();
        } catch (JsonProcessingException | JSONException e2) {
            Logger.d(e2, "error saving banner configuration", new Object[0]);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.e;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Observable b(BannerConfiguration bannerConfiguration) {
        boolean z = bannerConfiguration == null || this.d.a() > bannerConfiguration.receivedOn() + bannerConfiguration.expiresAfterSec();
        Logger.b("isExpired %s", Boolean.valueOf(z));
        if (!z) {
            return Observable.b(bannerConfiguration);
        }
        this.a.a();
        Logger.b("requestToBackEnd", new Object[0]);
        return this.c.a().b((Consumer<? super T>) new Consumer() {
            public final void accept(Object obj) {
                PlaceboBannerService.this.a((BannerConfiguration) obj);
            }
        });
    }
}

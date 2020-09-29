package com.spotify.music.features.placebobanner;

import android.content.Intent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;

public class BannerEventService extends whu {
    public RxResolver a;
    public ObjectMapper b;
    public ojz c;

    public BannerEventService() {
        super(BannerEventService.class.getSimpleName());
    }

    private Request a(BannerEvent bannerEvent) {
        Logger.b("createRequest %s", bannerEvent);
        try {
            Request request = new Request(Request.POST, "hm://bundling-placebo/v1/user-interactions");
            request.setBody(this.b.writeValueAsBytes(bannerEvent));
            return request;
        } catch (JsonProcessingException e) {
            Logger.d(e, "Error creating request with %s", bannerEvent);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        BannerEvent bannerEvent = (BannerEvent) intent.getParcelableExtra("placebo_event");
        Logger.b("getBannerEvent %s", bannerEvent);
        if (bannerEvent == null) {
            Logger.d("null banner event received", new Object[0]);
            return;
        }
        Logger.b("sendEvent %s", bannerEvent);
        Request a2 = a(bannerEvent);
        if (a2 != null) {
            Logger.b("Event %s was post to backend with response %s", bannerEvent, Integer.valueOf(((Response) this.a.resolve(a2).e()).getStatus()));
        }
    }
}

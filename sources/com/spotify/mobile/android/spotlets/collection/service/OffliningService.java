package com.spotify.mobile.android.spotlets.collection.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;

public class OffliningService extends vto {
    public FireAndForgetResolver a;

    public OffliningService() {
        super("OffliningService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.spotify.mobile.android.spotlets.collection.service.OffliningService.action.UPDATE".equals(action)) {
            this.a.resolve(new Request(intent.getBooleanExtra("state", false) ? Request.POST : Request.DELETE, String.format("sp://offline/v1/resources?uri=%s", new Object[]{Uri.encode(intent.getStringExtra("uri"))})));
            return;
        }
        StringBuilder sb = new StringBuilder("Unsupported action ");
        sb.append(action);
        sb.append(" in OffliningService.");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, OffliningService.class);
        intent.putExtra("uri", str);
        intent.putExtra("state", z);
        intent.setAction("com.spotify.mobile.android.spotlets.collection.service.OffliningService.action.UPDATE");
        context.startService(intent);
    }
}

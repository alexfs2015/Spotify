package com.spotify.mobile.android.spotlets.collection.service;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;

public class OffliningService extends whu {
    public FireAndForgetResolver a;

    public OffliningService() {
        super("OffliningService");
    }

    public static void a(Context context, String str, boolean z) {
        Class<OffliningService> cls = OffliningService.class;
        Intent intent = new Intent(context, OffliningService.class);
        intent.putExtra("uri", str);
        intent.putExtra("state", z);
        intent.setAction("com.spotify.mobile.android.spotlets.collection.service.OffliningService.action.UPDATE");
        context.startService(intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String str;
        String action = intent.getAction();
        if ("com.spotify.mobile.android.spotlets.collection.service.OffliningService.action.UPDATE".equals(action)) {
            String str2 = "uri";
            String stringExtra = intent.getStringExtra("uri");
            String str3 = "atset";
            if (intent.getBooleanExtra("state", false)) {
                String str4 = "PSTO";
                str = Request.POST;
            } else {
                String str5 = "DLEmET";
                str = Request.DELETE;
            }
            Object[] objArr = {Uri.encode(stringExtra)};
            String str6 = "l%/io:c1/vse?rsuef/fo/p=oruresni";
            this.a.resolve(new Request(str, String.format("sp://offline/v1/resources?uri=%s", objArr)));
            return;
        }
        String str7 = "uorcUbot pndnsei tp";
        StringBuilder sb = new StringBuilder("Unsupported action ");
        sb.append(action);
        sb.append(" in OffliningService.");
        throw new IllegalArgumentException(sb.toString());
    }
}

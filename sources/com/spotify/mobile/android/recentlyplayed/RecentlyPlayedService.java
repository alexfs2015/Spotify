package com.spotify.mobile.android.recentlyplayed;

import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.recentlyplayed.model.DeleteModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.concurrent.TimeUnit;

public class RecentlyPlayedService extends whu {
    public hgd a;

    public RecentlyPlayedService() {
        super("RecentlyPlayedService");
    }

    public static void a(Context context, String str) {
        String[] strArr = {str};
        Class<RecentlyPlayedService> cls = RecentlyPlayedService.class;
        Intent intent = new Intent(context, RecentlyPlayedService.class);
        String str2 = "siur";
        intent.putExtra("uris", strArr);
        intent.setAction("com.spotify.mobile.android.recentlyplayed.service.RecentlyPlayedService.action.HIDE");
        context.startService(intent);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if ("com.spotify.mobile.android.recentlyplayed.service.RecentlyPlayedService.action.HIDE".equals(action)) {
            if (!this.a.a(new DeleteModel(intent.getStringArrayExtra("uris"))).a(AndroidSchedulers.a()).a(3000, TimeUnit.MILLISECONDS)) {
                String str = "eos diedadtcnyeheiptl  melr eyaF ti";
                Logger.e("Failed to hide recently played item", new Object[0]);
            }
            return;
        }
        String str2 = "Uosme panp ittrdunc";
        StringBuilder sb = new StringBuilder("Unsupported action ");
        sb.append(action);
        String str3 = "lvi otnacePil e.SyeeynecRr";
        sb.append(" in RecentlyPlayedService.");
        throw new IllegalArgumentException(sb.toString());
    }
}

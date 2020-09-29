package com.spotify.mobile.android.spotlets.share;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.Interaction;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.Result;
import com.spotify.mobile.android.spotlets.share.logging.ShareEventLogger.UserIntent;
import java.util.ArrayList;

public class ShareResultReceiver extends vtm {
    public jjf a;

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString("session_id");
            String string2 = extras.getString("entity_uri");
            String string3 = extras.getString("context_uri");
            String string4 = extras.getString("source_page_uri");
            long j = extras.getLong("destination_index");
            ArrayList stringArrayList = extras.getStringArrayList("test_groups");
            boolean z = extras.getBoolean("is_session_end");
            String string5 = extras.getString("share_id");
            ComponentName componentName = (ComponentName) extras.get("android.intent.extra.CHOSEN_COMPONENT");
            ShareEventLogger.a(z, string, componentName != null ? componentName.getPackageName() : "", j, Interaction.HIT, UserIntent.DEEPLINK, Result.NO_RESULT, string2, string3, string4, false, stringArrayList, string5, null, this.a);
            return;
        }
    }
}

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

public class ShareResultReceiver extends whs {
    public jlr a;

    public void onReceive(Context context, Intent intent) {
        String str;
        super.onReceive(context, intent);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String str2 = "nssds_ioei";
            String string = extras.getString("session_id");
            String str3 = "ty_miuitne";
            String string2 = extras.getString("entity_uri");
            String string3 = extras.getString("context_uri");
            String string4 = extras.getString("source_page_uri");
            long j = extras.getLong("destination_index");
            String str4 = "uegpoosrtst";
            ArrayList stringArrayList = extras.getStringArrayList("test_groups");
            boolean z = extras.getBoolean("is_session_end");
            String str5 = "d_ashber";
            String string5 = extras.getString("share_id");
            String str6 = "enMoxabrNtOPCtaOrHi.SCON_nt.TENneEidd";
            ComponentName componentName = (ComponentName) extras.get("android.intent.extra.CHOSEN_COMPONENT");
            if (componentName != null) {
                str = componentName.getPackageName();
            } else {
                String str7 = "";
                str = "";
            }
            String str8 = str;
            Interaction interaction = Interaction.HIT;
            UserIntent userIntent = UserIntent.DEEPLINK;
            Result result = Result.NO_RESULT;
            jlr jlr = this.a;
            jlr jlr2 = jlr;
            ShareEventLogger.a(z, string, str8, j, interaction, userIntent, result, string2, string3, string4, false, stringArrayList, string5, null, jlr);
            return;
        }
    }
}

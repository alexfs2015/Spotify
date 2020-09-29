package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import io.fabric.sdk.android.services.common.CommonUtils;

public class CrashlyticsInitProvider extends ContentProvider {

    public interface a {
        boolean a(Context context);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        boolean z;
        String str = "CrashlyticsInitProvider";
        Context context = getContext();
        vvw vvw = new vvw();
        agk agk = new agk();
        if (vvw.a(context)) {
            z = agk.a(context);
        } else {
            int a2 = CommonUtils.a(context, "io.fabric.auto_initialize", "bool");
            if (a2 == 0) {
                z = false;
            } else {
                z = context.getResources().getBoolean(a2);
                if (z) {
                    vuu.a().a("Fabric", "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
                }
            }
        }
        if (z) {
            try {
                vuu.a(context, new agj());
                vuu.a().c(str, "CrashlyticsInitProvider initialization successful");
            } catch (IllegalStateException unused) {
                vuu.a().c(str, "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        }
        return true;
    }
}

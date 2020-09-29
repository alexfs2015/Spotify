package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;

public final class GooglePlayServicesUtil extends brz {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = brz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    @Deprecated
    public static Dialog getErrorDialog(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        if (brz.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return brx.a().a(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2, OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int i2, OnCancelListener onCancelListener) {
        if (brz.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        brx a = brx.a();
        if (fragment == null) {
            return a.b(activity, i, i2, onCancelListener);
        }
        Dialog a2 = brx.a((Context) activity, i, bwj.a(fragment, brx.a().a((Context) activity, i, "d"), i2), onCancelListener);
        if (a2 == null) {
            return false;
        }
        brx.a(activity, a2, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static void showErrorNotification(int i, Context context) {
        brx a = brx.a();
        if (brz.isPlayServicesPossiblyUpdating(context, i) || brz.isPlayStorePossiblyUpdating(context, i)) {
            a.b(context);
        } else {
            a.a(context, i);
        }
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return brz.getErrorString(i);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return brz.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i) {
        return brz.isGooglePlayServicesAvailable(context, i);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return brz.getErrorPendingIntent(i, context, i2);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return brz.isUserRecoverableError(i);
    }

    public static Resources getRemoteResource(Context context) {
        return brz.getRemoteResource(context);
    }

    public static Context getRemoteContext(Context context) {
        return brz.getRemoteContext(context);
    }
}

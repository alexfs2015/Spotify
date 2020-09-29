package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.spotify.music.R;

/* renamed from: bwz reason: default package */
public final class bwz {
    private static final dv<String, String> a = new dv<>();

    public static String a(Context context) {
        return context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
    }

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        String str = "GoogleApiAvailability";
        switch (i) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e(str, "An invalid account was specified when connecting. Please provide a valid account.");
                return a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e(str, "Network error occurred. Please retry request later.");
                return a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e(str, "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e(str, "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e(str, "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e(str, "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e(str, "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e(str, "The specified account could not be signed in.");
                return a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e(str, "The current user profile is restricted and could not use authenticated features.");
                return a(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e(str, sb.toString());
                return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(android.content.Context r4, java.lang.String r5) {
        /*
            dv<java.lang.String, java.lang.String> r0 = a
            monitor-enter(r0)
            dv<java.lang.String, java.lang.String> r1 = a     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x000f:
            android.content.res.Resources r4 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(r4)     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r4 != 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0018:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch:{ all -> 0x0061 }
            if (r2 != 0) goto L_0x0039
            java.lang.String r4 = "Missing resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0032
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x0032:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0039:
            java.lang.String r4 = r4.getString(r2)     // Catch:{ all -> 0x0061 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005a
            java.lang.String r4 = "Got empty resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0053
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0058
        L_0x0053:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x005a:
            dv<java.lang.String, java.lang.String> r1 = a     // Catch:{ all -> 0x0061 }
            r1.put(r5, r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r4
        L_0x0061:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwz.a(android.content.Context, java.lang.String):java.lang.String");
    }

    private static String a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a2 = a(context, str);
        if (a2 == null) {
            a2 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a2, new Object[]{str2});
    }

    private static String b(Context context) {
        String packageName = context.getPackageName();
        try {
            return cas.a(context).b(packageName).toString();
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        String a2 = i == 6 ? a(context, "common_google_play_services_resolution_required_title") : a(context, i);
        return a2 == null ? context.getResources().getString(R.string.common_google_play_services_notification_ticker) : a2;
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String b = b(context);
        if (i == 1) {
            return resources.getString(R.string.common_google_play_services_install_text, new Object[]{b});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(R.string.common_google_play_services_enable_text, new Object[]{b});
            } else if (i == 5) {
                return a(context, "common_google_play_services_invalid_account_text", b);
            } else {
                if (i == 7) {
                    return a(context, "common_google_play_services_network_error_text", b);
                }
                if (i == 9) {
                    return resources.getString(R.string.common_google_play_services_unsupported_text, new Object[]{b});
                } else if (i == 20) {
                    return a(context, "common_google_play_services_restricted_profile_text", b);
                } else {
                    switch (i) {
                        case 16:
                            return a(context, "common_google_play_services_api_unavailable_text", b);
                        case 17:
                            return a(context, "common_google_play_services_sign_in_failed_text", b);
                        case 18:
                            return resources.getString(R.string.common_google_play_services_updating_text, new Object[]{b});
                        default:
                            return resources.getString(R.string.common_google_play_services_unknown_issue, new Object[]{b});
                    }
                }
            }
        } else if (cab.b(context)) {
            return resources.getString(R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(R.string.common_google_play_services_update_text, new Object[]{b});
        }
    }

    public static String d(Context context, int i) {
        if (i != 6) {
            return c(context, i);
        }
        return a(context, "common_google_play_services_resolution_required_text", b(context));
    }

    public static String e(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(17039370) : resources.getString(R.string.common_google_play_services_enable_button) : resources.getString(R.string.common_google_play_services_update_button) : resources.getString(R.string.common_google_play_services_install_button);
    }
}

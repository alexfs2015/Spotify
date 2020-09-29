package com.comscore.activation;

import com.comscore.Analytics;
import com.comscore.ConfigurationListener;
import com.comscore.PublisherConfiguration;
import com.comscore.util.CrossPublisherIdUtil;
import com.comscore.util.CrossPublisherIdUtil.Listener;
import java.util.List;

public class Activation {
    private static final String a = "http://segment-data-us-east.zqtk.net/%s?url=%s&c2=%s&c12=%s&ns_ap_bi=%s&ns_ap_sv=%s&ns_ap_an=%s&ns_ap_ver=%s&ns_ap_pn=android";
    private static final String b = "\\{\\s*\".*\"\\s*:\\s*[^\\}]*\\s*\\}";

    public interface ActivationListener {
        void onReceivedCategories(List<String> list);
    }

    private Activation() {
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012c, code lost:
        return new java.util.ArrayList();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0127 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> b(java.lang.String r9, java.lang.String r10, com.comscore.PublisherConfiguration r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "UTF-8"
            boolean r1 = com.comscore.util.setup.Setup.isSetUpFinished()
            if (r1 == 0) goto L_0x013f
            if (r11 != 0) goto L_0x000c
            goto L_0x013f
        L_0x000c:
            java.lang.String r1 = r11.getPublisherId()
            java.lang.String r11 = r11.getPublisherUniqueDeviceId()
            com.comscore.util.jni.JniComScoreHelper r2 = com.comscore.util.setup.Setup.getJniComScoreHelper()
            java.lang.String r2 = r2.getApplicationId()
            java.lang.String r3 = com.comscore.Analytics.getVersion()
            com.comscore.util.jni.JniComScoreHelper r4 = com.comscore.util.setup.Setup.getJniComScoreHelper()
            java.lang.String r4 = r4.getApplicationName()
            com.comscore.util.jni.JniComScoreHelper r5 = com.comscore.util.setup.Setup.getJniComScoreHelper()
            java.lang.String r5 = r5.getApplicationVersion()
            if (r1 == 0) goto L_0x0139
            if (r11 == 0) goto L_0x0139
            if (r2 == 0) goto L_0x0139
            if (r3 == 0) goto L_0x0139
            if (r4 == 0) goto L_0x0139
            if (r5 == 0) goto L_0x0139
            boolean r6 = r1.isEmpty()
            if (r6 != 0) goto L_0x0139
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L_0x0139
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x0139
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto L_0x0139
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L_0x0139
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0062
            goto L_0x0139
        L_0x0062:
            java.lang.String r6 = "http://segment-data-us-east.zqtk.net/%s?url=%s&c2=%s&c12=%s&ns_ap_bi=%s&ns_ap_sv=%s&ns_ap_an=%s&ns_ap_ver=%s&ns_ap_pn=android"
            r7 = 8
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            java.lang.String r9 = java.net.URLEncoder.encode(r9, r0)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r8 = 0
            r7[r8] = r9     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            java.lang.String r9 = java.net.URLEncoder.encode(r10, r0)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r10 = 1
            r7[r10] = r9     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r9 = 2
            java.lang.String r10 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r7[r9] = r10     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r9 = 3
            java.lang.String r10 = java.net.URLEncoder.encode(r11, r0)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r7[r9] = r10     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r9 = 4
            java.lang.String r10 = java.net.URLEncoder.encode(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r7[r9] = r10     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r9 = 5
            java.lang.String r10 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r7[r9] = r10     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r9 = 6
            java.lang.String r10 = java.net.URLEncoder.encode(r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r7[r9] = r10     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r9 = 7
            java.lang.String r10 = java.net.URLEncoder.encode(r5, r0)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r7[r9] = r10     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            java.lang.String r9 = java.lang.String.format(r6, r7)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            if (r12 == 0) goto L_0x00c4
            boolean r10 = r12.isEmpty()     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            if (r10 != 0) goto L_0x00c4
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r10.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r10.append(r9)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            java.lang.String r9 = "&ns_ak="
            r10.append(r9)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            java.lang.String r9 = java.net.URLEncoder.encode(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            r10.append(r9)     // Catch:{ UnsupportedEncodingException -> 0x0133 }
            java.lang.String r9 = r10.toString()     // Catch:{ UnsupportedEncodingException -> 0x0133 }
        L_0x00c4:
            java.net.URL r10 = new java.net.URL     // Catch:{ IOException -> 0x012d }
            r10.<init>(r9)     // Catch:{ IOException -> 0x012d }
            java.io.InputStream r9 = r10.openStream()     // Catch:{ IOException -> 0x012d }
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x012d }
            r10.<init>()     // Catch:{ IOException -> 0x012d }
            r11 = 1024(0x400, float:1.435E-42)
            byte[] r11 = new byte[r11]     // Catch:{ IOException -> 0x012d }
        L_0x00d6:
            int r12 = r9.read(r11)     // Catch:{ IOException -> 0x012d }
            r1 = -1
            if (r12 == r1) goto L_0x00e1
            r10.write(r11, r8, r12)     // Catch:{ IOException -> 0x012d }
            goto L_0x00d6
        L_0x00e1:
            java.lang.String r9 = r10.toString(r0)     // Catch:{ IOException -> 0x012d }
            java.lang.String r10 = "\\{\\s*\".*\"\\s*:\\s*[^\\}]*\\s*\\}"
            java.util.regex.Pattern r10 = java.util.regex.Pattern.compile(r10)     // Catch:{ IOException -> 0x012d }
            java.util.regex.Matcher r9 = r10.matcher(r9)     // Catch:{ IOException -> 0x012d }
            boolean r10 = r9.find()     // Catch:{ IOException -> 0x012d }
            if (r10 != 0) goto L_0x00fb
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ IOException -> 0x012d }
            r9.<init>()     // Catch:{ IOException -> 0x012d }
            return r9
        L_0x00fb:
            java.lang.String r9 = r9.group(r8)     // Catch:{ IOException -> 0x012d }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0127 }
            r10.<init>(r9)     // Catch:{ JSONException -> 0x0127 }
            java.lang.String r9 = "data"
            org.json.JSONArray r9 = r10.getJSONArray(r9)     // Catch:{ JSONException -> 0x010b }
            goto L_0x0111
        L_0x010b:
            java.lang.String r9 = "errors"
            org.json.JSONArray r9 = r10.getJSONArray(r9)     // Catch:{ JSONException -> 0x0127 }
        L_0x0111:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0127 }
            r10.<init>()     // Catch:{ JSONException -> 0x0127 }
            int r11 = r9.length()     // Catch:{ JSONException -> 0x0127 }
        L_0x011a:
            if (r8 >= r11) goto L_0x0126
            java.lang.String r12 = r9.optString(r8)     // Catch:{ JSONException -> 0x0127 }
            r10.add(r12)     // Catch:{ JSONException -> 0x0127 }
            int r8 = r8 + 1
            goto L_0x011a
        L_0x0126:
            return r10
        L_0x0127:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ IOException -> 0x012d }
            r9.<init>()     // Catch:{ IOException -> 0x012d }
            return r9
        L_0x012d:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            return r9
        L_0x0133:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            return r9
        L_0x0139:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            return r9
        L_0x013f:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.activation.Activation.b(java.lang.String, java.lang.String, com.comscore.PublisherConfiguration, java.lang.String):java.util.List");
    }

    public static void getCategories(final String str, final String str2, final PublisherConfiguration publisherConfiguration, final ActivationListener activationListener) {
        if (Analytics.getConfiguration().isInitialized()) {
            CrossPublisherIdUtil.requestCrossPublisherId(new Listener() {
                public final void onCrossPublisherIdRequested(final String str, boolean z) {
                    new Thread(new Runnable() {
                        public void run() {
                            activationListener.onReceivedCategories(Activation.b(str, str2, publisherConfiguration, str));
                        }
                    }).start();
                }
            });
        } else {
            Analytics.getConfiguration().addListener(new ConfigurationListener() {
                public final void onConfigurationChanged(int i) {
                    if (i == 20307) {
                        Activation.getCategories(str, str2, publisherConfiguration, activationListener);
                        Analytics.getConfiguration().removeListener(this);
                    }
                }
            });
        }
    }
}

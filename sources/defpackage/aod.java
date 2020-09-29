package defpackage;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aod reason: default package */
public final class aod {
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.util.List, java.lang.String]
      uses: [java.util.Collection, java.lang.String]
      mth insns count: 178
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.os.Bundle a(java.util.UUID r5, defpackage.aon r6, boolean r7) {
        /*
            java.lang.String r0 = "shareContent"
            defpackage.amx.a(r6, r0)
            java.lang.String r0 = "callId"
            defpackage.amx.a(r5, r0)
            boolean r0 = r6 instanceof defpackage.aop
            java.lang.String r1 = "DESCRIPTION"
            java.lang.String r2 = "TITLE"
            r3 = 0
            if (r0 == 0) goto L_0x0041
            aop r6 = (defpackage.aop) r6
            android.os.Bundle r3 = a(r6, r7)
            java.lang.String r5 = r6.b
            defpackage.amw.a(r3, r2, r5)
            java.lang.String r5 = r6.a
            defpackage.amw.a(r3, r1, r5)
            android.net.Uri r5 = r6.c
            java.lang.String r7 = "IMAGE"
            defpackage.amw.a(r3, r7, r5)
            java.lang.String r5 = r6.d
            java.lang.String r7 = "QUOTE"
            defpackage.amw.a(r3, r7, r5)
            android.net.Uri r5 = r6.h
            java.lang.String r7 = "MESSENGER_LINK"
            defpackage.amw.a(r3, r7, r5)
            android.net.Uri r5 = r6.h
            java.lang.String r6 = "TARGET_DISPLAY"
            defpackage.amw.a(r3, r6, r5)
            goto L_0x01dc
        L_0x0041:
            boolean r0 = r6 instanceof defpackage.apa
            if (r0 == 0) goto L_0x005b
            apa r6 = (defpackage.apa) r6
            java.util.List r5 = defpackage.aoi.a(r6, r5)
            android.os.Bundle r3 = a(r6, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r5)
            java.lang.String r5 = "PHOTOS"
            r3.putStringArrayList(r5, r6)
            goto L_0x01dc
        L_0x005b:
            boolean r0 = r6 instanceof defpackage.apd
            if (r0 == 0) goto L_0x0094
            apd r6 = (defpackage.apd) r6
            if (r6 == 0) goto L_0x007e
            apc r0 = r6.d
            if (r0 != 0) goto L_0x0068
            goto L_0x007e
        L_0x0068:
            apc r0 = r6.d
            android.net.Uri r0 = r0.b
            amq$a r5 = defpackage.amq.a(r5, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 1
            r0.<init>(r3)
            r0.add(r5)
            defpackage.amq.a(r0)
            java.lang.String r3 = r5.b
        L_0x007e:
            android.os.Bundle r5 = a(r6, r7)
            java.lang.String r7 = r6.b
            defpackage.amw.a(r5, r2, r7)
            java.lang.String r6 = r6.a
            defpackage.amw.a(r5, r1, r6)
            java.lang.String r6 = "VIDEO"
            defpackage.amw.a(r5, r6, r3)
        L_0x0091:
            r3 = r5
            goto L_0x01dc
        L_0x0094:
            boolean r0 = r6 instanceof defpackage.aow
            r1 = 0
            if (r0 == 0) goto L_0x00e7
            aow r6 = (defpackage.aow) r6
            org.json.JSONObject r5 = defpackage.aoi.a(r5, r6)     // Catch:{ JSONException -> 0x00ce }
            org.json.JSONObject r5 = defpackage.aoi.a(r5, r1)     // Catch:{ JSONException -> 0x00ce }
            android.os.Bundle r3 = a(r6, r7)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r7 = r6.b     // Catch:{ JSONException -> 0x00ce }
            android.util.Pair r7 = defpackage.aoi.a(r7)     // Catch:{ JSONException -> 0x00ce }
            java.lang.Object r7 = r7.second     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r0 = "PREVIEW_PROPERTY_NAME"
            defpackage.amw.a(r3, r0, r7)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r7 = "ACTION_TYPE"
            aov r6 = r6.a     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r0 = "og:type"
            java.lang.String r6 = r6.b(r0)     // Catch:{ JSONException -> 0x00ce }
            defpackage.amw.a(r3, r7, r6)     // Catch:{ JSONException -> 0x00ce }
            java.lang.String r6 = "ACTION"
            java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x00ce }
            defpackage.amw.a(r3, r6, r5)     // Catch:{ JSONException -> 0x00ce }
            goto L_0x01dc
        L_0x00ce:
            r5 = move-exception
            com.facebook.FacebookException r6 = new com.facebook.FacebookException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to create a JSON Object from the provided ShareOpenGraphContent: "
            r7.<init>(r0)
            java.lang.String r5 = r5.getMessage()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L_0x00e7:
            boolean r0 = r6 instanceof defpackage.aoq
            if (r0 == 0) goto L_0x0115
            aoq r6 = (defpackage.aoq) r6
            if (r6 == 0) goto L_0x0105
            java.util.List<com.facebook.share.model.ShareMedia> r0 = r6.a
            if (r0 != 0) goto L_0x00f4
            goto L_0x0105
        L_0x00f4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            aoi$7 r2 = new aoi$7
            r2.<init>(r5, r1)
            java.util.List r3 = defpackage.amw.a(r0, r2)
            defpackage.amq.a(r1)
        L_0x0105:
            android.os.Bundle r5 = a(r6, r7)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r3)
            java.lang.String r7 = "MEDIA"
            r5.putParcelableArrayList(r7, r6)
            goto L_0x0091
        L_0x0115:
            boolean r0 = r6 instanceof defpackage.aom
            if (r0 == 0) goto L_0x0125
            aom r6 = (defpackage.aom) r6
            android.os.Bundle r5 = defpackage.aoi.a(r6, r5)
            android.os.Bundle r3 = a(r6, r5, r7)
            goto L_0x01dc
        L_0x0125:
            boolean r0 = r6 instanceof com.facebook.share.model.ShareMessengerGenericTemplateContent
            if (r0 == 0) goto L_0x0131
            com.facebook.share.model.ShareMessengerGenericTemplateContent r6 = (com.facebook.share.model.ShareMessengerGenericTemplateContent) r6
            android.os.Bundle r3 = a(r6, r7)
            goto L_0x01dc
        L_0x0131:
            boolean r0 = r6 instanceof defpackage.aot
            if (r0 == 0) goto L_0x013d
            aot r6 = (defpackage.aot) r6
            android.os.Bundle r3 = a(r6, r7)
            goto L_0x01dc
        L_0x013d:
            boolean r0 = r6 instanceof com.facebook.share.model.ShareMessengerMediaTemplateContent
            if (r0 == 0) goto L_0x0149
            com.facebook.share.model.ShareMessengerMediaTemplateContent r6 = (com.facebook.share.model.ShareMessengerMediaTemplateContent) r6
            android.os.Bundle r3 = a(r6, r7)
            goto L_0x01dc
        L_0x0149:
            boolean r0 = r6 instanceof defpackage.apb
            if (r0 == 0) goto L_0x01dc
            apb r6 = (defpackage.apb) r6
            if (r6 == 0) goto L_0x0178
            com.facebook.share.model.ShareMedia r0 = r6.a
            if (r0 != 0) goto L_0x0156
            goto L_0x0178
        L_0x0156:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.facebook.share.model.ShareMedia r2 = r6.a
            r0.add(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            aoi$3 r4 = new aoi$3
            r4.<init>(r5, r2)
            java.util.List r0 = defpackage.amw.a(r0, r4)
            defpackage.amq.a(r2)
            java.lang.Object r0 = r0.get(r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            goto L_0x0179
        L_0x0178:
            r0 = r3
        L_0x0179:
            if (r6 == 0) goto L_0x01a6
            aoz r2 = r6.b
            if (r2 != 0) goto L_0x0180
            goto L_0x01a6
        L_0x0180:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            aoz r4 = r6.b
            r2.add(r4)
            aoi$10 r4 = new aoi$10
            r4.<init>(r5)
            java.util.List r5 = defpackage.amw.a(r2, r4)
            aoi$2 r2 = new aoi$2
            r2.<init>()
            java.util.List r2 = defpackage.amw.a(r5, r2)
            defpackage.amq.a(r5)
            java.lang.Object r5 = r2.get(r1)
            android.os.Bundle r5 = (android.os.Bundle) r5
            goto L_0x01a7
        L_0x01a6:
            r5 = r3
        L_0x01a7:
            android.os.Bundle r7 = a(r6, r7)
            if (r0 == 0) goto L_0x01b2
            java.lang.String r1 = "bg_asset"
            r7.putParcelable(r1, r0)
        L_0x01b2:
            if (r5 == 0) goto L_0x01b9
            java.lang.String r0 = "interactive_asset_uri"
            r7.putParcelable(r0, r5)
        L_0x01b9:
            java.util.List<java.lang.String> r5 = r6.c
            if (r5 != 0) goto L_0x01be
            goto L_0x01c4
        L_0x01be:
            java.util.List<java.lang.String> r5 = r6.c
            java.util.List r3 = java.util.Collections.unmodifiableList(r5)
        L_0x01c4:
            boolean r5 = defpackage.amw.a(r3)
            if (r5 != 0) goto L_0x01d4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            java.lang.String r0 = "top_background_color_list"
            r7.putStringArrayList(r0, r5)
        L_0x01d4:
            java.lang.String r5 = r6.d
            java.lang.String r6 = "content_url"
            defpackage.amw.a(r7, r6, r5)
            r3 = r7
        L_0x01dc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aod.a(java.util.UUID, aon, boolean):android.os.Bundle");
    }

    private static Bundle a(aom aom, Bundle bundle, boolean z) {
        Bundle a = a((aon) aom, z);
        amw.a(a, "effect_id", aom.a);
        if (bundle != null) {
            a.putBundle("effect_textures", bundle);
        }
        try {
            JSONObject a2 = anu.a(aom.b);
            if (a2 != null) {
                amw.a(a, "effect_arguments", a2.toString());
            }
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided CameraEffectArguments: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    private static Bundle a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent, boolean z) {
        Bundle a = a((aon) shareMessengerGenericTemplateContent, z);
        try {
            aoc.a(a, shareMessengerGenericTemplateContent);
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    private static Bundle a(aot aot, boolean z) {
        Bundle a = a((aon) aot, z);
        try {
            aoc.a(a, aot);
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    private static Bundle a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent, boolean z) {
        Bundle a = a((aon) shareMessengerMediaTemplateContent, z);
        try {
            aoc.a(a, shareMessengerMediaTemplateContent);
            return a;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ");
            sb.append(e.getMessage());
            throw new FacebookException(sb.toString());
        }
    }

    private static Bundle a(aon aon, boolean z) {
        Bundle bundle = new Bundle();
        amw.a(bundle, "LINK", aon.h);
        amw.a(bundle, "PLACE", aon.j);
        amw.a(bundle, "PAGE", aon.k);
        amw.a(bundle, "REF", aon.l);
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List<String> list = aon.i;
        if (!amw.a((Collection<T>) list)) {
            bundle.putStringArrayList("FRIENDS", new ArrayList(list));
        }
        aoo aoo = aon.m;
        if (aoo != null) {
            amw.a(bundle, "HASHTAG", aoo.a);
        }
        return bundle;
    }
}

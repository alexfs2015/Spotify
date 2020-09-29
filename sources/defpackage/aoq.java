package defpackage;

import android.os.Bundle;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio;
import com.moat.analytics.mobile.MoatAdEvent;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: aoq reason: default package */
public final class aoq {
    private static Pattern a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    /* renamed from: aoq$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[WebviewHeightRatio.values().length];
        static final /* synthetic */ int[] b = new int[ImageAspectRatio.values().length];
        static final /* synthetic */ int[] c = new int[MediaType.values().length];

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003a */
        static {
            /*
                com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType[] r0 = com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c = r0
                r0 = 1
                int[] r1 = c     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.share.model.ShareMessengerMediaTemplateContent$MediaType r2 = com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType.VIDEO     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio[] r1 = com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                b = r1
                int[] r1 = b     // Catch:{ NoSuchFieldError -> 0x0027 }
                com.facebook.share.model.ShareMessengerGenericTemplateContent$ImageAspectRatio r2 = com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio.SQUARE     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio[] r1 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.values()
                int r1 = r1.length
                int[] r1 = new int[r1]
                a = r1
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x003a }
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio r2 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioCompact     // Catch:{ NoSuchFieldError -> 0x003a }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x003a }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x003a }
            L_0x003a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0045 }
                com.facebook.share.model.ShareMessengerURLActionButton$WebviewHeightRatio r1 = com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio.WebviewHeightRatioTall     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aoq.AnonymousClass1.<clinit>():void");
        }
    }

    private static String a(MediaType mediaType) {
        String str = "image";
        return (mediaType != null && AnonymousClass1.c[mediaType.ordinal()] == 1) ? "video" : str;
    }

    private static String a(WebviewHeightRatio webviewHeightRatio) {
        String str = "full";
        if (webviewHeightRatio == null) {
            return str;
        }
        int i = AnonymousClass1.a[webviewHeightRatio.ordinal()];
        return i != 1 ? i != 2 ? str : "tall" : "compact";
    }

    private static String a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.e) {
            return "hide";
        }
        return null;
    }

    private static JSONObject a(apf apf, boolean z) {
        if (apf instanceof ShareMessengerURLActionButton) {
            return a((ShareMessengerURLActionButton) apf, z);
        }
        return null;
    }

    private static JSONObject a(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) {
        return new JSONObject().put(MoatAdEvent.EVENT_TYPE, "web_url").put("title", z ? null : shareMessengerURLActionButton.a).put("url", ank.a(shareMessengerURLActionButton.b)).put("webview_height_ratio", a(shareMessengerURLActionButton.f)).put("messenger_extensions", shareMessengerURLActionButton.d).put("fallback_url", ank.a(shareMessengerURLActionButton.c)).put("webview_share_button", a(shareMessengerURLActionButton));
    }

    private static void a(Bundle bundle, apf apf, boolean z) {
        if (apf != null && (apf instanceof ShareMessengerURLActionButton)) {
            a(bundle, (ShareMessengerURLActionButton) apf, z);
        }
    }

    public static void a(Bundle bundle, aph aph) {
        a(bundle, aph.b, false);
        ank.a(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
        ank.a(bundle, "OPEN_GRAPH_URL", aph.a);
        JSONArray jSONArray = new JSONArray();
        JSONObject put = new JSONObject().put("url", ank.a(aph.a));
        if (aph.b != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(a(aph.b, false));
            put.put("buttons", jSONArray2);
        }
        ank.a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) new JSONObject().put("attachment", new JSONObject().put(MoatAdEvent.EVENT_TYPE, "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", jSONArray.put(put)))));
    }

    public static void a(Bundle bundle, ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        apg apg = shareMessengerGenericTemplateContent.c;
        if (apg.e != null) {
            a(bundle, apg.e, false);
        } else if (apg.d != null) {
            a(bundle, apg.d, true);
        }
        ank.a(bundle, "IMAGE", apg.c);
        ank.a(bundle, "PREVIEW_TYPE", "DEFAULT");
        ank.a(bundle, "TITLE", apg.a);
        ank.a(bundle, "SUBTITLE", apg.b);
        JSONArray jSONArray = new JSONArray();
        apg apg2 = shareMessengerGenericTemplateContent.c;
        String str = "image_url";
        JSONObject put = new JSONObject().put("title", apg2.a).put("subtitle", apg2.b).put(str, ank.a(apg2.c));
        if (apg2.e != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(a(apg2.e, false));
            put.put("buttons", jSONArray2);
        }
        if (apg2.d != null) {
            put.put("default_action", a(apg2.d, true));
        }
        JSONArray put2 = jSONArray.put(put);
        JSONObject put3 = new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.a);
        ImageAspectRatio imageAspectRatio = shareMessengerGenericTemplateContent.b;
        ank.a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) new JSONObject().put("attachment", new JSONObject().put(MoatAdEvent.EVENT_TYPE, "template").put("payload", put3.put("image_aspect_ratio", (imageAspectRatio == null || AnonymousClass1.b[imageAspectRatio.ordinal()] != 1) ? "horizontal" : "square").put("elements", put2))));
    }

    public static void a(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        a(bundle, shareMessengerMediaTemplateContent.d, false);
        ank.a(bundle, "PREVIEW_TYPE", "DEFAULT");
        ank.a(bundle, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.b);
        if (shareMessengerMediaTemplateContent.c != null) {
            String host = shareMessengerMediaTemplateContent.c.getHost();
            ank.a(bundle, (ank.a(host) || !a.matcher(host).matches()) ? "IMAGE" : "uri", shareMessengerMediaTemplateContent.c);
        }
        String a2 = a(shareMessengerMediaTemplateContent.a);
        String str = MoatAdEvent.EVENT_TYPE;
        ank.a(bundle, str, a2);
        JSONArray jSONArray = new JSONArray();
        String str2 = "media_type";
        JSONObject put = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.b).put("url", ank.a(shareMessengerMediaTemplateContent.c)).put(str2, a(shareMessengerMediaTemplateContent.a));
        if (shareMessengerMediaTemplateContent.d != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(a(shareMessengerMediaTemplateContent.d, false));
            put.put("buttons", jSONArray2);
        }
        ank.a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) new JSONObject().put("attachment", new JSONObject().put(str, "template").put("payload", new JSONObject().put("template_type", "media").put("elements", jSONArray.put(put)))));
    }

    private static void a(Bundle bundle, ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) {
        String str;
        if (z) {
            str = ank.a(shareMessengerURLActionButton.b);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(shareMessengerURLActionButton.a);
            sb.append(" - ");
            sb.append(ank.a(shareMessengerURLActionButton.b));
            str = sb.toString();
        }
        ank.a(bundle, "TARGET_DISPLAY", str);
        ank.a(bundle, "ITEM_URL", shareMessengerURLActionButton.b);
    }
}

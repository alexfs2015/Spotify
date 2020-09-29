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

/* renamed from: aoc reason: default package */
public final class aoc {
    private static Pattern a = Pattern.compile("^(.+)\\.(facebook\\.com)$");

    /* renamed from: aoc$1 reason: invalid class name */
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
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aoc.AnonymousClass1.<clinit>():void");
        }
    }

    private static void a(Bundle bundle, aor aor, boolean z) {
        if (aor != null && (aor instanceof ShareMessengerURLActionButton)) {
            a(bundle, (ShareMessengerURLActionButton) aor, z);
        }
    }

    private static JSONObject a(aor aor, boolean z) {
        if (aor instanceof ShareMessengerURLActionButton) {
            return a((ShareMessengerURLActionButton) aor, z);
        }
        return null;
    }

    private static JSONObject a(ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) {
        return new JSONObject().put(MoatAdEvent.EVENT_TYPE, "web_url").put("title", z ? null : shareMessengerURLActionButton.a).put("url", amw.a(shareMessengerURLActionButton.b)).put("webview_height_ratio", a(shareMessengerURLActionButton.f)).put("messenger_extensions", shareMessengerURLActionButton.d).put("fallback_url", amw.a(shareMessengerURLActionButton.c)).put("webview_share_button", a(shareMessengerURLActionButton));
    }

    private static String a(WebviewHeightRatio webviewHeightRatio) {
        String str = "full";
        if (webviewHeightRatio == null) {
            return str;
        }
        int i = AnonymousClass1.a[webviewHeightRatio.ordinal()];
        if (i != 1) {
            return i != 2 ? str : "tall";
        }
        return "compact";
    }

    private static String a(MediaType mediaType) {
        String str = "image";
        return (mediaType != null && AnonymousClass1.c[mediaType.ordinal()] == 1) ? "video" : str;
    }

    public static void a(Bundle bundle, ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        aos aos = shareMessengerGenericTemplateContent.c;
        if (aos.e != null) {
            a(bundle, aos.e, false);
        } else if (aos.d != null) {
            a(bundle, aos.d, true);
        }
        amw.a(bundle, "IMAGE", aos.c);
        amw.a(bundle, "PREVIEW_TYPE", "DEFAULT");
        amw.a(bundle, "TITLE", aos.a);
        amw.a(bundle, "SUBTITLE", aos.b);
        JSONArray jSONArray = new JSONArray();
        aos aos2 = shareMessengerGenericTemplateContent.c;
        String str = "image_url";
        JSONObject put = new JSONObject().put("title", aos2.a).put("subtitle", aos2.b).put(str, amw.a(aos2.c));
        if (aos2.e != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(a(aos2.e, false));
            put.put("buttons", jSONArray2);
        }
        if (aos2.d != null) {
            put.put("default_action", a(aos2.d, true));
        }
        JSONArray put2 = jSONArray.put(put);
        JSONObject put3 = new JSONObject().put("template_type", "generic").put("sharable", shareMessengerGenericTemplateContent.a);
        ImageAspectRatio imageAspectRatio = shareMessengerGenericTemplateContent.b;
        amw.a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) new JSONObject().put("attachment", new JSONObject().put(MoatAdEvent.EVENT_TYPE, "template").put("payload", put3.put("image_aspect_ratio", (imageAspectRatio == null || AnonymousClass1.b[imageAspectRatio.ordinal()] != 1) ? "horizontal" : "square").put("elements", put2))));
    }

    public static void a(Bundle bundle, aot aot) {
        a(bundle, aot.b, false);
        amw.a(bundle, "PREVIEW_TYPE", "OPEN_GRAPH");
        amw.a(bundle, "OPEN_GRAPH_URL", aot.a);
        JSONArray jSONArray = new JSONArray();
        JSONObject put = new JSONObject().put("url", amw.a(aot.a));
        if (aot.b != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(a(aot.b, false));
            put.put("buttons", jSONArray2);
        }
        amw.a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) new JSONObject().put("attachment", new JSONObject().put(MoatAdEvent.EVENT_TYPE, "template").put("payload", new JSONObject().put("template_type", "open_graph").put("elements", jSONArray.put(put)))));
    }

    public static void a(Bundle bundle, ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        a(bundle, shareMessengerMediaTemplateContent.d, false);
        amw.a(bundle, "PREVIEW_TYPE", "DEFAULT");
        amw.a(bundle, "ATTACHMENT_ID", shareMessengerMediaTemplateContent.b);
        if (shareMessengerMediaTemplateContent.c != null) {
            String host = shareMessengerMediaTemplateContent.c.getHost();
            amw.a(bundle, (amw.a(host) || !a.matcher(host).matches()) ? "IMAGE" : "uri", shareMessengerMediaTemplateContent.c);
        }
        String a2 = a(shareMessengerMediaTemplateContent.a);
        String str = MoatAdEvent.EVENT_TYPE;
        amw.a(bundle, str, a2);
        JSONArray jSONArray = new JSONArray();
        String str2 = "media_type";
        JSONObject put = new JSONObject().put("attachment_id", shareMessengerMediaTemplateContent.b).put("url", amw.a(shareMessengerMediaTemplateContent.c)).put(str2, a(shareMessengerMediaTemplateContent.a));
        if (shareMessengerMediaTemplateContent.d != null) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(a(shareMessengerMediaTemplateContent.d, false));
            put.put("buttons", jSONArray2);
        }
        amw.a(bundle, "MESSENGER_PLATFORM_CONTENT", (Object) new JSONObject().put("attachment", new JSONObject().put(str, "template").put("payload", new JSONObject().put("template_type", "media").put("elements", jSONArray.put(put)))));
    }

    private static void a(Bundle bundle, ShareMessengerURLActionButton shareMessengerURLActionButton, boolean z) {
        String str;
        if (z) {
            str = amw.a(shareMessengerURLActionButton.b);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(shareMessengerURLActionButton.a);
            sb.append(" - ");
            sb.append(amw.a(shareMessengerURLActionButton.b));
            str = sb.toString();
        }
        amw.a(bundle, "TARGET_DISPLAY", str);
        amw.a(bundle, "ITEM_URL", shareMessengerURLActionButton.b);
    }

    private static String a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.e) {
            return "hide";
        }
        return null;
    }
}

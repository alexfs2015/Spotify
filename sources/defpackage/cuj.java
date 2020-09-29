package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: cuj reason: default package */
public final class cuj {
    private static final Pattern a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);
    private static final Pattern b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a() {
        String str = (String) dqe.f().a(dtg.L);
        String str2 = "12.4.51-000";
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", str2);
            StringBuilder sb = new StringBuilder();
            sb.append("<script>");
            sb.append("Object.defineProperty(window,'MRAID_ENV',{get:function(){return ");
            sb.append(jSONObject.toString());
            sb.append("}});");
            sb.append("</script>");
            return sb.toString();
        } catch (JSONException unused) {
            cpn.a(5);
            return null;
        }
    }

    public static String a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            for (int i = 0; i <= 0; i++) {
                String str2 = strArr[0];
                if (str2 != null) {
                    sb.append(str2);
                }
            }
            str = str.substring(end);
        } else if (!b.matcher(str).find()) {
            for (int i2 = 0; i2 <= 0; i2++) {
                String str3 = strArr[0];
                if (str3 != null) {
                    sb.append(str3);
                }
            }
        }
        sb.append(str);
        return sb.toString();
    }
}

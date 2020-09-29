package defpackage;

import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ParameterValuePair;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.ActivityState;
import com.adjust.sdk.AdjustAttribution;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: wq reason: default package */
public final class wq {
    public static ActivityPackage a(String str, long j, ActivityState activityState, vt vtVar, wa waVar, wx wxVar) {
        String str2 = "malformed";
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            str2 = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            vv.a().f("Referrer decoding failed due to UnsupportedEncodingException. Message: (%s)", e.getMessage());
        } catch (IllegalArgumentException e2) {
            vv.a().f("Referrer decoding failed due to IllegalArgumentException. Message: (%s)", e2.getMessage());
        } catch (Exception e3) {
            vv.a().f("Referrer decoding failed. Message: (%s)", e3.getMessage());
        }
        vv.a().a("Referrer to parse (%s)", str2);
        UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
        urlQuerySanitizer.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
        urlQuerySanitizer.setAllowUnregisteredParamaters(true);
        urlQuerySanitizer.parseQuery(str2);
        wp a = a(urlQuerySanitizer.getParameterList(), activityState, vtVar, waVar, wxVar);
        if (a == null) {
            return null;
        }
        a.l = str2;
        a.h = j;
        a.m = str;
        return a.a("reftag");
    }

    static wp a(List<ParameterValuePair> list, ActivityState activityState, vt vtVar, wa waVar, wx wxVar) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdjustAttribution adjustAttribution = new AdjustAttribution();
        for (ParameterValuePair parameterValuePair : list) {
            String str = parameterValuePair.mParameter;
            String str2 = parameterValuePair.mValue;
            if (!(str == null || str2 == null || !str.startsWith("adjust_"))) {
                String substring = str.substring(7);
                if (!(substring.length() == 0 || str2.length() == 0)) {
                    boolean z = true;
                    if (substring.equals("tracker")) {
                        adjustAttribution.trackerName = str2;
                    } else if (substring.equals("campaign")) {
                        adjustAttribution.campaign = str2;
                    } else if (substring.equals("adgroup")) {
                        adjustAttribution.adgroup = str2;
                    } else if (substring.equals("creative")) {
                        adjustAttribution.creative = str2;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        linkedHashMap.put(substring, str2);
                    }
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        String str3 = (String) linkedHashMap.remove("reftag");
        if (activityState != null) {
            activityState.lastInterval = currentTimeMillis - activityState.lastActivity;
        }
        wp wpVar = new wp(vtVar, waVar, activityState, wxVar, currentTimeMillis);
        wpVar.o = linkedHashMap;
        wpVar.n = adjustAttribution;
        wpVar.j = str3;
        return wpVar;
    }
}

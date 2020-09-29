package defpackage;

import android.text.TextUtils;
import com.moat.analytics.mobile.MoatAdEvent;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;
import java.util.HashMap;
import java.util.Map;

/* renamed from: csf reason: default package */
final class csf implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ csc e;

    csf(csc csc, String str, String str2, String str3, String str4) {
        this.e = csc;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.a);
        if (!TextUtils.isEmpty(this.b)) {
            hashMap.put("cachedSrc", this.b);
        }
        String str = this.c;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1947652542:
                if (str.equals("interrupted")) {
                    c2 = 3;
                    break;
                }
                break;
            case -1396664534:
                if (str.equals("badUrl")) {
                    c2 = 8;
                    break;
                }
                break;
            case -1347010958:
                if (str.equals("inProgress")) {
                    c2 = 2;
                    break;
                }
                break;
            case -918817863:
                if (str.equals("downloadTimeout")) {
                    c2 = 9;
                    break;
                }
                break;
            case -659376217:
                if (str.equals("contentLengthMissing")) {
                    c2 = 0;
                    break;
                }
                break;
            case -642208130:
                if (str.equals("playerFailed")) {
                    c2 = 5;
                    break;
                }
                break;
            case -354048396:
                if (str.equals("sizeExceeded")) {
                    c2 = 11;
                    break;
                }
                break;
            case -32082395:
                if (str.equals("externalAbort")) {
                    c2 = 10;
                    break;
                }
                break;
            case 3387234:
                if (str.equals("noop")) {
                    c2 = 4;
                    break;
                }
                break;
            case 96784904:
                if (str.equals(LogMessage.SEVERITY_ERROR)) {
                    c2 = 1;
                    break;
                }
                break;
            case 580119100:
                if (str.equals("expireFailed")) {
                    c2 = 6;
                    break;
                }
                break;
            case 725497484:
                if (str.equals("noCacheDir")) {
                    c2 = 7;
                    break;
                }
                break;
        }
        String str2 = "internal";
        switch (c2) {
            case 6:
            case 7:
                str2 = "io";
                break;
            case 8:
            case 9:
                str2 = "network";
                break;
            case 10:
            case 11:
                str2 = "policy";
                break;
        }
        hashMap.put(MoatAdEvent.EVENT_TYPE, str2);
        hashMap.put("reason", this.c);
        if (!TextUtils.isEmpty(this.d)) {
            hashMap.put("message", this.d);
        }
        csc.a(this.e, "onPrecacheEvent", (Map) hashMap);
    }
}

package com.spotify.mobile.android.service.flow.facebook.confirmation;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.Assertion;
import java.nio.charset.Charset;
import org.json.JSONObject;

public class FacebookUserConfirmationIntentService extends whu {
    public RxResolver a;

    public FacebookUserConfirmationIntentService() {
        super("user_details_confirmation_service");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String str = "easnsetef_mctnr_iosde_uiturisolqa";
        try {
            hni hni = (hni) intent.getParcelableExtra("user_details_confirmation_request");
            JSONObject jSONObject = new JSONObject();
            String str2 = "cknmfncoooo-ierafbifm-e";
            String str3 = "1";
            jSONObject.put("confirmed-facebook-info", "1");
            boolean z = true & false;
            if (fbo.a(hni.a)) {
                String str4 = "tetlomirnv  p%Ae nit inmat oosilnmid aafc:";
                Assertion.b(String.format("Attempting to confirm an invalid email: %s", new Object[]{hni.a}));
            }
            String str5 = "baemi";
            jSONObject.put("email", hni.a);
            if (fbo.a(hni.b)) {
                String str6 = "t lvanbhi:ta%p cotseadrAbeniitfrmno  ndi git t";
                Assertion.b(String.format("Attempting to confirm an invalid birthdate: %s", new Object[]{hni.b}));
            }
            jSONObject.put("birthdate", hni.b);
            if (fbo.a(hni.c)) {
                Assertion.b(String.format("Attempting to confirm an invalid gender: %s", new Object[]{hni.c}));
            }
            jSONObject.put("gender", hni.c);
            String str7 = "OTSP";
            String str8 = "esiat/stpd:ueu/h/arumdn/pag1t";
            Request request = new Request(Request.POST, "hm://signupuserdata/v1/update");
            request.setBody(jSONObject.toString().getBytes(Charset.defaultCharset()));
            Response response = (Response) this.a.resolve(request).e();
            String str9 = "stt  vrepd hivcpieeec R cs%anueiimodrs sewgetrofeamtsea  f srossnc% i onaonmde";
            boolean z2 = true ^ true;
            Logger.b("Received response from confirmation service with status code %s and message %s", Integer.valueOf(response.getStatus()), new String(response.getBody(), Charset.defaultCharset()));
        } catch (Exception e) {
            Assertion.a("Calling service failed", (Throwable) e);
        }
    }
}

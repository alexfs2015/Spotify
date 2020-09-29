package com.spotify.mobile.android.service.flow.facebook.confirmation;

import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.util.Assertion;
import java.nio.charset.Charset;
import org.json.JSONObject;

public class FacebookUserConfirmationIntentService extends vto {
    public RxResolver a;

    public FacebookUserConfirmationIntentService() {
        super("user_details_confirmation_service");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        try {
            hkq hkq = (hkq) intent.getParcelableExtra("user_details_confirmation_request");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("confirmed-facebook-info", "1");
            if (fax.a(hkq.a)) {
                Assertion.b(String.format("Attempting to confirm an invalid email: %s", new Object[]{hkq.a}));
            }
            jSONObject.put("email", hkq.a);
            if (fax.a(hkq.b)) {
                Assertion.b(String.format("Attempting to confirm an invalid birthdate: %s", new Object[]{hkq.b}));
            }
            jSONObject.put("birthdate", hkq.b);
            if (fax.a(hkq.c)) {
                Assertion.b(String.format("Attempting to confirm an invalid gender: %s", new Object[]{hkq.c}));
            }
            jSONObject.put("gender", hkq.c);
            Request request = new Request(Request.POST, "hm://signupuserdata/v1/update");
            request.setBody(jSONObject.toString().getBytes(Charset.defaultCharset()));
            Response response = (Response) this.a.resolve(request).e();
            Logger.b("Received response from confirmation service with status code %s and message %s", Integer.valueOf(response.getStatus()), new String(response.getBody(), Charset.defaultCharset()));
        } catch (Exception e) {
            Assertion.a("Calling service failed", (Throwable) e);
        }
    }
}

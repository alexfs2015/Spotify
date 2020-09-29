package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: due reason: default package */
public final class due implements OnClickListener {
    final ceu a;
    /* access modifiers changed from: 0000 */
    public dxj b;
    bhc c;
    String d;
    Long e;
    WeakReference<View> f;

    public due(ceu ceu) {
        this.a = ceu;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        this.d = null;
        this.e = null;
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            this.f = null;
            if (view != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
            }
        }
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.d == null || this.e == null)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.d);
                    jSONObject.put("time_interval", bkc.l().a() - this.e.longValue());
                    jSONObject.put("messageType", "onePointFiveClick");
                    this.a.a("sendMessageToNativeJs", jSONObject);
                } catch (JSONException e2) {
                    cml.a("Unable to dispatch sendMessageToNativeJs event", e2);
                }
            }
            a();
        }
    }
}

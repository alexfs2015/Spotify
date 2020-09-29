package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: ccu reason: default package */
public final class ccu extends ccv implements bhc<cti> {
    private final cti a;
    private final Context b;
    private final WindowManager c;
    private final dsr d;
    private DisplayMetrics e;
    private float f;
    private int g = -1;
    private int h = -1;
    private int i;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;

    public ccu(cti cti, Context context, dsr dsr) {
        super(cti);
        this.a = cti;
        this.b = context;
        this.d = dsr;
        this.c = (WindowManager) context.getSystemService("window");
    }

    public final void a(int i2, int i3) {
        int i4 = 0;
        if (this.b instanceof Activity) {
            bkc.e();
            i4 = cmu.c((Activity) this.b)[0];
        }
        if (this.a.v() == null || !this.a.v().c()) {
            dqe.a();
            this.l = cpc.b(this.b, this.a.getWidth());
            dqe.a();
            this.m = cpc.b(this.b, this.a.getHeight());
        }
        int i5 = i3 - i4;
        int i6 = this.l;
        try {
            this.q.a("onDefaultPositionReceived", new JSONObject().put("x", i2).put("y", i5).put("width", i6).put("height", this.m));
        } catch (JSONException e2) {
            cml.a("Error occured while dispatching default position.", e2);
        }
        this.a.x().a(i2, i3);
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        int i2;
        this.e = new DisplayMetrics();
        Display defaultDisplay = this.c.getDefaultDisplay();
        defaultDisplay.getMetrics(this.e);
        this.f = this.e.density;
        this.i = defaultDisplay.getRotation();
        dqe.a();
        DisplayMetrics displayMetrics = this.e;
        this.g = cpc.b(displayMetrics, displayMetrics.widthPixels);
        dqe.a();
        DisplayMetrics displayMetrics2 = this.e;
        this.h = cpc.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity d2 = this.a.d();
        if (d2 == null || d2.getWindow() == null) {
            this.j = this.g;
            i2 = this.h;
        } else {
            bkc.e();
            int[] a2 = cmu.a(d2);
            dqe.a();
            this.j = cpc.b(this.e, a2[0]);
            dqe.a();
            i2 = cpc.b(this.e, a2[1]);
        }
        this.k = i2;
        if (this.a.v().c()) {
            this.l = this.g;
            this.m = this.h;
        } else {
            this.a.measure(0, 0);
        }
        a(this.g, this.h, this.j, this.k, this.f, this.i);
        cct cct = new cct();
        dsr dsr = this.d;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        cct.b = dsr.a(intent);
        dsr dsr2 = this.d;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        cct.a = dsr2.a(intent2);
        cct.c = this.d.b();
        cct.d = this.d.a();
        cct.e = true;
        String str = "onDeviceFeaturesReceived";
        this.a.a(str, new ccs(cct, 0).a());
        int[] iArr = new int[2];
        this.a.getLocationOnScreen(iArr);
        dqe.a();
        int b2 = cpc.b(this.b, iArr[0]);
        dqe.a();
        a(b2, cpc.b(this.b, iArr[1]));
        if (cml.a(2)) {
            cpn.a(4);
        }
        try {
            this.q.a("onReadyEventReceived", new JSONObject().put("js", this.a.k().a));
        } catch (JSONException e2) {
            cml.a("Error occured while dispatching ready Event.", e2);
        }
    }
}

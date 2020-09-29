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

@cey
/* renamed from: ccd reason: default package */
public final class ccd extends cce implements bgl<csr> {
    private final csr a;
    private final Context b;
    private final WindowManager c;
    private final dsa d;
    private DisplayMetrics e;
    private float f;
    private int g = -1;
    private int h = -1;
    private int i;
    private int j = -1;
    private int k = -1;
    private int l = -1;
    private int m = -1;

    public ccd(csr csr, Context context, dsa dsa) {
        super(csr);
        this.a = csr;
        this.b = context;
        this.d = dsa;
        this.c = (WindowManager) context.getSystemService("window");
    }

    public final void a(int i2, int i3) {
        int i4 = 0;
        if (this.b instanceof Activity) {
            bjl.e();
            i4 = cmd.c((Activity) this.b)[0];
        }
        if (this.a.v() == null || !this.a.v().c()) {
            dpn.a();
            this.l = col.b(this.b, this.a.getWidth());
            dpn.a();
            this.m = col.b(this.b, this.a.getHeight());
        }
        int i5 = i3 - i4;
        int i6 = this.l;
        try {
            this.q.a("onDefaultPositionReceived", new JSONObject().put("x", i2).put("y", i5).put("width", i6).put("height", this.m));
        } catch (JSONException e2) {
            clu.a("Error occured while dispatching default position.", e2);
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
        dpn.a();
        DisplayMetrics displayMetrics = this.e;
        this.g = col.b(displayMetrics, displayMetrics.widthPixels);
        dpn.a();
        DisplayMetrics displayMetrics2 = this.e;
        this.h = col.b(displayMetrics2, displayMetrics2.heightPixels);
        Activity d2 = this.a.d();
        if (d2 == null || d2.getWindow() == null) {
            this.j = this.g;
            i2 = this.h;
        } else {
            bjl.e();
            int[] a2 = cmd.a(d2);
            dpn.a();
            this.j = col.b(this.e, a2[0]);
            dpn.a();
            i2 = col.b(this.e, a2[1]);
        }
        this.k = i2;
        if (this.a.v().c()) {
            this.l = this.g;
            this.m = this.h;
        } else {
            this.a.measure(0, 0);
        }
        a(this.g, this.h, this.j, this.k, this.f, this.i);
        ccc ccc = new ccc();
        dsa dsa = this.d;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        ccc.b = dsa.a(intent);
        dsa dsa2 = this.d;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        ccc.a = dsa2.a(intent2);
        ccc.c = this.d.b();
        ccc.d = this.d.a();
        ccc.e = true;
        String str = "onDeviceFeaturesReceived";
        this.a.a(str, new ccb(ccc, 0).a());
        int[] iArr = new int[2];
        this.a.getLocationOnScreen(iArr);
        dpn.a();
        int b2 = col.b(this.b, iArr[0]);
        dpn.a();
        a(b2, col.b(this.b, iArr[1]));
        if (clu.a(2)) {
            cow.a(4);
        }
        try {
            this.q.a("onReadyEventReceived", new JSONObject().put("js", this.a.k().a));
        } catch (JSONException e2) {
            clu.a("Error occured while dispatching ready Event.", e2);
        }
    }
}

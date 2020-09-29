package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import io.fabric.sdk.android.services.common.CommonUtils;

/* renamed from: vxw reason: default package */
public final class vxw {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    private vxw(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static vxw a(Context context, String str) {
        String str2 = "Fabric";
        if (str != null) {
            try {
                int j = CommonUtils.j(context);
                vvc a2 = vuu.a();
                StringBuilder sb = new StringBuilder("App icon resource ID is ");
                sb.append(j);
                a2.a(str2, sb.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), j, options);
                return new vxw(str, j, options.outWidth, options.outHeight);
            } catch (Exception e) {
                vuu.a().c(str2, "Failed to load icon", e);
            }
        }
        return null;
    }
}

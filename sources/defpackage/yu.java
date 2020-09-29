package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: yu reason: default package */
public final class yu {
    private static final Object b = new Object();
    public final Context a;
    private String c;
    private wy d;
    private final Map<String, xd> e;

    public yu(Callback callback, String str, wy wyVar, Map<String, xd> map) {
        this.c = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.c;
            if (str2.charAt(str2.length() - 1) != '/') {
                StringBuilder sb = new StringBuilder();
                sb.append(this.c);
                sb.append('/');
                this.c = sb.toString();
            }
        }
        if (!(callback instanceof View)) {
            this.e = new HashMap();
            this.a = null;
            return;
        }
        this.a = ((View) callback).getContext();
        this.e = map;
        this.d = wyVar;
    }

    public final Bitmap a(String str) {
        xd xdVar = (xd) this.e.get(str);
        if (xdVar == null) {
            return null;
        }
        Bitmap bitmap = xdVar.c;
        if (bitmap != null) {
            return bitmap;
        }
        wy wyVar = this.d;
        if (wyVar != null) {
            Bitmap a2 = wyVar.a();
            if (a2 != null) {
                a(str, a2);
            }
            return a2;
        }
        String str2 = xdVar.b;
        Options options = new Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.c)) {
                    AssetManager assets = this.a.getAssets();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.c);
                    sb.append(str2);
                    return a(str, BitmapFactory.decodeStream(assets.open(sb.toString()), null, options));
                }
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            } catch (IOException unused) {
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                return a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused2) {
                return null;
            }
        }
    }

    public final void a() {
        synchronized (b) {
            for (Entry value : this.e.entrySet()) {
                xd xdVar = (xd) value.getValue();
                Bitmap bitmap = xdVar.c;
                if (bitmap != null) {
                    bitmap.recycle();
                    xdVar.c = null;
                }
            }
        }
    }

    private Bitmap a(String str, Bitmap bitmap) {
        synchronized (b) {
            ((xd) this.e.get(str)).c = bitmap;
        }
        return bitmap;
    }
}

package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zh reason: default package */
public final class zh {
    public final zq<String> a = new zq<>();
    public final Map<zq<String>, Typeface> b = new HashMap();
    public final Map<String, Typeface> c = new HashMap();
    public final AssetManager d;
    public String e = ".ttf";
    private xl f;

    public zh(Callback callback, xl xlVar) {
        this.f = xlVar;
        if (!(callback instanceof View)) {
            this.d = null;
        } else {
            this.d = ((View) callback).getContext().getAssets();
        }
    }
}

package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: yt reason: default package */
public final class yt {
    public final zc<String> a = new zc<>();
    public final Map<zc<String>, Typeface> b = new HashMap();
    public final Map<String, Typeface> c = new HashMap();
    public final AssetManager d;
    public String e = ".ttf";
    private wx f;

    public yt(Callback callback, wx wxVar) {
        this.f = wxVar;
        if (!(callback instanceof View)) {
            this.d = null;
        } else {
            this.d = ((View) callback).getContext().getAssets();
        }
    }
}

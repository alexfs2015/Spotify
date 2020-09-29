package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.overlay.zzg;

@cfp
/* renamed from: bho reason: default package */
public final class bho {
    public final int a;
    public final LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public bho(cti cti) {
        this.b = cti.getLayoutParams();
        ViewParent parent = cti.getParent();
        this.d = cti.s();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        this.c = (ViewGroup) parent;
        this.a = this.c.indexOfChild(cti.o());
        this.c.removeView(cti.o());
        cti.b(true);
    }
}

package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.overlay.zzg;

@cey
/* renamed from: bgx reason: default package */
public final class bgx {
    public final int a;
    public final LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public bgx(csr csr) {
        this.b = csr.getLayoutParams();
        ViewParent parent = csr.getParent();
        this.d = csr.s();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        this.c = (ViewGroup) parent;
        this.a = this.c.indexOfChild(csr.o());
        this.c.removeView(csr.o());
        csr.b(true);
    }
}

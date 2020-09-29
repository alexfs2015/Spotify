package defpackage;

import android.content.Context;
import android.view.SubMenu;

/* renamed from: fad reason: default package */
public final class fad extends ax {
    public fad(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        az azVar = (az) a(i, i2, i3, charSequence);
        faf faf = new faf(this.a, this, azVar);
        azVar.a((bi) faf);
        return faf;
    }
}

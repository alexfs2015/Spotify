package defpackage;

import android.content.Context;
import android.view.SubMenu;

/* renamed from: ezm reason: default package */
public final class ezm extends ax {
    public ezm(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        az azVar = (az) a(i, i2, i3, charSequence);
        ezo ezo = new ezo(this.a, this, azVar);
        azVar.a((bi) ezo);
        return ezo;
    }
}

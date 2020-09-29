package defpackage;

import android.app.Dialog;
import android.os.Bundle;

/* renamed from: v reason: default package */
public class v extends ke {
    public Dialog a(Bundle bundle) {
        return new u(n(), aa_());
    }

    public final void a(Dialog dialog, int i) {
        if (dialog instanceof u) {
            u uVar = (u) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                }
                return;
            }
            uVar.a(1);
            return;
        }
        super.a(dialog, i);
    }
}

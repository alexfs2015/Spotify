package defpackage;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import java.util.Set;

/* renamed from: fm reason: default package */
public final class fm {
    final String a;
    final CharSequence b;
    final CharSequence[] c;
    final boolean d;
    final Bundle e;
    final Set<String> f;

    static RemoteInput[] a(fm[] fmVarArr) {
        if (fmVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[fmVarArr.length];
        for (int i = 0; i < fmVarArr.length; i++) {
            fm fmVar = fmVarArr[i];
            remoteInputArr[i] = new Builder(fmVar.a).setLabel(fmVar.b).setChoices(fmVar.c).setAllowFreeFormInput(fmVar.d).addExtras(fmVar.e).build();
        }
        return remoteInputArr;
    }
}

package defpackage;

import android.os.Bundle;

/* renamed from: qob reason: default package */
public final class qob implements wig<qoa> {
    private final wzi<Bundle> a;

    private qob(wzi<Bundle> wzi) {
        this.a = wzi;
    }

    public static qob a(wzi<Bundle> wzi) {
        return new qob(wzi);
    }

    public final /* synthetic */ Object get() {
        return new qoa((Bundle) this.a.get());
    }
}

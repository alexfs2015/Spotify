package defpackage;

import android.content.Context;
import android.nfc.NfcAdapter;

/* renamed from: lab reason: default package */
public final class lab implements vua<NfcAdapter> {
    private final wlc<Context> a;

    private lab(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static lab a(wlc<Context> wlc) {
        return new lab(wlc);
    }

    public final /* synthetic */ Object get() {
        return NfcAdapter.getDefaultAdapter((Context) this.a.get());
    }
}

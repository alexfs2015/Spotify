package defpackage;

import android.nfc.NfcAdapter;

/* renamed from: upt reason: default package */
public final class upt implements vua<ups> {
    private final wlc<NfcAdapter> a;

    private upt(wlc<NfcAdapter> wlc) {
        this.a = wlc;
    }

    public static upt a(wlc<NfcAdapter> wlc) {
        return new upt(wlc);
    }

    public final /* synthetic */ Object get() {
        return new ups((NfcAdapter) this.a.get());
    }
}

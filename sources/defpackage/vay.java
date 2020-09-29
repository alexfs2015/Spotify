package defpackage;

import android.nfc.NfcAdapter;

/* renamed from: vay reason: default package */
public final class vay implements wig<vax> {
    private final wzi<NfcAdapter> a;

    private vay(wzi<NfcAdapter> wzi) {
        this.a = wzi;
    }

    public static vay a(wzi<NfcAdapter> wzi) {
        return new vay(wzi);
    }

    public final /* synthetic */ Object get() {
        return new vax((NfcAdapter) this.a.get());
    }
}

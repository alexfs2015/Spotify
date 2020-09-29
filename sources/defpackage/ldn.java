package defpackage;

import android.content.Context;
import android.nfc.NfcAdapter;

/* renamed from: ldn reason: default package */
public final class ldn implements wig<NfcAdapter> {
    private final wzi<Context> a;

    private ldn(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static ldn a(wzi<Context> wzi) {
        return new ldn(wzi);
    }

    public final /* synthetic */ Object get() {
        return NfcAdapter.getDefaultAdapter((Context) this.a.get());
    }
}

package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcAdapter.CreateNdefMessageCallback;
import android.nfc.NfcEvent;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: vax reason: default package */
public final class vax {
    private final NfcAdapter a;

    /* renamed from: vax$a */
    public interface a {
        Uri getNdefPushUri();
    }

    vax(NfcAdapter nfcAdapter) {
        this.a = nfcAdapter;
    }

    public final void a(final a aVar, final Activity activity) {
        NfcAdapter nfcAdapter = this.a;
        if (nfcAdapter != null) {
            try {
                nfcAdapter.setNdefPushMessageCallback(new CreateNdefMessageCallback() {
                    public final NdefMessage createNdefMessage(NfcEvent nfcEvent) {
                        Uri ndefPushUri = aVar.getNdefPushUri();
                        if (ndefPushUri == null) {
                            return null;
                        }
                        return new NdefMessage(new NdefRecord[]{NdefRecord.createUri(ndefPushUri), NdefRecord.createApplicationRecord(activity.getApplication().getApplicationInfo().packageName)});
                    }
                }, activity, new Activity[0]);
            } catch (RuntimeException e) {
                Assertion.a("NFC issue", (Throwable) e);
            }
        }
    }
}

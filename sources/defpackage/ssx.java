package defpackage;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient.FileChooserParams;

/* renamed from: ssx reason: default package */
public final class ssx {
    ValueCallback<Uri[]> a;
    private final a b;

    ssx(a aVar) {
        this.b = aVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(FileChooserParams fileChooserParams) {
        try {
            this.b.onStartActivityForResult(fileChooserParams.createIntent(), 1780);
        } catch (ActivityNotFoundException unused) {
            a((Uri[]) null);
        }
    }

    public void a(Uri[] uriArr) {
        ValueCallback<Uri[]> valueCallback = this.a;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(uriArr);
            this.a = null;
        }
    }
}

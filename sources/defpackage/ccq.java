package defpackage;

import android.app.DownloadManager;
import android.app.DownloadManager.Request;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Environment;

/* renamed from: ccq reason: default package */
public final class ccq implements OnClickListener {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ ccp c;

    public ccq(ccp ccp, String str, String str2) {
        this.c = ccp;
        this.a = str;
        this.b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.c.b.getSystemService("download");
        try {
            String str = this.a;
            String str2 = this.b;
            Request request = new Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            bkc.g().a(request);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.c.a("Could not store picture.");
        }
    }
}

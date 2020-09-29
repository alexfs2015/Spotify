package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.spotify.core.http.HttpConnection;

/* renamed from: cnq reason: default package */
final /* synthetic */ class cnq implements OnClickListener {
    private final cnn a;
    private final String b;

    cnq(cnn cnn, String str) {
        this.a = cnn;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        cnn cnn = this.a;
        String str = this.b;
        bkc.e();
        cmu.a(cnn.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType(HttpConnection.kDefaultContentType).putExtra("android.intent.extra.TEXT", str), "Share via"));
    }
}

package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.spotify.core.http.HttpConnection;

/* renamed from: cmz reason: default package */
final /* synthetic */ class cmz implements OnClickListener {
    private final cmw a;
    private final String b;

    cmz(cmw cmw, String str) {
        this.a = cmw;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        cmw cmw = this.a;
        String str = this.b;
        bjl.e();
        cmd.a(cmw.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType(HttpConnection.kDefaultContentType).putExtra("android.intent.extra.TEXT", str), "Share via"));
    }
}

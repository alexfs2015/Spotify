package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

/* renamed from: -$$Lambda$ssw$0OkJ4VH0azEZYbmBJy5p42yVv6w reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ssw$0OkJ4VH0azEZYbmBJy5p42yVv6w implements OnCancelListener {
    private final /* synthetic */ ssw f$0;
    private final /* synthetic */ JsResult f$1;

    public /* synthetic */ $$Lambda$ssw$0OkJ4VH0azEZYbmBJy5p42yVv6w(ssw ssw, JsResult jsResult) {
        this.f$0 = ssw;
        this.f$1 = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f$0.a(this.f$1, dialogInterface);
    }
}

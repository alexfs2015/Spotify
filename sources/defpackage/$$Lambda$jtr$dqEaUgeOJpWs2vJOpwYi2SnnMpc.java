package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/* renamed from: -$$Lambda$jtr$dqEaUgeOJpWs2vJOpwYi2SnnMpc reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jtr$dqEaUgeOJpWs2vJOpwYi2SnnMpc implements ObservableOnSubscribe {
    private final /* synthetic */ Handler f$0;
    private final /* synthetic */ Context f$1;
    private final /* synthetic */ ContentResolver f$2;
    private final /* synthetic */ Uri f$3;

    public /* synthetic */ $$Lambda$jtr$dqEaUgeOJpWs2vJOpwYi2SnnMpc(Handler handler, Context context, ContentResolver contentResolver, Uri uri) {
        this.f$0 = handler;
        this.f$1 = context;
        this.f$2 = contentResolver;
        this.f$3 = uri;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        jtr.a(this.f$0, this.f$1, this.f$2, this.f$3, observableEmitter);
    }
}

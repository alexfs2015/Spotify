package defpackage;

import android.net.Uri;
import com.squareup.picasso.Picasso;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$tiz$Cj0m09FZ3nXenvJTfBwYliq-kmM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tiz$Cj0m09FZ3nXenvJTfBwYliqkmM implements SingleOnSubscribe {
    private final /* synthetic */ Picasso f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$tiz$Cj0m09FZ3nXenvJTfBwYliqkmM(Picasso picasso, Uri uri) {
        this.f$0 = picasso;
        this.f$1 = uri;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        tiz.a(this.f$0, this.f$1, singleEmitter);
    }
}

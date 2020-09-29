package defpackage;

import android.net.Uri;
import com.squareup.picasso.Picasso;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;

/* renamed from: -$$Lambda$sys$BHnKNPtfwGskZ5wNIM-rIaKlEWE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$sys$BHnKNPtfwGskZ5wNIMrIaKlEWE implements SingleOnSubscribe {
    private final /* synthetic */ Picasso f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$sys$BHnKNPtfwGskZ5wNIMrIaKlEWE(Picasso picasso, Uri uri) {
        this.f$0 = picasso;
        this.f$1 = uri;
    }

    public final void subscribe(SingleEmitter singleEmitter) {
        sys.a(this.f$0, this.f$1, singleEmitter);
    }
}

package defpackage;

import android.net.Uri;
import com.spotify.music.features.voiceassistant.NaturalLanguageSearchModel.Request;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$qpx$QzP2T9wQ7HRlj4Y1p0s_ROhC-RI reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qpx$QzP2T9wQ7HRlj4Y1p0s_ROhCRI implements Consumer {
    private final /* synthetic */ qpx f$0;
    private final /* synthetic */ Uri f$1;

    public /* synthetic */ $$Lambda$qpx$QzP2T9wQ7HRlj4Y1p0s_ROhCRI(qpx qpx, Uri uri) {
        this.f$0 = qpx;
        this.f$1 = uri;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (Request) obj);
    }
}

package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kwa$xszcVM6hJ3mMoyHWGqgOqPYbsX8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kwa$xszcVM6hJ3mMoyHWGqgOqPYbsX8 implements Consumer {
    public static final /* synthetic */ $$Lambda$kwa$xszcVM6hJ3mMoyHWGqgOqPYbsX8 INSTANCE = new $$Lambda$kwa$xszcVM6hJ3mMoyHWGqgOqPYbsX8();

    private /* synthetic */ $$Lambda$kwa$xszcVM6hJ3mMoyHWGqgOqPYbsX8() {
    }

    public final void accept(Object obj) {
        Logger.e("Error fetching shuffle dialog data: %s", ((Throwable) obj).getMessage());
    }
}

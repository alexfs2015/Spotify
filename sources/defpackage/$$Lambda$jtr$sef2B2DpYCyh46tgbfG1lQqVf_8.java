package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;

/* renamed from: -$$Lambda$jtr$sef2B2DpYCyh46tgbfG1lQqVf_8 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jtr$sef2B2DpYCyh46tgbfG1lQqVf_8 implements Runnable {
    private final /* synthetic */ ContentResolver f$0;
    private final /* synthetic */ ContentObserver f$1;

    public /* synthetic */ $$Lambda$jtr$sef2B2DpYCyh46tgbfG1lQqVf_8(ContentResolver contentResolver, ContentObserver contentObserver) {
        this.f$0 = contentResolver;
        this.f$1 = contentObserver;
    }

    public final void run() {
        this.f$0.unregisterContentObserver(this.f$1);
    }
}

package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: -$$Lambda$qel$qB4H-tdW5-akajhLdBvZkYK9JKw reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qel$qB4HtdW5akajhLdBvZkYK9JKw implements OnClickListener {
    private final /* synthetic */ a f$0;
    private final /* synthetic */ jog f$1;

    public /* synthetic */ $$Lambda$qel$qB4HtdW5akajhLdBvZkYK9JKw(a aVar, jog jog) {
        this.f$0 = aVar;
        this.f$1 = jog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f$0.a(this.f$1.c.isChecked());
    }
}

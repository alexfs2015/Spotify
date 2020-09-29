package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: -$$Lambda$gmb$xUJjKU1HO8PCU65BYwcjwaTocOE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$gmb$xUJjKU1HO8PCU65BYwcjwaTocOE implements OnClickListener {
    private final /* synthetic */ Runnable f$0;
    private final /* synthetic */ Runnable f$1;

    public /* synthetic */ $$Lambda$gmb$xUJjKU1HO8PCU65BYwcjwaTocOE(Runnable runnable, Runnable runnable2) {
        this.f$0 = runnable;
        this.f$1 = runnable2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        gmb.a(this.f$0, this.f$1, dialogInterface, i);
    }
}

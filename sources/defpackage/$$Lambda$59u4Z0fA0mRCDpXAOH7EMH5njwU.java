package defpackage;

import android.content.Context;
import com.google.common.base.Function;

/* renamed from: -$$Lambda$59u4Z0fA0mRCDpXAOH7EMH5njwU reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$59u4Z0fA0mRCDpXAOH7EMH5njwU implements Function {
    private final /* synthetic */ Context f$0;

    public /* synthetic */ $$Lambda$59u4Z0fA0mRCDpXAOH7EMH5njwU(Context context) {
        this.f$0 = context;
    }

    public final Object apply(Object obj) {
        return this.f$0.getString(((Integer) obj).intValue());
    }
}

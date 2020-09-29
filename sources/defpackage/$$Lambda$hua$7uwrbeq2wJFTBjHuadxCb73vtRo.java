package defpackage;

import io.reactivex.functions.Function;
import java.util.Locale;

/* renamed from: -$$Lambda$hua$7uwrbeq2wJFTBjHuadxCb73vtRo reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hua$7uwrbeq2wJFTBjHuadxCb73vtRo implements Function {
    public static final /* synthetic */ $$Lambda$hua$7uwrbeq2wJFTBjHuadxCb73vtRo INSTANCE = new $$Lambda$hua$7uwrbeq2wJFTBjHuadxCb73vtRo();

    private /* synthetic */ $$Lambda$hua$7uwrbeq2wJFTBjHuadxCb73vtRo() {
    }

    public final Object apply(Object obj) {
        return String.format(Locale.getDefault(), "\"%s\"", new Object[]{((Throwable) obj).getMessage()});
    }
}

package defpackage;

import io.reactivex.functions.Function;
import java.util.Locale;

/* renamed from: -$$Lambda$hua$S5EEonImWOR0y1nqlDngVYkEaCA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$hua$S5EEonImWOR0y1nqlDngVYkEaCA implements Function {
    public static final /* synthetic */ $$Lambda$hua$S5EEonImWOR0y1nqlDngVYkEaCA INSTANCE = new $$Lambda$hua$S5EEonImWOR0y1nqlDngVYkEaCA();

    private /* synthetic */ $$Lambda$hua$S5EEonImWOR0y1nqlDngVYkEaCA() {
    }

    public final Object apply(Object obj) {
        return String.format(Locale.getDefault(), "\"%s\"", new Object[]{((Throwable) obj).getMessage()});
    }
}

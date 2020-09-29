package defpackage;

import com.spotify.mobile.android.connect.model.GaiaDevice;
import io.reactivex.functions.BiPredicate;

/* renamed from: -$$Lambda$ryd$LJG6iERDje4cHo6uoLAI_t8sF5I reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ryd$LJG6iERDje4cHo6uoLAI_t8sF5I implements BiPredicate {
    public static final /* synthetic */ $$Lambda$ryd$LJG6iERDje4cHo6uoLAI_t8sF5I INSTANCE = new $$Lambda$ryd$LJG6iERDje4cHo6uoLAI_t8sF5I();

    private /* synthetic */ $$Lambda$ryd$LJG6iERDje4cHo6uoLAI_t8sF5I() {
    }

    public final boolean test(Object obj, Object obj2) {
        return ((GaiaDevice) obj).getIdentifier().equals(((GaiaDevice) obj2).getIdentifier());
    }
}

package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.bans.BansLoader.BansResponse;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$qtu$L_ky1_ZYLZlMaVfLzeue5Cj6Eg4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$qtu$L_ky1_ZYLZlMaVfLzeue5Cj6Eg4 implements Function {
    public static final /* synthetic */ $$Lambda$qtu$L_ky1_ZYLZlMaVfLzeue5Cj6Eg4 INSTANCE = new $$Lambda$qtu$L_ky1_ZYLZlMaVfLzeue5Cj6Eg4();

    private /* synthetic */ $$Lambda$qtu$L_ky1_ZYLZlMaVfLzeue5Cj6Eg4() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(!((BansResponse) obj).getTracks().isEmpty());
    }
}

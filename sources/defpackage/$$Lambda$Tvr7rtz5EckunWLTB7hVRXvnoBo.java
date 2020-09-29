package defpackage;

import com.spotify.mobile.android.util.loader.SettingsState;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$Tvr7rtz5EckunWLTB7hVRXvnoBo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$Tvr7rtz5EckunWLTB7hVRXvnoBo implements Function {
    public static final /* synthetic */ $$Lambda$Tvr7rtz5EckunWLTB7hVRXvnoBo INSTANCE = new $$Lambda$Tvr7rtz5EckunWLTB7hVRXvnoBo();

    private /* synthetic */ $$Lambda$Tvr7rtz5EckunWLTB7hVRXvnoBo() {
    }

    public final Object apply(Object obj) {
        return Boolean.valueOf(((SettingsState) obj).localDevicesOnly());
    }
}

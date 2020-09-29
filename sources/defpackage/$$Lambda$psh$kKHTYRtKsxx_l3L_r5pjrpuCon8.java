package defpackage;

import com.spotify.music.features.profile.editprofile.EditProfileActivity;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$psh$kKHTYRtKsxx_l3L_r5pjrpuCon8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$psh$kKHTYRtKsxx_l3L_r5pjrpuCon8 implements Consumer {
    private final /* synthetic */ pry f$0;

    public /* synthetic */ $$Lambda$psh$kKHTYRtKsxx_l3L_r5pjrpuCon8(pry pry) {
        this.f$0 = pry;
    }

    public final void accept(Object obj) {
        this.f$0.a.startActivity(EditProfileActivity.a(this.f$0.a, ((g) obj).a, ((g) obj).b, ((g) obj).c));
    }
}

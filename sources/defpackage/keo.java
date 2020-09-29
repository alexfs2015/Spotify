package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.events.ReasonEnd;
import com.spotify.mobile.android.video.exception.BetamaxException;
import java.util.List;

/* renamed from: keo reason: default package */
public final class keo implements kch {
    private final gfk<fli> a;
    private final kaa b;
    private final String c;

    public keo(kaa kaa, gfk<fli> gfk, String str) {
        this.b = kaa;
        this.a = gfk;
        this.c = (String) kdv.a(kaa).a(str);
    }

    public /* synthetic */ void a() {
        CC.$default$a(this);
    }

    public /* synthetic */ void a(float f, long j, long j2) {
        CC.$default$a((kch) this, f, j, j2);
    }

    public /* synthetic */ void a(int i) {
        CC.$default$a((kch) this, i);
    }

    public /* synthetic */ void a(long j) {
        CC.$default$a((kch) this, j);
    }

    public /* synthetic */ void a(long j, long j2) {
        CC.$default$a((kch) this, j, j2);
    }

    public /* synthetic */ void a(long j, long j2, long j3) {
        CC.$default$a((kch) this, j, j2, j3);
    }

    public /* synthetic */ void a(Optional<VideoSurfaceView> optional, long j, long j2) {
        CC.$default$a((kch) this, (Optional) optional, j, j2);
    }

    public /* synthetic */ void a(EncryptionType encryptionType) {
        CC.$default$a((kch) this, encryptionType);
    }

    public final void a(BetamaxException betamaxException, long j, long j2) {
        this.a.a(ker.a(this.b, this.c, betamaxException));
    }

    public /* synthetic */ void a(List<kai> list) {
        CC.$default$a((kch) this, (List) list);
    }

    public /* synthetic */ void a(jzr jzr, ReasonEnd reasonEnd, long j, long j2) {
        CC.$default$a(this, jzr, reasonEnd, j, j2);
    }

    public /* synthetic */ void a(kaa kaa, long j) {
        CC.$default$a((kch) this, kaa, j);
    }

    public /* synthetic */ void a(kai kai, long j, long j2) {
        CC.$default$a((kch) this, kai, j, j2);
    }

    public /* synthetic */ void a(kcc kcc, long j, long j2) {
        CC.$default$a((kch) this, kcc, j, j2);
    }

    public /* synthetic */ void a(kcm kcm, long j, long j2) {
        CC.$default$a((kch) this, kcm, j, j2);
    }

    public /* synthetic */ void a(boolean z, long j) {
        CC.$default$a((kch) this, z, j);
    }

    public /* synthetic */ void a(boolean z, long j, long j2) {
        CC.$default$a((kch) this, z, j, j2);
    }

    public /* synthetic */ void b(long j) {
        CC.$default$b(this, j);
    }

    public /* synthetic */ void b(long j, long j2) {
        CC.$default$b(this, j, j2);
    }

    public final void b(BetamaxException betamaxException, long j, long j2) {
        this.a.a(ker.a(this.b, this.c, betamaxException));
    }

    public /* synthetic */ void c(long j, long j2) {
        CC.$default$c(this, j, j2);
    }

    public /* synthetic */ void d(long j, long j2) {
        CC.$default$d(this, j, j2);
    }

    public /* synthetic */ void e(long j, long j2) {
        CC.$default$e(this, j, j2);
    }
}

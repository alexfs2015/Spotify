package defpackage;

import android.app.Activity;
import com.google.common.base.Optional;

/* renamed from: jna reason: default package */
public final class jna implements jmz {
    private final jmb a;
    private final Activity b;
    private final jsz c;
    private final jyj d;
    private final jyl e;

    public jna(jmb jmb, Activity activity, jsz jsz, jyj jyj, jyl jyl) {
        this.a = jmb;
        this.b = activity;
        this.c = jsz;
        this.d = jyj;
        this.e = jyl;
    }

    public final jmk a(udr udr, sih sih, boolean z, boolean z2, boolean z3, jnu jnu) {
        jml jml = new jml(this.a, this.b, udr, sih, z, z2, z3, jnu);
        return jml;
    }

    public final jmo a(udr udr, sih sih, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, jnu jnu) {
        jmp jmp = new jmp(this.a, udr, sih, z, z2, z3, z4, z5, jnu);
        return jmp;
    }

    public final jmu a(udr udr, sih sih, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, jnu jnu, jmx jmx, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, Optional<String> optional, Optional<String> optional2) {
        jmv jmv = new jmv(this.a, this.b, udr, sih, this.c, this.d, this.e, z, z2, z3, z4, z5, z6, z7, jnu, jmx, z8, z9, z10, z11, z12, z13, optional, optional2);
        return jmv;
    }

    public final jni a(udr udr, sih sih, boolean z, boolean z2, jnu jnu) {
        jnj jnj = new jnj(this.a, this.b, udr, sih, z, z2, jnu, this.c);
        return jnj;
    }

    public final jnm a(udr udr, sih sih, boolean z, jnu jnu) {
        jnn jnn = new jnn(this.a, this.b, udr, sih, z, jnu);
        return jnn;
    }

    public final jns a(udr udr, sih sih, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Optional<String> optional, boolean z6, jnu jnu, Optional<String> optional2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, Optional<joa> optional3, Optional<joa> optional4, boolean z13, boolean z14) {
        jnt jnt = new jnt(this.a, this.b, udr, sih, z, z2, z3, z4, z5, optional, z6, jnu, optional2, z7, z8, z9, z10, z11, z12, optional3, optional4, z13, z14);
        return jnt;
    }
}

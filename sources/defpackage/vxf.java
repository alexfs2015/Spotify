package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator.PasswordValidation;
import com.spotify.signup.api.services.model.EmailSignupStatus.Error;
import com.spotify.signup.api.services.model.EmailSignupStatus.Ok;
import com.spotify.signup.api.services.model.EmailSignupStatus.Unknown;

/* renamed from: vxf reason: default package */
public final class vxf extends knj<vyl, vyj, vyi> {
    private final boolean a = false;
    private final gbp b;
    private int c = -1;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;

    public vxf(gbp gbp) {
        super("InstrumentationLogger");
        this.b = gbp;
    }

    private void a(int i) {
        if (i != this.c) {
            this.c = i;
            int i2 = this.c;
            if (i2 == 0) {
                this.b.a(gbr.a((gbo) new c()));
            } else if (i2 == 1) {
                this.b.a(gbr.a((gbo) new g()));
            } else if (i2 == 2) {
                this.b.a(gbr.a((gbo) new a()));
            } else if (i2 == 3) {
                this.b.a(gbr.a((gbo) new d()));
            } else if (i2 == 4) {
                this.b.a(gbr.a((gbo) new f()));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Error error) {
        String str = "";
        switch (error.status()) {
            case STATUS_ALREADY_REGISTERED:
            case STATUS_EMAIL_ALREADY_EXISTS:
                this.b.a(gbr.a((gbo) new f(), (gbk) new d(), (gbl) new d(), str));
                break;
            case STATUS_INVALID_EMAIL:
                this.b.a(gbr.a((gbo) new f(), (gbk) new e(), (gbl) new d(), str));
                return;
            case STATUS_INVALID_FORM_DATA:
                this.b.a(gbr.a((gbo) new f(), (gbk) new i(), (gbl) new d(), str));
                return;
            case STATUS_INVALID_COUNTRY:
                this.b.a(gbr.a((gbo) new f(), (gbk) new h(), (gbl) new d(), str));
                return;
            case STATUS_VALIDATE_TOO_YOUNG:
                this.b.a(gbr.a((gbo) new f(), (gbk) new b(), (gbl) new d(), str));
                return;
            case STATUS_NO_CONNECTION:
                this.b.a(gbr.a((gbo) new f(), (gbk) new k(), (gbl) new d(), str));
                return;
            case STATUS_UNKNOWN_ERROR:
                this.b.a(gbr.a((gbo) new f(), (gbk) new g(), (gbl) new d(), str));
                break;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Ok ok) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Unknown unknown) {
        this.b.a(gbr.a((gbo) new f(), (gbk) new g(), (gbl) new d(), ""));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        if (!this.f) {
            this.b.a(gbr.a((gbo) new a(), (gbl) new a()));
            this.f = true;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        aVar.a.a(new $$Lambda$vxf$yLEP2BADhedguArUg8yATynqg3U(this), new $$Lambda$vxf$mW2MgyptoT_40CjYUYXg4U9oq0(this), new $$Lambda$vxf$j5cwAbtiStXotoB0vAgi1y5_E(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(d dVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.b.a(gbr.a((gbo) new a(), (gbk) new a(), (gbl) new a(), ""));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.b.a(gbr.a((gbo) new a(), (gbk) new b(), (gbl) new a(), ""));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.b.a(gbr.a((gbo) new a(), (gbk) new c(), (gbl) new a(), ""));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        bVar.a.match($$Lambda$vxf$RBUYtAjliCMq2veWeRgP0XZeqA.INSTANCE, new $$Lambda$vxf$R0MTkVqky_NNbbGiC1uLehpIeE(this), new $$Lambda$vxf$QjAZuNPwPH6BpViLzDChIqiYUog(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.b.a(gbr.a(new f(), new a(), new j()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        this.b.a(gbr.a(new c(), new b(), new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(f fVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        gVar.a().a((ged<b>) $$Lambda$vxf$kTDMEY_yIie5hVWvcq7LxMwsS8Y.INSTANCE, (ged<c>) new $$Lambda$vxf$kCi55O9fsr0HlYhwVT1SdGswp7c<c>(this), (ged<a>) $$Lambda$vxf$7jtqfB9tqiRMtOU3gM5uEejQ7g.INSTANCE, (ged<d>) new $$Lambda$vxf$30qjrQNThXZMS8ZF1n0WPyQhkQ<d>(this), (ged<g>) $$Lambda$vxf$cSiiQxk_jAGaJRQF2JijLzgjodA.INSTANCE, (ged<f>) new $$Lambda$vxf$RPfwIpWJM_9XlEqzEtykyjizCW4<f>(this), (ged<e>) new $$Lambda$vxf$XcdNgZ2Kp47Brbll9goGQRWkdMc<e>(this), (ged<h>) $$Lambda$vxf$7tEt_ZqK8SwFnQeH41eDNE9foA.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(h hVar) {
        hVar.a().a((ged<a>) new $$Lambda$vxf$RvO0mAdTTVD4FFb3z5ok6LKqj2I<a>(this));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(i iVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(j jVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(k kVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(l lVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(m mVar) {
        if (mVar.c) {
            this.b.a(gbr.b(new f()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(n nVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(o oVar) {
        oVar.a().a((ged<a>) new $$Lambda$vxf$CMgPCqK1BZJYItcatcnOiGI2Yw<a>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(q qVar) {
        this.b.a(gbr.a(new c(), new e(), new a()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(r rVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vyl vyl, a aVar) {
        vyl.d().d().a($$Lambda$vxf$aDx_NdRawkaNyuMOtKw4koa2yIk.INSTANCE, $$Lambda$vxf$QOOmv4Apz3eOGRm3AokZgV97LWE.INSTANCE, new $$Lambda$vxf$K0hRR7i9JzWKk5Y0MCC6bSSzik(this), $$Lambda$vxf$sP8QnzEqFuwZLYG_DMgP202oXo.INSTANCE);
        this.b.a(gbr.a(new a(), new h(), new j()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vyl vyl, d dVar) {
        dVar.a().a((ged<a>) new $$Lambda$vxf$lcIXrkv_RlXsBP7Fu30GPuqycY<a>(this, vyl), (ged<c>) new $$Lambda$vxf$1wdrzMZGTLnVWbAMiQUPfztmEG4<c>(this), (ged<b>) $$Lambda$vxf$UZjleXd0SvWdD5dYsXg9ARQX5Rg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vyl vyl, p pVar) {
        pVar.a().a((ged<b>) new $$Lambda$vxf$Qofs_eOSbCnI4wv7wQFzZY57YE<b>(this), (ged<a>) new $$Lambda$vxf$xeTw12sVyrJhB6J6CFND6uvlI8<a>(this), (ged<d>) $$Lambda$vxf$pInBD7LlHCNCg4LFA75VYVehMLg.INSTANCE, (ged<c>) new $$Lambda$vxf$x8H99veRQOy0Ea11Axjl6geoZX4<c>(this, vyl));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vyl vyl, c cVar) {
        vyl.c().a().a((ged<b>) $$Lambda$vxf$_uIAi9gVvSk1TJ95n0tSZRX1EPk.INSTANCE, (ged<d>) $$Lambda$vxf$IZxyD48e3v_rXBKEmrYeSxvrAow.INSTANCE, (ged<f>) $$Lambda$vxf$_LQCM3YlNWNOviXfH8tE5KVLo.INSTANCE, (ged<e>) $$Lambda$vxf$noksG3auTQGMuDb3jBb_N3rmV6A.INSTANCE, (ged<g>) $$Lambda$vxf$RZD5v9JAy_nOwevPfbUjVh7ZX4A.INSTANCE, (ged<i>) $$Lambda$vxf$FRGVrncRWS6tcOGsjGPZy1cTflA.INSTANCE, (ged<h>) new $$Lambda$vxf$WPSD_60_suwBm5gucVIqYpbxFI<h>(this), (ged<c>) $$Lambda$vxf$42c6jc_mAnTg5CT72atWapKX8Vk.INSTANCE, (ged<a>) $$Lambda$vxf$f8zBdldzNDzGRQEgw8WKqfUy4o.INSTANCE);
        this.b.a(gbr.a(new g(), new h(), new j()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.b.a(gbr.a(new c(), new m(), new j()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        if (!this.d) {
            this.d = true;
            this.b.a(gbr.a((gbo) new c(), (gbl) new c()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        this.b.a(gbr.a(new c(), new h(), new j()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        fVar.a.a((ged<c>) $$Lambda$vxf$2fuh2X2HWUxLOFYwzrrkKjwPXo.INSTANCE, (ged<b>) new $$Lambda$vxf$AN6wU2TVuBCUqOak5CvEdkAL88c<b>(this), (ged<a>) $$Lambda$vxf$TNDw9Qd1hNQ89lCAZGxNfUiryqQ.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(g gVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(h hVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        String str = "";
        if (bVar.a == 20) {
            this.b.a(gbr.a((gbo) new c(), (gbk) new d(), (gbl) new c(), str));
            this.b.a(gbr.a((gbo) new c(), (gbj) new a()));
            return;
        }
        this.b.a(gbr.a((gbo) new c(), (gbk) new g(), (gbl) new c(), str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.b.a(gbr.a(new d(), new c(), new j()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.b.a(gbr.a(new d(), new g(), new j()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        this.b.a(gbr.a(new d(), new i(), new j()));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        aVar.a.a((ged<c>) $$Lambda$vxf$v0OY7tWprSRhMLqjJO06WBUUGE.INSTANCE, (ged<b>) new $$Lambda$vxf$efEmrppthgjKDwimBfQUBpUCq4<b>(this), (ged<a>) new $$Lambda$vxf$vGaiAkDZMofJKptsF1JYC95bilw<a>(this), (ged<d>) new $$Lambda$vxf$VcOdnPAY8BoM2Y4ttj_GwDJUciI<d>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        if (aVar.b && !this.g) {
            this.g = true;
            this.b.a(gbr.a((gbo) new f(), (gbl) new b()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        if (PasswordValidation.TOO_WEAK == aVar.b) {
            this.b.a(gbr.a((gbo) new g(), (gbk) new o(), (gbl) new e(), ""));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        if (!this.e) {
            this.e = true;
            this.b.a(gbr.a((gbo) new g(), (gbl) new e()));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(d dVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(b bVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(c cVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(d dVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(e eVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(f fVar) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(g gVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(h hVar) {
        this.b.a(gbr.a((gbo) new g(), (gbk) new n(), (gbl) new e(), ""));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(i iVar) {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2, Throwable th) {
    }

    public final /* synthetic */ void a(Object obj, Object obj2, kng kng) {
        vyj vyj = (vyj) obj2;
        vyl vyl = (vyl) kng.a((vyl) obj);
        a(vyl.h());
        $$Lambda$vxf$6WJWLR3uxcrP2JPoEsqZAxz2VQ r3 = r4;
        $$Lambda$vxf$6WJWLR3uxcrP2JPoEsqZAxz2VQ r4 = new $$Lambda$vxf$6WJWLR3uxcrP2JPoEsqZAxz2VQ(this);
        $$Lambda$vxf$1AWmQgoDXzY5IoMgkL0xidmDg4 r42 = r5;
        $$Lambda$vxf$1AWmQgoDXzY5IoMgkL0xidmDg4 r5 = new $$Lambda$vxf$1AWmQgoDXzY5IoMgkL0xidmDg4(this, vyl);
        $$Lambda$vxf$Vx46sZ7w3XL_56OIxy6gfpWX8gA r52 = r6;
        $$Lambda$vxf$Vx46sZ7w3XL_56OIxy6gfpWX8gA r6 = new $$Lambda$vxf$Vx46sZ7w3XL_56OIxy6gfpWX8gA(this, vyl);
        $$Lambda$vxf$PhWsjGBM9oOcI1Sbl7Q3oKSwE4Q r62 = r1;
        $$Lambda$vxf$PhWsjGBM9oOcI1Sbl7Q3oKSwE4Q r1 = new $$Lambda$vxf$PhWsjGBM9oOcI1Sbl7Q3oKSwE4Q(this);
        $$Lambda$vxf$OgCBIMrqnnNooXoxzrdiOAhgNP0 r7 = r1;
        $$Lambda$vxf$OgCBIMrqnnNooXoxzrdiOAhgNP0 r12 = new $$Lambda$vxf$OgCBIMrqnnNooXoxzrdiOAhgNP0(this);
        $$Lambda$vxf$YBq0yImGl8gWztNngEmgHE2Z7sU r8 = $$Lambda$vxf$YBq0yImGl8gWztNngEmgHE2Z7sU.INSTANCE;
        $$Lambda$vxf$DtS3u6bMMKbGa5C9Ujt34TkJaVY r9 = $$Lambda$vxf$DtS3u6bMMKbGa5C9Ujt34TkJaVY.INSTANCE;
        $$Lambda$vxf$LbU1r9Oyj0OxyLDPSGyhbJCFxE r10 = $$Lambda$vxf$LbU1r9Oyj0OxyLDPSGyhbJCFxE.INSTANCE;
        $$Lambda$vxf$BTV16hHtN7oUjSkWVVKjFyDqBg r11 = $$Lambda$vxf$BTV16hHtN7oUjSkWVVKjFyDqBg.INSTANCE;
        $$Lambda$vxf$UxENg2HskZ9lEXHsjdM9XNNqDW0 r122 = $$Lambda$vxf$UxENg2HskZ9lEXHsjdM9XNNqDW0.INSTANCE;
        $$Lambda$vxf$5HQdHtyKfgmjpeADH37QXSkIA r13 = r1;
        $$Lambda$vxf$5HQdHtyKfgmjpeADH37QXSkIA r14 = new $$Lambda$vxf$5HQdHtyKfgmjpeADH37QXSkIA(this);
        $$Lambda$vxf$Gi97RpfbXWdifTasVALFlvtvZCM r142 = r1;
        $$Lambda$vxf$Gi97RpfbXWdifTasVALFlvtvZCM r15 = new $$Lambda$vxf$Gi97RpfbXWdifTasVALFlvtvZCM(this);
        $$Lambda$vxf$IQdxY2u6GFUKTxMOQo87niv1Vfc r152 = $$Lambda$vxf$IQdxY2u6GFUKTxMOQo87niv1Vfc.INSTANCE;
        $$Lambda$vxf$PfCaZBDnMvEeOaQww328dc4YXrE r16 = $$Lambda$vxf$PfCaZBDnMvEeOaQww328dc4YXrE.INSTANCE;
        $$Lambda$vxf$pIHuPP8Gb3xEz14Dmm8MIIv7UNI r17 = r1;
        $$Lambda$vxf$pIHuPP8Gb3xEz14Dmm8MIIv7UNI r18 = new $$Lambda$vxf$pIHuPP8Gb3xEz14Dmm8MIIv7UNI(this);
        $$Lambda$vxf$VyccmNiUkW3NFQY4eAbXqb5tCk r182 = $$Lambda$vxf$VyccmNiUkW3NFQY4eAbXqb5tCk.INSTANCE;
        $$Lambda$vxf$8NQCAbcjwBz4KthmQo3MnteR8pE r19 = r1;
        $$Lambda$vxf$8NQCAbcjwBz4KthmQo3MnteR8pE r110 = new $$Lambda$vxf$8NQCAbcjwBz4KthmQo3MnteR8pE(this);
        $$Lambda$vxf$gtBRH1E30yChoW1N_WMB_B2Z8 r20 = r1;
        $$Lambda$vxf$gtBRH1E30yChoW1N_WMB_B2Z8 r111 = new $$Lambda$vxf$gtBRH1E30yChoW1N_WMB_B2Z8(this);
        vyj.a((ged<g>) r3, (ged<p>) r42, (ged<d>) r52, (ged<h>) r62, (ged<o>) r7, (ged<i>) r8, (ged<j>) r9, (ged<r>) r10, (ged<a>) r11, (ged<l>) r122, (ged<c>) r13, (ged<b>) r142, (ged<k>) r152, (ged<n>) r16, (ged<m>) r17, (ged<f>) r182, (ged<q>) r19, (ged<e>) r20);
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, Throwable th) {
    }

    public final /* synthetic */ void a(Object obj, kmw kmw) {
        a(((vyl) obj).h());
    }
}

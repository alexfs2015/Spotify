package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.Lists;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.Type;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;

/* renamed from: qzu reason: default package */
public final class qzu implements kjd<MusicPagesModel, qwj> {
    /* access modifiers changed from: private */
    public final ArrayList<qus> a = Lists.a();
    private final qtl<Type, MusicItem> b;
    private final qtk c;
    private final RecyclerView d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public a f;
    /* access modifiers changed from: private */
    public final int g;
    /* access modifiers changed from: private */
    public final int h;

    /* renamed from: qzu$a */
    interface a {
        void onRangeChanged(int i, int i2);
    }

    public qzu(qtl<Type, MusicItem> qtl, RecyclerView recyclerView, qsr qsr) {
        this.b = qtl;
        fay.a(qtl instanceof qtk, (Object) "Adapter was not a PlayerStateConsumer");
        this.c = (qtk) qtl;
        this.d = recyclerView;
        this.g = qsr.f;
        int i = this.g;
        this.h = i - (i / 4);
    }

    public final kje<MusicPagesModel> connect(kkn<qwj> kkn) {
        this.f = new $$Lambda$qzu$TFQbVA1q5UrzR16SA_aAt6tl6lo(kkn);
        final PublishSubject a2 = PublishSubject.a();
        final Disposable a3 = a2.c((Function<? super T, ? extends R>) $$Lambda$xXTAeqDFBXI4mDP6SvIwmipsgbA.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$qzu$kAMCb63GWMrcOk4F6CjFoqr6yM<Object>(this), (Consumer<? super Throwable>) $$Lambda$qzu$i2V7GhCTEh4bfOf8fnzfdA94mqI.INSTANCE);
        final Disposable a4 = a2.c((Function<? super T, ? extends R>) $$Lambda$qzu$TxXKMMRuJcl7wQ8NykctxZXTZA.INSTANCE).a(Functions.a()).a((Consumer<? super T>) new $$Lambda$qzu$0XC3cBWoptII5R__hLX2fqOsMM<Object>(this), (Consumer<? super Throwable>) $$Lambda$qzu$71tUf9RlvzkggrQOAstDRSQyMJk.INSTANCE);
        return new kje<MusicPagesModel>() {
            public final /* synthetic */ void accept(Object obj) {
                a2.onNext((MusicPagesModel) obj);
            }

            public final void dispose() {
                a3.bf_();
                a4.bf_();
                qzu.this.f = null;
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(final qun qun) {
        qtl<Type, MusicItem> qtl = this.b;
        qtl.a = new b<Type, MusicItem>() {
            public final int a() {
                return qun.k();
            }

            /* JADX WARNING: Removed duplicated region for block: B:15:0x0065 A[LOOP:0: B:13:0x005f->B:15:0x0065, LOOP_END] */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ defpackage.qtl.a a(int r6) {
                /*
                    r5 = this;
                    qun r0 = r3
                    com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r0 = r0.a(r6)
                    qzu r1 = defpackage.qzu.this
                    int r1 = r1.e
                    qzu r2 = defpackage.qzu.this
                    int r2 = r2.g
                    qzu r3 = defpackage.qzu.this
                    int r3 = r3.h
                    int r4 = r1 + r2
                    if (r6 < r4) goto L_0x0023
                    int r2 = r2 - r3
                    int r1 = r6 - r3
                    int r1 = r1 / r2
                L_0x0020:
                    int r1 = r1 * r2
                    goto L_0x002b
                L_0x0023:
                    if (r1 <= 0) goto L_0x002b
                    if (r6 >= r1) goto L_0x002b
                    int r2 = r2 - r3
                    int r1 = r6 / r2
                    goto L_0x0020
                L_0x002b:
                    qzu r2 = defpackage.qzu.this
                    int r2 = r2.e
                    if (r1 == r2) goto L_0x0055
                    qzu r2 = defpackage.qzu.this
                    r2.e = r1
                    qzu r1 = defpackage.qzu.this
                    qzu$a r1 = r1.f
                    if (r1 == 0) goto L_0x0055
                    qzu r1 = defpackage.qzu.this
                    qzu$a r1 = r1.f
                    qzu r2 = defpackage.qzu.this
                    int r2 = r2.e
                    qzu r3 = defpackage.qzu.this
                    int r3 = r3.g
                    r1.onRangeChanged(r2, r3)
                L_0x0055:
                    qzu r1 = defpackage.qzu.this
                    java.util.ArrayList r1 = r1.a
                    java.util.Iterator r1 = r1.iterator()
                L_0x005f:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L_0x0070
                    java.lang.Object r2 = r1.next()
                    qus r2 = (defpackage.qus) r2
                    com.spotify.music.features.yourlibrary.musicpages.item.MusicItem r0 = r2.a(r0, r6)
                    goto L_0x005f
                L_0x0070:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qzu.AnonymousClass2.a(int):qtl$a");
            }
        };
        qtl.d++;
        qtl.e();
        if (this.d.c() == null) {
            this.d.a((androidx.recyclerview.widget.RecyclerView.a) this.b);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(MusicPagesModel musicPagesModel) {
        return new ho(musicPagesModel.v(), musicPagesModel.a().b().d());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ho hoVar) {
        this.c.a((qwl) hoVar.a, (String) hoVar.b);
    }

    public final void a(qus qus) {
        this.a.add(qus);
    }
}

package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: mu reason: default package */
public final class mu extends u {
    Context a;
    List<f> b;
    private nd c;
    private final a d;
    private nc e;
    private ImageButton f;
    private b g;
    private RecyclerView h;
    private boolean i;
    private long j;
    private long k;
    private final Handler l;

    /* renamed from: mu$a */
    final class a extends defpackage.nd.a {
        a() {
        }

        public final void a(nd ndVar, f fVar) {
            mu.this.b();
        }

        public final void b(nd ndVar, f fVar) {
            mu.this.b();
        }

        public final void c(nd ndVar, f fVar) {
            mu.this.b();
        }

        public final void a(f fVar) {
            mu.this.dismiss();
        }
    }

    /* renamed from: mu$b */
    final class b extends androidx.recyclerview.widget.RecyclerView.a<u> {
        private final ArrayList<C0057b> d = new ArrayList<>();
        private final LayoutInflater e;
        private final Drawable f;
        private final Drawable g;
        private final Drawable h;
        private final Drawable i;

        /* renamed from: mu$b$a */
        class a extends u {
            TextView a;

            a(View view) {
                super(view);
                this.a = (TextView) view.findViewById(R.id.mr_picker_header_name);
            }
        }

        /* renamed from: mu$b$b reason: collision with other inner class name */
        class C0057b {
            final Object a;
            final int b;

            C0057b(Object obj) {
                this.a = obj;
                if (obj instanceof String) {
                    this.b = 1;
                } else if (obj instanceof f) {
                    this.b = 2;
                } else {
                    this.b = 0;
                }
            }
        }

        /* renamed from: mu$b$c */
        class c extends u {
            final View a;
            final ImageView b;
            final ProgressBar c;
            final TextView d;

            c(View view) {
                super(view);
                this.a = view;
                this.b = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
                this.c = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
                this.d = (TextView) view.findViewById(R.id.mr_picker_route_name);
                mw.a(mu.this.a, this.c);
            }
        }

        b() {
            this.e = LayoutInflater.from(mu.this.a);
            this.f = mw.c(mu.this.a);
            this.g = mw.d(mu.this.a);
            this.h = mw.e(mu.this.a);
            this.i = mw.f(mu.this.a);
            a();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            this.d.clear();
            this.d.add(new C0057b(mu.this.a.getString(R.string.mr_chooser_title)));
            for (f bVar : mu.this.b) {
                this.d.add(new C0057b(bVar));
            }
            e();
        }

        public final u a(ViewGroup viewGroup, int i2) {
            if (i2 == 1) {
                return new a(this.e.inflate(R.layout.mr_picker_header_item, viewGroup, false));
            }
            if (i2 != 2) {
                return null;
            }
            return new c(this.e.inflate(R.layout.mr_picker_route_item, viewGroup, false));
        }

        public final void a(u uVar, int i2) {
            int a2 = a(i2);
            C0057b bVar = (C0057b) this.d.get(i2);
            if (a2 != 1) {
                if (a2 == 2) {
                    c cVar = (c) uVar;
                    f fVar = (f) bVar.a;
                    cVar.a.setVisibility(0);
                    cVar.c.setVisibility(4);
                    cVar.a.setOnClickListener(new OnClickListener(fVar) {
                        private /* synthetic */ f a;

                        {
                            this.a = r2;
                        }

                        public final void onClick(View view) {
                            this.a.e();
                            c.this.b.setVisibility(4);
                            c.this.c.setVisibility(0);
                        }
                    });
                    cVar.d.setText(fVar.d);
                    cVar.b.setImageDrawable(b.this.a(fVar));
                }
                return;
            }
            a aVar = (a) uVar;
            aVar.a.setText(bVar.a.toString());
        }

        public final int b() {
            return this.d.size();
        }

        public final int a(int i2) {
            return ((C0057b) this.d.get(i2)).b;
        }

        /* access modifiers changed from: 0000 */
        public final Drawable a(f fVar) {
            Uri uri = fVar.f;
            if (uri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(mu.this.a.getContentResolver().openInputStream(uri), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException unused) {
                    new StringBuilder("Failed to load ").append(uri);
                }
            }
            int i2 = fVar.l;
            if (i2 == 1) {
                return this.g;
            }
            if (i2 == 2) {
                return this.h;
            }
            if (fVar.f()) {
                return this.i;
            }
            return this.f;
        }
    }

    /* renamed from: mu$c */
    static final class c implements Comparator<f> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return ((f) obj).d.compareToIgnoreCase(((f) obj2).d);
        }
    }

    public mu(Context context) {
        this(context, 0);
    }

    private mu(Context context, int i2) {
        Context a2 = mw.a(context, 0, false);
        super(a2, mw.h(a2));
        this.e = nc.c;
        this.l = new Handler() {
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    mu.this.a((List) message.obj);
                }
            }
        };
        Context context2 = getContext();
        this.c = nd.a(context2);
        this.d = new a();
        this.a = context2;
        this.j = (long) context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    public final void a(nc ncVar) {
        if (ncVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        } else if (!this.e.equals(ncVar)) {
            this.e = ncVar;
            if (this.i) {
                this.c.a((defpackage.nd.a) this.d);
                this.c.a(ncVar, this.d, 1);
            }
            b();
        }
    }

    private void b(List<f> list) {
        int size = list.size();
        while (true) {
            int i2 = size - 1;
            if (size > 0) {
                f fVar = (f) list.get(i2);
                if (!(!fVar.c() && fVar.g && fVar.a(this.e))) {
                    list.remove(i2);
                }
                size = i2;
            } else {
                return;
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.mr_picker_dialog);
        mw.a(this.a, (Dialog) this);
        this.b = new ArrayList();
        this.f = (ImageButton) findViewById(R.id.mr_picker_close_button);
        this.f.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                mu.this.dismiss();
            }
        });
        this.g = new b();
        this.h = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.h.a((androidx.recyclerview.widget.RecyclerView.a) this.g);
        this.h.a((i) new LinearLayoutManager(this.a));
        a();
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        getWindow().setLayout(mt.b(this.a), mt.c(this.a));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        this.c.a(this.e, this.d, 1);
        b();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = false;
        this.c.a((defpackage.nd.a) this.d);
        this.l.removeMessages(1);
    }

    public final void b() {
        if (this.i) {
            ArrayList arrayList = new ArrayList(nd.a());
            b(arrayList);
            Collections.sort(arrayList, c.a);
            if (SystemClock.uptimeMillis() - this.k >= this.j) {
                a((List<f>) arrayList);
                return;
            }
            this.l.removeMessages(1);
            Handler handler = this.l;
            handler.sendMessageAtTime(handler.obtainMessage(1, arrayList), this.k + this.j);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(List<f> list) {
        this.k = SystemClock.uptimeMillis();
        this.b.clear();
        this.b.addAll(list);
        this.g.a();
    }
}

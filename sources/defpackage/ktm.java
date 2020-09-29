package defpackage;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.RoomDatabase;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: ktm reason: default package */
public final class ktm implements ktl {
    final RoomDatabase a;
    final ot b;
    final os c;
    final pd d;

    public ktm(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new ot<ktk>(roomDatabase) {
            public final String a() {
                return "INSERT OR REPLACE INTO `cachedClientInfo`(`client_id`,`redirect_uri`,`scopes`,`timestamp`,`package_name`,`app_signature`,`last_used_timestamp`) VALUES (?,?,?,?,?,?,?)";
            }

            public final /* bridge */ /* synthetic */ void a(ps psVar, Object obj) {
                ktk ktk = (ktk) obj;
                if (ktk.a == null) {
                    psVar.a(1);
                } else {
                    psVar.a(1, ktk.a);
                }
                if (ktk.b == null) {
                    psVar.a(2);
                } else {
                    psVar.a(2, ktk.b);
                }
                if (ktk.c == null) {
                    psVar.a(3);
                } else {
                    psVar.a(3, ktk.c);
                }
                psVar.a(4, ktk.d);
                if (ktk.e == null) {
                    psVar.a(5);
                } else {
                    psVar.a(5, ktk.e);
                }
                if (ktk.f == null) {
                    psVar.a(6);
                } else {
                    psVar.a(6, ktk.f);
                }
                psVar.a(7, ktk.g);
            }
        };
        this.c = new os<ktk>(roomDatabase) {
            public final String a() {
                return "DELETE FROM `cachedClientInfo` WHERE `client_id` = ? AND `redirect_uri` = ? AND `package_name` = ? AND `app_signature` = ?";
            }

            public final /* bridge */ /* synthetic */ void a(ps psVar, Object obj) {
                ktk ktk = (ktk) obj;
                if (ktk.a == null) {
                    psVar.a(1);
                } else {
                    psVar.a(1, ktk.a);
                }
                if (ktk.b == null) {
                    psVar.a(2);
                } else {
                    psVar.a(2, ktk.b);
                }
                if (ktk.e == null) {
                    psVar.a(3);
                } else {
                    psVar.a(3, ktk.e);
                }
                if (ktk.f == null) {
                    psVar.a(4);
                } else {
                    psVar.a(4, ktk.f);
                }
            }
        };
        this.d = new pd(roomDatabase) {
            public final String a() {
                return "DELETE FROM cachedClientInfo";
            }
        };
    }

    public final Completable a(final ktk ktk) {
        return Completable.b((Callable<?>) new Callable<Void>() {
            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                ktm.this.a.e();
                try {
                    ktm.this.b.a(ktk);
                    ktm.this.a.g();
                    ktm.this.a.f();
                    return null;
                } catch (Throwable th) {
                    ktm.this.a.f();
                    throw th;
                }
            }
        });
    }

    public final Completable b(final ktk ktk) {
        return Completable.b((Callable<?>) new Callable<Void>() {
            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                ktm.this.a.e();
                try {
                    ktm.this.c.a(ktk);
                    ktm.this.a.g();
                    ktm.this.a.f();
                    return null;
                } catch (Throwable th) {
                    ktm.this.a.f();
                    throw th;
                }
            }
        });
    }

    public final Single<Integer> b() {
        return Single.a((Callable<? extends T>) new Callable<Integer>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Integer call() {
                ps b = ktm.this.d.b();
                ktm.this.a.e();
                try {
                    Integer valueOf = Integer.valueOf(b.a());
                    ktm.this.a.g();
                    return valueOf;
                } finally {
                    ktm.this.a.f();
                    ktm.this.d.a(b);
                }
            }
        });
    }

    public final Single<ktk> a(String str, String str2, String str3, String str4) {
        final pc a2 = pc.a("SELECT * FROM cachedClientInfo WHERE client_id = ? AND redirect_uri = ? AND package_name = ? AND app_signature = ?", 4);
        if (str == null) {
            a2.b[1] = 1;
        } else {
            a2.a(1, str);
        }
        if (str2 == null) {
            a2.b[2] = 1;
        } else {
            a2.a(2, str2);
        }
        if (str3 == null) {
            a2.b[3] = 1;
        } else {
            a2.a(3, str3);
        }
        if (str4 == null) {
            a2.b[4] = 1;
        } else {
            a2.a(4, str4);
        }
        return Single.a((Callable<? extends T>) new Callable<ktk>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public ktk call() {
                Cursor a2 = ktm.this.a.a((pr) a2);
                try {
                    ktk ktk = a2.moveToFirst() ? new ktk(a2.getString(pg.a(a2, "client_id")), a2.getString(pg.a(a2, "redirect_uri")), a2.getString(pg.a(a2, "scopes")), a2.getLong(pg.a(a2, "timestamp")), a2.getString(pg.a(a2, "package_name")), a2.getString(pg.a(a2, "app_signature")), a2.getLong(pg.a(a2, "last_used_timestamp"))) : null;
                    if (ktk != null) {
                        return ktk;
                    }
                    StringBuilder sb = new StringBuilder("Query returned empty result set: ");
                    sb.append(a2.a);
                    throw new EmptyResultSetException(sb.toString());
                } finally {
                    a2.close();
                }
            }

            /* access modifiers changed from: protected */
            public final void finalize() {
                a2.a();
            }
        });
    }

    public final Single<List<ktk>> a() {
        final pc a2 = pc.a("SELECT * FROM cachedClientInfo", 0);
        return Single.a((Callable<? extends T>) new Callable<List<ktk>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<ktk> call() {
                Cursor a2 = ktm.this.a.a((pr) a2);
                try {
                    int a3 = pg.a(a2, "client_id");
                    int a4 = pg.a(a2, "redirect_uri");
                    int a5 = pg.a(a2, "scopes");
                    int a6 = pg.a(a2, "timestamp");
                    int a7 = pg.a(a2, "package_name");
                    int a8 = pg.a(a2, "app_signature");
                    int a9 = pg.a(a2, "last_used_timestamp");
                    ArrayList arrayList = new ArrayList(a2.getCount());
                    while (a2.moveToNext()) {
                        ktk ktk = new ktk(a2.getString(a3), a2.getString(a4), a2.getString(a5), a2.getLong(a6), a2.getString(a7), a2.getString(a8), a2.getLong(a9));
                        arrayList.add(ktk);
                    }
                    return arrayList;
                } finally {
                    a2.close();
                }
            }

            /* access modifiers changed from: protected */
            public final void finalize() {
                a2.a();
            }
        });
    }
}

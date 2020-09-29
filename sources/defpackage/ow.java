package defpackage;

import android.content.Context;
import androidx.room.RoomDatabase.JournalMode;
import androidx.room.RoomDatabase.b;
import androidx.room.RoomDatabase.c;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: ow reason: default package */
public final class ow {
    public final c a;
    public final Context b;
    public final String c;
    public final c d;
    public final List<b> e;
    public final boolean f;
    public final JournalMode g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    final Set<Integer> m;

    public ow(Context context, String str, c cVar, c cVar2, List<b> list, boolean z, JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = cVar2;
        this.e = list;
        this.f = z;
        this.g = journalMode;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = set;
    }
}

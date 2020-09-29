package defpackage;

import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.a;
import com.spotify.wrapped2019.v1.proto.Entity;
import com.spotify.wrapped2019.v1.proto.GlobalCitizenStory;
import java.util.List;

/* renamed from: kjo reason: default package */
public abstract class kjo implements Parcelable {
    public static kjo a(GlobalCitizenStory globalCitizenStory) {
        e<Entity> eVar = globalCitizenStory.f;
        a g = ImmutableList.g();
        for (Entity entity : eVar) {
            g.c(kjk.a(entity.g, entity.e, entity.d, entity.f));
        }
        return a(g.a(), globalCitizenStory.d, globalCitizenStory.e, kjp.a(globalCitizenStory.k()));
    }

    public static kjo a(List<kjk> list, String str, String str2, kjp kjp) {
        return new kjm(list, str2, str, kjp);
    }

    public abstract List<kjk> a();

    public abstract String b();

    public abstract String c();

    public abstract kjp d();
}

package com.adjust.sdk;

import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Calendar;
import java.util.LinkedList;

public class ActivityState implements Serializable, Cloneable {
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("uuid", String.class), new ObjectStreamField("enabled", Boolean.TYPE), new ObjectStreamField("isGdprForgotten", Boolean.TYPE), new ObjectStreamField("askingAttribution", Boolean.TYPE), new ObjectStreamField("eventCount", Integer.TYPE), new ObjectStreamField("sessionCount", Integer.TYPE), new ObjectStreamField("subsessionCount", Integer.TYPE), new ObjectStreamField("sessionLength", Long.TYPE), new ObjectStreamField("timeSpent", Long.TYPE), new ObjectStreamField("lastActivity", Long.TYPE), new ObjectStreamField("lastInterval", Long.TYPE), new ObjectStreamField("updatePackages", Boolean.TYPE), new ObjectStreamField("orderIds", LinkedList.class), new ObjectStreamField("pushToken", String.class), new ObjectStreamField("adid", String.class), new ObjectStreamField("clickTime", Long.TYPE), new ObjectStreamField("installBegin", Long.TYPE), new ObjectStreamField("installReferrer", String.class)};
    private static final long serialVersionUID = 9039439291143138148L;
    private transient wf a = vv.a();
    public String adid = null;
    public boolean askingAttribution = false;
    public long clickTime = 0;
    public boolean enabled = true;
    public int eventCount = 0;
    public long installBegin = 0;
    public String installReferrer = null;
    public boolean isGdprForgotten = false;
    public long lastActivity = -1;
    public long lastInterval = -1;
    protected LinkedList<String> orderIds = null;
    public String pushToken = null;
    public int sessionCount = 0;
    public long sessionLength = -1;
    public int subsessionCount = -1;
    public long timeSpent = -1;
    public boolean updatePackages = false;
    public String uuid = xa.a();

    private void readObject(ObjectInputStream objectInputStream) {
        GetField readFields = objectInputStream.readFields();
        this.eventCount = xa.a(readFields, "eventCount", 0);
        this.sessionCount = xa.a(readFields, "sessionCount", 0);
        this.subsessionCount = xa.a(readFields, "subsessionCount", -1);
        this.sessionLength = xa.a(readFields, "sessionLength", -1);
        this.timeSpent = xa.a(readFields, "timeSpent", -1);
        this.lastActivity = xa.a(readFields, "lastActivity", -1);
        this.lastInterval = xa.a(readFields, "lastInterval", -1);
        this.uuid = xa.a(readFields, "uuid", (String) null);
        this.enabled = xa.a(readFields, "enabled", true);
        this.isGdprForgotten = xa.a(readFields, "isGdprForgotten", false);
        this.askingAttribution = xa.a(readFields, "askingAttribution", false);
        this.updatePackages = xa.a(readFields, "updatePackages", false);
        this.orderIds = (LinkedList) xa.a(readFields, "orderIds", null);
        this.pushToken = xa.a(readFields, "pushToken", (String) null);
        this.adid = xa.a(readFields, "adid", (String) null);
        this.clickTime = xa.a(readFields, "clickTime", -1);
        this.installBegin = xa.a(readFields, "installBegin", -1);
        this.installReferrer = xa.a(readFields, "installReferrer", (String) null);
        if (this.uuid == null) {
            this.uuid = xa.a();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    public final void a(long j) {
        this.subsessionCount = 1;
        this.sessionLength = 0;
        this.timeSpent = 0;
        this.lastActivity = j;
        this.lastInterval = -1;
    }

    public final void a(String str) {
        if (this.orderIds == null) {
            this.orderIds = new LinkedList<>();
        }
        if (this.orderIds.size() >= 10) {
            this.orderIds.removeLast();
        }
        this.orderIds.addFirst(str);
    }

    public final boolean b(String str) {
        LinkedList<String> linkedList = this.orderIds;
        if (linkedList == null) {
            return false;
        }
        return linkedList.contains(str);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityState activityState = (ActivityState) obj;
        return xa.a(this.uuid, activityState.uuid) && xa.a(Boolean.valueOf(this.enabled), Boolean.valueOf(activityState.enabled)) && xa.a(Boolean.valueOf(this.isGdprForgotten), Boolean.valueOf(activityState.isGdprForgotten)) && xa.a(Boolean.valueOf(this.askingAttribution), Boolean.valueOf(activityState.askingAttribution)) && xa.a(Integer.valueOf(this.eventCount), Integer.valueOf(activityState.eventCount)) && xa.a(Integer.valueOf(this.sessionCount), Integer.valueOf(activityState.sessionCount)) && xa.a(Integer.valueOf(this.subsessionCount), Integer.valueOf(activityState.subsessionCount)) && xa.a(Long.valueOf(this.sessionLength), Long.valueOf(activityState.sessionLength)) && xa.a(Long.valueOf(this.timeSpent), Long.valueOf(activityState.timeSpent)) && xa.a(Long.valueOf(this.lastInterval), Long.valueOf(activityState.lastInterval)) && xa.a(Boolean.valueOf(this.updatePackages), Boolean.valueOf(activityState.updatePackages)) && xa.a((Object) this.orderIds, (Object) activityState.orderIds) && xa.a(this.pushToken, activityState.pushToken) && xa.a(this.adid, activityState.adid) && xa.a(Long.valueOf(this.clickTime), Long.valueOf(activityState.clickTime)) && xa.a(Long.valueOf(this.installBegin), Long.valueOf(activityState.installBegin)) && xa.a(this.installReferrer, activityState.installReferrer);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((xa.a(this.uuid) + 629) * 37) + xa.a(Boolean.valueOf(this.enabled))) * 37) + xa.a(Boolean.valueOf(this.isGdprForgotten))) * 37) + xa.a(Boolean.valueOf(this.askingAttribution))) * 37) + this.eventCount) * 37) + this.sessionCount) * 37) + this.subsessionCount) * 37) + xa.a(Long.valueOf(this.sessionLength))) * 37) + xa.a(Long.valueOf(this.timeSpent))) * 37) + xa.a(Long.valueOf(this.lastInterval))) * 37) + xa.a(Boolean.valueOf(this.updatePackages))) * 37) + xa.a((Object) this.orderIds)) * 37) + xa.a(this.pushToken)) * 37) + xa.a(this.adid)) * 37) + xa.a(Long.valueOf(this.clickTime))) * 37) + xa.a(Long.valueOf(this.installBegin))) * 37) + xa.a(this.installReferrer);
    }

    public String toString() {
        double d = (double) this.sessionLength;
        Double.isNaN(d);
        double d2 = (double) this.timeSpent;
        Double.isNaN(d2);
        Calendar.getInstance().setTimeInMillis(this.lastActivity);
        return xa.a("ec:%d sc:%d ssc:%d sl:%.1f ts:%.1f la:%s uuid:%s", Integer.valueOf(this.eventCount), Integer.valueOf(this.sessionCount), Integer.valueOf(this.subsessionCount), Double.valueOf(d / 1000.0d), Double.valueOf(d2 / 1000.0d), xa.a("%02d:%02d:%02d", Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13)), this.uuid);
    }
}

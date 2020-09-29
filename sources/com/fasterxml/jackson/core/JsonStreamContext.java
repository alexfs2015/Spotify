package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharTypes;

public abstract class JsonStreamContext {
    protected int _index;
    protected int _type;

    protected JsonStreamContext() {
    }

    protected JsonStreamContext(int i, int i2) {
        this._type = i;
        this._index = i2;
    }

    protected JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this._type = jsonStreamContext._type;
        this._index = jsonStreamContext._index;
    }

    public final int getCurrentIndex() {
        int i = this._index;
        if (i < 0) {
            return 0;
        }
        return i;
    }

    public abstract String getCurrentName();

    public Object getCurrentValue() {
        return null;
    }

    public final int getEntryCount() {
        return this._index + 1;
    }

    public abstract JsonStreamContext getParent();

    public JsonLocation getStartLocation(Object obj) {
        return JsonLocation.NA;
    }

    @Deprecated
    public final String getTypeDesc() {
        int i = this._type;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "OBJECT" : "ARRAY" : "ROOT";
    }

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }

    public void setCurrentValue(Object obj) {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        int i = this._type;
        if (i == 0) {
            sb.append("/");
        } else if (i != 1) {
            sb.append('{');
            String currentName = getCurrentName();
            if (currentName != null) {
                sb.append('\"');
                CharTypes.appendQuoted(sb, currentName);
                sb.append('\"');
            } else {
                sb.append('?');
            }
            sb.append('}');
        } else {
            sb.append('[');
            sb.append(getCurrentIndex());
            sb.append(']');
        }
        return sb.toString();
    }

    public String typeDesc() {
        int i = this._type;
        return i != 0 ? i != 1 ? i != 2 ? "?" : "Object" : "Array" : "root";
    }
}

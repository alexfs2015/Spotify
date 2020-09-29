package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonInclude.Value;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std;
import java.io.Serializable;
import java.util.Map;

public class ConfigOverrides implements Serializable {
    private static final long serialVersionUID = 1;
    protected Value _defaultInclusion;
    protected Boolean _defaultMergeable;
    protected JsonSetter.Value _defaultSetterInfo;
    protected Map<Class<?>, Object> _overrides;
    protected VisibilityChecker<?> _visibilityChecker;

    public ConfigOverrides() {
        this(null, Value.empty(), JsonSetter.Value.empty(), Std.defaultInstance(), null);
    }

    protected ConfigOverrides(Map<Class<?>, Object> map, Value value, JsonSetter.Value value2, VisibilityChecker<?> visibilityChecker, Boolean bool) {
        this._overrides = map;
        this._defaultInclusion = value;
        this._defaultSetterInfo = value2;
        this._visibilityChecker = visibilityChecker;
        this._defaultMergeable = bool;
    }

    public ConfigOverride findOverride(Class<?> cls) {
        Map<Class<?>, Object> map = this._overrides;
        if (map == null) {
            return null;
        }
        return (ConfigOverride) map.get(cls);
    }

    public Value getDefaultInclusion() {
        return this._defaultInclusion;
    }

    public JsonSetter.Value getDefaultSetterInfo() {
        return this._defaultSetterInfo;
    }

    public Boolean getDefaultMergeable() {
        return this._defaultMergeable;
    }

    public VisibilityChecker<?> getDefaultVisibility() {
        return this._visibilityChecker;
    }

    public void setDefaultInclusion(Value value) {
        this._defaultInclusion = value;
    }

    public void setDefaultVisibility(VisibilityChecker<?> visibilityChecker) {
        this._visibilityChecker = visibilityChecker;
    }
}

package com.winit.vms.base.query;

public class SetData {
    private String property;

    private Object value;

    public String getProperty() {
		return property;
	}
    
    public Object getValue() {
        return value;
    }

    public SetData(String property, Object value) {
        this.value = value;
        this.property = property;
    }
}
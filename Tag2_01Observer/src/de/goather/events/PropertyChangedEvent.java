package de.goather.events;

public class PropertyChangedEvent {
	
	private final Object source;
	private final String propertyName;
	private final Object oldValue;
	private final Object newValue;
	
	public PropertyChangedEvent(final Object source, final String propertyName, final Object oldValue, final Object newValue) {
		super();
		this.source = source;
		this.propertyName = propertyName;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}
	public Object getSource() {
		return source;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public Object getOldValue() {
		return oldValue;
	}
	public Object getNewValue() {
		return newValue;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PropertyChangedEvent [source=");
		builder.append(source);
		builder.append(", propertyName=");
		builder.append(propertyName);
		builder.append(", oldValue=");
		builder.append(oldValue);
		builder.append(", newValue=");
		builder.append(newValue);
		builder.append("]");
		return builder.toString();
	}
	

}

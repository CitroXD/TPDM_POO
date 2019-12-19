package fr.ensim.tp5.model;

public class Features {

	private String type;
	private Geometry geometry;
	private Properties properties;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties prop) {
		this.properties = prop;
	}


}

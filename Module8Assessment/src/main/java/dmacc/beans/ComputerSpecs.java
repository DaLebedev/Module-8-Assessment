package dmacc.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class ComputerSpecs {
	
	private int ramGB;
	private String storageSize;
	private String graphicsCard;
	private String operatingSystem;
	private String processor;
	
	public ComputerSpecs() {
		super();
		this.graphicsCard = "Integrated Graphics";
	}
	
	public ComputerSpecs(int ramGB, String storageSize, String operatingSystem, String processor) {
		super();
		this.ramGB = ramGB;
		this.storageSize = storageSize;
		this.graphicsCard = "Integrated Graphics";
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}
	
	public ComputerSpecs(int ramGB, String storageSize, String graphicsCard, String operatingSystem, String processor) {
		super();
		this.ramGB = ramGB;
		this.storageSize = storageSize;
		this.graphicsCard = graphicsCard;
		this.operatingSystem = operatingSystem;
		this.processor = processor;
	}

	public int getRamGB() {
		return ramGB;
	}

	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}

	public String getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(String storageSize) {
		this.storageSize = storageSize;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "[ramGB=" + ramGB + "GB, storageSize=" + storageSize + ", graphicsCard=" + graphicsCard
				+ ", operatingSystem=" + operatingSystem + ", processor=" + processor + "]";
	}
	
}
